package three;

import java.util.Scanner;

public class vicstar {

	public static void main(String[] args) {
		 int n ;
	        Scanner sc = new Scanner(System.in);
	        while (true) {
	            System.out.println("숫자를 입력하시오");
	            n = Math.abs(sc.nextInt())*2+5;
	            sc.close();
	            break;
	        }
	        
	        int i = 0;
	        int j = 0;
	        int star = 0;
	        int a = 0;
	        //머리
	        for (i = 0; i < n; i+=2) {    
	            for (a=0; a<n; a++) {
	            	System.out.print("  ");
	            }
	            for (j = n; j >= i; j -= 2) {   
	                System.out.print("  ");
	            }
	            for (star = 0; star <= i ; star++) {
	                System.out.print("* ");
	            }
	            System.out.println(); 
	        }
	        //몸통
	        for (i =0; i <= n; i += 2) { 
	         
	            for (j = 0; j <= i; j += 2) {  
	                System.out.print("  ");
	            }
	            for (star =3*n; star > i; star--) {
	                System.out.print("* ");
	            }
	           System.out.println();
	           
	        }
	        //다리
	        int herbuck = 0;
	        int leg = n;
	        int k = 0;
	        for (i = 0; i < n/2+1; i++) { 
	            System.out.print("  ");
	            for (j = i; j < n/2; j++) {   
	                System.out.print("  ");
	            }

	            for (k = 0; k < n; k++) { 
	                if (k < leg) {
	                    System.out.print("* ");
	                } else {
	                    System.out.print("  ");
	                }
	        
	            }
	            System.out.print("  "); 

	            for (j = 0; j < herbuck; j++) {
	                System.out.print("  ");
	            }
	
	            
	            for (k = 0; k < n; k++) {
	                if (k < leg) {
	                    System.out.print("* ");
	                } else {
	                    System.out.print("  ");
	                }

	            }

	            leg = leg -2;
	            herbuck = herbuck +4; 
	            System.out.println();
	          
	        }
	}

}
