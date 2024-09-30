fun main() {
    println("2.2.3")
    println("2.2.1")
    val A = true
    val B = false
    val C = false
    println("A=true\n" + "B=false\n" + "C=false")
    val a = !A && B
    val b = A || !B
    val c =A && B || C
    println("НЕ А и Б:$a")
    println("А или НЕ Б:$b")
    println("А и Б или С:$c")

    println("2.2.4")
    val X=true
    val Y=true
    val Z=false
    println("X=true\n" + "Y=true\n" + "Z=false")
    val x=!X&&Y
    val y=X&&!Y
    val z=X||Y&&Z
    println("НЕ X и Y:$x")
    println("X или НЕ Y:$y")
    println("X или Y и Z:$z")
}