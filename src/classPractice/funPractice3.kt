package classPractice

// simple function
//fun birthdayGreating(){
//    println("Happy Birthday Vnsii💗")
//    println("This is your 19th Birthday")
//}

//--------------------------------------------------------------

// return function........
//fun birthdayGreating() : String{
//    println("Happy Birthday Vnsii💗")
//    println("This is your 19th Birthday")
//    var message: String = "I am the lucky one, to have you"
//    return message
//}

//--------------------------------------------------------------

// parameterize return function.....
fun birthdayGreating(name : String, age: Int) : String{
    println("Happy Birthday ${name}💗")
    println("This is your ${age}th Birthday")
    var message: String = "I am the lucky one, to have you"
    return message
}


//main function
fun main(){
    var pass: String = "0506"
    print("Enter password: ")
    var enteredPass = readln()
    if(pass == enteredPass){
        val result2 = birthdayGreating("ujvl",23)      //without name arguments
        val result = birthdayGreating(name = "Vansii", age = 19) //name arguments
        println(result)
        println(result2)
    }else{
        println("you entered the wrong pass")
    }



}