package level0;

import java.util.Scanner;

public class level0_14 {//n의 배수 구하기 n의 배수이면 1을 반환 아니면 0을 반환
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n = sc.nextInt();
        int answer = 0;

        answer = (num % n == 0) ? 1 : 0;
        System.out.println(answer);
    }
}
