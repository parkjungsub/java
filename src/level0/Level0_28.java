package level0;
//정수 n이 매개변수로 주어질 때, n의 약수를 오름차순으로 담은 배열을 return하도록 solution 함수를 완성해주세요.
public class Level0_28 { // 약수 구하기
    public static void main(String[] args) {
        int [] arr;

            arr = solution(24);
    for (int i = 0;i < arr.length;i++){
        System.out.println(arr[i]);
        }
    }
    public static int[] solution(int n) {
        int[] answer = new int[10000];
        int count = 0;
        for (int i = 1;i<=n;i++){
            if(n % i == 0 ){
                answer[count] = i;
                count++;
            }
        }
        int[] result = new int[count];
        for (int i = 0 ;i < 10000;i++){
            if (answer[i] != 0){
                result[i] = answer[i];
            }
        }
        return result;
    }
}
