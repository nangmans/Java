package Algorithm;
import java.util.Scanner;

interface Queue {
	
	boolean isEmpty();
	String enQueue(String data);
	String deQueue();
	}



class queueNode {
	
	String data;
	queueNode link;
	
}


class LinkedQueues implements Queue{
	
	queueNode Front;
	queueNode Rear;
	
	
	public boolean isEmpty() {
		
		return (Front == null);
		
	}
	
	public String enQueue(String data) {
		
	
		queueNode newQueue = new queueNode();
		
		if(isEmpty()) {
			Front = newQueue;
			Rear = newQueue;
			newQueue.data = data;
			return newQueue.data;
		}
		else {
		
		Rear.link = newQueue;
		Rear = newQueue;
		newQueue.data =data;
		{
		
		return newQueue.data;
		}
	}
	
}
	
	public String deQueue() {
		
		
	if(isEmpty()) {
		
		return null;
	}
	else {
	
	String item = Front.data;
	Front = Front.link;
	if(Front == null) Rear=null;
	
	return item;
	}
		}
	
	public void printQueue() {
		
		queueNode temp = Front;
		
		if(isEmpty()) {
			System.out.println("큐에 아이템이 없습니다");
		}
		else {
			while(temp !=null) {
				System.out.print(temp.data);
				if(temp.link!=null) {
					System.out.print(",");
				}
					temp=temp.link;
				
			}
		}
		System.out.println(" ");
	}
}



class LinkedQueue {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		LinkedQueues L = new LinkedQueues();
		
		while(sc.hasNextLine()) {
			
			String Input = sc.nextLine();
			
			
			
			if(Input.equals("Dequeue")) {
				String item= L.deQueue();
				
				if(item == null) {
					System.out.println("아이템이 없습니다");
				}
				else {
					System.out.println(item+"이 제거되었습니다");
				}
			}
				
				else if(Input.equals("Print")) {
					L.printQueue();
				}
			
			
				else {
					
					 String item = L.enQueue(Input);
					 
					 System.out.println(item+"이 추가되었습니다");
						
					}
		}
		

	} //main 

} //LinkedQueue
