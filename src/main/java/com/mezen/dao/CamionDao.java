package com.mezen.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import com.mezen.entities.Camion;
import com.mezen.util.JPAutil;

public class CamionDao {
	private EntityManager entityManager=JPAutil.getEntityManager("MonCamion");
	
	public void ajouter(Camion c)
	{
	EntityTransaction tx = entityManager.getTransaction();
	tx.begin();
	entityManager.persist(c);
	tx.commit();
	}
	//méthode modifier d'une entité à partir de la bd
	public void modifier(Camion c)
	{
	EntityTransaction tx = entityManager.getTransaction();
	tx.begin();
	entityManager.merge(c);
	tx.commit();
	}
	public void supprimer(Camion c)
	{
	EntityTransaction tx = entityManager.getTransaction();
	tx.begin();
	c=entityManager.merge(c); // important
	entityManager.remove(c);
	tx.commit();
	}
	//méthode Consulter d'une entité à partir de la bd
	public Camion consulter(Camion c,Object id)
	{
	return entityManager.find(c.getClass(), id);
	}
	//méthode pour lister tous les objets à partir de la bd
	public List<Camion> listerTous() {
	List<Camion> camions = entityManager.createQuery("select c from Camion c").getResultList();

	return camions;
	}
	//méthode pour lister tous les client dont le nom contient un
	//texte donné en paramètre (pnom)
	public List<Camion> listerParNom(String nom) {
		List<Camion> camions=entityManager.createQuery( "select c from Camion c where c.nom like :pnom").setParameter("pnom","%"+nom+"%").getResultList();

	return camions; }}

