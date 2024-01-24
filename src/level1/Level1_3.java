package level1;
//자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요.
// 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
public class Level1_3 {
    public static void main(String[] args) {//자연수 뒤집어 배열로 만들기
        int[] arr = solution(1234);

        for (int i = 0; i < arr.length;i++){
            System.out.println(arr[i]);
        }

    }
    public static int[] solution(long n) {
        String str = "" + n;
        String str2 = "";
        int[] answer = new int[str.length()];
        for(int i = 0 ;i < str.length() ; i++){
            str2 = "" + str.charAt(str.length() - i - 1);
            answer[i] = Integer.parseInt(str2);
        }
        return answer;
    }
}
