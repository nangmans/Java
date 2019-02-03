package Algorithm;


class fibonacci {
	
	public int fib(int n) { //�Ǻ���ġ ������ ��������� ������ �Լ�, ���̳��� ���α׷����� ������� �ʾ� ��ȿ������ ����� �Ѵ�.
		
		if(n==1 || n==2) {
			return 1;
		}
		else {
			return fib(n-1)+fib(n-2);			
		}
	}
	
	public int Dfib(int n) { //���̳��� ���α׷����� �̿��� �Ǻ���ġ ����, �߰����� ���(�޸������̼�)�� �ߺ��Ǵ� ����� �����ߴ�.
		
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
