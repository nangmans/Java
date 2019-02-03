package Algorithm;

class MatrixPath { //nxn ����� ���� ���� ������ ���� ������ �Ʒ����� �̸��� ��� �� ���� ���� ������ ��� ��θ� ã�� ����, ���� ���α׷����� �̿��� �߰����� �����ذ��� ������ �����Ѵ�.
	
	
	
	public int Ex(int n) {
		
		int [][] board = new int [n][n]; // nxn ũ���� ���� �������� ����� ��
		
		for(int i =0; i<board.length;i++) {               
			for(int j = 0; j<board[i].length;j++) { 
				board[i][j]=(int) (Math.random()*99+1);
			}
		}
		
		for(int i =0; i<board.length;i++) {
			for(int j = 0; j<board[i].length;j++) {
				if(board[i][j]<10) {
					System.out.print(" "+board[i][j]+" ");
				}							
				else {
				System.out.print(board[i][j]+" ");
				}
			}
			System.out.println(" ");
		} 								//������ ����� ���� ��
		
		
		int [][] c = new int [n][n]; //board�ʹ� �ٸ� �� 2���� �迭�� �����Ѵ�. �� �迭�� ��α��� �̸��� �ִ밪�� �����Ѵ�.
		
		
		
		for(int i =0; i<n;i++) { //board�� �����ǿ��� ���� ���ڵ��� ���� ū ��θ� Ž���ϴ� ��, ������ (n,n)�� �̸��� �������� (n-1,n)�� (n,n-1)�� �̸��� ������ �� ū ���̶�� �� �����ߴ�.
			for(int j = 0; j<n;j++) {
				if(i==0 && j==0) {
					c[i][j]=board[i][j];				//�������� ���ۺκ� (0,0)������ �������� (0,0)�� �״�� ��´�.
				}
					else if(i==0) {
						c[i][j]=board[i][j]+c[i][j-1];						
					}
					else if(j==0) {
						c[i][j]=board[i][j]+c[i-1][j];
											}				
					else {
				c[i][j]= board[i][j]+Math.max(c[i-1][j], c[i][j-1]);		//�� �迭�� ������ board�� �迭���� �� �� �迭 ������ max���� ���� �� ��α��� �̸��� �ִ밪�� �����Ѵ�.	
					}
							
			}	
		}
		return c[n-1][n-1];
	}
		
}


public class DynamicProgrammingEx {

	public static void main(String[] args) {
		
		MatrixPath a = new MatrixPath();
		
		System.out.println(a.Ex(3));
		
		
		
		
		
	}//main

}//DynamicProgrammingEx
