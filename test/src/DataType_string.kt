import java.util.*
fun main(args : Array<String>){
    var sName = "문자열 ㄹ테스트"
    println (sName + " : 문자열 붙이기")
    var sTest = """
        어떻게 출력될지..
    모르겠다
        html의 <pre>? 비슷한
                가?
    """
    println(sTest)
    //문자열 내의 포멧팅
    var sTest2 = "sName의 값을 가져오는 것: $sName"
    println(sTest2)
    //리눅스의 bash와 비슷하니 ${}안에 함수호출이나 수식처리도 가능
    var sTest3 = "sName의 값을 가져오는 것: ${sName + "움하하하" + Date()}" //java 클래스도 가져올 수 있음
    println(sTest3)
}