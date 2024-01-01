package level0;

import java.util.Scanner;

public class level0_3 {//대소문자 바궈서 출력하기!!!
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        for(int i = 0;i < str.length();i++){
            if(str.charAt(i) > 64 && str.charAt(i) < 91){
                char word = (char)(str.charAt(i) + 32);
                System.out.print(word);
            } else if(str.charAt(i) > 96 && str.charAt(i) < 123){
                char word = (char)(str.charAt(i) - 32);
                System.out.print(word);
            }
        }


    }
}
