object act1 {
  def areaOfCircle(r:Double): Double = r*r*math.Pi

  def toFahrenheit(temp:Double):Double = temp*1.8 +32.00

  def vofSphere(r:Double):Double = r*r*r*(4/3)*math.Pi

  def priceofbooks(nofbooks:Int):Double = 24.95*nofbooks*0.4
  def shipcost(n:Int):Double = 3 + 0.75*(n-50)
  def totalprice(n:Int):Double = priceofbooks(n) + shipcost(n)

  def easytime(d: Int): Int = d * 8
  def tempotime(d:Int):Int = d*7
  def totaltime(ed:Int, td:Int) :Int = easytime(ed) + tempotime(td)

  def main(args:Array[String]): Unit = {
    println(areaOfCircle(5))
    println(toFahrenheit(35))
    println(vofSphere(5))
    println(totalprice(60))
    println(totaltime(2 + 2, 3))
  }
}
