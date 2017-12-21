package test;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

import model.Mandat;
import model.PromesseVente;
import model.RendezVous;
import model.Voeu;
import model.bien_immobilier.Appartement;
import model.bien_immobilier.BienImmobilier;
import model.personne.Personne;
import model.personne.PersonnePhysique;

public class PersonneTest {
	
	Personne p;

	@Test
	public void testAddMandat() {
		p = new PersonnePhysique("Lejeune", "Nicolas", "Mirail", "0515544542", "coucou@gmail.com");
		BienImmobilier b1 = new Appartement("Toulouse", "Sud", 10000, new Date(), new Date(), 3, 5, 1000);
		Mandat m = new Mandat(b1,p, new Date());
		assertTrue(p.getbiensEnVente().size() == 0);
		
		p.addMandat(m);
		
		assertTrue(p.getbiensEnVente().size() == 1);
	}

	@Test
	public void testAddPromesseVente() {
		p = new PersonnePhysique("Lejeune", "Nicolas", "Mirail", "0515544542", "coucou@gmail.com");
		BienImmobilier b1 = new Appartement("Toulouse", "Sud", 10000, new Date(), new Date(), 3, 5, 1000);
		PromesseVente pv = new PromesseVente(100000, "Toulouse", new Date(), 1500, 50000, b1, p);
		assertTrue(p.getbiensAchetes().size() == 0);
		
		p.addPromesseVente(pv);
		
		assertTrue(p.getbiensAchetes().size() == 1);
	}

	@Test
	public void testAddRendezVous() {
		p = new PersonnePhysique("Lejeune", "Nicolas", "Mirail", "0515544542", "coucou@gmail.com");
		BienImmobilier b1 = new Appartement("Toulouse", "Sud", 10000, new Date(), new Date(), 3, 5, 1000);
		RendezVous rdv = new RendezVous(new Date(), p, b1);
		assertTrue(p.getbiensVisites().size() == 0);
		
		p.addRendezVous(rdv);
		
		assertTrue(p.getbiensVisites().size() == 1);
	}

	@Test
	public void testAddVoeu() {
		p = new PersonnePhysique("Lejeune", "Nicolas", "Mirail", "0515544542", "coucou@gmail.com");
		BienImmobilier b1 = new Appartement("Toulouse", "Sud", 10000, new Date(), new Date(), 3, 5, 1000);
		Voeu v = new Voeu("Appartement", 400000, "Blagnac", 151, 5, p);
		assertTrue(p.getSetVoeu().size() == 0);
		
		p.addVoeu(v);
		
		assertTrue(p.getSetVoeu().size() == 1);
	}

	@Test
	public void testRemoveMandat() {
		p = new PersonnePhysique("Lejeune", "Nicolas", "Mirail", "0515544542", "coucou@gmail.com");
		BienImmobilier b1 = new Appartement("Toulouse", "Sud", 10000, new Date(), new Date(), 3, 5, 1000);
		Mandat m = new Mandat(b1,p, new Date());
		assertTrue(p.getbiensEnVente().size() == 0);
		
		p.addMandat(m);
		
		assertTrue(p.getbiensEnVente().size() == 1);
		
		p.removeMandat(m);
		
		assertTrue(p.getbiensEnVente().size() == 0);
	}

	@Test
	public void testRemovePromesseVente() {
		p = new PersonnePhysique("Lejeune", "Nicolas", "Mirail", "0515544542", "coucou@gmail.com");
		BienImmobilier b1 = new Appartement("Toulouse", "Sud", 10000, new Date(), new Date(), 3, 5, 1000);
		PromesseVente pv = new PromesseVente(100000, "Toulouse", new Date(), 1500, 50000, b1, p);
		assertTrue(p.getbiensAchetes().size() == 0);
		
		p.addPromesseVente(pv);
		
		assertTrue(p.getbiensAchetes().size() == 1);
		
		p.removePromesseVente(pv);
		
		assertTrue(p.getbiensAchetes().size() == 0);
	}

	@Test
	public void testRemoveRendezVous() {
		p = new PersonnePhysique("Lejeune", "Nicolas", "Mirail", "0515544542", "coucou@gmail.com");
		BienImmobilier b1 = new Appartement("Toulouse", "Sud", 10000, new Date(), new Date(), 3, 5, 1000);
		RendezVous rdv = new RendezVous(new Date(), p, b1);
		assertTrue(p.getbiensVisites().size() == 0);
		
		p.addRendezVous(rdv);
		
		assertTrue(p.getbiensVisites().size() == 1);
		
		p.removeRendezVous(rdv);
		
		assertTrue(p.getbiensVisites().size() == 0);
	}

	@Test
	public void testRemoveVoeu() {
		p = new PersonnePhysique("Lejeune", "Nicolas", "Mirail", "0515544542", "coucou@gmail.com");
		BienImmobilier b1 = new Appartement("Toulouse", "Sud", 10000, new Date(), new Date(), 3, 5, 1000);
		Voeu v = new Voeu("Appartement", 400000, "Blagnac", 151, 5, p);
		assertTrue(p.getSetVoeu().size() == 0);
		
		p.addVoeu(v);
		
		assertTrue(p.getSetVoeu().size() == 1);
		
		p.removeVoeu(v);
		
		assertTrue(p.getSetVoeu().size() == 0);
	}

	@Test
	public void testGetMandat() {
		p = new PersonnePhysique("Lejeune", "Nicolas", "Mirail", "0515544542", "coucou@gmail.com");
		BienImmobilier b1 = new Appartement("Toulouse", "Sud", 10000, new Date(), new Date(), 3, 5, 1000);
		Mandat m = new Mandat(b1,p, new Date(2018,12,5));
		assertTrue(p.getMandat(b1) == null);
		
		p.addMandat(m);
		
		assertTrue(p.getMandat(b1) == m);
	}

	@Test
	public void testGetPromesseVente() {
		p = new PersonnePhysique("Lejeune", "Nicolas", "Mirail", "0515544542", "coucou@gmail.com");
		BienImmobilier b1 = new Appartement("Toulouse", "Sud", 10000, new Date(), new Date(), 3, 5, 1000);
		PromesseVente pv = new PromesseVente(100000, "Toulouse", new Date(2018,12,5), 1500, 50000, b1, p);
		assertTrue(p.getPromesseVente(b1) == null);
		
		p.addPromesseVente(pv);
		
		assertTrue(p.getPromesseVente(b1) == pv);
	}

	@Test
	public void testGetRendezVous() {
		p = new PersonnePhysique("Lejeune", "Nicolas", "Mirail", "0515544542", "coucou@gmail.com");
		BienImmobilier b1 = new Appartement("Toulouse", "Sud", 10000, new Date(), new Date(), 3, 5, 1000);
		RendezVous rdv = new RendezVous(new Date(2018,12,5), p, b1);
		assertTrue(p.getRendezVous(b1) == null);
		
		p.addRendezVous(rdv);
		
		assertTrue(p.getRendezVous(b1)  == rdv);
	}
	
	@Test
	public void testGetVoeu() {
		
	}

}
