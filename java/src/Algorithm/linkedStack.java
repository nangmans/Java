package Algorithm;
import java.util.Scanner;

interface Stack{ //interface Stack은 링크드 스택 말고도 어레이스택에서도 쓰일 수 있다. 즉 스택의 가장 기본적인 기능들을 모아놓은 것이다. 이것은 다른 스택에서도 쓰일 수 있도록 부모 클래스가 규칙을 정해놓는 것이라고 할 수 있다.
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

class LinkedStacks implements Stack{ //implements 를 통해서 interface에서 정의해 놓은 규칙들의 구체적인 기능을 정의해 놓는다.
	
	private stackNode top; //맨 마지막 노드를 지정해주는 함수
	
	public boolean isEmpty() {
		return (top ==null);
	}
	
	public void push(String item) {
		stackNode newNode = new stackNode();
		
		newNode.data = item;
		newNode.link= top;
		top = newNode;
		System.out.println(item+" 아이템이 삽입되었습니다");
		
	}
	
	public String pop() { //String 값을 반환하기 때문에 void가 아닌 String 자료형이다.
		if(isEmpty()) {
			System.out.println("스택이 비어있습니다");
			return null;
		}
		else {
			String item = top.data; //top.data를 바로 리턴하지 않고 item을 통해 반환하는 이유: 함수는 리턴을 하는 순간 끝나버림, 하지만 노드를 삭제한 후 top.data를 리턴하면 전 노드를 반환하므로 미리 item 변수에 담아놓은 후 노드를 삭제하고 item을 리턴하는 방식으로 쓴다.
			top = top.link; //stack 자료구조는 노드의 링크가 자신 아래의 자료를 지정하도록 되어있기 떄문에, 노드의 삭제는 top이 top의 링크 값을 가지게 만든다.
			System.out.println(item+"이 제거되었습니다");
			return item;
		}
	}
	
	public void delete() { //아무런 값도 반환하지 않기 떄문에 void를 쓴다.
		if(isEmpty()) {
			System.out.println("스택이 비어있습니다");
		}
		else {
			top = top.link;
		}
	}
	
	public String peek() {
		if(isEmpty()) {
			System.out.println("스택이 비어있습니다");
			return null;
		}
		else 
			return top.data;
				
	}
	
	public void printStack() {
		if(isEmpty()) {
			System.out.println("스택이 비어있습니다");	
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
		
		LinkedStacks L = new LinkedStacks(); //새 스택 L을 만드는 선언을 while문 안에 두어서 while문이 돌떄마다 새로 LinkedStacks 개체가 생성되는 오류를 겪었음
		
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
