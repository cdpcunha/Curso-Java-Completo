package EntidadeAbs;

public class PessoaJuridica extends Contribuinte{
	private int qtdFuncionarios;
		
	public PessoaJuridica(String nome, double renda, int qtdFuncionarios) {
		super(nome, renda);
		this.qtdFuncionarios = qtdFuncionarios;
	}

	@Override
	public double impostoAPagar() {
		double result = 0;
		if(qtdFuncionarios > 10) {
			result = renda * 0.14;
		}
		if(qtdFuncionarios <= 10) {
			result = renda * 0.16;
		}
		return result;
	}

	public int getQtdFuncionarios() {
		return qtdFuncionarios;
	}

	public void setQtdFuncionarios(int qtdFuncionarios) {
		this.qtdFuncionarios = qtdFuncionarios;
	}
}
