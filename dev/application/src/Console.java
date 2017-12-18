import java.util.InputMismatchException;
import java.util.Scanner;

import model.Agence;

public class Console {
	
	private Agence agence = new Agence("Timmo");

	public static void main(String[] args) {
		System.out.println("- Bienvenue dans l'application de gestion de l'agence Timmo -");
		Scanner clavier = new Scanner(System.in);
		int valClavier = 0;
		while(valClavier != 6){
			System.out.println("\n- Vous êtes dans le menu principal de l'application -");
			System.out.println("[1] Menu de gestion des clients\n"
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
					clavier.nextLine();
				}
			}while(valClavier < 0 || valClavier > 7);
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
		clavier.close();
	}
	
	private static void menuClient(){
		Scanner clavier = new Scanner(System.in);
		int valClavier = 0;
		System.out.println("\n- Vous êtes dans le menu de gestion des clients -");
		while(valClavier != 10){
			System.out.println("[1] Afficher la liste des clients\n"
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
				}catch(InputMismatchException e){
					clavier.nextLine();
				}
			}while(valClavier < 0 || valClavier > 11);
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
			case 11 :
				break;
			case 12 :
				break;
			case 13 :
				break;
			case 14 :
				break;
			case 15 :
				break;
			case 16 :
				break;
			}
		}
		clavier.close();
	}
	
	private static void menuBienImmobilier(){
		Scanner clavier = new Scanner(System.in);
		int valClavier = 0;
		System.out.println("\n- Vous êtes dans le menu de gestion des biens immobiliers -");
		while(valClavier != 10){
			System.out.println("[1] Afficher la liste des biens immobiliers\n"
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
				}catch(InputMismatchException e){
					clavier.nextLine();
				}
			}while(valClavier < 0 || valClavier > 11);
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
			case 11 :
				break;
			case 12 :
				break;
			case 13 :
				break;
			case 14 :
				break;
			case 15 :
				break;
			case 16 :
				break;
			}
		}
		clavier.close();
	}
	
	private static void menuMandat(){
		Scanner clavier = new Scanner(System.in);
		int valClavier = 0;
		System.out.println("\n- Vous êtes dans le menu de gestion des mandats -");
		while(valClavier != 4){
			System.out.println("[1] Afficher la liste des mandats\n"
					+ "[2] Ajouter un mandat\n"
					+ "[3] Supprimer un mandat\n"
					+ "[4] Revenir au menu précédent");
			do{
				System.out.print("Entrer un nombre correspondant à l'action à effectuer : ");
				try{
					valClavier = clavier.nextInt();
				}catch(InputMismatchException e){
					clavier.nextLine();
				}
			}while(valClavier < 0 || valClavier > 5);
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
		clavier.close();
	}
	
	private static void menuPromesse(){
		Scanner clavier = new Scanner(System.in);
		int valClavier = 0;
		System.out.println("\n- Vous êtes dans le menu de gestion des promesses -");
		while(valClavier != 4){
			System.out.println("[1] Afficher la liste des promesses\n"
					+ "[2] Ajouter une promesse\n"
					+ "[3] Supprimer une promesse\n"
					+ "[4] Revenir au menu précédent");
			do{
				System.out.print("Entrer un nombre correspondant à l'action à effectuer : ");
				try{
					valClavier = clavier.nextInt();
				}catch(InputMismatchException e){
					clavier.nextLine();
				}
			}while(valClavier < 0 || valClavier > 5);
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
		clavier.close();
	}
	
	private static void menuRDV(){
		Scanner clavier = new Scanner(System.in);
		int valClavier = 0;
		System.out.println("\n- Vous êtes dans le menu de gestion des rdv -");
		while(valClavier != 4){
			System.out.println("[1] Afficher la liste des rdv\n"
					+ "[2] Ajouter une rdv\n"
					+ "[3] Supprimer une rdv\n"
					+ "[4] Revenir au menu précédent");
			do{
				System.out.print("Entrer un nombre correspondant à l'action à effectuer : ");
				try{
					valClavier = clavier.nextInt();
				}catch(InputMismatchException e){
					clavier.nextLine();
				}
			}while(valClavier < 0 || valClavier > 5);
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
		clavier.close();
	}

}
