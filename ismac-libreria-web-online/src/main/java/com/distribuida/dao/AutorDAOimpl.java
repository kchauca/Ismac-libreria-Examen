package com.distribuida.dao;

import java.util.List;

import javax.transaction.Transactional;
import com.distribuida.entities.Autor;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AutorDAOimpl implements AutorDAO{

	@Autowired
	private SessionFactory sessionFactory;

	@Transactional
	public List<Autor> findALL() {
		// TODO Auto-generated method stub
		
		Session session = sessionFactory.getCurrentSession();
		return session.createQuery("SELECT au FROM Autor au", Autor.class).getResultList();
	}

	@Transactional
	public Autor findOne(int id) {
		// TODO Auto-generated method stub
		
		Session session = sessionFactory.getCurrentSession();

		
		Query query = session.createQuery("SELECT au FROM Autor au WHERE au.idAutor =: keyIdAutor");
		query.setParameter("keyIdAutor", id);
		return (Autor) query.getSingleResult();
	}

	@Transactional
	public void add(Autor autor) {
		// TODO Auto-generated method stub
		
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(autor);

	}

	@Transactional
	public void up(Autor autor) {
		// TODO Auto-generated method stub

		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("UPDATE Autor au SET au.nombre =: keyNombre "
												   +", au.apellido  =: keyApellido"
												   +", au.pais      =: keyPais"
												   +", au.direccion =: keyDireccion"
												   +", au.telefono  =: keyTelefono"
												   +", au.correo    =: keyCorreo"
												   +" WHERE au.idAutor =: keyIdAutor");		
		query.setParameter("keyNombre",autor.getNombre());
		query.setParameter("keyApellido",autor.getApellido());
		query.setParameter("keyPais",autor.getPais());
		query.setParameter("keyDireccion",autor.getDireccion());
		query.setParameter("keyTelefono",autor.getTelefono());
		query.setParameter("keyCorreo",autor.getCorreo());
		query.setParameter("keyIdAutor",autor.getIdAutor());

		query.executeUpdate();
	}

	@Transactional
	public void dell(int id) {
		// TODO Auto-generated method stub

		Session session = sessionFactory.getCurrentSession();
		Query query=session.createQuery("DELETE FROM Autor au WHERE au.idAutor =: keyIdAutor");
		query.setParameter("keyIdAutor", id);
		query.executeUpdate();
		
		
	}
}
