package com.distribuida.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.distribuida.entities.Categoria;

@Repository
public class CategoriaDAOimpl implements CategoriaDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	
	@Transactional
	public List<Categoria> findALL() {
		// TODO Auto-generated method stub
		
		Session session = sessionFactory.getCurrentSession();
		return session.createQuery("from Categoria", Categoria.class).getResultList();
	}

	
	@Transactional
	public Categoria findOne(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		return session.get(Categoria.class,id);
	}

	
	@Transactional
	public void add(Categoria categoria) {
		// TODO Auto-generated method stub
		Session session =sessionFactory.getCurrentSession();
		session.saveOrUpdate(categoria);
	}

	
	@Transactional
	public void up(Categoria categoria) {
		// TODO Auto-generated method stub
		Session session =sessionFactory.getCurrentSession();
		session.saveOrUpdate(categoria);
		
	}

	
	@Transactional
	public void dell(int id) {
		// TODO Auto-generated method stub
		Session session= sessionFactory.getCurrentSession();
		session.delete(findOne(id));
		
	}
}
