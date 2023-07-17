
public class Car {
	
	
	//필드 - 저장되는 공간도 변수와 다르다. 힙영역에 생성 저장
	int model;
	int speed;
	
	void forward() { // 동작을 나타내는 메소드(≒ 함수)
		
		int num; // 로컬변수, 스택변수, 임시변수, 블럭변수
		// 변수 num은 메소드 forward가 호출될 때 생겼다가 forward가 모든 
		//명령을 수행하면 소멸된다. 
		System.out.println("go forward");
	}
	
	void backward() {
		System.out.println("go backward");
	}
	
	public static void main(String[] args) {
		
		int num; // 로컬변수, 스택변수, 임시변수, 블럭변수
		
		Car c1 = new Car(); //  new + 생성자(Car()) ->> 객체 생성 

		c1.forward();
		c1.backward();
	}
}
