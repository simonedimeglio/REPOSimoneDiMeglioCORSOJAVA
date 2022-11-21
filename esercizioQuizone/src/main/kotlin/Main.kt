/*
* Creare un sistema di login per due tipologie
*
* - Utente: Verrà riportato al menu per esguire il quiz o uscire
* - Admin: Verrà riportato a un menu per: Aggiungere, Rimuovere, Visualizzare le domande e uscire
*
* All'utente quando finisce il corso dovrà uscire il suo risultato e non potrà ripetere il test
* Il test dev'essere almeno di 4 domande con 3 risposte
* Alla fine del test gli utenti torneranno al login
*
* */


// Simone Di Meglio
// Corso Vianova - Experis
// Android App Developer
//
//
// CODE DOCUMENTATION:
// Riga 31 - Costanti
// Riga 37 - Variabili
// Riga 48 - Array
// Riga 80 - Start
// Riga 229 - End
// Fun Main - riga 27 / riga 231

fun main(args: Array<String>) {


    // COSTANTI
    val admin = "admin"             // Username per admin
    val adminPass = "adminPass"     // Password per admin
    val user = "user"               // Username per user
    val userPass = "userPass"       // Password per user

    // VARIABILI
    var choice : Int                // Inizializzo variabile per la scelta in input (assegno in seguito)
    var readUserUsername : String   // Inizializzo variabile per la lettura dell'username per user in input (assegno in seguito)
    var readUserPassword : String   // Inizializzo variabile per la lettura della password per user (assegno in seguito)
    var readAdminUsername : String  // Inizializzo variabile per la lettura dell'username per admin in input (assegno in seguito)
    var readAdminPassword : String  // Inizializzo variabile per la lettura dell'username per admin in input (assegno in seguito)
    var check = false               // Controller
    var end = false                 // Controller
    var menuSelector = ""           // Inizializzo variabile per la lettura della scelta in menu in input (assegno in seguito)
    var results = 0                 // Inizializzo contatore per il punteggio

    // ARRAY DELLE DOMANDE
    var questionArrayList = ArrayList<String>()
    questionArrayList.add("1) Di che colore è il cavallo bianco di Napoleone?")
    questionArrayList.add("2) Pierino ha tre fratelli: Qui, Quo e ?")
    questionArrayList.add("3) Un uomo entra in un caffè")
    questionArrayList.add("4) Quanto è bello questo quiz?")

    // ARRAY DELLE RISPOSTE
    var answerArrayList = ArrayList<String>()
    // 1)
    answerArrayList.add("A) BIANCO - B) MARRONE - C) NERO")
    // 2)
    answerArrayList.add("A) QUA - B) PIERINO - C) QUO")
    // 3)
    answerArrayList.add("A) SPLASH - B) BOOM - C) CRACK")
    // 4)
    answerArrayList.add("A) BELLO - B) BELLISSIMO - C) SUPER")


    // ARRAY DELLE RISPOSTE CORRETTE
    var correctAnswerArrayList = ArrayList<String>()
    // 1)
    correctAnswerArrayList.add("A")
    // 2)
    correctAnswerArrayList.add("B")
    // 3)
    correctAnswerArrayList.add("A")
    // 4)
    correctAnswerArrayList.add("C")



    // START
    println("Benvenuto al quiz!")       // Messaggio di benvenuto

    do {                                // Inizio ciclo DO-WHILE
        println("PRESS 1: USER")
        println("PRESS 2: ADMIN")
        // Richiedo all'utente se è 1 (User) o 2 (Admin)
        choice = readLine()!!.toInt()   // ReadLine per input

        // Se User
        if(choice == 1) {
            println("------------")
            println("Login User")
            println("USERNAME:")
            readUserUsername = readLine()!!.toString()
            println("PASSWORD:")
            readUserPassword = readLine()!!.toString()

            // Check per correttezza dei dati
            if ( readUserUsername == user && readUserPassword == userPass ) {
                println("------------")
                println("Login Utente Effettuato - accesso consentito")
                println("------------")
                menuSelector = "user"
                check = true
            } else {
                println("------------")
                println("Errore: accesso negato.")
                println("------------")
            }

        // Se Admin
        } else if (choice == 2 ) {
            println("------------")
            println("Login Admin")
            println("USERNAME:")
            readAdminUsername = readLine()!!.toString()
            println("PASSWORD:")
            readAdminPassword = readLine()!!.toString()

            // Check per correttezza dei dati
            if ( readAdminUsername == admin && readAdminPassword == adminPass ) {
                println("------------")
                println("Login Admin Effettuato - accesso consentito")
                println("------------")
                menuSelector = "admin"
                check = true
            }  else {
                println("------------")
                println("Errore: accesso negato.")
                println("------------")
            }
        }
    } while (check == false) // Rimango nel ciclo DO-WHILE fino a che non avviene l'accesso


    // Ad accesso avvenuto
    do {
        // ACCESSO DIVERSIFICATO AI MENU
        // Menu Admin
        if (menuSelector.equals("admin")) {
            println("MENU")
            println("1 - AGGIUNGI DOMANDE")
            println("2 - RIMUOVI DOMANDE")
            println("3 - VISUALIZZA DOMANDE")
            println("4 - ESCI")

            choice = readLine()!!.toInt()

            if (choice.equals(1)) { // Aggiungo domanda, risposta e risposta corretta
                println("Inserisci una nuova domanda")
                var newQuestion = readLine()!!.toString()
                questionArrayList.add(newQuestion)
                println("Inserisci le tre risposte possibili alla domanda")
                var newAnswer = readLine()!!.toString()
                answerArrayList.add(newAnswer)
                println("Inserisci la lettera corrispondende alla risposta corretta")
                var newCorrectAnswer = readLine()!!.toString()
                correctAnswerArrayList.add(newCorrectAnswer)
                // -----------------------------------------------
            } else if (choice.equals(2)) { // Rimuovo le domande
                println("Quale domanda vuoi eliminare? da 1 a ${questionArrayList.size}")
                var deleteInt = readLine()!!.toInt()
                var deleteString = readLine()!!.toString()
                // Se la domanda non esiste segnalo l'errore
                if (deleteInt > questionArrayList.size || deleteInt < 0) {
                    println("Errore - la domanda non esiste")
                // Altrimenti la rimuovo
                } else {
                    questionArrayList.remove(deleteString)
                }
                // -----------------------------------------------
            } else if (choice.equals(3)) { // Visualizzo le domande
                var questionArraySize = questionArrayList.size
                for (i in 0 until questionArraySize) {
                    println(questionArrayList.get(i))
                }
                println("-------")
                // -----------------------------------------------
            } else if (choice.equals(4)) { // Esco
                end = true
            } else { // Se l'admin non sceglie correttamente una opzione possibile, segnalo l'errore
                println("Errore: Seleziona 1 - 2 - 3 - 4 (Altre selezioni non consentite)")
            }


        // Menu User
        } else {
            println("MENU")
            println("1 - INIZIA IL QUIZ")
            println("2 - ESCI")
            choice = readLine()!!.toInt()
            println("Inserisci una risposta scegliendo tra le seguenti")


            if (choice.equals(1)) { // Inizio il quiz
                println("------")
                var questionArraySize = questionArrayList.size  // Calcolo dimensione array delle domande
                var answerArraySize = answerArrayList.size      // Calcolo dimensione array delle risposte


                for (i in 0 until questionArraySize) {    // Ciclo per risposte
                    println(questionArrayList.get(i))
                    println(answerArrayList.get(i))
                    var answerChoice = readLine()!!.toString()

                    // Se risposta corretta
                    if (answerChoice.equals(correctAnswerArrayList.get(i))) {
                        println("Risposta corretta")
                        println("------")
                        results++
                    // Se risposta errata
                    } else {
                        println("Risposta errata")
                        println("------")
                    }
                }

                // Stampa del punteggio
                println("PUNTEGGIO TOTALE: ${results}")
                println("------")
                end = true // esco dal quiz


            } else if (choice.equals(2)) {  // Esco
                end = true

            } else {    // Errore
                println("Errore: Selezionare 1 (INIZIA QUIZ) o 2 (ESCI)")
            }
        }
    } while (end == false)
}
