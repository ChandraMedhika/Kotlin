import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    var i =1
    do {
        var total: Double = 0.0

        println("*******************************")
        println("*****PARKING FEE CALCULATE*****")
        println("*******************************")

        println("")

        print("Parking Duration/h: ")
        var hours = readLine()!!.toInt()

        if (hours <= 5){
            total = (hours * 1).toDouble()
        }else if(hours == 24){
            total = 15.0
        }else if(hours > 24){
            total = (hours - 24) * 0.5
            total += 15
        }else if (hours > 5){
            total = (hours - 5) * 0.5
            total += 5
        }

        println("Accumulated costs/$: $total")

        println("")

        i++

        print("Back to Menu? yes/no :")
        val rtn = input.nextLine()
        println("")
    }while(rtn != "no")

}