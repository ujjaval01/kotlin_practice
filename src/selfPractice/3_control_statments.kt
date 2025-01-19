fun main(){
    print("enter num1: ")
    val num1 = readln().toInt()
    print("enter num2: ")
    val num2 = readln().toInt()

    if(num1>num2){
        println("$num1 is greater than $num2")
    }else if(num1<num2){
        println("$num1 is smaller than $num2")
    }else
        println("these two numbers are equal")
}
