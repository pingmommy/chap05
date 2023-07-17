import java.time.DayOfWeek;

public class EnumExample {
	
	enum Gender{  // enum + 타입 + {값}
		Male, Female
	}
	
	enum Color{  // enum + 타입 + {값}
		 Black, Red ,Green, Yellow, Blue,  Magenta, Cyan,  White

	}
	// enum의 값을 알아내는 메소드는 values();
    // enum 배열 안에 있는 값들의 순서를 알아내는 메소드 ordinal()

	public static void main(String[] args) {
		
		
		for(int i=0; i<10 ;i++) {
			for(int j=0;j<10 ;j++) {
				//Color fg = Color.values()[4];
				Color fg = Color.values()[(int)(Math.random()*8)];
				Color bg = Color.values()[(int)(Math.random()*8)];
				System.out.printf("\033[%dm",fg.ordinal()+30); 
				System.out.printf("\033[%dm",bg.ordinal()+40); 

				// fg는 enum타입이기 때문에 정수값으로 변환하여 매개변수로 주어야 한다. 
				char ch =(char)(Math.random()*26+'A');
				System.out.print(ch);
			}
			System.out.println("\033[0m");
		}
	}
	
	public static void main5(String[] args) {
		Color[] colors = Color.values();
		
		for(Color c : colors)
			System.out.printf("%d %s \n",c.ordinal(),c.toString());
		
		DayOfWeek[] weeks = DayOfWeek.values();  // enum에 있는 모든 값을 사용할 때 values();
		
		for(DayOfWeek d : weeks)
			System.err.printf("%d %s\n",d.ordinal(),d.toString());
	}
	
	public static void main4(String[] args) {
		
		Color c1 = Color.Black;
		Color c2 = Color.Red;
		
		System.out.printf("%d %s\n",c1.ordinal(),c1.toString()); // 순서번호와 글자 출력할 때
		System.out.printf("%d %s\n",c2.ordinal(),c2.toString());

	}
	
	
	public static void main3(String[] args) {

		Gender g= null; 
		
		// g= 10; (X)
		g=Gender.Male;
		g=Gender.Female;
		
		DayOfWeek week = null;
		
		week= DayOfWeek.MONDAY;
		// week = Gender.Male;(X)
		
	}

}
