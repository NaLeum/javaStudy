package three;

import java.util.Random;
import java.util.Scanner;

public class Sudokugz {

	public static void main(String[] args) {
		Random rn = new Random();
		int n ;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("숫자를 입력하시오");
            n = Math.abs(sc.nextInt());
            sc.close();
            break;
        }
        
        long beforeTime = System.currentTimeMillis();
       //배열생성부
       int [][] array;
       array = new int[n][n];
       
        int i = 0;
        int j = 0;
        int a = 0;
        int b = 0;
        boolean asame=true;
        boolean bsame=true;
        int count=0;
      
        
        for(i=0; i < n ; i++) {
        	for(j=0; j < n ; j++) {
        		array[i][j]= 0;
        	}
        }
        
        //랜덤함수 입력부
 Loop: for(i=0; i < array.length ; i++) {
	        count=0;
        	for(j=0; j < array.length ; j++) {
        		array[i][j]=rn.nextInt(n)+1;
    
     while(true) {
    	        //가로 중복 체크
        		for(b=0; b<j; b++) {
        			 if(array[i][j]==array[i][b]){
         				 bsame =false;
          	    	}
        			 
            	}
 
        		//세로 중복체크
              	for(a=0; a<i; a++) {
         			 if(array[i][j]==array[a][j]){
       
         				asame = false;
         				 
         			}
         		}
              	if(asame==true && bsame==true) {
              		asame=true;
              		bsame=true;
              	     break;
              	}  else { 
              		count++;
              		asame=true;
              		bsame=true;
              		j--;
              		//판엎
              		if(count>2000) {
                        i--;
              			continue Loop;
              		}
          		    break;}
              	
        	}
        	//세로 중복체크
             /* for(a=0; a<i; a++) {
  			   while(array[i][j]==array[a][j]) {
  					array[i][j]=rn.nextInt(n)+1;
  					a=0;
  				
  			   }
  			   
  		   }*/

        	}
        }
        
        
        
        long afterTime = System.currentTimeMillis(); 
        long secDiffTime = (afterTime - beforeTime)/1000;
        System.out.println("시간차이(m) : "+secDiffTime);
        
        //출력부
        for(i=0; i < array.length; i++) {
            for(j=0; j < array.length; j++) {
            	
            	 System.out.print(" ㅣ" + array[i][j]+"ㅣ");
            }
            System.out.println();
	}
       
   

}
	

	
	}


