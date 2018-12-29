package HelloJava;
import java.util.Scanner;

public class Fibonacci {

	public static int Fibonacci(int x) {
		
		if(x==2) return x;
		
		if(x==1) return x;
		
		 x = Fibonacci(x-1)+Fibonacci(x-2);
		
		
		return x;
	
	}//fibonacci
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //java의 함수는 메소드 밖에 있을 수 없으므로 main 메소드 안에 넣어준다.
		
		int n = sc.nextInt();
		
		System.out.println(Fibonacci(n));
	}//main


	
}//class
