fun main() {
    val stringList = mutableListOf<String>()
    for (i in 0..4) {
        println("please enter string #${i + 1}")
        stringList.add(readln())
    }
    // ... != ""
    stringList.filter { it != "" }
        .forEach { println(it) }
}
