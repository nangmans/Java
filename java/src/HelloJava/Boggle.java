package HelloJava;
import java.util.Scanner;
public class Boggle {
	
			
		static final int [] dx = new int[] {-1,-1,-1,0,1,1,1,0}; //시계방향으로 7시부터 돌음 -> x좌표
	
	static final int [] dy = new int[] {-1,0,1,1,1,0,-1,-1}; //시계방향으로 7시부터 돌음 -> y좌표
	
	public static char [][] Board = new char [5][5];	 // boggle 게임판의 크기 5*5

	public static Scanner sc = new Scanner(System.in);
	
	public static String Word = sc.nextLine(); //찾을 단어                  //nextLine은 엔터가 들어가기 전까지의 입력을 받음
    
	
	static int FindX = sc.nextInt(); //시작위치 x좌표            //nextInt는 띄어쓰기,엔터 전까지의 입력을 받음
	static int FindY = sc.nextInt(); //시작위치 y좌표
	
	
	public static void main(String [] args) { //main함수 시작 -> 여기서 최종값 출력
		
		for(int i =0 ; i<5 ; i++) {  // 입력받는 5*5 게임판          // next는 띄어쓰기 전까지의 입력을 받음
			for(int j =0; j<5 ; j++) {
				Board[i][j] = sc.next().charAt(0); //아래에 charAt을 사용하기 위해 string형식의 board에 입력을 charAt(0)을 사용해 넣었다
				
			
			}
		}		
		
		System.out.println(HasWord(FindX,FindY,Word)); //최종 출력
		
	}//main
	
	
	public static boolean HasWord (int x,int y,String Word) { //HasWord함수 시작 -> 재귀함수로 true or false 값 출력
		
		if(x>5 || x<0 || y>5 || y<0) return false;
		
		if(Board[x][y]!=Word.charAt(0)) return false; //substring 함수는 substring(int a,int b)로 쓰며 a이상, b미만의 문자열을 반환한다
													  // charAt()함수는 char에만 쓸수 있다 but 
		
		if(Word.length()==1) return true;
		
		for(int k =0 ; k<8 ; ++k) {
			int NextX = x+dx[k];
			int NextY = y+dy[k];
			if(HasWord(NextX,NextY,Word.substring(1))) {
				return true;
			}
			
		}
		
		return false;
		
		
	}//HasWord
	
	
	
}//class