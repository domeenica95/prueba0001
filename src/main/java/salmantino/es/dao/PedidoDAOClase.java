package salmantino.es.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import salmantino.es.controlador.entity.Cliente;
import salmantino.es.controlador.entity.Pedido;

public class PedidoDAOClase implements PedidoDAO  {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public List<Pedido> getPedidos() {
		Session miSession=sessionFactory.getCurrentSession();
		Query<Pedido> miQuery=miSession.createQuery("from Pedido",Pedido.class);
		List<Pedido> pedidos=miQuery.getResultList();
		return pedidos;
}

	@Override
	@Transactional
	public void insertarPedido(Pedido elPedido) {
		Session miSession=sessionFactory.getCurrentSession();
		//miSession.save(elPedido);   este solo vale para insertar
		miSession.saveOrUpdate(elPedido); //sirve para actualizar o insertar se adapta
		
	}

	@Override
	public Cliente getPedido(int idPedido) {
		//tarea obtener la sesión
		Session miSession=sessionFactory.getCurrentSession();
		//obtener la información del pedido seleccionado
		Cliente elPedido=miSession.get(Cliente.class, idPedido);
		// devuelve el pedido
		return elPedido;
	}

	@Override
	public void eliminarPedido(int idPedido) {
		//tarea obtener la sesión
		Session miSession=sessionFactory.getCurrentSession();
		//eliminar el registro de la BBDD con su id correspondiente
		//cñodigo ORM para borrar
		Query consulta=miSession.createQuery("delete from Pedidos where id=:IdDelPedido");
		consulta.setParameter("IdDelPedido",idPedido);
		consulta.executeUpdate();  //ejecuta ésta actualización
		
	}
	
}
