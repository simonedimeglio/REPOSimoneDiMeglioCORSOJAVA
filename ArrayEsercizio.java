import java.util.Scanner; // Import dello scanner

class CicliConArray {public static void main(String[] args) {
    // VARIABILI
    int intIndex = 0; // Indice per Integer
    int stringIndex = 0; // Indice per String
    boolean Check = true; // Variabile di controllo inizializzata a true
    


    // SCANNER
    Scanner objString = new Scanner(System.in);
    Scanner opt = new Scanner(System.in);
    Scanner obj = new Scanner(System.in);

    // Inizio procedure

    // Richiedo all'utente le dimensioni dei due array

    System.out.println("Inserire dimensione array stringhe");
    int stringLenght = obj.nextInt();

    System.out.println("Inserire dimensione array interi");
    int intLenght = obj.nextInt();

    String stringArray[] = new String[stringLenght]; // Array stringhe
    int intArray[] = new int[intLenght]; // Array interi

    // Inizio ciclo DO-WHILE
    do {
      if (Check == true) {

        System.out.println("1) AGGIUNGERE - 2) STAMPARE - 3) USCIRE"); // Richiesta opt ad utente
        int opz = opt.nextInt();

        
        // DOCS
        // RIGA 47: se utente seleziona aggiungere
        // RIGA 93: se utente seleziona stampare
        // RIGA 126: se utente seleziona uscire
        // RIGA 132: se utente non seleziona opzioni previste
        
        

        // --------------------------------------------------------------------
        // Selezione utente = AGGIUNGERE
        if (opz == 1) {

          // Selezione array da incrementare 
          System.out.println("1) INCREMENTA INTERI - 2) INCREMENTA STRINGHE");
          int choice = obj.nextInt();

          // Richiedo all'utente cosa vuole aggiungere all'array selezionato
          System.out.println("Cosa vuoi aggiungere all'array?");

          // Se incrementa interi
          if (choice == 1) {

            int incrInt = obj.nextInt(); // Intero da aggiungere

            // Controllo su lunghezza array
            if (intIndex >= intLenght) {
              System.out.println("Errore: Limite raggiunto.");
            } else { 
              intArray[intIndex] = incrInt; // Inserisco l'intero
              intIndex++; // Incremento
            }

          // Se incrementa stringhe
          } else if (choice == 2) {

            String incrString = objString.nextLine(); // Stringa da aggiungere

            // Controllo su lunghezza array
            if (stringIndex >= stringLenght) {
              System.out.println("Limite superato!");
            } else { 
              stringArray[stringIndex] = incrString; // Inserisco la stringa
              stringIndex++; // Incremento
            }
          }
          
          // Se l'utente sceglie un opzione non prevista da menu
          else if (choice != 1 && choice != 2)
            System.out.println("Errore: Scegli una opzione prevista dal menu precedente");

        // --------------------------------------------------------------------



        // --------------------------------------------------------------------
        // Selezione utente = STAMPARE
        } else if (opz == 2) { 

          // Richiesta array da stampare 
          System.out.println("1) STAMPA ARRAY INTERI - 2) STAMPA ARRAY STRINGHE");
          int choice = obj.nextInt(); // Ottengo scelta utente

          // Se stampa interi
          if (choice == 1) {

            System.out.println("INTERI:");
            for (int x = 0; x < intLenght; x++) {
              System.out.println(intArray[x]);
            }

          // Se stampa stringhe
          } else if (choice == 2) {
            // Stampo l'array di strighe
            System.out.println("STRINGHE:");
            for (int x = 0; x < stringLenght; x++) {
              System.out.println(stringArray[x]);
            }
          }

          // Se l'utente non seleziona opzione 1 o opzione 2
          else if (choice != 1 && choice != 2)
            System.out.println("Errore: Stampa non prevista");

        // --------------------------------------------------------------------



        // --------------------------------------------------------------------
        // Selezione utente = USCIRE
        } else if (opz == 3)
          Check = false; // Inverto il valore del check booleano


        // --------------------------------------------------------------------
        // Selezione utente = Nessuna delle opzioni previste
        else if (opz != 1 && opz != 2 && opz != 3)
          System.out.println("ERRORE: Seleziona opzione 1, 2 o 3");
      }

    } while (Check == true); // Controllo - finchè il controller è true
  }
} // End Main