package test;

import static org.junit.Assert.*;

import org.junit.Test;

import model.Agence;
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
		BienImmobilier b1 = new Appartement()
		assertTrue(agence.getClients().size() == 0);
		
		agence.addClients(b1);
		
		assertTrue(agence.getClients().size() == 1);*/
	}

	@Test
	public void testRemoveClients() {
		agence = new Agence("Timmo");
		Personne p1 = new PersonnePhysique("Lejeune", "Nicolas", "Mirail", "0515544542", "coucou@gmail.com");
		assertTrue(agence.getClients().size() == 0);
		
		agence.addClients(p1);
		
		assertTrue(agence.getClients().size() == 1);
		
		agence.removeClients(p1);
		
		assertTrue(agence.getClients().size() == 0);
	}

	@Test
	public void testRemoveBiens() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetPersonne() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetNom() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetNom() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetClients() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetClients() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetBiens() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetBiens() {
		fail("Not yet implemented");
	}

}
