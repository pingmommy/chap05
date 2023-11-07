
public class EpochTimeExample2 {

	
	//epoch : 1970/01/01 목 00:00:00~ 경과시간 
	//집에서 해보기 
	public static void main(String[] args) {  //>>초단위(/1000)로 바꿔라.
		long epoch = System.currentTimeMillis()/1000+9*60*60;  
		                                          //>>9*60*60 우리나라는 9시간을 더해야 하고
		System.out.println("first: "+ epoch);                // 단위를 맞추기 위해 초단위로 환산. 
		
		int year = 1970;
		for (;;) {
		   boolean isleap = (year%4==0 && year!=100)||(year%400 ==0);
		   int daysOfYear = isleap ? 366:365;
		   if(epoch - daysOfYear*24*60*60 >=0) {
			   epoch = epoch -daysOfYear*24*60*60;
			   year++;
			   continue;
		   }
		   //else 
			 
		   break;
		}
		
		//31일 월 - 상반기는 홀수월(1,3,5,7)에, 하반기는 짝수월(8,10,12)에 더해준다.
		
		// 31 28 31 30 31 30 31 31 30 31 30 31
		System.out.print(year+"년");
		
		System.out.println();
		System.out.println("middle1: "+ epoch); 
		
		
		int month = 0;
		int[] dayOfMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; 
		boolean isleap = (year%4==0 && year!=100)||(year%400 ==0);
		if(isleap) {
			dayOfMonth[1] =29;
		}
		
		for(int i=1; i<12;i++) {
			
			if(epoch-dayOfMonth[i-1]*24*60*60>=0) {
				epoch = epoch -dayOfMonth[i-1]*24*60*60;
				continue;
			}
			month=i;
			break;
		}
		
		System.out.println();
		System.out.println("middle: "+ epoch);                // 단위를 맞추기 위해 초단위로 환산. 

		int day =0;
		int hour =0;
		int minute =0;
		int second = 0;
		int week = 0;
		
		//minute = (int)epoch/60;
		//System.out.println(minute);
		//hour=minute/60;
		
		
		// 나머지가 1이 아니면 변수에 +1을 해라 | 30,31이 넘어가는 시점에는 어떻게 계산될까? 다시 1 되어야 하는데..
		//System.out.println(epoch);

		day=(int)Math.ceil(epoch/60/60/24.0);  
		///System.out.println(day);

		
		
		hour=(int)epoch/60/60%24;
		minute = (int)epoch/60%60;
		second = (int)epoch%60%60;
		
		System.out.printf("%d년 %d월 %d일 %d시 %d분 %d초",year,month,day,hour,minute,second);
		//System.out.println(epoch);
		
		
	}

}
