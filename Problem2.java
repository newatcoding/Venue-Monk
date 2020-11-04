package Solutions;

public class Problem2 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Finding no. of ways to get a sum of 2000 using \n"
				+ "{10,20,50,100,200,500,1000,2000} coins");
		int[] coins= {10,20,50,100,200,500,1000,2000};
		int[] targetSumways=new int[2000+1];
		
		targetSumways[0]=1;
		for(int i=0;i<coins.length;i++) {
			for(int j=coins[i];j<=2000;j++) {
				targetSumways[j]+=targetSumways[j-coins[i]];
			}
		}
		System.out.println("Total No. of ways are "+targetSumways[2000]);
	}

}
