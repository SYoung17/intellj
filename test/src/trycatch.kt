import java.io.BufferedReader
import java.io.FileReader
import java.lang.Exception

fun main(args : Array<String>){
    //java와 흡사, 그러나 checked exception을 지원 안함
    //try catch문을 강제적으로 할 필요가 없다
    try{
        13 / 0
    } catch (e : Exception){
        println(e)
    } finally {
        println("마지막 수행.")
    }
    var zerodivided = 13 / 0
    println(zerodivided)
}
//try catch를 강제하지 않았을 뿐, 방어코드는 필요하다.
fun no_checked_exception(){
//    //java 코드 자동 컨버팅
//    try {
//        val 'in' = BufferedReader(FileReader(args[0]))
//        var s: String?
//
//        s = 'in'.readLine()
//        while(s != null) {
//            println(s)
//            s = 'in'.readLine()
//        }
//        'in'.close()
//    } catch (e: IOException) {
//        System.err.println(e) //에러가 있다면 메시지 출력
//        System.exit(1)
//    }

    val in1 = BufferedReader(FileReader("file경로명"))
    var s: String?
    s = in1.readLine()
    while (s != null){
        println(s)
        s = in1.readLine()
    }
    in1.close()
}