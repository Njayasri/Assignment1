
public class firstTask {

	public static void main(String[] args) {
		
		int 	n= 7;
		for (int i = 0; i<=n-1 ; i++) 
		{
			
			for (int j = 0; j<=n-1 ; j++) 
			{
			   if(j==(n-1)/2)
		    	{
				System.out.print("!");
			     }
			   else 
			   {
				System.out.print(" ");
			     
			   }
			
			}	
			
			for (int j = 0; j<=n-1 ; j++) 
			{
			   if(j==0|| j==i || j==(n-1))
		    	{
				System.out.print("@");
			     }
			   else 
			   {
				System.out.print(" ");
			     
			   }
			
			}	

			for (int j = 0; j<=n-1 ; j++) 
			{
			   if(j==0||i==0 || i == (n-1)/2 || i== (n-1))
		    	{
				System.out.print("#");
			     }
			   else 
			   {
				System.out.print(" ");
			     
			   }
			
			}	
			
			for (int j = 0; j<=n-1 ; j++) 
			{
			   if(j==n/4 && i!= n-1 || j == n-1 && i!= n-1  || i==n-1 &&  j!=n-1&& j>n/4 )
		    	{
				System.out.print("$");
			     }
			   else 
			   {
				System.out.print(" ");
			     
			   }
			
			}	
			
			for (int j = 0; j<=n-1 ; j++) 
			{
			   if(j==0  || i==j && i>n/4 && j!=2 || i==0 && j!=n-1|| j== n-1 && i!=0 && i<n/2 || i== n/2 && j!= n-1 )
		    	{
				System.out.print("%");
			     }
			   else 
			   {
				System.out.print(" ");
			     
			   }
			
			}	
			
			for (int j = 0; j<=n-1 ; j++) 
			{
			   if(j==0  && i!=0 && i!= n-1|| j== n-1 && i!=0 && i!= n-1|| i == 0 && j!=0 && j!= n-1|| (i == n-1  && j!=0 &&  j!=n-1))
		    	{
				System.out.print("^");
			     }
			   else 
			   {
				System.out.print(" ");
			     
			   }
			
			}
			
			for (int j = 0; j<=n-1 ; j++) 
			{
			   if(j==0|| j==i || j==(n-1))
		    	{
				System.out.print("&");
			     }
			   else 
			   {
				System.out.print(" ");
			     
			   }
			
			}			
			System.out.println();
		}		
	}
	
}		    	