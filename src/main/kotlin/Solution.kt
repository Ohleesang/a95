/** 1~1,000,000 n : 정수 최대 10^11 크기를 고려해야한다.
 * 3~10 k : 진수
 *
 *  @p@ 소수 양쪽에 0 이있는경우
 *  P@  오른쪽에만 0이 있는경우
 *  @P
 *  P     P: 0을 포함하지않은 소수
 *
 *  변환된 수 안에 몇개의 소수가있는지 출력하라.
 *  (중복도 허용)
 *
 *
 *  #1  n이 입력되면, k진수로 자료형 표현하는 로직
 *
 *  #2  표현된 자료형에서 조건(위에 4가지)에따른 구분 필요
 *
 *  #3  구분된 자료에대하여 그 값이 소수인지 판별이 필요
 *
 *  끝에 0 이 붙어있으면 소수는 절떄아님! 10의배수이므로
 *
 *
 */

class Solution {

    fun isPrime(n :Int):Boolean{//n :들어오는 정수값
        return false
    }
    fun solution(n: Int, k: Int): Int {
        var answer: Int = -1

        //#1
        var intStr= n.toString(k) //k 진수의 정수값

        //#2
//        var maps = intStr.split('0') //1001 같은경우 소수인데 0이 2개이상 들어가는 경우가 생길수도?


        //#3
        var s = 14543243
        return answer
    }
}

fun main(){

    var a = Solution()
    a.solution(437674,3)
    a.solution(110011,10)

}