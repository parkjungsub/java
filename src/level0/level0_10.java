package level0;

import java.util.Scanner;

public class level0_10 {//문자열 겹쳐쓰기
    public static void main(String[] args) { //리펙토리 요망
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        int index = sc.nextInt();
        String str3 = str1.substring(index + str2.length());// 끝 문자의 붙이기

        System.out.println(str1.substring(0,index) + str2 + str3); //결과값
    }
}
