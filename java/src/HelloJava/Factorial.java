package HelloJava;
import java.util.Scanner;
public class Factorial {

	static Scanner sc = new Scanner(System.in);
	
	static int n = sc.nextInt();
	
	 static int Factorial (int x) { //print �޼ҵ忡�� �θ� Factorial �޼ҵ尡 ����ȴ�. Factorial(n)���� n�� int x�� �μ��̴�. �� �޼ҵ尡 main �޼ҵ忡���� ������ �ϱ� ������ static�� �ٿ� �������ش�.
		
	
		
		if(x!=1) //Factorial(1)�� �ƴ϶��, �� ������ ������ ���ȣ���� ������ ����ȴ�. -1,-2,-3...
		
			x= x * Factorial(x-1); //x�� Factorial(x-1)�� ���Ѵ�. Factorial(x-1)�� �����Ű�� ���� �ٽ� �� �Լ��� ȣ���Ѵ�.
		
		return x;	//int x�� 1�̶�� �״�� 1�� ����, int x�� 1�� �ƴ϶�� ���� ��ͽĿ��� ����� ���� �����Ѵ�. ���������� Factorial�� ������ �����ϰ� �ȴ�.
		
	}//factorial
	
	

	
	public static void main(String[] args) {
	
		System.out.print(Factorial(n));  //����� main �Լ����� �����Ѵ� 	//���ʷ� Factorial �Լ��� �θ��� ��, n�� Ű���� �Է°��̴�
		
	} //main

} //class
