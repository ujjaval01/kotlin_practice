fun main(){
    var s = "raushan"
    println(s.length)
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




}