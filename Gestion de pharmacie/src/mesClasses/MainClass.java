package mesClasses;

import java.util.Scanner;

/*
 * this is the main classe that contain the main function .
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		menu(); // call the menu() method in the main method.
		System.out.println("\nMerci pour l'utilisation de l'application. :) ");
		
	}
	public static void sousMenu1() {
		System.out.println("1- Ajouter un medicament interne au stock.");
		System.out.println("2- Ajouter un medicament externe au stock.");
		System.out.println("3- Ajouter un produit parapharmaceutique au stock.");
		int choixSousMenu1;
		System.out.print("\n\t\t\t\t Entrez votre choix : ");
		try (Scanner scan = new Scanner (System.in)) {
			choixSousMenu1 = scan.nextInt();
		} 
		switch (choixSousMenu1) {
			case 1 : 
				
				break;
			case 2 : 
				
				break;
			case 3 : 
				
				break;
			default:
				System.out.println("\n\t\t\t\t Vous avez entré un nombre erroné :( ");
				System.out.println("\t\t\t\t !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\n ");
				break;
			}
		
		
	}
	
	public static void menu() {
			
		int choixMenu = 1 ; 	
		while(choixMenu != 0) {
			
			System.out.println("\n\t\t\t\t Menu principale de l'application : GESTION DE PHARMACIE. ");
			System.out.println("\t\t\t\t ################################## *********************\n ");
			System.out.println("1- Alimenter les stockes de la pharmacie.");
			System.out.println("2- vérifier les produits existes dans la pharmacie.");
			System.out.println("3- Ajouter des personnes insecrites sous l'application.");
			System.out.println("4- vérifier les personnes enregistrées sous l'application");
			System.out.println("5- Contacter le fournisseur pour préparer les commandes.");
			System.out.println("6- Contacter les clients de retour ,après préparation de commandes.");
			System.out.println("\n7- Vente de produits $$.");
			System.out.println("************************\n");
			System.out.println("0- Arrêt du système\r\n");
			System.out.print("\n\t\t\t\t Entrez votre choix : ");

			@SuppressWarnings("resource")
			Scanner scan = new Scanner (System.in) ; 
			choixMenu = scan.nextInt(); // Scanner l inpout d utilisateur et le mettre dans choixMenu comme un entier
			switch (choixMenu) {
				case 0 : 
					System.out.println("\n\t\t\t\t Le système est arrêté :( ");
					break;
				case 1 : 
					
					break;
				case 2 : 
					
					break;
				case 3 : 
					
					break;
				case 4 : 
					
					break;
				case  5: 
					
					break;
				case 6 : 
					
					break;
				case 7 : 
					
					break;
				default:
					System.out.println("\n\t\t\t\t Vous avez entré un nombre erroné :( ");
					System.out.println("\t\t\t\t !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\n ");
					break;
			}
			
		} 
	
		
		

	}
	


}
