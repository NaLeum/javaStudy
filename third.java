package three;

import java.util.Scanner;

public class third {

	public static void main(String[] args) {
		 int n ;
	        Scanner sc = new Scanner(System.in);
	        while (true) {
	            System.out.println("숫자를 입력하시오");
	            n = Math.abs(sc.nextInt())*2+1;
	         //   n = (n*2)+1;
	            sc.close();
	            break;
	        }

	        int i = 0;
	        int j = 0;
	        int diamond = 0;
	        
	        for (i=0; i<n; i+=2) {    
	            for (j=n; j>=i; j-=2) {   
	                System.out.print("  ");
	            }
	            for (diamond=0; diamond<=i; diamond++) {
	                System.out.print("◆ ");
	            }
	            System.out.println(); 
	        }
	
	        for (i=0; i<=n-2; i+=2) { 
	            System.out.print("  "); 
	            for (j=0; j<=i; j+=2) {  
	                System.out.print("  ");
	            }
	            for (diamond=n-2; diamond>i; diamond--) {
	                System.out.print("◆ ");
	            }
	           System.out.println();
	        }
	}

}//128
