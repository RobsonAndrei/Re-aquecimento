import java.util.LinkedList;
import java.util.List;

public class FIlaCliente {
	private List<Cliente> filaCliente;

	public FIlaCliente() {
		filaCliente = new LinkedList<Cliente>();

	}

	public void addFila(Cliente c) {
		filaCliente.add(c);
	}

}
