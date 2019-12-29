package entities;

public class PessoaJuridica extends ReceitaFederal {

	private Integer numeroDeFuncionarios;
	
	public PessoaJuridica() {
		super();
	}
	
	public PessoaJuridica(String nome, Double receita, Integer numeroDeFuncionarios) {
		super(nome, receita);
		this.numeroDeFuncionarios = numeroDeFuncionarios;
	}

	public Integer getNumeroDeFuncionarios() {
		return numeroDeFuncionarios;
	}

	public void setNumeroDeFuncionarios(Integer numeroDeFuncionarios) {
		this.numeroDeFuncionarios = numeroDeFuncionarios;
	}


	@Override
	public Double imposto() {
		
		Double imposto = null;
		
		if(numeroDeFuncionarios > 10) {
			imposto = super.getReceita() * 0.14;
		} else {
			imposto = super.getReceita() * 0.16;
		}
		return imposto;
	}
	
	
}
