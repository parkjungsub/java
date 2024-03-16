package level0;

//정수가 담긴 배열 numbers와 문자열 direction가 매개변수로 주어집니다.
// 배열 numbers의 원소를 direction방향으로 한 칸씩 회전시킨 배열을 return하도록
// solution 함수를 완성해주세요.

//numbers	                direction	    result
//[1, 2, 3]             	"right"	        [3, 1, 2]
//[4, 455, 6, 4, -1, 45, 6]	"left"	        [455, 6, 4, -1, 45, 6, 4]


public class Level0_30 { // 배열 회전시키기
    public static void main(String[] args) {
        int[] numbers = {1,2,3};
        String str = "left";
        System.out.println(solution(numbers,str));

    }

    public static int[] solution(int[] numbers, String direction){
        int[] answer = new int[numbers.length];
        if(direction.equals("right")){
            answer[0] = numbers[numbers.length-1];
            for (int i = 0, j = 1; i < numbers.length-1;i++, j++){
                answer[j] = numbers[i];
            }
        } else if (direction.equals("left")) {
            answer[answer.length-1] = numbers[0];
            for (int i = 1, j = 0; i < numbers.length;i++, j++){
                answer[j] = numbers[i];
            }
        }
        for (int i = 0;i < answer.length;i++){
            System.out.println(answer[i]);
        }

        return answer;
    }
}
