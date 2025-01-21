fun main(){
    print("Enter a digit: ")
    var number = readln().toInt()
    var count = 0
    while (number > 0){
        var n = number % 10
        count++
        number /= 10
    }
    println("digit is $count")

}