import kotlin.math.abs
import kotlin.math.pow
import kotlin.math.sqrt
import kotlin.math.abs

fun main()
{
    try {
        println("введите  координаты точки")
        var p= readLine()!!.toDouble()
        var q= readLine()!!.toDouble()
        println("введите  A")
        var a= readLine()!!.toDouble()
        println("введите  B")
        var b= readLine()!!.toDouble()
        println("введите  C")
        var c= readLine()!!.toDouble()

        var s= abs(a*p+b*q+c)/ (sqrt((a.pow(2))+(b.pow(2))))
                println(String.format("%.2f",s))
    }
    catch(e:Exception){ println("неправильный ввод")}
}