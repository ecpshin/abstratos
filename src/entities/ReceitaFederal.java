package entities;

public abstract class ReceitaFederal {
	
	private String nome;
	private Double receita;
	
	public ReceitaFederal() {
	}

	public ReceitaFederal(String nome, Double receita) {
		super();
		this.nome = nome;
		this.receita = receita;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getReceita() {
		return receita;
	}

	public void setReceita(Double receita) {
		this.receita = receita;
	}
	
	public abstract Double imposto();
}
