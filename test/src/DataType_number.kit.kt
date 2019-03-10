fun main(arg : Array<String>){
    var doubleValue : Double = 10.1111
    var floatValue : Float = 10.1f
    var longValue   : Long  = 10
    var intValue    : Int   = 10
    var shortValue  : Short = 10
    var byteValue   : Byte = 10
    //출력
    println (doubleValue)
    println (floatValue)
    println (intValue)
    doubleValue     = intValue.toDouble()
    intValue = doubleValue.toInt()
}