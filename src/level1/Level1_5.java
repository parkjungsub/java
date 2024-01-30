package level1;
//임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
//n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.
public class Level1_5 {
    public static void main(String[] args) {//정수 제곱근 판별

        System.out.println(solution(144));
    }
    public static long solution(long n){
        long answer = -1;
        long num = (long)Math.sqrt(n);

        if(Math.sqrt(n) - num == 0){
            num += 1;
            answer = num * num;
            return answer;
        }else
            return answer;
    }
}
