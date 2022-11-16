// ESERCIZIO 
// Creare un sistema che faccia inserire e che poi controlli password e nome oppure " esci "
// (DIFF: che ci permetta di avere più utenti)
// Avere al interno del sistema però salvate le credenziali di un ADMIN. che può ordinare senza pagare e aggiungere e modificare la lista piatti e prezzi 
// Dopo il login dovrà essere assegnato al utente un budget
// Creare un menu con 3 opzioni
// - Visualizza Lista Cibo   - Carrello o Paga  - Esci
// - Visualizza Lista Cibo  ---> Dovrà STAMPARE UN MENU DI PIATTI COI PREZZI e permettere di selezionare
// - Carrello o Paga ---> Dovrai POTER SCEGLIERE DA QUI SE PAGARE E SE HAI ABBSTANZA SOLDI DOPO LA CONFERMA DELLA PASSWORD SCALERà LA PECUNIA
// - Esci ---> VA A STAMPARE IL TOTALE DEGHLI ELEMENTI COMPRATI E IL CONTO TOTALE 
// Dovrai tornare alla possibilità di LOGIN e poterlo rifare

import java.util.ArrayList; // Import ArrayList
import java.util.Scanner; // Import Scanner

class TestComplessivoJava {
  public static void main(String[] args) {

    // VARIABILI
    Scanner scan = new Scanner(System.in);                  // Scanner
    String adminUsername = "admin";                         // Username dell'admin
    String adminPassword = "password";                      // Password dell'admin
    String username = "";                                   // Username utente
    String password = "";                                   // Password utente
    String newUserUsername = "";                            // Username dell'utente che si registrerà
    String newUserPassword = "";                            // Password dell'utente che si registrerà
    Integer budget;                                          // Budget utente
    boolean check = false;                                  // Controller #1


    ArrayList<String> cibo = new ArrayList<String>();       // Array del cibo
    cibo.add("Pizza");
    cibo.add("Caffè");
    cibo.add("Cioccolato");
    ArrayList<Integer> prezzi = new ArrayList<Integer>();   // Array dei prezzi
    prezzi.add(8);
    prezzi.add(1);
    prezzi.add(2);
    ArrayList<String> acquisti = new ArrayList<String>();   // Array degli acquisti

    
    while (check == false) { // Start While
      // Richiesta di conferma all'utente sui dati inseriti
      System.out.print("Scegli tra: \"LOGIN\", \"REGISTRATI\" o \"ESCI\"\n");
      String startChoice = scan.nextLine();

      // ----------------------------------------------------------------------------------------------------

      // Se l'utente sceglie di effettuare il login
      if (startChoice.equalsIgnoreCase("login")) {
        System.out.print("----------------------\n");

        // Inserimento username
        System.out.print("INSERISCI USERNAME:\n");
        username = scan.nextLine();

        // Inserimento password
        System.out.print("INSERISCI PASSWORD:\n");
        password = scan.nextLine();

        // Se l'accesso è consentito si accede al menù
        if (((username.equals(adminUsername)) && (password.equals(adminPassword)))
            || ((username.equals(newUserUsername)) && (password.equals(newUserPassword)))) {
          check = true;
        } else {
          System.out.print("Errore: accesso non consentito\n");
          System.out.print("----------------------\n");
        }

        // ----------------------------------------------------------------------------------------------------

        // Se l'utente sceglie di effettuare il registrarsi
      } else if (startChoice.equalsIgnoreCase("registrati")) {

        // Inserimento username
        System.out.print("INSERISCI USERNAME:\n");
        username = scan.nextLine();

        // Inserimento password
        System.out.print("INSERISCI PASSWORD:\n");
        password = scan.nextLine();

        // Controllo: l'utente deve inserire almeno un carattere
        // sia per username che per password
        if ((username.equals("")) || (password.equals(""))) {
          System.out.println("ERRORE: inserisci entrambi i campi\n"); // check se uno dei due campi e' vuoto
        } else {
          check = true; // esco dal programma
        }
      }
    }

    // Notifica di accesso e separazione menu

    // ADMIN
    if ((username.equals(adminUsername)) && (password.equals(adminPassword))) {
      System.out.print("----------------------\n");
      System.out.print("Accesso effettuato come ADMIN\n");
      // // Visualizzo il menu con le 4 opzioni dedicate all'admin
      Scanner adminOption = new Scanner(System.in);
      System.out.print("Scegli tra: \"LISTA CIBO\" - \"AGGIUNGI\" - \"MODIFICA\" - \"ESCI\".\n");
      String adminOptChoice = scan.nextLine(); // Scanner per richiesta utente

    // USER
    } else {
      System.out.print("----------------------\n");
      System.out.print("Accesso effettuato come USER\n");

      // Faccio inserire il budget all'utente
      System.out.print("Inserisci il budget:\n");
      budget = Integer.parseInt(scan.nextLine());

      // // Visualizzo il menu con le 4 opzioni
      Scanner option = new Scanner(System.in);
      System.out.print("Scegli tra: \"LISTA CIBO\" - \"CARRELLO\" - \"PAGA\" - \"ESCI\".\n");
      String optChoice = scan.nextLine(); // Scanner per richiesta utente

      // Se sceglie di stampare la lista del cibo
      if (optChoice.equalsIgnoreCase("lista cibo")) {
        System.out.print("----------------------\n");
        for (int i = 0; i < cibo.size(); i++) {
          System.out.println(i + ") " + cibo.get(i) + " - €" + prezzi.get(i));
        }
        System.out.print("----------------------\n\n");
        System.out.print("Seleziona l'acquisto inserendo il numero di riferimento\n");

        // Scanner per la scelta dell'acquisto
        Scanner foodChoice = new Scanner(System.in);
        Integer pickFoodChoice = scan.nextInt();

        
        
        // Seleziono dall'array del cibo l'elemento selezionato
        String pickedFoodChoice = cibo.get(pickFoodChoice);
        System.out.println("Hai selezionato: " + pickedFoodChoice);
        
        // // Ne estraggo il prezzo dall'array del prezzo
        Integer pricePickedFoodChoice = prezzi.get(pickFoodChoice);

        System.out.println("Prezzo: " + pricePickedFoodChoice);
        System.out.println("Budget: " + budget);
        System.out.print("----------------------\n\n");

        // Se il budget è sufficiente
        // if (budget >= pricePickedFoodChoice) {
        //   System.out.print("Budget sufficiente: inserire password per confermare l'acquisto\n");
        //   // richiedo la password e se viene coincide con quella dichiarata inizialmente
        //   // confermo l'acquisto scalando il prezzo dal budget iniziale
        //   Scanner checkPassword = new Scanner(System.in);
        //   String insertPassword = scan.nextLine();

        //   if (insertPassword.equals(password)) {
        //     budget = budget - pricePickedFoodChoice;
        //     System.out.prinln("Acquisto confermato");
        //     System.out.println("Budget residuo: " + budget);
        //   }
        // }

      }
    }

    // // Se l'utente sceglie di registrarsi
    // if (startChoice.equalsIgnoreCase("registrati")) {
    // // Inserimento username
    // System.out.print("INSERISCI USERNAME:\n");
    // username = scan.nextLine();

  } // End main
}