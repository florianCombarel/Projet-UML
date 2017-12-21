package test;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

import model.Agence;
import model.bien_immobilier.Appartement;
import model.bien_immobilier.BienImmobilier;
import model.personne.Personne;
import model.personne.PersonnePhysique;

public class AgenceTest {
	
	Agence agence;

	@Test
	public void testAddClients() {
		agence = new Agence("Timmo");
		Personne p1 = new PersonnePhysique("Lejeune", "Nicolas", "Mirail", "0515544542", "coucou@gmail.com");
		assertTrue(agence.getClients().size() == 0);
		
		agence.addClients(p1);
		
		assertTrue(agence.getClients().size() == 1);
		
	}

	@Test
	public void testAddBiens() {
		agence = new Agence("Timmo");
		BienImmobilier b1 = new Appartement("Toulouse", "Sud", 10000, new Date(), new Date(), 3, 5, 1000);
		assertTrue(agence.getBiens().size() == 0);
		
		agence.addBiens(b1);
		
		assertTrue(agence.getBiens().size() == 1);
	}

	@Test
	public void testRemoveClients() {
		agence = new Agence("Timmo");
		Personne p1 = new PersonnePhysique("Lejeune", "Nicolas", "Mirail", "0515544542", "coucou@gmail.com");
		assertTrue(agence.getClients().size() == 0);
		
		agence.addClients(p1);
		
		assertTrue(agence.getClients().size() == 1);
		
		agence.removeClients(151554545);
		
		assertTrue(agence.getClients().size() == 1);
	}

	@Test
	public void testRemoveBiens() {
		agence = new Agence("Timmo");
		BienImmobilier b1 = new Appartement("Toulouse", "Sud", 10000, new Date(), new Date(), 3, 5, 1000);
		assertTrue(agence.getBiens().size() == 0);
		
		agence.addBiens(b1);
		
		assertTrue(agence.getBiens().size() == 1);
		
		agence.removeBiens(51545757);
		
		assertTrue(agence.getBiens().size() == 1);
	}

}
