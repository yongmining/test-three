package test_three;

import java.util.Scanner;

public class test1 {

		public static void arithmetic() {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.printf("첫번째 숫자를 입력하세요 :");
			int number1 = sc.nextInt();
			System.out.printf("두번째 숫자를 입력하세요 :");
			int number2 = sc.nextInt();
			
			int num = number1 - number2;
			
			System.out.println("덧셈 결과 ->" + number1 + number2);
			System.out.println("뺄셈 결과 ->" + num);
			System.out.println("곱셈 결과 ->" + number1 * number2);
			System.out.println("나눗셈 몫 ->" + number1/number2);
			//%를 사용할려면 %%%(이스케이프 시컨스 기호를 사용함)
			System.out.println("나눗셈 나머지 ->" + number1%number2);
		}		
	public static void main(String[] args) {
			arithmetic();
		}
	 
	}
