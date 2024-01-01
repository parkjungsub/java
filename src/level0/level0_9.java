package level0;

import java.util.Scanner;

public class level0_9 {// 홀짝 구분하기 (간단한 조건문이면 삼항연산자 사용해보기)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println(num + " is even");
        } else{
            System.out.println(num + " is odd");
        }
    }
}
