
public class Exercise08 {

	public static void main(String[] args) {

		int sum =0;
		double avg = 0.0;
		int count = 0;
		
		
		int[][]array = {
				{95,96},
				{ 83,92,96},
				{78,83,93,87,88}
		};
		for(int[] arr:array) {
			for(int n:arr)
				sum+=n;
				count++;
		}
		
		avg = sum/(double)count;
		
		System.out.println(sum);
		System.out.println(avg);
	}


	
	public static void main1(String[] args) {

		int sum =0;
		double avg = 0.0;
		int count = 0;
		
		
		int[][]array = {
				{95,96},
				{ 83,92,96},
				{78,83,93,87,88}
		};
		for(int i=0; i<array.length;i++) {
			for(int j=0; j<array[i].length;j++)
				sum+=array[i][j];
				count++;
		}
		
		avg = sum/(double)count;
		
		System.out.println(sum);
		System.out.println(avg);
	}

}
