package lianshou;

public class F¿ÕÐÄÈý½ÇÐÎ {
	public static void main(String args[]){
		 int n = 6;  
	     String c = " ";  
	     String x = "*";
	     for(int i = 0; i < n; i++){
	    	 for (int j = 0; j < 2 * n; j++){
	    		 if (j == (n - i) || j == (n + i)) {  
	                    System.out.print(x);  
	                } else {  
	                    System.out.print(c);  
	                }  
	    	 }
	    	 System.out.println();  
	     }
	     for(int j=0;j<2*(n+1)-1;j++){  
	            System.out.print(x); 
	}
	}    
}
