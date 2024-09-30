fun main()
{
    println("2.2.5")
    val X = false
    val Y = false
    val Z = true

    val А = X || (Y && !Z)
    val Б = !X && !Y
    val В = !(X && Z) || Y
    val Г = (X && !Y) || Z
    val Д = X && (!Y || Z)
    val Е = X || !(Y || Z)

    println("X или (Y и не Z: $А")
    println("не X и не Y: $Б")
    println("не (X и Z) или Y: $В")
    println("X и (не Y или Z): $Г")
    println("X и (не Y или Z): $Д")
    println("X или (не (Y или Z)): $Е")

    println("2.2.6")
        val A = true
        val B = false
        val C = false

        val a= A || !(A && B) || C
        val b = !A || (A && (B || C))
        val c = (A || (B && !C)) && C

    println("A или не (A и B) или C: $a")
    println("не A или A и (B или C): $b")
    println("(A или (B и не C)) и C: $c")
}
