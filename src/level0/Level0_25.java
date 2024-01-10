package level0;
//정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소의 평균값을 return하도록 solution 함수를 완성해주세요.
public class Level0_25 {
    public static void main(String[] args) {// 배열의 평균값
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
        System.out.println(solution(arr));
    }
    public static double solution(int[] numbers){
        double answer = 0;
        int sum = 0;
        for (int i = 0;i < numbers.length;i++){
            sum += numbers[i];
        }
        answer = (double)sum / numbers.length;
        return answer;
    }
}
