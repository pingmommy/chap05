import java.util.Scanner;

public class EqualsExample {

	public static void main(String[] args) {

		System.out.println(">");
		Scanner sc = new Scanner(System.in);
		String str= sc.next();
		System.out.printf("입력한것:%s\n",str);
		
		//if(str=="java")(X)
		if(str.equals("java")) {
			System.out.println("good");
		}
		else
			System.out.println("Insert Again");
	}

}
