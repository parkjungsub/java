package level0;

import java.math.BigInteger;

public class Level0_21 {
    public static void main(String[] args) { // 두수의 합 구하기
        System.out.println(solution("18446744073709551615","287346502836570928366"));
    }

    public static String solution (String a, String b){
        String answer = "";
        BigInteger numA = new BigInteger(a);
        BigInteger numB = new BigInteger(b);

        return numA.add(numB).toString();// 두수를 더하고 String으로 바꾸는 과정
    }
}
