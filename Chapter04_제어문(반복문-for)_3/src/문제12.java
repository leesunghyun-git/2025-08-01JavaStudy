// 12. 10개의 정수를 입력받아 3의 배수의 개수와 5의 배수의 개수를 각각 출력하는 프로그램

import java.util.Scanner;
public class 문제12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int count3=0,count5=0;
		for(int i=1;i<=10;i++)
		{
			System.out.print("정수를 입력하시오");
			int num=scan.nextInt();
			if(num%3==0)
				count3++;
			if(num%5==0)
				count5++;
		}
		System.out.println("3의 배수의 개수 : "+count3);
		System.out.println("5의 배수의 개수 : "+count5);
			
	}

}
