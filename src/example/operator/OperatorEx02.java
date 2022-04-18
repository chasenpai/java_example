package example.operator;

public class OperatorEx02 {

	public static void main(String[] args) {

		int select = 3;
		
		String job = select == 1 ? "취준생" : 
			select == 2 ? "학생" : 
				select == 3 ? "회사원" : 
					"선택된 직업이 없습니다..";
		
		System.out.println(job); // 변수 select의 값이 3이므로, 변수 job의 값으로 회사원이 담긴다.


        int score = 10;
        String grade = score < 0 || score > 100 ? "잘못된 점수입니다." :
			score >= 90 ? "A학점" :
				score >= 80 ? "B학점" :
					score >= 70 ? "C학점" :
						score >= 60 ? "D학점" : "F학점";
		
		System.out.println("\n" + grade);	// score의 값이 10이므로, 변수 grade의 값으로 F학점이 담긴다
	}

}
