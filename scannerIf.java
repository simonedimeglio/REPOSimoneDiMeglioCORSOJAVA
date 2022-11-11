import java.util.Scanner; // Importo funzionalità scanner dalla libreria di java util

class scannerIf { // Dichiaro la classe
  public static void main(String[] args) { // dichiaro il tipo

    // ESERCIZIO:
    // Creare un sistema di IF che controllino l'uguaglianza di tre
    // valori numerici prima in sequenza (3, 13, 13)
    // poi in modo annidato, messi per far si che si arrivi più in profondità
    // possibile
    // -------
    // In ultima analisi dovremmo creare una struttura di IF-ELSE dove sia possibile
    // far stampare tutti e tre i casi tramite lo SCANNER
    // -------
    // Creare poi un sistema di inserimento di tre variabili dette
    // Nome: String
    // Cognome: String
    // Eta: Int
    // Stampare le variabili assieme a "Questo è il tuo profilo"

    // Dichiarazione e valorizzazioni variabili
    int x = 3;
    int y = 13;
    int z = 13;

    // Primo IF che controlla le tre variabili contemporanemente
    if (x == y && y == z && z == x) {
      // Se x, y e z sono uguali stampo la seguente stringa
      System.out.println("x, y e z hanno valori uguali");
    } else {
      // Se x, y e z non hanno tre valori uguali stampo la seguente stringa
      System.out.println("Nessuna delle tre variabili ha valori in comune");
    } // fine IF

    // Catena di IF che ha come scopo di fare più test possibile
    if (x == y) {
      // Se x = y stampo la seguente riga
      System.out.println("x = y");
    } else if (y == z) {
      // Se y = z stampo la seguente riga
      System.out.println("y = z");
    } else if (z == x) {
      // Se z = x stampo la seguente riga
      System.out.println("z = x");
    } else {
      // Se nessuna delle tre variabili ha lo stesso dato stampo la seguente riga
      System.out.println("Nessuna delle variabili ha valori in comune");
    } // fine IF

    // Creo un sistema di IF-ELSE dove sia possibile stampare tutti e tre i casi
    // attraverso lo scanner

    Scanner a = new Scanner(System.in); // Creo nuovo scanner per il primo numero
    System.out.println("Inserisci il primo numero");
    String first = a.nextLine(); // Leggo l'input

    Scanner b = new Scanner(System.in); // Creo nuovo scanner per il secondo numero
    System.out.println("Inserisci il secondo numero");
    String second = b.nextLine(); // Leggo l'input

    Scanner c = new Scanner(System.in); // Creo nuovo scanner per il terzo numero
    System.out.println("Inserisci il terzo numero");
    String third = c.nextLine(); // Leggo l'input1

    if (a == b) {
      // Se a = b stampo la seguente riga
      System.out.println(first + " = " + second);
    } else if (b == c) {
      // Se b = c stampo la seguente riga
      System.out.println(second + " = " + third);
    } else if (c == a) {
      // Se c = a stampo la seguente riga
      System.out.println(third + " = " + first);
    } else {
      // Se nessuna delle tre variabili ha lo stesso dato stampo la seguente riga
      System.out.println("Nessuna delle variabili ha valori in comune");
    } // fine IF


    // Creo un sistema di riferimento delle tre variabili 
    Scanner nome = new Scanner(System.in); // Creo nuovo scanner per il nome
    System.out.println("Inserisci il nome");
    String name = nome.nextLine(); // Leggo l'input

    Scanner cognome = new Scanner(System.in); // Creo nuovo scanner per il cognome
    System.out.println("Inserisci il cognome");
    String surname = cognome.nextLine(); // Leggo l'input

    Scanner età = new Scanner(System.in); // Creo nuovo scanner per l'età
    System.out.println("Inserisci l'età");
    int age = età.nextInt(); // Leggo l'input

    System.out.println("Questo è il tuo profilo: " + name + " " + surname + " " + age);

  } // end main
}
