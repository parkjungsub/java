package level1;
//정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.
public class Level1_0 {// 평균 구하기

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4};
        System.out.println(solution(arr));
    }

    public static double solution(int[] arr){
        double answer = 0;
        double sum = 0;
        for (int i = 0;i < arr.length;i++){
            sum += arr[i];
        }
        answer = sum / arr.length;
        return answer;
    }
}
