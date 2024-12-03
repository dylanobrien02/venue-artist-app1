package ie.setu
import utils.readIntNotNull
import io.github.oshai.kotlinlogging.KotlinLogging
import java.lang.System.exit

private val logger = KotlinLogging.logger{}

fun mainMenu(): Int {
    print(""" 
         > ----------------------------------
         > |       VENUE ARTIST APP         |
         > ----------------------------------
         > | NOTE MENU                      |
         > |   1) Add a note                |
         > |   2) List all notes            |
         > |   3) Update a note             |
         > |   4) Delete a note             |
         > ----------------------------------
         > |   0) Exit                      |
         > ----------------------------------
         > ==>> """.trimMargin(">"))
    return readIntNotNull("Choose an option: ")

}

fun runMenu() {
    do {
        val option = mainMenu()
        when (option) {
            1  -> addNote()
            2  -> listNotes()
            3  -> updateNote()
            4  -> deleteNote()
            0  -> exitApp()
            else -> println("Invalid option entered: ${option}")
        }
    } while (true)
}

fun addNote(){
    logger.info { "addNote() function invoked" }
}

fun listNotes(){
    logger.info { "listNote() function invoked" }
}

fun updateNote(){
    logger.info { "updateNote() function invoked"}
}

fun deleteNote(){
    logger.info { "deleteNote() function invoked"}
}

fun exitApp(){
    logger.info { "exitApp() function invoked"}
    exit(0)
}

fun main() {
    runMenu()
}