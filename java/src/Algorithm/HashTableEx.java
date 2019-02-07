package Algorithm; //hashtable을 사용한 영어단어장을 구현

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.LinkedList;

class HashTable { 
	
	static String[] word = new String [1200];
	
	static int [] table = new int [1200];
		
	public String[] Eword(){ //영단어와 뜻이 혼재되어있는 txt파일에서 영단어 부분만 추출해 배열에 담는 클래스 
			
	try {
				
		File file = new File("C:\\Users\\Admin\\Downloads\\english1200.txt"); //java.io.File을 import한 뒤 file 형식의 해당 경로의 파일을 참조하는 file 객체를 생성한다.
		
		Scanner scan = new Scanner(file); //Scanner을 사용해 file 내의  문자를 읽는다.

			int i =0;				//txt파일에서 영단어만 배열에 담는 단.
			String temp;
			while(scan.hasNextLine()) {
			temp = scan.nextLine();
			word[i] = temp.substring(0, temp.indexOf("\t")); //substring을 사용해 해당 행의 원하는 부분(처음부터 탭이 있는 곳까지)만 배열에 담는다.
			i++;			
			}
	}
		catch(FileNotFoundException e){
					System.out.println(e);
		}	
		return word;	
	}
	
	public static int getHash(String word) { //해쉬함수를 정의하는 메소드, 해쉬함수는 문자의 각 알파벳의 ASCII코드를 더한 값에 전체 배열로 나눈 값으로 만들어졌다.
		
		int hash=0;
		int length = table.length;
		for(int i=0; i<word.length();i++) {
		hash += (int)word.charAt(i);		
		}
		
		return hash%length;		
	}
	
	public void makeHashTable() { //해쉬 테이블을 만드는 메소드, 해쉬함수로 추출한 값의 배열 위치에 그 값이 들어가도록 만들었다.
		
		for(int i=0 ; i<table.length ; i++) {
			table[getHash(Eword()[i])]=getHash(Eword()[i]);
			
		}	
	}
	
	
}

class HashNode{
	
	String key;
	String value;
	
	LinkedList<HashNode>[] arr= new LinkedList [1200];
	
	public String getKey(HashNode Node) {
		return key;
		
	}
	
	public void put(String key, String value) {
		
		int index = HashTable.getHash(key);
		
		if(arr[index]==null) {
			
			arr[index]= new LinkedList<HashNode>();
			
			HashNode node = new HashNode();
			
			node.key = key;
			node.value = value;
			
			arr[index].add(node);
			System.out.println(key);
			
		}
			else {
				for(HashNode node : arr[index]) {
					if(node.key.equals(key)) {
						node.value=value;
						return;
					}				
				}
				System.out.println(" "+key);
				HashNode node = new HashNode();
				node.key=key;
				node.value=value;
				arr[index].add(node);
				
				
		}
	}
	
	public void Print() { //기존의 word[]배열은 순서가 해쉬값으로 이루어진 index순이 아니기 때문에, index순으로 이루어진 arr배열을 통해 출력한다. 
		for(int i=0; i<1200 ; i++) {
			if(arr[i]!=null) { //null값이 아닐 시에만 출력을 시행한다. 생략할 시 nullpointerException이 일어난다.
				int j=0;
				for(HashNode node : arr[i]) {
					for(int k=1; k<=j ; k++) { //for문이 돈다는 것은 해당 index에 체이닝되어있는 노드가 있다는 뜻, 이를 표현하기 위해 for문이 돌때마다 공백을 출력하게 한다.
						System.out.print(" ");
					}
				System.out.println(node.key);
				j++;
				}	
			}
		}
	}
	
	public void Search(String key) {
		
		int index = HashTable.getHash(key);
		
		for(HashNode node : arr[index]) {
			if(node.key.equals(key)) {
			System.out.println(index+"번 째에 "+key+"(이)가 있습니다.");
			return;
		}		
			}
		System.out.println("테이블에 해당 값이 없습니다.");
	}
}



 
	


	
	

public class HashTableEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashTable H = new HashTable();

		HashNode N = new HashNode();
		
		String [] word = new String[1200] ; //Eword()를 for문 안에 넣으면 반복마다 Eword 안의 배열생성과 반복문을 돌려 비효율적, word배열에 미리 Eword의 배열을 담아서 쓴다.
		
		word = H.Eword();
		
		for(int i=0;i<1200;i++) {
		N.put(word[i], " ");		
		}
		
		N.Print(); //처음에는 서로 다른 index값임에도 체이닝된 것처럼 출력되어 의문을 품었지만, 출력이 word의 배열순서(파일의 단어 순서 순)로 되어있음을 깨닫고 순서를 해쉬값으로 정렬된 arr의 배열순서로 바꿨다.
		
		N.Search("cut across"); 
		N.Search("go through");
		
	}

}
