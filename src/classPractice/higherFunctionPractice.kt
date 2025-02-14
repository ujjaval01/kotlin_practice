/*
there has one problem, we are calling the higher function at the end, but when we're
printing the result, the higher function output printing in first
*/

fun sum(
    num1:Int,
    num2:Int,
    callBack: Unit
){
    println("sum of two numb is ${num2+num1}")

}
val higherFun = (
        println("sum completed")
        )

fun main(){


    sum(3,5, higherFun)


}