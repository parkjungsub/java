package level0;

import java.util.Scanner;

public class level0_11 {//문자열 섰기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        for(int i = 0 ;i < str1.length();i++){
            System.out.print(str1.substring(i,i+1)); // 서브스트링 함수를 이용하여 출력
            System.out.print(str2.substring(i,i+1));
        }
    }
}
