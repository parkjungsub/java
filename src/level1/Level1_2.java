package level1;
//함수 solution은 정수 x와 자연수 n을 입력 받아, x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다.
// 다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.
public class Level1_2 {
    public static void main(String[] args) {//x만큼 간격이 있는 n개의 숫자
        long[] answer = solution(2,5);
        for (int i = 0;i < answer.length;i++){
            System.out.print(answer[i]);
        }
    }
    public static long[] solution(int x, int n) {
        long[] answer = new long[n];
        long sum = 0;
        for (int i = 0;i < n;i++){
             sum += (long)x;
             answer[i] = sum;
        }
        return answer;
    }
}
