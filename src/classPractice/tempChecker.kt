fun main(){
    var temps = intArrayOf(8,5,11,3,14,4,1)
    var sizeOfArray = temps.size
    var highestTemp = temps.maxOrNull()
    var lowestTemp = temps.minOrNull()
    var sum = 0
        for(num in temps ){
            sum = sum + num
        }

    var avrgTemp = sum/sizeOfArray

    for (aboveAvgTemp in temps){
        if(aboveAvgTemp > avrgTemp)
            println("above avg temp is : $aboveAvgTemp")
    }

    println("size of array: $sizeOfArray")
    println("max temp in week $highestTemp")
    println("min temp in week $lowestTemp")
    println("avg temp of week: $avrgTemp")


}