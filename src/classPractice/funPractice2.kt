fun digitCounter(number: Int): Int {
    var count = 0
    var n = number
    while (n>0){
        var r = n%10
        count++
        n /= 10
    }
    return count
}

fun checkPrime(){

}

fun reverseNumber(){

}



fun main(){

    print("Enter first Number: ")
    val number = readln().toInt()
    var result = digitCounter(number)
    println("The digit in the number is $result")
//    print("Enter second number: ")
//    val number2 = readln().toInt()
//    val result2 = digitCounter(number2)
//    println("The digit in second number is $result2")

}