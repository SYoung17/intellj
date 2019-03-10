fun main(arg : Array<String>){
    varTest() //r/w가능변수
    valTest() //readonly변수
}
fun varTest(){
    //1. 변수의 타입을 미리 정함
    //아래는 초기화 하지 않아도 됨
    var num : Int
    num = 1
    //2. 변수의 타입을 정하지 ㅇ낳음
    //아래는 초기화 반드시 해야함
    // var number; <error
    var number = 2
}

fun valTest() {
    //val은 const와 같은 읽기 전용값
    val num = 1
    val name : String
    name = ""
//    name="sdfsdf" < 재할당 못함
}