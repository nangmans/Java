package Algorithm; //hashtable�� ����� ����ܾ����� ����

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.LinkedList;

class HashTable { 
	
	static String[] word = new String [1200];
	
	static int [] table = new int [1200];
		
	public String[] Eword(){ //���ܾ�� ���� ȥ��Ǿ��ִ� txt���Ͽ��� ���ܾ� �κи� ������ �迭�� ��� Ŭ���� 
			
	try {
				
		File file = new File("C:\\Users\\Admin\\Downloads\\english1200.txt"); //java.io.File�� import�� �� file ������ �ش� ����� ������ �����ϴ� file ��ü�� �����Ѵ�.
		
		Scanner scan = new Scanner(file); //Scanner�� ����� file ����  ���ڸ� �д´�.

			int i =0;				//txt���Ͽ��� ���ܾ �迭�� ��� ��.
			String temp;
			while(scan.hasNextLine()) {
			temp = scan.nextLine();
			word[i] = temp.substring(0, temp.indexOf("\t")); //substring�� ����� �ش� ���� ���ϴ� �κ�(ó������ ���� �ִ� ������)�� �迭�� ��´�.
			i++;			
			}
	}
		catch(FileNotFoundException e){
					System.out.println(e);
		}	
		return word;	
	}
	
	public static int getHash(String word) { //�ؽ��Լ��� �����ϴ� �޼ҵ�, �ؽ��Լ��� ������ �� ���ĺ��� ASCII�ڵ带 ���� ���� ��ü �迭�� ���� ������ ���������.
		
		int hash=0;
		int length = table.length;
		for(int i=0; i<word.length();i++) {
		hash += (int)word.charAt(i);		
		}
		
		return hash%length;		
	}
	
	public void makeHashTable() { //�ؽ� ���̺��� ����� �޼ҵ�, �ؽ��Լ��� ������ ���� �迭 ��ġ�� �� ���� ������ �������.
		
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
	
	public void Print() { //������ word[]�迭�� ������ �ؽ������� �̷���� index���� �ƴϱ� ������, index������ �̷���� arr�迭�� ���� ����Ѵ�. 
		for(int i=0; i<1200 ; i++) {
			if(arr[i]!=null) { //null���� �ƴ� �ÿ��� ����� �����Ѵ�. ������ �� nullpointerException�� �Ͼ��.
				int j=0;
				for(HashNode node : arr[i]) {
					for(int k=1; k<=j ; k++) { //for���� ���ٴ� ���� �ش� index�� ü�̴׵Ǿ��ִ� ��尡 �ִٴ� ��, �̸� ǥ���ϱ� ���� for���� �������� ������ ����ϰ� �Ѵ�.
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
			System.out.println(index+"�� °�� "+key+"(��)�� �ֽ��ϴ�.");
			return;
		}		
			}
		System.out.println("���̺� �ش� ���� �����ϴ�.");
	}
}



 
	


	
	

public class HashTableEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashTable H = new HashTable();

		HashNode N = new HashNode();
		
		String [] word = new String[1200] ; //Eword()�� for�� �ȿ� ������ �ݺ����� Eword ���� �迭������ �ݺ����� ���� ��ȿ����, word�迭�� �̸� Eword�� �迭�� ��Ƽ� ����.
		
		word = H.Eword();
		
		for(int i=0;i<1200;i++) {
		N.put(word[i], " ");		
		}
		
		N.Print(); //ó������ ���� �ٸ� index���ӿ��� ü�̴׵� ��ó�� ��µǾ� �ǹ��� ǰ������, ����� word�� �迭����(������ �ܾ� ���� ��)�� �Ǿ������� ���ݰ� ������ �ؽ������� ���ĵ� arr�� �迭������ �ٲ��.
		
		N.Search("cut across"); 
		N.Search("go through");
		
	}

}
