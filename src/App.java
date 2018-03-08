import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		
		Sistema sistema = new Sistema();
		
		Cliente c1 = new Cliente("Fulano", 19);
		Cliente c2 = new Cliente("Beltrano", 30);
		Cliente c3 = new Cliente("Mario", 65);
		Cliente c4 = new Cliente("Maria", 12);
		Cliente c5 = new Cliente("Sergio", 79);
		
		
		sistema.addCliente(c1);
		sistema.addCliente(c2);
		sistema.addCliente(c3);
		sistema.addCliente(c4);
		sistema.addCliente(c5);
		
		Caixa cx1 = new Caixa(1);
		Caixa cx2 = new Caixa(2);
		Caixa cx3 = new Caixa(6);
		
		sistema.addCaixa(cx1);
		sistema.addCaixa(cx2);
		sistema.addCaixa(cx3);
		
		ArrayList<Caixa> caixas = sistema.getCaixas();
		
		for (Caixa caixa : caixas) {
			
		}or
		
	}

}
