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
//		return this.data; //Ŭ���� listNode�� �Ӽ��� data�� �����ϱ� ���� this�� �ٿ��ش�.
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
//		newNode.Llink = temp; //���߿��Ḯ��Ʈ�̹Ƿ� �� ����� ���� ��ũ�� ������ ��带 ����Ű�� �����.
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
//			newNode.Rlink = pre.Rlink; //�� ����� ������ ��ũ�� ���� ����� ������ ��ũ�� �״�� �޴´�.
//			
//			pre.Rlink = newNode; //���� ����� ������ ��ũ�� �� ����� ���� �����Ѵ�.
//			
//			newNode.Llink = pre; //�� ����� ���� ��ũ�� ���� ����� ���� �����Ѵ�.
//			
//			newNode.Rlink.Llink = newNode ; //���� ����� ������ ��ũ�� ���� ��ũ, �� �� ����� ������ ����� ���� ��ũ�� �� ��带 �����ϰ� �Ѵ�.
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
//		pre.Rlink =null; //�� ����� ��ũ�� null�� ���� ���� ��带 �������� �ʴ� ������� ��带 �����Ѵ�.
//		temp.Llink = null;
//		}
//		
//	}
//	
//	public listNode searchNode(String data) {
//		
//		listNode temp = this.head; //linkedList Ŭ������ head �Ӽ����� �θ��� ���� (�� �ڱ� �ڽ��� �Ӽ��� �θ��� ����)head �տ� this�� �ٴ´�
//		
//		while(temp != null) {
//			
//			if(data.equals(temp.getData()))  //""�� ���� ���ڿ��� NextLine���� ���� ������� ���ڿ��� �Ѻ��⿡�� ���� ��쿡�� �ּҰ��� �ٸ���. ���ڿ������� �񱳴� equals�� ����.
//			
//				return temp; //return�� ����Ǿ �ݺ����� ����ȴ�.
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
//			System.out.print("����� ���� �����ϴ�");
//		
//		else {
//		
//		while(temp != null) {
//			System.out.print(temp.getData()); //string���� ����ؾ� �ϹǷ� getData �޼ҵ带 ����Ѵ�.
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
//				System.out.println("������ ���� �Է��ϼ���.");
//				
//				
//				String Delete = sc.nextLine();
//				listNode This = L.searchNode(Delete);
//				
//				if(This == null) {
//					System.out.println("������ ���� �������� �ʽ��ϴ�");	
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
//				System.out.println("���� �����Ǿ����ϴ�.");
//				L.deleteLastNode();
//				L.printList();
//			}
//			else if(Input.equals("Insert")) {
//				System.out.println(" ");
//				System.out.println("������ �� �� ���� �Է��ϼ���");
//				
//				String Node = sc.nextLine();
//				listNode This = L.searchNode(Node);
//				
//				System.out.println(" ");
//				System.out.println("������ ���� �Է��ϼ���");
//				
//				String Insert = sc.nextLine();
//				
//				if(This == null) {
//					System.out.println("���� �������� �ʽ��ϴ�");	
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
//			System.out.println("���� ���� �Է��ϼ���");
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
