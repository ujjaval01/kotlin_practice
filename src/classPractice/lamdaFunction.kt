fun main(){

    print("Enter a numb for square: ")
    var e = readln().toInt()
    var square = {e:Int -> e*e}
    println("square of $e is " + square(e))


    println("Enter the first num of addition: ")
    var a = readln().toInt()
    println("Enter the second num of addition: ")
    var b = readln().toInt()
    var addition = {a:Int, b:Int -> a+b}
    println(addition(a,b))







}