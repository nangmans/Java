//package Algorithm;
//import java.util.Scanner;
//class listNode{
//	
//	String data; 
//	listNode link;
//	
//	public listNode(String data, listNode link) { //listNode의 매개변수를 데이터와 링크값이 있는지,없는지의 3가지 경우로 나눈 이유는
//												 //같은 이름의 함수를 여러개 정하고 다양한 매개변수 경우의 수에 응답할 수 있게 하는 것으로 오버로딩(OverLoading)이라고 한다.
//		this.data = data;
//		this.link = link;
//	}
//	
//	public listNode(String data) {
//		this.data = data;
//		this.link = null;
//	}
//	
//	public listNode(listNode link) {
//		this.data = null;
//		this.link = link;
//	}
//	
//	public String getData() {
//		return this.data;
//		
//	}
//	
//}//ListNode
//
//	class linkedList {
//		
//		private listNode head;
//		
//		public linkedList() {
//			head= null;
//		}
//		
//		public void insertLastNode(String data) {
//			
//			listNode newNode = new listNode(data);
//			
//				
//			if (head ==null) {
//				this.head = newNode;
//			}
//			else {
//			listNode temp = head;
//			while(temp.link != null) { //temp가 아닌 temp값의 링크를 비교하는 이유는 temp값이 null인 경우를 찾으면 그 전 노드의 링크를 찾을 방법이 없어서 이기 때문이다
//			
//				temp = temp.link;
//				}
//			temp.link = newNode;
//			}
//		}
//		
//		public void insertMiddleNode(listNode pre,String data) {
//			
//			listNode newNode = new listNode(data);
//			
//			if (head ==null) {
//				this.head = newNode;
//			}
//			else {
//				newNode.link = pre.link;
//				
//				pre.link = newNode;
//				
//			}
//		}
//		
//		public void deleteLastNode() {
//			
//			listNode pre , temp;
//			
//			
//			if(head == null) return;
//			
//			if(head.link ==null) head = null;
//			
//			else {
//				pre = head;
//				temp = head.link;
//			while(temp.link != null) {
//				pre= temp;
//				temp = temp.link;
//				}
//			pre.link =null; //전 노드의 링크를 null로 만들어서 다음 노드를 지정하지 않는 방식으로 노드를 삭제한다.
//			}
//			
//		}
//		
//		public listNode searchNode(String data) {
//			
//			listNode temp = this.head; //listNode라는 클래스의 속성값을 부르기 위해 (즉 자기 자신의 속성을 부르기 위해)head 앞에 this가 붙는다
//			
//			while(temp != null) {
//				
//				if(temp.getData()==data) { //getdata메소드를 쓰는 이유는 순수한 string값을 비교해야 하기 떄문이다. 
//					break;
//				}
//				else
//					temp=temp.link;
//				}
//		
//			return temp;
//			
//		}	
//		
//		public void printList() {
//			System.out.print("(");
//			listNode temp = head;
//			
//			if(temp == null) 
//				System.out.print("저장된 값이 없습니다");
//			
//			else {
//			
//			while(temp != null) {
//				System.out.print(temp.getData()); //string값을 출력해야 하므로 getData 메소드를 사용한다.
//				
//				if(temp.link != null)
//					System.out.print(",");
//				
//				temp = temp.link;
//			}	
//				
//			}
//			System.out.print(")");
//			System.out.println(" ");
//		
//		}
//			
//		
//		
//			
//		
//	}//linkedList
//
//public class SinglyLinkedLinearList_Self {
//
//	public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
//		
//		linkedList L = new linkedList() ;
//		
//		
//		
//		
//		while(sc.hasNextLine()) {
//			
//			String Input = sc.nextLine();
//			
//			if(Input.equals("Exit")) {
//				break;
//			}
//			if (Input.equals("Delete")) {
//				System.out.println(" ");
//				System.out.println("값이 삭제되었습니다.");
//				L.deleteLastNode();
//				L.printList();
//				
//				
//				
//			}
//			else
//			 {
//			System.out.println(" ");
//			System.out.println("넣을 값을 입력하세요");
//			L.insertLastNode(Input);
//			L.printList();
//			}	
//			
//		}
//		
//		sc.close();
//		
//		
//		System.out.println("수 노드 뒤에 금 노드 삽입하기");
//		
//		listNode pre = L.searchNode("수");
//		
//		if(pre == null) {
//			System.out.println("찾는 데이터가 없습니다!");
//		}
//			else {
//				L.insertMiddleNode(pre, "금");
//				
//				L.printList();
//				
//			}
//	
//		// TODO Auto-generated method stub
//
//	} //main
//
//}//SinglyLinkedLinearList_Self
