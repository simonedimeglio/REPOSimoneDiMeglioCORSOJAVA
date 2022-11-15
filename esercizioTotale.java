import java.util.ArrayList; // Import ArrayList
import java.util.Scanner; // Import Scanner

// ESERCIZIO
// Creiamo un sistema che ti permetta di inserire username e password. 
// Solo dopo questo inserimento il sistema deve proseguire e chiederti
// di confermare entrambi gli elementi. Dopo averli confermati potremmo
// accedere a Quattro opzioni: 

// 1) - Aggiungi ad ArrayConstringhe 
// 2) - Aggiungi ad ArrayConNumeri
// 3) - Stampa
// 4) - Esci 

// All'uscita dovrà stampare uno alla volta ogni elemento dell'array e 
// chiederti la password per confermare le modifiche. 

// Difficile:  Far anche rimuovere e editre gli elementi. 
// Aggiungendo al menu due sotto funzioni per ogni optChoice di aggiunta possibile

class esercizioTotale {
  public static void main(String[] args) {

    // VARIABILI
    Scanner scan = new Scanner(System.in);  // Scanner
    String username = "";                   // Username utente
    String password = "";                   // Password utente
    boolean check = false;                  // Controller #1
    boolean confirmation = false;           // Controller #2
    
    // START WHILE #1
    while (check == false) {      // (Controller #1) - Condizione iniziale 
      confirmation = false;       // (Controller #2)
      // Inserimento username
      System.out.print("ENTER USERNAME:\n");
      username = scan.nextLine(); 

      // Inserimento password
      System.out.print("ENTER PASSWORD:\n");
      password = scan.nextLine();

      // Controllo: l'utente deve inserire almeno un carattere
      // sia per username che per password
      if ((username.equals("")) || (password.equals(""))) {
        System.out.println("ERROR: enter both required fields\n"); // check se uno dei due campi e' vuoto
      } else {
        // Controllo superato
        while (confirmation == false) {

          // Richiesta di conferma all'utente sui dati inseriti
          System.out.print("ENTER \"CONFIRM\" OR \"DELETE\" TO CONTINUE:\n");
          String confirmationChoice = scan.nextLine();

          // Se l'utente conferma esco dai cicli portando Controller #1 & Controller #2 a "true"
          if (confirmationChoice.equals("CONFIRM")) {
            confirmation = true;
            check = true;

            // altrimenti obbligo l'utente ad inserire nuovamente username e password
          } else if (confirmationChoice.equals("DELETE")) {
            confirmation = true;

            // se l'utente non seleziona "CONFIRM" o "DELETE" stampo l'errore
          } else {
            System.out.println("ERROR: you have to choose between \"CONFIRM\" and \"DELETE\".");
          }
        }
      }
    } // END WHILE #1

    boolean secondCheck = false; // Controller #3
    ArrayList<Integer> number = new ArrayList<Integer>(); // Array dei numeri (interi)
    ArrayList<String> string = new ArrayList<String>();   // Array delle stringhe

    // START WHILE #2
    while (secondCheck == false) {

      Scanner N = new Scanner(System.in);
      System.out.print("Choose between: \"ADDSTRING\" - \"ADDNUMBER\" - \"EDIT\" - \"DELETE\" - \"PRINT\" - \"EXIT\".");
      String optChoice = scan.nextLine(); // Scanner per richiesta utente


      // CASO 1 - Aggiunta di una stringa
      if (optChoice.equalsIgnoreCase("addstring")) {
        System.out.print("ENTER THE STRING:\n");
        string.add(scan.nextLine()); // push della stringa in array

      // CASO 2 - Aggiunta di un intero
      } else if (optChoice.equalsIgnoreCase("addnumber")) {
        System.out.print("ENTER A NUMBER:\n");
        number.add(N.nextInt()); // push del numero in array

      // CASO 3 - edit
      } else if (optChoice.equalsIgnoreCase("edit")) {
        // Stampa dell'array dei numeri
        System.out.print("NUMBER ARRAY: ");
        System.out.println(number);

        // Stampa dell'array delle stringhe
        System.out.print("STRING ARRAY: ");
        System.out.println(string);
        
        // Richiesta all'utente su cosa intende effettuare la edit
        System.out.print("choose edit by selecting \"STRING\" or \"NUMBERS\"");
        String editChoice = scan.nextLine();


        // CASO "STRINGHE"
        if (editChoice.equalsIgnoreCase("string")) {
          Scanner indexScan = new Scanner(System.in);
          Scanner insertScan = new Scanner(System.in);
          System.out.print("What position do you want to change?\n");

          // Scelta dell'index da parte dell'utente
          int indexString = indexScan.nextInt(); 
          System.out.print("what do you want to enter?\n");
          String editString = inserScan.nextLine();     // nuova stringa da inserire
          string.set(indexString, editString);          // effettuo la modifica

        // CASO "NUMERI"
        } else if (editChoice.equalsIgnoreCase("addnumber")) {
          Scanner indexScan = new Scanner(System.in);
          Scanner insertScan = new Scanner(System.in);
          System.out.print("What position do you want to change?\n");

          // Scelta dell'index da parte dell'utente
          int indexInt = indexScan.nextInt(); 
          System.out.print("what do you want to enter?\n");
          int editInt = insertScan.nextInt();           // nuovo numero da inserire
          number.set(indexInt, editInt);                // effettuo la modifica
        
        // Se l'utente non ha selezionato correttamente una categoria da modificare
        } else {
          System.out.println("ERROR: you have to choice between \"STRING\" or \"NUMBERS\"");
        }

      // CASO 4 - delete
      } else if (optChoice.equalsIgnoreCase("delete")) {
        // Stampa dell'array numerico
        System.out.print("NUMBER ARRAY:\n");
        System.out.println(number);

        // Stampa dell'array di stringhe
        System.out.print("STRING ARRAY:\"");
        System.out.println(string);
        
        // Richiedo all'utente l'elemento da eliminare
        System.out.print("choose what to delete by selecting \"NUMBER\" or \"STRING\"");
        String deleteChoice = scan.nextLine();

        // CASO "STRING"
        if (deleteChoice.equalsIgnoreCase("string")) {
          Scanner deleteStringScanner = new Scanner(System.in);
          System.out.print("what index to delete?\n");
          int indexDeleteString = deleteStringScanner.nextInt();  // indice stringa da rimuovere
          string.remove(indexDeleteString);                       // rimozione

        // CASO "NUMBER"
        } else if (deleteChoice.equalsIgnoreCase("number")) {
          Scanner numberStringScanner = new Scanner(System.in);
          System.out.print("what index to delete?\n");
          int indexDeleteNumber = numberStringScanner.nextInt();  // indice numero da rimuovere
          number.remove(indexDeleteNumber);                       // rimozione
        }
      
      // CASO 5 - print
      } else if (optChoice.equalsIgnoreCase("print")) {
        // Stampa dell'array numerico
        System.out.print("NUMBER ARRAY:\n");
        System.out.println(number);

        // Stampa dell'array di stringhe
        System.out.print("STRING ARRAY:\"");
        System.out.println(string);

      // CASO 6 - exit
      } else if (optChoice.equalsIgnoreCase("exit")) {
        // Stampa dell'array di stringhe
        System.out.print("STRING ARRAY:\"");
        System.out.println(string);

        // Richiesta di conferma
        System.out.print("Are you sure? \"YES\" or \"NOT\"? ");
        String confirmChoice = scan.nextLine();

        // Istanzio due variabili booleane per controllo a "false"
        boolean case1 = false;
        boolean case2 = false;

        // START WHILE
        while (case1 == false) {

          // Se l'utente conferma
          if (confirmChoice.equals("YES")) {
            System.out.print("enter your password to proceed\n");
            String confirmPassword = scan.nextLine();

            // Controllo della password
            if (confirmPassword.equals(password)) { 
              // Se la password coincide procedo
              System.out.print("Saved\n");
              System.out.print("NUMBER ARRAY:\n");
              System.out.println(number);
              // Richiedo la conferma all'utente
              System.out.print("Are you sure? \"YES\" or \"NOT\"? ");
              String confirmChoice2 = scan.nextLine();

              // Altra operazione se l'utente conferma
              while (case2 == false) {
                if (confirmChoice2.equals("YES")) {
                  // Richiedo la conferma dell'array numerico
                  System.out.print("enter your password to proceed\n");
                  String confirmPassword2 = scan.nextLine();

                  // Controllo della password
                  if (confirmPassword2.equals(password)) {
                    System.out.print("Saved\n");

                    // Imposto il mio controllore a true per uscire dal while
                    case2 = true;

                  // Se l'utente sbaglia la password
                  } else {
                    System.out.print("ERROR: insert correct password to proceed");
                  }

                // Se l'utente non conferma
                } else if (confirmChoice2.equals("NOT")) {
                  // Cancello array numerico
                  number.clear();
                  System.out.print("Only string saved, numbers have been eliminated");
                  // Imposto il mio controllore a true per uscire dal ciclo
                  case2 = true;
                }
              }

              // Imposto il mio controllore a true per uscire dal ciclo
              case1 = true;

              // Esco dal programma/esercizio
              secondCheck = true;
            
            // Se l'utente sbaglia la password stampo messaggio di errore
            } else {
              System.out.print("ERROR: insert correct password to proceed");
            }

          // Se l'utente non conferma alla prima richiesta
          } else if (confirmChoice.equals("NOT")) {
            // Elimino sia le stringhe che i numeri
            number.clear();
            string.clear();
            // Comunico all'utente che non si hanno dati salvati
            System.out.print("No data on");

            // Imposto i miei controllori a true per uscire dal ciclo
            case1 = true;
            secondCheck = true; // esco dal ciclo MENU

          // Se l'utente sbaglia ad inserire "YES" o "NOT"
          } else {
            System.out.print("Error: choose selecting \"YES\" or \"NOT\"");
          }
        }
      // Errore di inserimento
      } else {
        System.out.println("ERROR: Try again");
      }
    } // END WHILE #2
  } // End main
}