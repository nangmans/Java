//package Algorithm;
//
//import java.util.Scanner;
//
//class listNode{
//	
//	String data;
//	listNode Rlink;
//	listNode Llink;
//
//	
//	listNode(listNode Rlink,String data, listNode Llink){
//		this.data = data;
//		this.Rlink = Rlink;
//		this.Llink = Llink;
//		}
//	
//	listNode(String data){
//		this.data =data;
//		this.Llink = null;
//		this.Rlink = null;
//	}
//	
//	listNode(listNode Llink,listNode Rlink){
//		this.Llink=Llink;
//		this.Rlink=Rlink;
//		this.data =null;
//	}
//	
//	public String getData() {
//		return this.data; //클래스 listNode의 속성값 data를 지정하기 위해 this를 붙여준다.
//	}
//	
//} //listNode
//
//class linkedList {
//	
//	private listNode head;
//	
//	public linkedList() {
//		head= null;
//	}
//	
//	public void insertLastNode(String data) {
//		
//		listNode newNode = new listNode(data);
//		
//			
//		if (head ==null) {
//			head = newNode;
//		}
//		else {
//		listNode temp = head;
//		while(temp.Rlink != null) { 
//		
//			temp = temp.Rlink;
//			}
//		temp.Rlink = newNode;
//		
//		newNode.Llink = temp; //이중연결리스트이므로 새 노드의 왼쪽 링크가 마지막 노드를 가르키게 만든다.
//		}
//	}
//	
//	public void insertMiddleNode(listNode pre,String data) {
//		
//		listNode newNode = new listNode(data);
//		
//		if (head ==null) {
//			this.head = newNode;
//		}
//		else {
//			newNode.Rlink = pre.Rlink; //새 노드의 오른쪽 링크는 이전 노드의 오른쪽 링크를 그대로 받는다.
//			
//			pre.Rlink = newNode; //이전 노드의 오른쪽 링크에 새 노드의 값을 지정한다.
//			
//			newNode.Llink = pre; //새 노드의 왼쪽 링크에 이전 노드의 값을 지정한다.
//			
//			newNode.Rlink.Llink = newNode ; //이전 노드의 오른쪽 링크의 왼쪽 링크, 즉 새 노드의 오른쪽 노드의 왼쪽 링크를 새 노드를 지정하게 한다.
//			
//		}
//	}
//	
//	public void deleteThisNode(listNode This) {
//		
//		if (head ==null)  return;
//		else if (This.Rlink == null) {
//			This.Llink.Rlink =null; 
//		}
//		else {
//				This.Llink.Rlink = This.Rlink;
//				This.Rlink.Llink = This.Llink;
//		}
//	}
//	
//	public void deleteLastNode() {
//		
//		listNode pre , temp;
//		
//		
//		if(head == null) return;
//		
//		if(head.Rlink ==null) head = null;
//		
//		else {
//			pre = head;
//			temp = head.Rlink;
//		while(temp.Rlink != null) {
//			pre= temp;
//			temp = temp.Rlink;
//			}
//		pre.Rlink =null; //전 노드의 링크를 null로 만들어서 다음 노드를 지정하지 않는 방식으로 노드를 삭제한다.
//		temp.Llink = null;
//		}
//		
//	}
//	
//	public listNode searchNode(String data) {
//		
//		listNode temp = this.head; //linkedList 클래스의 head 속성값을 부르기 위해 (즉 자기 자신의 속성을 부르기 위해)head 앞에 this가 붙는다
//		
//		while(temp != null) {
//			
//			if(data.equals(temp.getData()))  //""로 만든 문자열과 NextLine으로 인해 만들어진 문자열은 겉보기에는 같은 경우에도 주소값이 다르다. 문자열끼리의 비교는 equals로 하자.
//			
//				return temp; //return이 실행되어도 반복문이 종료된다.
//			
//			else
//				temp=temp.Rlink;
//			}
//	
//		return temp;
//		
//	}	
//	
//	public void printList() {
//		System.out.print("(");
//		listNode temp = head;
//		
//		if(temp == null) 
//			System.out.print("저장된 값이 없습니다");
//		
//		else {
//		
//		while(temp != null) {
//			System.out.print(temp.getData()); //string값을 출력해야 하므로 getData 메소드를 사용한다.
//			
//			if(temp.Rlink != null)
//				System.out.print(",");
//			
//			temp = temp.Rlink;
//		}	
//			
//		}
//		System.out.print(")");
//		System.out.println(" ");
//	
//	}
//		
//	
//	
//		
//}//LinkedList
//
//
//
//
//
//
//public class DoublyLinkedList {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//Scanner sc = new Scanner(System.in);
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
//			else if(Input.equals("Del")){
//				
//				System.out.println(" ");
//				System.out.println("삭제할 값을 입력하세요.");
//				
//				
//				String Delete = sc.nextLine();
//				listNode This = L.searchNode(Delete);
//				
//				if(This == null) {
//					System.out.println("삭제할 값이 존재하지 않습니다");	
//					L.printList();
//					System.out.println(" ");
//				}
//			
//				else {
//					L.deleteThisNode(This);
//					L.printList();
//				}
//				
//			}
//			else if (Input.equals("Delete")) {
//				System.out.println(" ");
//				System.out.println("값이 삭제되었습니다.");
//				L.deleteLastNode();
//				L.printList();
//			}
//			else if(Input.equals("Insert")) {
//				System.out.println(" ");
//				System.out.println("삽입할 값 옆 값을 입력하세요");
//				
//				String Node = sc.nextLine();
//				listNode This = L.searchNode(Node);
//				
//				System.out.println(" ");
//				System.out.println("삽입할 값을 입력하세요");
//				
//				String Insert = sc.nextLine();
//				
//				if(This == null) {
//					System.out.println("값이 존재하지 않습니다");	
//					L.printList();
//					System.out.println(" ");
//				}
//			
//				else {
//					L.insertMiddleNode(This,Insert);
//					L.printList();
//				}
//			}
//				
//				
//			
//			else
//			 {
//			
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
//		
//	
//	} //main
//
//} //DoublyLinkedList
