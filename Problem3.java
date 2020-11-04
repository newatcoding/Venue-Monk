package Solutions;

public class Problem3 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		try {
			System.out.println("a+b+c= 1000");
			int sum=1000;
			for (int i = 1; i <= sum / 3; i++) 
	        { 
	              
	            
	            for (int j = i + 1; j <= sum / 2; j++) 
	            { 
	                int k = sum - i - j; 
	                if (i * i + j * j == k * k)  
	                { 
	                    System.out.print(i + ", "+  
	                                j + ", " + k); 
	                    return; 
	                } 
	            } 
	        }  
	      
	        System.out.print("No Triplets are Possible"); 
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
