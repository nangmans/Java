package HelloJava;
import java.util.Scanner;
public class Boggle {
	
			
		static final int [] dx = new int[] {-1,-1,-1,0,1,1,1,0}; //�ð�������� 7�ú��� ���� -> x��ǥ
	
	static final int [] dy = new int[] {-1,0,1,1,1,0,-1,-1}; //�ð�������� 7�ú��� ���� -> y��ǥ
	
	public static char [][] Board = new char [5][5];	 // boggle �������� ũ�� 5*5

	public static Scanner sc = new Scanner(System.in);
	
	public static String Word = sc.nextLine(); //ã�� �ܾ�                  //nextLine�� ���Ͱ� ���� �������� �Է��� ����
    
	
	static int FindX = sc.nextInt(); //������ġ x��ǥ            //nextInt�� ����,���� �������� �Է��� ����
	static int FindY = sc.nextInt(); //������ġ y��ǥ
	
	
	public static void main(String [] args) { //main�Լ� ���� -> ���⼭ ������ ���
		
		for(int i =0 ; i<5 ; i++) {  // �Է¹޴� 5*5 ������          // next�� ���� �������� �Է��� ����
			for(int j =0; j<5 ; j++) {
				Board[i][j] = sc.next().charAt(0); //�Ʒ��� charAt�� ����ϱ� ���� string������ board�� �Է��� charAt(0)�� ����� �־���
				
			
			}
		}		
		
		System.out.println(HasWord(FindX,FindY,Word)); //���� ���
		
	}//main
	
	
	public static boolean HasWord (int x,int y,String Word) { //HasWord�Լ� ���� -> ����Լ��� true or false �� ���
		
		if(x>5 || x<0 || y>5 || y<0) return false;
		
		if(Board[x][y]!=Word.charAt(0)) return false; //substring �Լ��� substring(int a,int b)�� ���� a�̻�, b�̸��� ���ڿ��� ��ȯ�Ѵ�
													  // charAt()�Լ��� char���� ���� �ִ� but 
		
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