import kotlin.math.pow
import kotlin.math.sqrt
import kotlin.math.tan

fun main()
{
    try {
        println("введите  x")
        var a= readLine()
        var x=a!!.toDouble()
        var rez=(1/tan(x))-Math.sin(sqrt((x.pow(2)+1)))
        println(String.format("%.2f",rez))
    }
    catch(e:Exception){ println("неправильный ввод")}
}