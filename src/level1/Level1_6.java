package level1;


//함수 solution은 정수 n을 매개변수로 입력받습니다.
// n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요.
// 예를들어 n이 118372면 873211을 리턴하면 됩니다.
public class Level1_6 {//정수 내림차순으로 배치하기
    public static void main(String[] args) {

    }

    public static long Solutrion(long n) {
        long answer = 0;
        String str = Long.toString(n);

        for (int i = 0;i < str.length();i++){
            long num = str.indexOf(i);

        }

        return answer;
    }
}
