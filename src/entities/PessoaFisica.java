package entities;

public class PessoaFisica extends ReceitaFederal{

	private Double despesasComSaude;
	
	public PessoaFisica() {
	   super();
	}	
	
	public PessoaFisica(String nome, Double receita, Double despesasComSaude) {
		super(nome, receita);
		this.despesasComSaude = despesasComSaude;
	}

	public Double getDespesasComSaude() {
		return despesasComSaude;
	}

	public void setDespesasComSaude(Double despesasComSaude) {
		this.despesasComSaude = despesasComSaude;
	}


	@Override
	public Double imposto() {
		
		Double imposto = null;
		
		if(super.getReceita() < 20000.0) {
			imposto = (super.getReceita() * 0.15) - (despesasComSaude / 2);
		} else {
			imposto = (super.getReceita() * 0.25) - (despesasComSaude / 2);
		}
		
		return imposto;
	}

}
