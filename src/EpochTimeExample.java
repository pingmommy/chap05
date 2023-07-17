
public class EpochTimeExample {

	public static void main(String[] args) {  //>>초단위(/1000)로 바꿔라.
		long epoch = System.currentTimeMillis()/1000+9*60*60;  
		                                          //>>9*60*60 우리나라는 9시간을 더해야 하고
		//System.out.println(epoch);                // 단위를 맞추기 위해 초단위로 환산. 
		
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
		
		System.out.print(year+"년");
		//System.out.println(epoch); 
		
//		long minute = epoch/60L;
//		//System.out.println("minute = "+ minute);
//		
//		long hour = minute/60L;
//		//System.out.println("hour = "+ hour);
//		
//		long day = hour/24;
//		//System.out.println("day = "+ day);
//		
//		int month = (int)day/30; // 30/ 31 /2월 28
//		//System.out.println("month = "+ month);
//		
//		int left = (int)day%30;
//		//System.out.println("left = "+ left);
//		
//		int todayHour = (int)day/30;
//		
//		System.out.printf("%d월%d일",month+1,left);
//		System.out.println(todayHour+"시");
//		
		//int mon = (int)dd/30;
		//System.out.println(mon);
		
		int month = 0;
		
		for(int i=1; i<12;i++) {
			int dayOfMonth =0;
			
			switch (i) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				dayOfMonth = 31;
				break;
			case 2:
				 boolean isleap = (year%4==0 && year!=100)||(year%400 ==0);
				 dayOfMonth =isleap? 29:28;
				break;
			default:
				dayOfMonth =30;
				break;
			}
			
			if(epoch-dayOfMonth*24*60*60>=0) {
				epoch = epoch -dayOfMonth*24*60*60;
				continue;
			}
			month=i;
			break;
		}
		System.out.println(month);
	}

}
