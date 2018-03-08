import java.util.ArrayList;

public class Sistema {
	private ArrayList<Cliente> clientes;
	private ArrayList<Caixa> caixas;
	
	public void addCliente(Cliente cliente) {
		clientes.add(cliente);
	}
	
	public void addCaixa(Caixa caixa) {
		caixas.add(caixa);
	}
	
	public ArrayList<Caixa> getCaixas(){
		return caixas;
	}
	
}
