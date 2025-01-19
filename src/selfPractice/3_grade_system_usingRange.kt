fun main() {
    println("enter total marks: ")
    val marks = readln().toInt()
//    if(marks in 100..70){
//        println("grade A")
//    }else if (marks in 50..69){
//        println("grade B")
//    }else if (marks in 33..49){
//        println("grade C")
//    }else
//        println("fail")


    var grade: Char = if (marks in 70..100) {
        'A'
    } else if (marks in 69..50) {
        'B'
    } else if (marks in 49..33) {
        'C'

    } else
        'F'

    print("Grade is $grade")

}