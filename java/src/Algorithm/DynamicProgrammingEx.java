package Algorithm;

class MatrixPath { //nxn 행렬의 가장 왼쪽 위에서 가장 오른쪽 아래까지 이르는 경로 중 가장 많은 점수를 얻는 경로를 찾는 문제, 동적 프로그래밍을 이용해 중간값을 저장해가며 문제를 접근한다.
	
	
	
	public int Ex(int n) {
		
		int [][] board = new int [n][n]; // nxn 크기의 랜덤 게임판을 만드는 단
		
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
		} 								//게임판 만드는 단의 끝
		
		
		int [][] c = new int [n][n]; //board와는 다른 새 2차원 배열을 생성한다. 이 배열에 경로까지 이르는 최대값을 저장한다.
		
		
		
		for(int i =0; i<n;i++) { //board의 게임판에서 가장 숫자들의 합이 큰 경로를 탐색하는 단, 목적지 (n,n)에 이르는 최적값은 (n-1,n)과 (n,n-1)에 이르는 최적값 중 큰 값이라는 데 착안했다.
			for(int j = 0; j<n;j++) {
				if(i==0 && j==0) {
					c[i][j]=board[i][j];				//게임판의 시작부분 (0,0)에서는 게임판의 (0,0)을 그대로 담는다.
				}
					else if(i==0) {
						c[i][j]=board[i][j]+c[i][j-1];						
					}
					else if(j==0) {
						c[i][j]=board[i][j]+c[i-1][j];
											}				
					else {
				c[i][j]= board[i][j]+Math.max(c[i-1][j], c[i][j-1]);		//각 배열의 값에는 board의 배열값과 그 전 배열 값들의 max값을 더해 현 경로까지 이르는 최대값을 저장한다.	
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
