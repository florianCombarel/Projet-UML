import java.util.InputMismatchException;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

import model.Agence;
import model.Mandat;
import model.PromesseVente;
import model.RendezVous;
import model.Voeu;
import model.personne.Personne;
import model.personne.PersonneMorale;
import model.personne.PersonnePhysique;

public class Console {
	
	private static Agence agence = new Agence("Timmo");
	static Scanner clavier = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("- Bienvenue dans l'application de gestion de l'agence Timmo -");
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
		System.out.println("\nAurevoir !");
		clavier.close();
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
				break;
			case 9 :
				break;
			case 10 :
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
		for(Mandat m : p.getbiensEnVente()){
			str.append("\n"+m);
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
		for(PromesseVente pr : p.getbiensAchetes()){
			str.append("\n"+pr);
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
		for(RendezVous r : p.getbiensVisites()){
			str.append("\n"+r);
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
		for(Voeu v : p.getSetVoeu()){
			str.append("\n"+v);
		}
		System.out.println(str.toString());
	}
	
	private static void menuBienImmobilier(){
		int valClavier = 0;
		while(valClavier != 10){
			System.out.print("\n- Vous êtes dans le menu de gestion des biens immobiliers -");
			System.out.println("\n[1] Afficher la liste des biens immobiliers\n"
					+ "[2] Ajouter un bien immobilier\n"
					+ "[3] Supprimer un bien immobilier\n"
					+ "[4] Voir la liste des mandats d'un bien immobilier\n"
					+ "[5] Voir la liste des promesses d'un bien immobilier\n"
					+ "[6] Voir la liste des rdv d'un bien immobilier\n"
					+ "[7] Voir la liste des publicites d'un bien immobilier\n"
					+ "[8] Ajouter une publicite pour un bien immobilier\n"
					+ "[9] Supprimer une publicite pour un bien immobilier\n"
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
				break;
			case 2 :
				break;
			case 3 :
				break;
			case 4 :
				break;
			case 5 :
				break;
			case 6 :
				break;
			case 7 :
				break;
			case 8 :
				break;
			case 9 :
				break;
			case 10 :
				break;
			}
		}
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

}
