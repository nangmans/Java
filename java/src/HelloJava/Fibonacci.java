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
		
		Scanner sc = new Scanner(System.in); //java�� �Լ��� �޼ҵ� �ۿ� ���� �� �����Ƿ� main �޼ҵ� �ȿ� �־��ش�.
		
		int n = sc.nextInt();
		
		System.out.println(Fibonacci(n));
	}//main


	
}//class
