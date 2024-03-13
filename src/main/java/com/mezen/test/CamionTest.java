package com.mezen.test;
import com.mezen.dao.CamionDao;
import com.mezen.entities.Camion;

public class CamionTest {
	public class ClientTest {
		public static void main(String[] args) {
		//créer un objet Camion
		Camion c = new Camion();
		c.setNom("HILUX");
		c.setPrix(55.3);
		Camion c1 = new Camion();
		c1.setNom("Dmax");
		c1.setPrix(55.3);
		//ajouter l'objet Camion à la BD
		CamionDao cDao = new CamionDao();
		cDao.ajouter(c);
		cDao.ajouter(c1);
		System.out.println("Appel de la méthode listerTous");
		for (Camion cl : cDao.listerTous())
		System.out.println(cl.getId()+" "+cl.getNom());
		System.out.println("Appel de la méthode listerParNom");
		for (Camion cl : cDao.listerParNom("HIL"))

		System.out.println(cl.getId()+" "+cl.getNom());

		//tester les autres méthodes de la classe ClientDao
		}
		}

}
