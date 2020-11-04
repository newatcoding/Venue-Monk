package Solutions;

import java.util.*;

public class Problem1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try {
			System.out.println("1st January 1990 was a Monday");
			//day on 1st of Every month for  Year 1900
			//here numbers indicate week and month
			//0-7 is monday - sunday.
			//int[] month=new int[12];
			//for 1900 if Jan 1st was a monday
			
			int[] months= {1,4,4,0,2,5,0,3,6,1,4,6};
			int[] add= {3,0,3,2,3,2,3,3,2,3,2,3};
			int noOfSundays=0;
			for(int i=1901;i<2001;i++) {
				//special case for leap year
				int addday=0;
				if((i%4==0 && i%4!=100)|| (i%100==0 &&i%400==0)) {
					addday=1;
				}
				else {
					addday=0;
				}
				months[0]=(months[11]+add[11])%7;
				
				if(months[0]==0) {
					noOfSundays++;
				}
				for(int j=1;j<12;j++) {
					if(j==2) {
						months[j]=(months[j-1]+add[j-1]+addday)%7;
					}
					else {
						months[j]=(months[j-1]+add[j-1])%7;
					}
					
					if(months[j]==0 || months[j]==7) {
						
						noOfSundays++;
					}
					
				}
				
			}
			
			
			System.out.println("Total No. of sundays from 1st January 1901 to 31st December 2001 are " +noOfSundays);
			
		}catch(Exception e) {
			System.out.print(e);
		}
		
	}

}
