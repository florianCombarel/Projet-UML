package test;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

import model.Publicite;
import model.RendezVous;
import model.bien_immobilier.Appartement;
import model.bien_immobilier.BienImmobilier;
import model.personne.Personne;
import model.personne.PersonnePhysique;

public class BienImmobilierTest {
	
	BienImmobilier b;

	@Test
	public void testAddRendezVous() {
		b = new Appartement("Toulouse", "Sud", 10000, new Date(), new Date(), 3, 5, 1000);
		Personne p = new PersonnePhysique("Lejeune", "Nicolas", "Mirail", "0515544542", "coucou@gmail.com");
		RendezVous rdv = new RendezVous(new Date(2018,12,5), p, b);
		b.addRendezVous(rdv);
		assertTrue(b.getRendezVous().size() == 1);
	}

	@Test
	public void testRemoveRendezVous() {
		b = new Appartement("Toulouse", "Sud", 10000, new Date(), new Date(), 3, 5, 1000);
		Personne p = new PersonnePhysique("Lejeune", "Nicolas", "Mirail", "0515544542", "coucou@gmail.com");
		RendezVous rdv = new RendezVous(new Date(2018,12,5), p, b);
		b.addRendezVous(rdv);
		assertTrue(b.getRendezVous().size() == 1);
		b.removeRendezVous(1545431);
		assertTrue(b.getRendezVous().size() == 1);
	}

	@Test
	public void testAddPublicite() {
		b = new Appartement("Toulouse", "Sud", 10000, new Date(), new Date(), 3, 5, 1000);
		Personne p = new PersonnePhysique("Lejeune", "Nicolas", "Mirail", "0515544542", "coucou@gmail.com");
		Publicite pub = new Publicite(b);
		b.addPublicite(pub);
		assertTrue(b.getPublicites().size() == 1);
	}

	@Test
	public void testRemovePublicite() {
		b = new Appartement("Toulouse", "Sud", 10000, new Date(), new Date(), 3, 5, 1000);
		Personne p = new PersonnePhysique("Lejeune", "Nicolas", "Mirail", "0515544542", "coucou@gmail.com");
		Publicite pub = new Publicite(b);
		b.addPublicite(pub);
		assertTrue(b.getPublicites().size() == 1);
		b.removePublicite(487454);
		assertTrue(b.getPublicites().size() == 1);
	}

}
