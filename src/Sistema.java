import java.util.ArrayList;

public class Sistema {
	
	 static PureQueue<Cliente> fila = new PureQueue<>();
	 static ArrayList<Caixa> caixas;
	 
	 

	static PureQueue<Cliente> clientesIdosos(PureQueue p) {
		Cliente aux;
		PureQueue<Cliente> pAux = new PureQueue<>();
		for (int i = 0; i < p.size(); i++) {
			aux = (Cliente) p.item(i);
			if (aux.getIdade() >= 65) {
				pAux.enqueue(aux);
			}
		}
		return pAux;

	}

	static void nextClientIdoso() {

		if (!fila.isEmpty()) {
			PureQueue<Cliente> filIdo = clientesIdosos(fila);
			if (!filIdo.isEmpty()) {
				Cliente r = filIdo.dequeue();
				fila.removeItem(r);
				System.out.println("Atendimento para: " + r.toString());
			} else {
				Cliente r = fila.dequeue();
				System.out.println("Atendimento para " + r.toString());
			}

		} else {
			System.out.println("Sem clientes na fila no momento");
		}
	}

	static void nextNormal() {
		if (!fila.isEmpty()) {
			Cliente r = fila.dequeue();
			System.out.println("Atendimento para " + r.toString());
		} else {
			System.out.println("Sem clientes na fila no momento");
		}
	}

	public void addCaixa(Caixa caixa) {
		caixas = new ArrayList<>();
		caixas.add(caixa);
	}

	public ArrayList<Caixa> getCaixas() {
		return caixas;
	}

	public void addCliente(Cliente c1) {
		fila.enqueue(c1);

	}

	public String mostrarFila() {
		String msn = "";
		for (int i = 0; i < fila.size(); i++) {
			msn = msn + "\n" + fila.item(i).getNome() + " Idade: " + fila.item(i).getIdade();
		}

		return msn;

	}

}
