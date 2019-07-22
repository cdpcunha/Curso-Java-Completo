package EntidadeAbs;

public class PessoaFisica extends Contribuinte{
	private double gastoSaude;
		
	public PessoaFisica(String nome, double renda, double gastoSaude) {
		super(nome, renda);
		this.gastoSaude = gastoSaude;
	}

	@Override
	public double impostoAPagar() {
		double result = 0;
		if(renda<20000) {
			result = (renda * 0.15) - gastoSaude*0.5;
		}
		if(renda>=20000) {
			 result = (renda * 0.25) - gastoSaude*0.5;
		}
		return result;
	}

	public double getGastoSaude() {
		return gastoSaude;
	}

	public void setGastoSaude(double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}
	
}
