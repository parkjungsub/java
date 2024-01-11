package level0;
//정수 n이 매개변수로 주어질 때 n의 각 자리 숫자의 합을 return하도록 solution 함수를 완성해주세요
public class Level0_27 {//자릿수 더하기
    public static void main(String[] args) {

        System.out.println(solution(1234));
    }
    public static int solution(int n){
        int answer = 0;
        String str = Integer.toString(n);

        for(int i = 0;i < str.length();i++){
            answer += Integer.parseInt(str.substring(i,i+1));
        }
        return answer;
    }
}
