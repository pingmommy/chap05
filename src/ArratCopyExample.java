
public class ArratCopyExample {
	
	public static void main(String[] args) {
		System.out.println(args.length);
		
		for(String arg: args)
			System.out.println(arg);
	}

	public static void main2(String[] args) {

		int[] num= {1,2,3,4,5};
		
		int[] dest = new int[10];
		
		System.arraycopy(num, 0, dest, 0, num.length);
		
		num=dest;
		
		for(int i = 0; i<num.length; i++) { // 배열의 인덱스를 가지고 작업을 할 때 사용. 
			System.out.printf("%d",num[i]);
		}
		
		System.out.println();
		
		// 향상된 for문
		for(int n:num) {  // 배열의 전체를 순회하면서 전체의 값으 읽기만 할 때는 자주 사용한다. 
			System.out.printf("%d",n); // num[]에 있는 값을 n에 대입하여 출력한다. 
		}                              // num자리에는 배열만 올 수 있고 인덱스는 쓰지 않는다. (인덱스없다.)
	}

}
