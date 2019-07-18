package OOInter;
import java.util.Date;

import Entidades.Pedido;
import Entidades.StatusPedido;;

public class Enumeração {

	public static void main(String[] args) {
	Pedido pedido = new Pedido(1,new Date(), StatusPedido.PAGAMENTO_PENDENTE);
	System.out.println(pedido);
	StatusPedido os1 = StatusPedido.valueOf("ENTREGUE");
	System.out.println(os1);
	}
}
