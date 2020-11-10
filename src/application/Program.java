package application;

import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {

		Order order = new Order(1080, new Date(), OrderStatus.AGUARDANDO_PAGAMENTO);

		System.out.println(order); // printando o objeto
		
		OrderStatus os1 = OrderStatus.ENTREGUE; // Atribuindo a enumeração "ENTREGUE" no os1
		OrderStatus os2 = OrderStatus.valueOf("ENTREGUE"); //colocando em uma outra variável
		
		System.out.println(os1);
		System.out.println(os2);
	}

}
