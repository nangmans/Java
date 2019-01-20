package Algorithm;
import java.util.Scanner;

class DQnode {
	String data;
	DQnode Rlink;
	DQnode Llink;	
} //DQnode


class DQueue {
	
	DQnode front ;
	DQnode rear;
	
	public void Dqueue() {
		front = null;
		rear = null;
	}
	
	public boolean isEmpty() {
		return(front==null);
	}
	
	public void insertFront(String item) {
		DQnode newNode = new DQnode();
		newNode.data = item;
		
		if(isEmpty()) {
			front = newNode;
			rear = newNode;
			newNode.Rlink = null;
			newNode.Llink = null;
			}
		else {
			newNode.Rlink = front;
			newNode.Llink = null;
			front.Llink = newNode;
			front = newNode;
		}
		System.out.println("아이템 "+item+"가 추가되었습니다.");
	}
	
	public void insertRear(String item) {
		DQnode newNode = new DQnode();
		newNode.data = item;
		
		if(isEmpty()) {
			front = newNode;
			rear = newNode;
			newNode.Rlink = null;
			newNode.Llink = null;
			}
		else {
			newNode.Rlink = null;
			newNode.Llink = rear;
			rear.Rlink = newNode;
			rear = newNode;
		}
		System.out.println("아이템 "+item+"가 추가되었습니다.");
	}
	
	public String deleteRear() {
		
		if(isEmpty()) {
			System.out.println("DQ가 비어있습니다.");		
			return null;
		}
		else {
			String item = rear.data;
			if(front.Rlink == null) {
				front = null;
				rear = null;
			}
			else {
				rear = rear.Llink;
				rear.Rlink = null;
			}
			return item;
		}
	}
	
	public String deleteFront() {
		
		if(isEmpty()) {
			System.out.println("DQ가 비어있습니다.");		
			return null;
		}
		else {
			String item = front.data;
			if(front.Rlink == null) {
				front = null;
				rear = null;
			}
			else {
				front = front.Rlink;
				front.Llink = null;
			}
			return item;
		}
	}
	
	
	
	public void printDQ() {
		if(isEmpty()) {
			System.out.println("DQ가 비어있습니다.");
		}
		else {
			DQnode temp = front;
			System.out.print("(");
			while(temp!= null) {
				System.out.print(temp.data);
				temp = temp.Rlink;
				if(temp != null) {
					System.out.print(",");
				}
			}
			System.out.print(")");
		}
	}
} //Dqueue

public class DoubleLinkedQueue {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DQueue DQ = new DQueue();
		
		while(sc.hasNextLine()) {
			
			String Input = sc.nextLine();
			
			switch(Input) {
					
			case "DeleteFront" : {
				System.out.println(" ");
				System.out.println("값이 삭제되었습니다.");
				DQ.deleteFront();
				DQ.printDQ();
				System.out.println(" ");
				break;
			}
			case "DeleteRear" : {
				System.out.println(" ");
				System.out.println("값이 삭제되었습니다.");
				DQ.deleteRear();
				DQ.printDQ();
				System.out.println(" ");
				break;
			}
			case "InsertFront" : {
				String item = sc.nextLine();
				DQ.insertFront(item);
				DQ.printDQ();
				System.out.println(" ");
				break;
			}
			case "InsertRear" : {
				String item = sc.nextLine();
				DQ.insertRear(item);
				DQ.printDQ();
				System.out.println(" ");
				break;
			}
			default :{
				System.out.println("명령어를 입력하세요.");
			}
					
			}	
			
		
		
		

	} //main

} 
}// DoubleLinkedQueue
