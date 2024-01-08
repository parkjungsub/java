package level0;

public class Level0_20 {
    public static void main(String[] args) { //숫자 비교하기
        System.out.println(solution(2,3));
    }
    public static int solution(int num1, int num2) {
        int answer = 0;
        if(num1 == num2){
            answer = 1;
        }else {
            answer = -1;
        }
        return answer;
    }
}
