// index번호 찾기
// 자바 : index 번호 => 0번부터 시작
// ㅇ라클 : index 번호 => 1번부터 시작
import java.util.Scanner;
public class 제어문_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg="ABCDEFGHPOLMNGBATCTD";
		System.out.println("문자의 총갯수:"+msg.length());
		Scanner scan=new Scanner(System.in);
		System.out.print("알파벳 대문자 입력:");
		int index=0;
		String s=scan.next();
		if (s.length()!=1 || (s.charAt(0)<'A' ||s.charAt(0)>'Z'))
			System.out.println("똑바로 입력해라ㅇㅇ");
		for(int i=0;i<msg.length();i++)
		{
			char c=msg.charAt(i);
			if(c==s.charAt(0))
			{
				index=i;
				System.out.println(s+"는(은) "+index+"번째 위치한다!!");
			}
		}

	}

}
