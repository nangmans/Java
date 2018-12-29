package HelloJava;
import java.util.Scanner;
public class Factorial {

	static Scanner sc = new Scanner(System.in);
	
	static int n = sc.nextInt();
	
	 static int Factorial (int x) { //print 메소드에서 부른 Factorial 메소드가 실행된다. Factorial(n)에서 n은 int x의 인수이다. 이 메소드가 main 메소드에서도 쓰여야 하기 때문에 static을 붙여 공유해준다.
		
	
		
		if(x!=1) //Factorial(1)이 아니라면, 이 조건이 없으면 재귀호출이 무한히 실행된다. -1,-2,-3...
		
			x= x * Factorial(x-1); //x에 Factorial(x-1)을 곱한다. Factorial(x-1)을 실행시키기 위해 다시 이 함수를 호출한다.
		
		return x;	//int x가 1이라면 그대로 1을 리턴, int x가 1이 아니라면 위의 재귀식에서 실행된 값을 리턴한다. 최종적으로 Factorial의 정답을 리턴하게 된다.
		
	}//factorial
	
	

	
	public static void main(String[] args) {
	
		System.out.print(Factorial(n));  //출력은 main 함수에서 실행한다 	//최초로 Factorial 함수를 부르는 곳, n은 키보드 입력값이다
		
	} //main

} //class
