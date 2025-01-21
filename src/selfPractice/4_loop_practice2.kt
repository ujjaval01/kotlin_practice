fun main(){
    print("Enter Number: ")
    var num = readln().toInt()
    var rev = 0
    var count = 0
    var tempNum = num

    while (num>0){
        var n = num % 10
        rev = rev*10 + count
        tempNum /=10
        count++

    }
    println("digit is : $count")
    println("rev numb is: $rev")


}