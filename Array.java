public class Array
{   
    public static void main(String args[])
    {

      // Dichiarazione di un array
      String[] students;

      // Dichiarazione di un array e del suo contenuto
      String[] teams = {"Inter", "Milan", "Naples", "Juventus"};

      // Array di interi 
      int[] integers = {5, 10, 15, 20, 25};

      // Stampa del contenuto di un array
      String[] singers = {"Dua Lipa", "Bruno Mars", "Arctic Monkeys", "Foo Fighters"};
      System.out.println(singers[0]);
      // Outputs "Dua Lipa"

      // cambiare il contenuto di un array
      singers[1] = "Capo Plaza";
      System.out.println(singers[1]);


      // stampare lunghezza di un array
      String[] names = {"Simone", "Michael", "Lorenzo", "Gianmarco"};
      System.out.println(names.length);
      // Outputs 4


    }
}