import java.util.ArrayList;

public class Sistema {

	private static Sistema unicaInstancia = new Sistema();

	private Sistema() {

	}

	public static Sistema getInstance() {
		return unicaInstancia;
	}

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

	static Cliente nextClientIdoso() {

		if (!fila.isEmpty()) {
			PureQueue<Cliente> filIdo = clientesIdosos(fila);
			if (!filIdo.isEmpty()) {
				Cliente r = filIdo.dequeue();
				fila.removeItem(r);
				System.out.println("Atendimento para: " + r.toString());
				return r;
			} else {
				Cliente r = fila.dequeue();
				System.out.println("Atendimento para " + r.toString());
				return r;
			}

		} else {
			System.out.println("Sem clientes na fila no momento");
			return null;
		}
	}

	static Cliente nextNormal() {
		if (!fila.isEmpty()) {
			Cliente r = fila.dequeue();
			System.out.println("Atendimento para " + r.toString());
			return r;
		} else {
			System.out.println("Sem clientes na fila no momento");
			return null;
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
			msn = msn + fila.item(i).getNome() + " Idade: " + fila.item(i).getIdade() + "\n";
		}

		return msn;

	}
	
	public boolean filaIsEmpty() {
		if (fila.isEmpty()==true) {
			return true;
		}else {
			return false;
		}
	}

}
