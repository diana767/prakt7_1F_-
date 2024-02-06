import kotlin.math.pow
import kotlin.math.sqrt
import kotlin.math.tan


fun main() {
    try {
        println("введите  m")
        var m = readLine()!!.toInt()
        println("введите  n")
        var n = readLine()!!.toInt()
        when(m<n){
            true->{println("введите значение элемента с номером m")
            var am= readLine()!!.toDouble()
            println("введите значение элемента с номером n")
              var an= readLine()!!.toDouble()
             var s=(am+an)*(n*m+1)/2
                println("сумма членов с номерами от m до n:${s}")}
            false-> println("m должно быт меньше n")
    }
    } catch (e: Exception) { println("неправильный ввод") }
}

