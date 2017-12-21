import java.util.Date;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

import model.Agence;
import model.Mandat;
import model.PromesseVente;
import model.RendezVous;
import model.Voeu;
import model.bien_immobilier.Appartement;
import model.bien_immobilier.BienImmobilier;
import model.bien_immobilier.Maison;
import model.bien_immobilier.Terrain;
import model.personne.Personne;
import model.personne.PersonneMorale;
import model.personne.PersonnePhysique;

public class Console {
	
	private static Agence agence = new Agence("Timmo");
	static Scanner clavier = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("- Bienvenue dans l'application de gestion de l'agence Timmo -");
		menuGeneral();
		System.out.println("\nAurevoir !");
		clavier.close();
	}
	
	private static void menuGeneral() {
		int valClavier = 0;
		while(valClavier != 6){
			System.out.print("\n- Vous êtes dans le menu principal de l'application -");
			System.out.println("\n[1] Menu de gestion des clients\n"
					+ "[2] Menu de gestion des biens immobiliers\n"
					+ "[3] Menu de gestion des mandats\n"
					+ "[4] Menu de gestion des promesse\n"
					+ "[5] Menu de gestion des rdv\n"
					+ "[6] Quitter");
			do{
				System.out.print("Entrer un nombre correspondant à l'action à effectuer : ");
				try{
					valClavier = clavier.nextInt();
				}catch(Exception e){
					clavier.next();
				}
			}while(valClavier < 1 || valClavier > 6);
			switch(valClavier){
			case 1 :
				menuClient();
				break;
			case 2 :
				menuBienImmobilier();
				break;
			case 3 :
				menuMandat();
				break;
			case 4 :
				menuPromesse();
				break;
			case 5 :
				menuRDV();
				break;
			case 6 :
				break;
			}
		}
	}
	
	private static void menuClient(){
		int valClavier = 0;
		while(valClavier != 10){
			System.out.print("\n- Vous êtes dans le menu de gestion des clients -");
			System.out.println("\n[1] Afficher la liste des clients\n"
					+ "[2] Ajouter un client\n"
					+ "[3] Supprimer un client\n"
					+ "[4] Voir la liste des mandats d'un client\n"
					+ "[5] Voir la liste des promesses d'un client\n"
					+ "[6] Voir la liste des rdv d'un client\n"
					+ "[7] Voir la liste des voeux d'un client\n"
					+ "[8] Ajouter un voeu pour un client\n"
					+ "[9] Supprimer un voeu pour un client\n"
					+ "[10] Revenir au menu précédent");
			do{
				System.out.print("Entrer un nombre correspondant à l'action à effectuer : ");
				try{
					valClavier = clavier.nextInt();
				}catch(Exception e){
					clavier.next();
				}
			}while(valClavier < 1 || valClavier > 10);
			switch(valClavier){
			case 1 :
				afficherListeClients();
				break;
			case 2 :
				ajouterClient();
				break;
			case 3 :
				supprimerClient();
				break;
			case 4 :
				afficherListeMandats();
				break;
			case 5 :
				afficherListePromesses();
				break;
			case 6 :
				afficherListeRDV();
				break;
			case 7 :
				afficherListeVoeux();
				break;
			case 8 :
				ajouterVoeu();
				break;
			case 9 :
				break;
			case 10 :
				menuGeneral();
				break;
			}
		}
	}
	
	private static void afficherListeClients(){
		System.out.print("\n- Liste des clients -");
		StringBuilder str = new StringBuilder();
		for(Entry<Integer, Personne> client : agence.getClients().entrySet()){
			str.append("\n["+client.getKey()+"]    "+client.getValue());
		}
		System.out.println(str.toString());
	}
	
	private static void ajouterClient(){
		System.out.print("\n- Ajout d'un client -");
		int valChoixPersonne = 0;
		do{
			System.out.print("\n[1] Créer un client physique / [2] Créer un client moral : ");
			try{
				valChoixPersonne = clavier.nextInt();
			}catch(Exception e){
				clavier.next();
			}
		}while(valChoixPersonne < 1 || valChoixPersonne > 2);
		
		String valNom = "";
		String valPrenom = "";
		String valAdresse = "";
		String valTelephone = "";
		String valMail = "";
		String valFormeJuridique = "";
		String valNumSiren = "";
		switch(valChoixPersonne){
		case 1:
			clavier.nextLine();
			do{
				System.out.print("\nNom du client : ");
				try{
					valNom = clavier.nextLine();
				}catch(Exception e){
					clavier.next();
				}
			}while(valNom.equals(""));
			
			do{
				System.out.print("\nPrénom du client : ");
				try{
					valPrenom = clavier.nextLine();
				}catch(Exception e){
					clavier.next();
				}
			}while(valPrenom.equals(""));
			
			do{
				System.out.print("\nAdresse du client : ");
				try{
					valAdresse = clavier.nextLine();
				}catch(Exception e){
					clavier.next();
				}
			}while(valAdresse.equals(""));
			
			do{
				System.out.print("\nTelephone du client : ");
				try{
					valTelephone = clavier.nextLine();
				}catch(Exception e){
					clavier.next();
				}
			}while(valTelephone.equals(""));
			
			do{
				System.out.print("\nMail du client : ");
				try{
					valMail = clavier.nextLine();
				}catch(Exception e){
					clavier.next();
				}
			}while(valMail.equals(""));
			
			PersonnePhysique p = new PersonnePhysique(valNom,valPrenom,valAdresse,valTelephone,valMail);
			agence.addClients(p);
			break;
			
		case 2:
			clavier.nextLine();
			do{
				System.out.print("\nNom du client : ");
				try{
					valNom = clavier.nextLine();
				}catch(Exception e){
					clavier.next();
				}
			}while(valNom.equals(""));
			do{
				System.out.print("\nAdresse du client : ");
				try{
					valAdresse = clavier.nextLine();
				}catch(Exception e){
					clavier.next();
				}
			}while(valAdresse.equals(""));
			
			do{
				System.out.print("\nTelephone du client : ");
				try{
					valTelephone = clavier.nextLine();
				}catch(Exception e){
					clavier.next();
				}
			}while(valTelephone.equals(""));
			
			do{
				System.out.print("\nMail du client : ");
				try{
					valMail = clavier.nextLine();
				}catch(Exception e){
					clavier.next();
				}
			}while(valMail.equals(""));
			
			do{
				System.out.print("\nForme juridique du client : ");
				try{
					valFormeJuridique = clavier.nextLine();
				}catch(Exception e){
					clavier.next();
				}
			}while(valFormeJuridique.equals(""));
			
			do{
				System.out.print("\nNuméro Siren du client : ");
				try{
					valNumSiren = clavier.nextLine();
				}catch(Exception e){
					clavier.next();
				}
			}while(valNumSiren.equals(""));
			
			PersonneMorale pM = new PersonneMorale(valNom,valAdresse,valTelephone,valMail,valFormeJuridique,valNumSiren);
			agence.addClients(pM);
			break;
		}
	}
	
	private static void supprimerClient(){
		System.out.print("\n- Suppression d'un client -");
		int valChoixPersonne = 0;
		do{
			System.out.print("\nNuméro du client à supprimer : ");
			try{
				valChoixPersonne = clavier.nextInt();
			}catch(Exception e){
				clavier.next();
			}
		}while(valChoixPersonne < 0);
		
		if(agence.getPersonne(valChoixPersonne) != null){
			agence.removeClients(valChoixPersonne);
		}
	}
	
	private static void afficherListeMandats(){
		System.out.print("\n- Liste des mandats d'un client -");
		StringBuilder str = new StringBuilder();
		int valChoixPersonne = 0;
		do{
			System.out.print("\nNuméro du client dont on veut afficher la liste : ");
			try{
				valChoixPersonne = clavier.nextInt();
			}catch(Exception e){
				clavier.next();
			}
		}while(valChoixPersonne < 0);
		
		Personne p = agence.getPersonne(valChoixPersonne);
		for(Entry<Integer, Mandat> m : p.getBiensEnVente().entrySet()){
			str.append("\n["+m.getKey()+"]    "+m.getValue());
		}
		System.out.println(str.toString());
	}
	
	private static void afficherListePromesses(){
		System.out.print("\n- Liste des promesses d'un client -");
		StringBuilder str = new StringBuilder();
		int valChoixPersonne = 0;
		do{
			System.out.print("\nNuméro du client dont on veut afficher la liste : ");
			try{
				valChoixPersonne = clavier.nextInt();
			}catch(Exception e){
				clavier.next();
			}
		}while(valChoixPersonne < 0);
		
		Personne p = agence.getPersonne(valChoixPersonne);
		for(Entry<Integer, PromesseVente> pr : p.getBiensAchetes().entrySet()){
			str.append("\n["+pr.getKey()+"]    "+pr.getValue());
		}
		System.out.println(str.toString());
	}
	
	private static void afficherListeRDV(){
		System.out.print("\n- Liste des rdv d'un client -");
		StringBuilder str = new StringBuilder();
		int valChoixPersonne = 0;
		do{
			System.out.print("\nNuméro du client dont on veut afficher la liste : ");
			try{
				valChoixPersonne = clavier.nextInt();
			}catch(Exception e){
				clavier.next();
			}
		}while(valChoixPersonne < 0);
		
		Personne p = agence.getPersonne(valChoixPersonne);
		for(Entry<Integer, RendezVous> r : p.getBiensVisites().entrySet()){
			str.append("\n["+r.getKey()+"]    "+r.getValue());
		}
		System.out.println(str.toString());
	}
	
	private static void afficherListeVoeux(){
		System.out.print("\n- Liste des voeux d'un client -");
		StringBuilder str = new StringBuilder();
		int valChoixPersonne = 0;
		do{
			System.out.print("\nNuméro du client dont on veut afficher la liste : ");
			try{
				valChoixPersonne = clavier.nextInt();
			}catch(Exception e){
				clavier.next();
			}
		}while(valChoixPersonne < 0);
		
		Personne p = agence.getPersonne(valChoixPersonne);
		for(Entry<Integer,Voeu> v : p.getSetVoeu().entrySet()){
			str.append("\n["+v.getKey()+"]    "+v.getValue());
		}
		System.out.println(str.toString());
	}
	
	private static void ajouterVoeu(){
		System.out.print("\n- Ajout d'un voeu -");
		int valChoixPersonne = 0;
		String typeBien = "";
		double prixSouhaite = 0;
		String localisation = "";
		double surfaceAuSol = 0;
		int nbPiece = 0;
		
		do{
			System.out.print("\nNuméro du client dont on veut ajouter un voeu : ");
			try{
				valChoixPersonne = clavier.nextInt();
			}catch(Exception e){
				clavier.next();
			}
		}while(valChoixPersonne < 0);
		Personne p = agence.getPersonne(valChoixPersonne);
		
		clavier.nextLine();
		do{
			System.out.print("\nType de bien : ");
			try{
				typeBien = clavier.nextLine();
			}catch(Exception e){
				clavier.next();
			}
		}while(!typeBien.equals("terrain") && !typeBien.equals("maison") && !typeBien.equals("appartement"));
		
		if(typeBien.equals("terrain") || typeBien.equals("maison")){
			do{
				System.out.print("\nPrix souhaité : ");
				try{
					prixSouhaite = clavier.nextDouble();
				}catch(Exception e){
					clavier.next();
				}
			}while(prixSouhaite < 0);
			
			clavier.nextLine();
			do{
				System.out.print("\nLocalisation : ");
				try{
					localisation = clavier.nextLine();
				}catch(Exception e){
					clavier.next();
				}
			}while(localisation.equals(""));
			
			do{
				System.out.print("\nSurface au sol : ");
				try{
					surfaceAuSol = clavier.nextDouble();
				}catch(Exception e){
					clavier.next();
				}
			}while(surfaceAuSol < 0);
		}
		
		if(typeBien.equals("appartement") || typeBien.equals("maison")){
			do{
				System.out.print("\nNombre de pièce : ");
				try{
					nbPiece = clavier.nextInt();
				}catch(Exception e){
					clavier.next();
				}
			}while(nbPiece < 0);
		}
		Voeu v = new Voeu(typeBien, prixSouhaite, localisation, surfaceAuSol, nbPiece, p);
		p.addVoeu(v);
	}
	
	private static void menuMandat(){
		int valClavier = 0;
		while(valClavier != 4){
			System.out.print("\n- Vous êtes dans le menu de gestion des mandats -");
			System.out.println("\n[1] Afficher la liste des mandats\n"
					+ "[2] Ajouter un mandat\n"
					+ "[3] Supprimer un mandat\n"
					+ "[4] Revenir au menu précédent");
			do{
				System.out.print("Entrer un nombre correspondant à l'action à effectuer : ");
				try{
					valClavier = clavier.nextInt();
				}catch(Exception e){
					clavier.next();
				}
			}while(valClavier < 1 || valClavier > 4);
			switch(valClavier){
			case 1 :
				break;
			case 2 :
				break;
			case 3 :
				break;
			case 4 :
				break;
			}
		}
	}
	
	private static void menuPromesse(){
		int valClavier = 0;
		while(valClavier != 4){
			System.out.print("\n- Vous êtes dans le menu de gestion des promesses -");
			System.out.println("\n[1] Afficher la liste des promesses\n"
					+ "[2] Ajouter une promesse\n"
					+ "[3] Supprimer une promesse\n"
					+ "[4] Revenir au menu précédent");
			do{
				System.out.print("Entrer un nombre correspondant à l'action à effectuer : ");
				try{
					valClavier = clavier.nextInt();
				}catch(Exception e){
					clavier.next();
				}
			}while(valClavier < 1 || valClavier > 4);
			switch(valClavier){
			case 1 :
				break;
			case 2 :
				break;
			case 3 :
				break;
			case 4 :
				break;
			}
		}
	}
	
	private static void menuRDV(){
		int valClavier = 0;
		while(valClavier != 4){
			System.out.print("\n- Vous êtes dans le menu de gestion des rdv -");
			System.out.println("\n[1] Afficher la liste des rdv\n"
					+ "[2] Ajouter une rdv\n"
					+ "[3] Supprimer une rdv\n"
					+ "[4] Revenir au menu précédent");
			do{
				System.out.print("Entrer un nombre correspondant à l'action à effectuer : ");
				try{
					valClavier = clavier.nextInt();
				}catch(Exception e){
					clavier.next();
				}
			}while(valClavier < 1 || valClavier > 4);
			switch(valClavier){
			case 1 :
				break;
			case 2 :
				break;
			case 3 :
				break;
			case 4 :
				break;
			}
		}
	}

	private static void menuBienImmobilier(){
		int valClavier = 0;
		while(valClavier != 10){
			System.out.print("\n- Vous êtes dans le menu de gestion des biens immobiliers -");
			System.out.println("\n[1] Afficher la liste des biens immobiliers\n"
					+ "[2] Ajouter un bien immobilier\n"
					+ "[3] Supprimer un bien immobilier\n"
					+ "[4] Voir la liste des rendez-vous pour un bien immobilier\n"
					+ "[5] Voir la liste des publicites pour un bien immobilier\n"
					+ "[6] Revenir au menu précédent");
			do{
				System.out.print("Entrer un nombre correspondant à l'action à effectuer : ");
				try{
					valClavier = clavier.nextInt();
				}catch(Exception e){
					clavier.next();
				}
			}while(valClavier < 1 || valClavier > 10);
			switch(valClavier){
			case 1 :
				afficherListeBiens();
				break;
			case 2 :
				ajouterBien();
				break;
			case 3 :
				supprimerBien();
				break;
			case 4 :
				afficherListeRendezVous();
				break;
			case 5 :
				afficherListePublicites();
				break;
			case 6 :
				menuGeneral();
				break;
			}
		}
	}
	
	private static void afficherListeBiens(){
		System.out.print("\n- Liste des biens immobiliers -");
		StringBuilder str = new StringBuilder();
		for(Entry<Integer, BienImmobilier> bien : agence.getBiens().entrySet()){
			str.append("\n["+bien.getKey()+"]    "+bien.getValue());
		}
		System.out.println(str.toString());
	}
	
	private static void ajouterBien(){
		System.out.print("\n- Ajout d'un bien immobilier -");
		int valChoixBien = 0;
		do{
			System.out.print("\n[1] Créer un appartement / [2] Créer un terrain / [3] Créer une maison : ");
			try{
				valChoixBien = clavier.nextInt();
			}catch(Exception e){
				clavier.next();
			}
		}while(valChoixBien < 1 || valChoixBien > 3);
		clavier.nextLine();
		switch(valChoixBien){
		case 1:
			creerAppartement();
			break;
		case 2:
			creerTerrain();
			break;
		case 3:
			creerMaison();
			break;
		default:
			menuBienImmobilier();
			break;
		}	
	}
	
	private static void creerAppartement() {
		String adresse = "";
		do {
			System.out.print("\nAdresse de l'appartement : ");
			try{
				adresse = clavier.nextLine();
			}catch(Exception e){
				clavier.next();
			}
		}while(adresse.equals(""));
		String exposition = "";
		do {
			System.out.println("\nExposition : ");
			try{
				exposition = clavier.nextLine();
			}catch(Exception e){
				clavier.next();
			}
		}while(exposition.equals(""));
		double demandPrice = 0;
		do {
			System.out.println("\nPrix demandé : ");
			try{
				demandPrice = clavier.nextDouble();
			}catch(Exception e){
				clavier.next();
			}
		}while(demandPrice < 0);
		
		Date dateSellingDemand = getDate("demand");
		Date dateDispo = getDate("dispo");
		
		int nbRoom = 0;
		do {
			System.out.println("\nNombre de pièces : ");
			try{
				nbRoom = clavier.nextInt();
			}catch(Exception e){
				clavier.next();
			}
		}while(nbRoom < 0);
		
		int floor = 0;
		do {
			System.out.println("\nNombre d'étages : ");
			try{
				floor = clavier.nextInt();
			}catch(Exception e){
				clavier.next();
			}
		}while(floor < 0);
		
		double monthlySubs = 0;
		do {
			System.out.println("\nCharges mensuelles : ");
			try{
				monthlySubs = clavier.nextDouble();
			}catch(Exception e){
				clavier.next();
			}
		}while(monthlySubs < 0);
		
		BienImmobilier b = new Appartement(adresse, exposition, demandPrice, dateSellingDemand, dateDispo, nbRoom, floor, monthlySubs);
		agence.addBiens(b);
	}
	
	private static Date getDate(String info) {
		Date dateSellingDemand = null;
		String message = "";
		if(info == "demand") {
			message = "\nDate de demande de vente : ";
		} else if(info == "dispo"){
			message = "\nDate de disponibilité : ";
		}
		do {
			System.out.println(message);
			int year = 0;
			int month = 0;
			int day = 0;
			try{
				System.out.println("\nAnnée : ");
				year = clavier.nextInt();
				System.out.println("\nMois : ");
				month = clavier.nextInt();
				System.out.println("\nJour : ");
				day = clavier.nextInt();
			}catch(Exception e){
				clavier.next();
			}
			dateSellingDemand = new Date(year, month, day);
		} while(dateSellingDemand.equals(null));
		return dateSellingDemand;
	}
	
	private static void creerTerrain() {
		String adresse = "";
		do {
			System.out.print("\nAdresse du terrain : ");
			try{
				adresse = clavier.nextLine();
			}catch(Exception e){
				clavier.next();
			}
		}while(adresse.equals(""));
		String exposition = "";
		do {
			System.out.println("\nExposition : ");
			try{
				exposition = clavier.nextLine();
			}catch(Exception e){
				clavier.next();
			}
		}while(exposition.equals(""));
		double demandPrice = 0;
		do {
			System.out.println("\nPrix demandé : ");
			try{
				demandPrice = clavier.nextDouble();
			}catch(Exception e){
				clavier.next();
			}
		}while(demandPrice < 0);
		
		Date dateSellingDemand = getDate("demand");
		Date dateDispo = getDate("dispo");
		
		double livingSurface = 0;
		do {
			System.out.println("\nSurface : ");
			try{
				livingSurface = clavier.nextDouble();
			}catch(Exception e){
				clavier.next();
			}
		}while(livingSurface < 0);
		
		double facadeLength = 0;
		do {
			System.out.println("\nLongueur de façade : ");
			try{
				facadeLength = clavier.nextDouble();
			}catch(Exception e){
				clavier.next();
			}
		}while(facadeLength < 0);
		
		BienImmobilier b = new Terrain(adresse, exposition, demandPrice, dateSellingDemand, dateDispo, livingSurface, facadeLength);
		agence.addBiens(b);
		
	}
	
	private static void creerMaison() {
		String adresse = "";
		do {
			System.out.print("\nAdresse de la maison : ");
			try{
				adresse = clavier.nextLine();
			}catch(Exception e){
				clavier.next();
			}
		}while(adresse.equals(""));
		String exposition = "";
		do {
			System.out.println("\nExposition : ");
			try{
				exposition = clavier.nextLine();
			}catch(Exception e){
				clavier.next();
			}
		}while(exposition.equals(""));
		double demandPrice = 0;
		do {
			System.out.println("\nPrix demandé : ");
			try{
				demandPrice = clavier.nextDouble();
			}catch(Exception e){
				clavier.next();
			}
		}while(demandPrice < 0);
		
		Date dateSellingDemand = getDate("demand");
		Date dateDispo = getDate("dispo");
		
		double livingSurface = 0;
		do {
			System.out.println("\nSurface : ");
			try{
				livingSurface = clavier.nextDouble();
			}catch(Exception e){
				clavier.next();
			}
		}while(livingSurface < 0);
		
		int nbRoom = 0;
		do {
			System.out.println("\nNombre de pièces : ");
			try{
				nbRoom = clavier.nextInt();
			}catch(Exception e){
				clavier.next();
			}
		}while(nbRoom < 0);
		
		int nbFloor = 0;
		do {
			System.out.println("\nNombre d'étages : ");
			try{
				nbFloor = clavier.nextInt();
			}catch(Exception e){
				clavier.next();
			}
		}while(nbFloor < 0);
		String heatingSystem = "";
		do {
			System.out.print("\nSystème de chauffage : ");
			try{
				heatingSystem = clavier.nextLine();
			}catch(Exception e){
				clavier.next();
			}
		}while(heatingSystem.equals(""));
		
		BienImmobilier b = new Maison(adresse, exposition, demandPrice, dateSellingDemand, dateDispo, livingSurface, nbRoom, nbFloor, heatingSystem);
		agence.addBiens(b);
	}
	
	private static void supprimerBien(){
		
	}
	
	private static void afficherListeRendezVous(){
		
	}
	
	private static void afficherListePublicites(){
		
	}
}
