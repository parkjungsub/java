package level0;

import java.util.Scanner;

public class level0_8 {//문자열 돌리기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        for(int i = 0;i < str.length() ;i++){
            System.out.println(str.charAt(i));
        }
    }
}
