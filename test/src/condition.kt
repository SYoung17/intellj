fun main(args : Array<String>){
    ifExample()
    loopExample()
    caseExample()
}
fun caseExample() {
    //var obj : Any? = "aaa";
    var obj : Any? = 10.00f
    //var obj : Any? = 8
    when(obj){ //when c의 switch같은 개념?
        "aaaa"      -> {println("문자:" + obj)}
        is Float    -> {println("숫자: " + obj)} //코틀린에서 when은 is 와 in 지원
        in (0 .. 9) -> {println("0-10까지 숫자")}
        else        -> {println("???")}
    }
}
fun loopExample() {
    //반복문 for: in과 (시작..끝)으로 반복 가능
    for (i in (0..10)){
        println("i -> " + i)
    }
    //반복문 while: while(조건){}
    var i : Int = 0
    while(i < 10){   i++; println ("$i 입니다.") }
}
fun ifExample() {
    var a : Any? = null
    if(a == "aaaa"){
        println("문자:" + a)
    }else if( a is Float ){
        println("숫자: " + a)
    }else if(a in (0..9) ){
        println("0-10까지 숫자")
    }else if (a == null){
        println ("null!")
    }
}