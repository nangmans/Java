package ProblemSolving;
import java.util.Scanner;

public class BeeHive {

	public static int Bee(int N) {
		
		
		
		int P;
		if(N==1) {	

			return 1;
		}
			
			else {
		
					for(int i = 1 ; i <= 1000000000 ; i++ ) {
				
						P = 3*i*(i-1)+2;
						if(N<P) {
							return i;
						
							}
					
					}
		}
		return 0;
	}
	
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int P = sc.nextInt();
		
		System.out.println(Bee(P));
		
		
	}//main
	
} //class
