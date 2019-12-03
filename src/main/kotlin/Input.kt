import java.io.File

fun fileToList(fileName: String): List<String> {
    val path = System.getProperty("user.dir") + "/src/main/resources/" + fileName
    return File(path).useLines { it.toList() }
}
