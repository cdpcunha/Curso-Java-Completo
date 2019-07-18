package Entidades;

import java.util.Date;
import Entidades.StatusPedido;

public class Pedido {

	private int id;
	private Date dhpedido;
	private StatusPedido status;

	public Pedido(int id, Date dhpedido, StatusPedido status) {
		this.id = id;
		this.dhpedido = dhpedido;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public Date getDhpedido() {
		return dhpedido;
	}

	public StatusPedido getStatus() {
		return status;
	}

	public void setStatus(StatusPedido status) {
		this.status = status;
	}

	public String toString() {
		return "Identificador= " + id + " , Data/Hora = " + dhpedido + " , Status = " + status ;
	}
}
