package p01;

import java.util.Scanner;

public class TT01 {

	public static void main(String[] args) {
	

		        Scanner scanner = new Scanner(System.in);
		        System.out.print("높이를 입력하세요: ");
		        int height = scanner.nextInt();
		        
		        // 정삼각형 출력
		        for (int i = 1; i <= height; i++) {
		            for (int j = 1; j <= height - i; j++) {
		                System.out.print(" ");
		            }
		            for (int k = 1; k <= 2 * i - 1; k++) {
		                System.out.print("*");
		            }
		            
		            System.out.println();
		        }
		        
		        scanner.close();
		    
		
    //tt

	}

}
