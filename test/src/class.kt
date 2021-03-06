fun main(args: Array<String>){
    var obj1 = TestClass()
    var obj2 = TestClass("파라메터 받음")
    var obj3 = ParentClass()
    println( obj3.getMyName() )
    var obj4 = ChildClass()
    println(obj4.getMyName())
}

//class name으로 생성자를 만들어 쓰기도 한다.
class TestClass{
    var name : String = ""
    //기본 생성자
    constructor(){
        println("기본생성자")
    }
    //overloading 생성자
    constructor(name: String){
        this.name = name
        println("$name 을 입력받은 생성자")
    }
}

//코틀린에서는 기본적으로 상속이 거부되어 있다. 그래서 부모 클래스를 open으로 지정해야 함
open class ParentClass {
    var name : String = this.toString()
    fun getMyName() : String = name
}

//상속 받을 때는 부모 클래스를 "class name : 부모 클래스명(생성자인자){}" 형식으로 해야한다.
class ChildClass : ParentClass(){

}