package EntidadesPoli;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsadoPoli extends ProdutoPoli {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private Date dataManufatura;

	public ProdutoUsadoPoli() {
	}

	public ProdutoUsadoPoli(String nome, Double pre�o, Date dataManufatura) {
		super(nome, pre�o);
		this.dataManufatura = dataManufatura;
	}

	public Date getDataManufatura() {
		return dataManufatura;
	}
	
	@Override
	public String etiqueta () {
		return "Nome : " + this.nome + "(usado) , Pre�o : $" + pre�o + " , Data de Manufatura : " + sdf.format(dataManufatura);
	}
}
