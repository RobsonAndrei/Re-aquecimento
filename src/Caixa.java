
public class Caixa {
	private int id;
	private boolean disponivel;

	public Caixa(int idcx) {
		this.id = idcx;
	}

	public int getId() {
		return id;
	}

	public boolean disponivel() {
		return disponivel;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
}
