import java.io.BufferedReader
import java.io.File

fun fileToString(fileName: String): String {
    val path = System.getProperty("user.dir") + "/src/main/resources/" + fileName
    val bufferedReader: BufferedReader = File(path).bufferedReader()
    return bufferedReader.use { it.readText() }
}

fun fileToList(fileName: String): List<String> {
    val path = System.getProperty("user.dir") + "/src/main/resources/" + fileName
    return File(path).useLines { it.toList() }
}
