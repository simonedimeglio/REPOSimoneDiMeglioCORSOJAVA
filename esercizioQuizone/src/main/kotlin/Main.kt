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

fun main(args: Array<String>) {


    // Inizializzo variabili
    val admin = "admin"
    val adminPass = "adminPass"
    val user = "user"
    val userPass = "userPass"

    var choice : Int
    var readUserUsername : String // valorizzo in seguito
    var readUserPassword : String // valorizzo in seguito
    var readAdminUsername : String // valorizzo in seguito
    var readAdminPassword : String // valorizzo in seguito
    var check = false
    var end = false
    var menuSelector = ""
    var results = 0

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




    println("Benvenuto al quiz!")

    do {
        println("PRESS 1: USER")
        println("PRESS 2: ADMIN")
        // Richiedo all'utente se è 1 o 2
        choice = readLine()!!.toInt()

        if(choice == 1) {
            println("------------")
            println("Login User")
            println("USERNAME:")
            readUserUsername = readLine()!!.toString()
            println("PASSWORD:")
            readUserPassword = readLine()!!.toString()

            // Check della correttezza dei dati
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

        } else if (choice == 2 ) {
            println("------------")
            println("Login Admin")
            println("USERNAME:")
            readAdminUsername = readLine()!!.toString()
            println("PASSWORD:")
            readAdminPassword = readLine()!!.toString()

            // Check della correttezza dei dati
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
    } while (check == false)


    // PROGRAMMA "ON"
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

            if (choice.equals(1)) { // Aggiungo le domande
                println("Inserisci una nuova domanda")
                var newQuestion = readLine()!!.toString()
                questionArrayList.add(newQuestion)
                println("Inserisci le tre risposte possibili alla domanda")
                var newAnswer = readLine()!!.toString()
                answerArrayList.add(newAnswer)
                println("Inserisci la lettera corrispondende alla risposta corretta")
                var newCorrectAnswer = readLine()!!.toString()
                correctAnswerArrayList.add(newCorrectAnswer)
            } else if (choice.equals(2)) { // Rimuovo le domande
                println("Quale domanda vuoi eliminare? da 1 a ${questionArrayList.size}")
                var deleteInt = readLine()!!.toInt()
                var deleteString = readLine()!!.toString()
                if (deleteInt > questionArrayList.size || deleteInt < 0) {
                    println("Errore - la domanda non esiste")
                } else {
                    questionArrayList.remove(deleteString)
                }

            } else if (choice.equals(3)) { // Visualizzo le domande
                var questionArraySize = questionArrayList.size
                for (i in 0 until questionArraySize) {
                    println(questionArrayList.get(i))
                }
                println("-------")
            } else if (choice.equals(4)) { // Esco
                end = true
            } else { // Errore
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
                var questionArraySize = questionArrayList.size
                var answerArraySize = answerArrayList.size

                for (i in 0 until questionArraySize) {
                    println(questionArrayList.get(i))
                    println(answerArrayList.get(i))
                    var answerChoice = readLine()!!.toString()

                    if (answerChoice.equals(correctAnswerArrayList.get(i))) {
                        println("Risposta corretta")
                        println("------")
                        results++
                    } else {
                        println("Risposta errata")
                        println("------")
                    }
                }

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

// Utilities Function

fun user(args: Array<String>) {

}