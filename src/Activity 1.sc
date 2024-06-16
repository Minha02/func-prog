def areaOfCircle(r:Double): Double = r*r*math.Pi
areaOfCircle(5)

def toFarenheit(temp:Double):Double = temp*1.8 +32.00
toFarenheit(35)

def vofSphere(r:Double):Double = r*r*r*(4/3)*math.Pi
vofSphere(5)

def priceofbooks(nofbooks:Int):Double = 24.95*nofbooks*0.4
def shipcost(n:Int):Double = 3 + 0.75*(n-50)
def totalprice(n:Int):Double = priceofbooks(n) + shipcost(n)

totalprice(60)

