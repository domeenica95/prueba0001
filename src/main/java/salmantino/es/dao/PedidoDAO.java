package salmantino.es.dao;

import java.util.List;

import salmantino.es.controlador.entity.Cliente;
import salmantino.es.controlador.entity.Pedido;

public interface PedidoDAO {
	public List<Pedido> getPedidos();

	public void insertarPedido(Pedido elPedido);

	public Cliente getPedido(int idPedido);

	public void eliminarPedido(int idPedido);
}
