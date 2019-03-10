fun main(args : Array<String>){
    //읽기 전용
    var lst = listOf(1, "헉", 3.00f, true)
    for (i in 0 .. lst.size - 1){
        println ( lst.get(i).toString() )
    }
    //수정가능 - list. 데이터형을 미리 정해야?
    println("___________")
    var lstEditable = mutableListOf<String>()
    //add 메소드로 추가
    lstEditable.add("나는야")
    lstEditable.add("우주의")
    lstEditable.add("판타지")
    lstEditable.add("우주의")
    lstEditable.add("ㄴㅇㄹㄴ")
    lstEditable.add("우주의")
    for (s in lstEditable){
        println(s)
    }
    println("_________")
    //remove 메소드
    lstEditable.removeAt(0)
    for(s in lstEditable){
        println(s)
    }
    println("_______")
    //map
    var m = hashMapOf("고양이" to 1, "강아지" to 2)
    println(m["고양이"])

}