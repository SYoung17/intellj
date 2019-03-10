fun main(args : Array <String>){
    //any는 C에서 void*와 같은 역할
    //어떠한 데이터형의 변수이든 간에 담을 수 있는 크기
    var anything : Any
    anything = 1
    anything = "문자열"
    anything = 111.10001
    anything = 10.10f
    //is와 !(not) 연산자로 어떤 데이터형인지 체크 가능
    if(anything !is String){
        if (anything is Float){
            println("float")
        }
    }
}