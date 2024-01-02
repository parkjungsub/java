package level0;

import java.util.Scanner;
//양의 정수 n이 매개변수로 주어질 때, n이 홀수라면 n 이하의 홀수인 모든 양의 정수의 합을
// return 하고 n이 짝수라면 n 이하의 짝수인 모든 양의 정수의 제곱의 합을 return
public class level0_15 {// 홀짝에 따라 다른 값 반환하기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = 0;

        for(int i = 0 ; i <= num; i++){
            if((num % 2 == 0)&& (i % 2 == 0)) {
                result += i*i;
            }else if(num % 2 == 1 && i % 2 == 1){
                result += i;
            }
        }
        System.out.println(result);
    }
}
