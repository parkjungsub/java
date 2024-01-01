package level0;

import java.util.Scanner;

public class level0_12 {//문자 리스트를 문자열로 변환하기
    public static void main(String[] args) {
        String[] arr = new String[]{"a","b","c"};
        String str = "";

        for (int i = 0;i < arr.length;i++){
            str += arr[i];
        }
        // 한줄 처리하는 방법
        //String.join("", arr);

        System.out.println(str);
    }
}
