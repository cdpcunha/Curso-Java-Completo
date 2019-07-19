package EntidadesPoli;

public class Empregado {
	protected String nome;
	protected int horasTrab;
	protected double valorHora;

	public double pagamento() {
		return this.horasTrab * this.valorHora;
	}

	public Empregado() {

	}

	public Empregado(String nome, int horasTrab, double valorHora) {
		this.nome = nome;
		this.horasTrab = horasTrab;
		this.valorHora = valorHora;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getHorasTrab() {
		return horasTrab;
	}

	public void setHorasTrab(int horasTrab) {
		this.horasTrab = horasTrab;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

}
