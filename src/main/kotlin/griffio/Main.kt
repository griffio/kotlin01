package griffio

fun main(args : Array<String>) {

    println("Hello, world!")

    val n = 1..10
    for ( (index, value) in n.withIndex() ) { println("$index $value") }

    for (i in (1..10).filter { it > 5 }) {
        println(i)
    }

}
