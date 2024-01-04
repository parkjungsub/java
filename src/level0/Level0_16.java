package level0;

import com.sun.tools.javac.Main;

public class Level0_16 { // 두 수의 차 구하기
    public static void main(String[] args) {
        System.out.println(solution(1,2));
    }
    public static int solution(int num1, int num2) {
        int answer = 0;
        answer = num1 - num2;
        return answer;
    }
}
