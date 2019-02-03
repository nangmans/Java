package Algorithm;


class fibonacci {
	
	public int fib(int n) { //피보나치 수열을 재귀적으로 구현한 함수, 다이나믹 프로그래밍이 적용되지 않아 비효율적인 계산을 한다.
		
		if(n==1 || n==2) {
			return 1;
		}
		else {
			return fib(n-1)+fib(n-2);			
		}
	}
	
	public int Dfib(int n) { //다이나믹 프로그래밍을 이용한 피보나치 수열, 중간값을 기억(메모이제이션)해 중복되는 계산을 제거했다.
		
		int[] f = new int [n+1];
		
		f[1]=1;
		f[2]=1;
		
		
		for(int i = 3; i<=n;i++) 
			f[i]=f[i-1]+f[i-2];
			
		
		return f[n];
	}
	
	
}
	



public class DynamicProgramming {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		fibonacci f = new fibonacci();
		
		long Sd = System.nanoTime();
		System.out.println(f.Dfib(30));
		long Ed = System.nanoTime();
		System.out.println("Dynamic fibonacci time "+(Ed-Sd)/1000.00000+"ns");
		
				
		long Sf = System.nanoTime();	
		System.out.println(f.fib(30));
		long Ef = System.nanoTime();
		System.out.println("fibonacci time "+(Ef-Sf)/1000.00000+"ns");

		
	}

}
