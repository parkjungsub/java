package level0;

import java.util.Scanner;

public class level0_13 { //문자열 곱하기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int number = sc.nextInt();

        for(int i = 0; i < number ;i++){
            System.out.print(str);
        }
        //str.repeat(k);
    }
}
