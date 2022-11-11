class HelloWorld { // Dichiaro la classe
  public static void main(String[] args) { // dichiaro il tipo

    // ESERCIZIO 
    // Creare tre variabili (b, 123.34, 1)
    // Sommare i risultati e dividere per 3
    // Farli stampare accompagnati da "evviva" se c'è eguaglianza tra le due variabili bool
    // Bool 1 = True (non modificabile di valore)
    // Bool 2 = False (non modificabile di valore)
    // Caricare sulla repo


    // Dichiaro le variabili e le inizializzo
    int x = 1;
    double y = (int) 123.34; 
    char zChar = 'b';
    double z = zChar;
    boolean bool1 = true;
    boolean bool2 = false;
    double sum; 
    double dividedSum; 

    // Sommo i valori
    sum = x + y + z; 

    // Divido per 3
    dividedSum = sum / 3;

    // Stampo in consolle
    System.out.println(dividedSum);

    // Stampo accompagnato da "evviva" se c'è eguaglianza 
    // tra le due variabili bool definite nelle righe 18 e 19
    System.out.println((bool1 || bool2) + " " + dividedSum + " evviva");

  }
} // end main
