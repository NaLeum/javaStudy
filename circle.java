package three;
import java.util.Scanner;


public class circle {

	public static void main(String[] args) {
		int n;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("숫자를 입력하시오");
            n =Math.abs(sc.nextInt())+11;
            sc.close();
            break;
        }
    
          int i = 0;
          int j = 0; 
         
          double r = 0;
          
          for (i=0 ; i < n*2 ; i++) {
              for (j=0; j < n*2 ; j++) {
            	  r = Math.sqrt((n-i)*(n-i)+(n-j)*(n-j));
            	if (r<n) {
            		
            		System.out.print("o ");
            	
            	}else
            	{
            		System.out.print("  ");
            		
            	}
            	  
            
              };    
              System.out.println();
          };
          
	}

}
