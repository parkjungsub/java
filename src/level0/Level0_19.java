package level0;

//머쓱이는 40살인 선생님이 몇 년도에 태어났는지 궁금해졌습니다. 나이 age가 주어질 때,
// 2022년을 기준 출생 연도를 return 하는 solution 함수를 완성해주세요.
public class Level0_19 {
    public static void main(String[] args) { // 나이출력 2022년도 기준
        System.out.println(solution(30));
    }

    public static int solution(int age) {
        int answer = 0;
        answer = 2023 - age;
        return answer;
    }
}

