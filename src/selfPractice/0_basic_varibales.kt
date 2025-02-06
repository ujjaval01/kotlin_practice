package selfPractice

fun main(){
    // val - constant
    // var - changeable
    // byte short int long float double char bool string array
    //   1    2    4    8     4     8     2    1
    // TYPE 1:--
    // var/val variable_name = value

    var a = 10           //int
    var b = 10.1        // float
    var c = 1995621.45 // double
    var d = 'f'    // char
    var e = "name"   // string
    var activity = arrayOf("cricket", "music", "online gaming", "programming")
    activity[0] = "ujjaval"   //modifying

    println("${a} ${b} ${c} ${d} ${e} ${activity[0]}")

    // TYPE 2:--
   // val variable_name : Int = value

    var p : Int = 10
    var q : Float = 10.1f
    var r : Double = 1995621.45
    var s : Char = 'F'
    var t : String = "ujjaval"

    println("${p} ${q} ${r} ${s} ${t}")




}