fun main(){
    var s = "ujjaval"
   // println(s.toUpperCase())
    println(s.length)

    val str = "  Kotlin  "
    println(str.trimStart())  // Output: "Kotlin  "
    println(str.trimEnd())    // Output: "  Kotlin"

//    val str = "Kotlin"
    println(str.uppercase())  // Output: KOTLIN
    println(str.lowercase())  // Output: kotlin







    println(s.contains("sh"))
    println(s.get(2))
    println(s.replace('a','u'))

    var newString = "Ujjaval"
    var s1 = newString.substring(0,5)
    println(s1)

    var s2 = newString.substring(2)
    println(s2)

    var s3 = newString.startsWith("U")
    println("s3 = $s3")



    //equal and compair

    println("equall or not: " + s.equals(newString, ignoreCase = true))

    val str1 = "one,two,three"
    println(str1.split(","))  // Output: [one, two, three]



}