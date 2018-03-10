
public class Cliente {
	private int idade;
	private String nome;

	public Cliente(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public int getIdade() {
		return idade;
	}

	public String getNome() {
		return nome;
	}

	@Override
	public String toString() {
		String msn = "";
		msn = msn +"\n"+ this.nome + " " + this.idade;
		return msn;
	}

}
