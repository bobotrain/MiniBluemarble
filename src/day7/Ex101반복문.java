package day7;

import java.util.Scanner;

public class Ex101반복문 {
public static void main(String[] args) {
	
	/*Q602.[고급]
			(실행결과의 예) n : 4 (엔터)
						i	공백		별
					   *	1	3=(4-i)개	1=(2*i-1)개
					  ***	2	2		3
					 *****	3	1		5
					*******	4	0		7
	*/
	
	Scanner sc = new Scanner(System.in);
	System.out.print("n : ");
	int n = sc.nextInt();
	for(int i=1; i<=n; i++) {
		for(int j=1; j<=n-i; j++) {
			System.out.print(" ");
		}//inner1
		for(int j=1; j<=2*i-1; j++) {
			System.out.print("*");
		}//inner2
		System.out.println();
	}//outer
	
	
}
}
