
//val one:Int=1
//
//var number:Int=2
//number=15

//control+/
//var naming:String="carrot"
//if(naming=="carrot"){
//    naming="apple"
//} else if(naming=="carrot"){
//    naming="lemon"
//} else(naming=="carrot"){
//    naming="banana"
//}


fun calculateif(favorite:String, title:String){
    println("나는 $favorite 을/를 $title 합니다")
}

val variation:String="사과"
calculateif(variation, "바나나")

fun numbering(numberOne:Int, numberTwo:Int, type:String){
    var numberThree = 0

    if (type == "+"){
        numberThree = numberOne + numberTwo
    } else if (type == "-"){
        numberThree = numberOne - numberTwo
    } else if (type == "*"){
        numberThree = numberOne * numberTwo
    } else if (type == "/"){
        numberThree = numberOne / numberTwo
    } else {
        println("error")
    }
    println("계산 결과는 $numberThree 입니다")
}
//numbering(5,10)

fun logic(a:Int, b:Int, type:String){
    var plus:Int=0
    when(type){
        "+" -> plus = a + b
        "-" -> plus = a - b
        "*" -> plus = a * b
        "/" -> plus = a / b
        //ctl d
    }
    println("$a $type $b = $plus")
}

logic(500, 400, "+")
logic(500, 400, "-")
logic(500, 400, "*")
logic(500, 400, "/")


/**
 * 매개변수만 넣어줘도 됨 ctl x
 * numberOne, numberTwo 라는 변수를 선언해서 그 변수를 인자로 함수에 대입
 */

val test:Int=250
val two:Int=300
numbering(test, two,"+")
numbering(test, two,"-")
numbering(test, two,"*")
numbering(test, two,"/")
numbering(test, two,"j")

var i = 0
var j = 0

for (i in 2..9){
    for (j in 1 .. 9){
        var jj = i*j
        println("$i*$j = $jj")
    }
}
/**
 * 이중포문(for)
 * 변수의 위치: 전역변수, 지역변수
 * double: 소수점
 */



과제
/**
 * 모든 문제의 출력은 입력값, 결과값이 표시 되도록 출력
 *
 * 1.번문제
 * numberOne과 numberTwo를 매개변수로 갖는 함수를 만들고,
 * 함수의 로직은 numberOne, numberTwo를 더하기 하고, 그 결과값을 출력
 * 여기서 함수의 인자는 변수를 사용
 * ex) calculate(4,5) => 입력값:4,5 결과값: 9
 */

/**
 * 2.번문제
 * 2중 for 문을 이용하여 구구단 함수를 만들고 사용자가 입력한 숫자의 단을 출력하는 함수를 생성
 * ex) calculate(1) => 1단출력, calculate(2) => 2단출력
 */

/**
 * 3.번문제
 * 사용자가 2개의 숫자를 입력하고 그 숫자 중 큰 숫자를 출력, 같으면 같다고 출력
 * ex) calculate(1,4) => 입력값: 1,4 큰 숫자: 4, calculate(4,4) => 입력값: 4,4 같음
 * if문을 사용하여 작성
 */
