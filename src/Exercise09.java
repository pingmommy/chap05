import java.util.Scanner;


// 집에서 마저 완성하기 
public class Exercise09 {

	public static void main(String[] args) {

		boolean run = true;
		int studentNum =0;
		int[] scores = null;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학생수 입력: ");
		studentNum = sc.nextInt();
		//System.out.println(studentNum);
		
		while(run) {
			System.out.println("------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("------------------------------------------------");
			System.out.println("선택>");
			
			int selectNo= sc.nextInt();
			
			if(selectNo == 1) {
				System.out.println(studentNum);
				
			}else if(selectNo==2) {
				scores = new int[studentNum];
				
			}else if(selectNo==3) {
				
			}else if(selectNo==4) {
				
			}else if(selectNo==5) {
				run = false;
			}
		}
		
		System.out.println("end");
	}

}
