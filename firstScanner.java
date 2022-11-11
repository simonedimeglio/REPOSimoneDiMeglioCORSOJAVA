import java.util.Scanner; // Importo funzionalità scanner dalla libreria di java util

class firstScanner { // Dichiaro la classe
  public static void main(String[] args) { // dichiaro il tipo

    Scanner myObj = new Scanner(System.in); // Creo nuovo scanner
    System.out.println("Inserisci nickname");

    String name = myObj.nextLine(); // Leggo l'input
    System.out.println("Nickname inserito: " + name);

  } // end main
}   
