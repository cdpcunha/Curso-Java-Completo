package EntidadesPoli;

public class EmpregadoTerceirizado extends Empregado{
	private double custoExtra;

	public EmpregadoTerceirizado(String nome, int horasTrab, double valorHora, double custoExtra) {
		super(nome, horasTrab, valorHora);
		this.custoExtra = custoExtra;
	}
	public EmpregadoTerceirizado() {
	}
	
	public double getCustoExtra() {
		return custoExtra;
	}
	public void setCustoExtra(double custoExtra) {
		this.custoExtra = custoExtra;
	}
	
	@Override
	public double pagamento() {
		return (this.horasTrab * this.valorHora)+ (custoExtra*1.1);
	}
}
