fun main()
{
    println("2.1.1")
    print("Введите двузначное число-")
    val a= readLine()?.toInt()
    val d=a!!/10
    val e=a%10
    val f=d+e
    val c=d*e
    println("Число:$a")
    println("Кол-во десятков:$d")
    println("кол-во единиц:$e")
    println("Сумма цифр:$f")
    println("Произведение $c")

    println()
    println("2.1.2")
    print("Введите 3-х значное число")
    val b= readLine()?.toInt()
    val s=b!!/100
    val d2=b!!/10%10
    val e2=b!!%10
    val f2=d2+e2+s
    val c2=d2*e2*s
    println("Число:$b")
    println("Кол-во десятков:$d2")
    println("кол-во единиц:$e2")
    println("Сумма цифр:$f2")
    println("Произведение $c2")

    println()
    println("2.1.3")
    print("Введите что делить:")
    val p= readLine()?.toInt()
    print("Введите на что делить:")
    val h= readLine()?.toInt()
    val u= p!! / h!!
    println("получится $u")

    println()
    println("2.1.4 возведение во вторую степень")
    print("Введите возводимое число:")
    val r= readLine()?.toInt()
    val t=r!! * r!!
    println("$r^2 ровно $t")
}