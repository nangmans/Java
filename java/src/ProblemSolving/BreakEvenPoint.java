package ProblemSolving;
import java.util.Scanner;

public class BreakEvenPoint {
	
	public static int GetBEP (int F,int V,int P) {
		
		if(P>V) {
			
		
		int BEP = F/(P-V)+1;
	
		return BEP;
		}
		else
		
			return -1;
	}

	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int F = sc.nextInt();
		int V = sc.nextInt();
		int P = sc.nextInt();
		
		System.out.println(GetBEP(F,V,P));
	}
} //class

