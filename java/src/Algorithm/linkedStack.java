package Algorithm;
import java.util.Scanner;

interface Stack{ //interface Stack�� ��ũ�� ���� ���� ��̽��ÿ����� ���� �� �ִ�. �� ������ ���� �⺻���� ��ɵ��� ��Ƴ��� ���̴�. �̰��� �ٸ� ���ÿ����� ���� �� �ֵ��� �θ� Ŭ������ ��Ģ�� ���س��� ���̶�� �� �� �ִ�.
	boolean isEmpty();
	void push(String item);
	String pop();
	void delete();
	String peek();
	
} //Stack

class stackNode {
	String data;
	stackNode link;
	
}

class LinkedStacks implements Stack{ //implements �� ���ؼ� interface���� ������ ���� ��Ģ���� ��ü���� ����� ������ ���´�.
	
	private stackNode top; //�� ������ ��带 �������ִ� �Լ�
	
	public boolean isEmpty() {
		return (top ==null);
	}
	
	public void push(String item) {
		stackNode newNode = new stackNode();
		
		newNode.data = item;
		newNode.link= top;
		top = newNode;
		System.out.println(item+" �������� ���ԵǾ����ϴ�");
		
	}
	
	public String pop() { //String ���� ��ȯ�ϱ� ������ void�� �ƴ� String �ڷ����̴�.
		if(isEmpty()) {
			System.out.println("������ ����ֽ��ϴ�");
			return null;
		}
		else {
			String item = top.data; //top.data�� �ٷ� �������� �ʰ� item�� ���� ��ȯ�ϴ� ����: �Լ��� ������ �ϴ� ���� ��������, ������ ��带 ������ �� top.data�� �����ϸ� �� ��带 ��ȯ�ϹǷ� �̸� item ������ ��Ƴ��� �� ��带 �����ϰ� item�� �����ϴ� ������� ����.
			top = top.link; //stack �ڷᱸ���� ����� ��ũ�� �ڽ� �Ʒ��� �ڷḦ �����ϵ��� �Ǿ��ֱ� ������, ����� ������ top�� top�� ��ũ ���� ������ �����.
			System.out.println(item+"�� ���ŵǾ����ϴ�");
			return item;
		}
	}
	
	public void delete() { //�ƹ��� ���� ��ȯ���� �ʱ� ������ void�� ����.
		if(isEmpty()) {
			System.out.println("������ ����ֽ��ϴ�");
		}
		else {
			top = top.link;
		}
	}
	
	public String peek() {
		if(isEmpty()) {
			System.out.println("������ ����ֽ��ϴ�");
			return null;
		}
		else 
			return top.data;
				
	}
	
	public void printStack() {
		if(isEmpty()) {
			System.out.println("������ ����ֽ��ϴ�");	
		}
		else {
			
			stackNode temp = top;
			
			while (temp != null) {
				
				System.out.print(temp.data);
				System.out.print('\n');
				
				temp = temp.link;												
			}
		}
		
	}
	
} //LinkedStack




public class linkedStack {

	public static void main(String[] args) {
		
		LinkedStacks L = new LinkedStacks(); //�� ���� L�� ����� ������ while�� �ȿ� �ξ while���� �������� ���� LinkedStacks ��ü�� �����Ǵ� ������ �޾���
		
		Scanner sc = new Scanner(System.in);
		
		
	    while(sc.hasNextLine()) {
	    	String Input = sc.nextLine();
			
		
			
			if(Input.equals("Delete")) {
				L.pop();
			
			}
			
			else if(Input.equals("Print")) {
				L.printStack();
			}
			
			else
			
			L.push(Input);
			System.out.println(" ");
			L.printStack();
			
	    	
	    }
		
		
		
		
		
		
		
		
		
		
		
		

	} //main

} //linkedStack
