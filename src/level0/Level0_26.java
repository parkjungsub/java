package level0;
//정수 리스트 num_list가 주어집니다. 가장 첫 번째 원소를 1번 원소라고 할 때,
// 홀수 번째 원소들의 합과 짝수 번째 원소들의 합 중 큰 값을 return 하도록 solution 함수를 완성해주세요. 두 값이 같을 경우 그 값을 return합니다.
public class Level0_26 { //홀수와 짝수
    public static void main(String[] args) {
        int[] arr = new int[]{4,2,6,1,7,6,};
        System.out.println(solution(arr));
    }

    public static int solution(int[] num_list){
        int answer = 0;
        int evenSum = 0;
        int oddSum = 0;
        for (int i = 0;i<num_list.length;i++){
            if(i % 2 == 0){
                evenSum += num_list[i];
            }else if (i % 2 == 1){
                oddSum += num_list[i];
            }
        }
        if (evenSum <= oddSum){
            answer = oddSum;
        }else if(evenSum >= oddSum){
            answer = evenSum;
        }
        return answer;
    }
}
