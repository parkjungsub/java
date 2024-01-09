package level0;
//정수 n이 주어질 때, n이하의 짝수를 모두 더한 값을 return 하도록 solution 함수를 작성해주세요.
public class Level0_24 {//짝수의 합 구하기
    public static void main(String[] args) {
        System.out.println(solution(10));
    }
    public static int solution(int n) {
        int answer = 0;
        for(int i = 0;i <= n;i++){
            if(i % 2 == 0){
                answer += i;
            }
        }
        return answer;
    }
}
