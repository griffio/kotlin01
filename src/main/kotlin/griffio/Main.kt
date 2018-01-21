package griffio

import java.io.BufferedReader
import java.io.FileReader

fun main(args: Array<String>) {

    val spaces = " ".toRegex()

    fun splitToWords(line: String): Sequence<String> = line.split(spaces).asSequence()

    val words = "words.txt" // file required

    val wordCount = BufferedReader(FileReader(words)).use { read ->
        read.lineSequence().flatMap(::splitToWords).groupingBy { it }.eachCount()
    }

    wordCount.forEach {
        println("Word: ${it.key} Count: ${it.value}")
    }
}
