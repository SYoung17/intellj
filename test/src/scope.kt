var gName : String = "전역처리 "
fun main(args : Array<String>){
    println(gName)
    // {}안의 변수는 {} 밖에서 접근못함
    if(true){
        var lName = "지역처리"
        println(lName)
        println(gName)
    }
    //모르는 변수라 예외 발생
    ///println(lName)
}