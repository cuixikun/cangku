package lianshou;

public class Fµ¹Èý½ÇÐÎ {
	 public static void main(String args[]){
		 int n = 5;  
	     String c = " ";  
	     String x = "*";  
	     for(int j=0;j<2*(n+1)-1;j++){  
	         System.out.print(x);  
	     }  
	     System.out.println();  
	     for (int i = 0; i < n; i++) {  
	         for (int j = 0; j < 2 * n; j++) {  
	             if (j == i+1 || j == (2*n - i-1)) {  
	                 System.out.print(x);  
	             } else {  
	                 System.out.print(c);  
	             }  
	               
	         }  
	         System.out.println();  
	     }  
	       
	 }  
	 
}


