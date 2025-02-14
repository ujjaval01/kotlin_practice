package classPractice.oops

fun main() {
    var student1 = Student()
    student1.name = "Ujjaval"
    student1.srName = "Saini"
    student1.id = 43

//    println(student1.name)
//    println(student1.srName)
//    println(student1.id)

    var student2 = Student()
    student2.name = "aditya"
    student2.srName = "raj"
    student2.id = 28

//    student1.sayHello()
    student1.printStudent()
    student2.printStudent()


}


class Student{

    var name:String = ""
    var srName: String = ""
    var id:Int= 0

    fun sayHello(){
        println(message = "hii, my name is ${"$name $srName"}")
    }

    fun printStudent(){
        println(name)
        println(srName)
        println(id)
        println("--------------------------------")
    }


}