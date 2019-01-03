//package Algorithm;
//import java.util.Scanner;
//class listNode{
//	
//	String data; 
//	listNode link;
//	
//	public listNode(String data, listNode link) { //listNode�� �Ű������� �����Ϳ� ��ũ���� �ִ���,�������� 3���� ���� ���� ������
//												 //���� �̸��� �Լ��� ������ ���ϰ� �پ��� �Ű����� ����� ���� ������ �� �ְ� �ϴ� ������ �����ε�(OverLoading)�̶�� �Ѵ�.
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
//			while(temp.link != null) { //temp�� �ƴ� temp���� ��ũ�� ���ϴ� ������ temp���� null�� ��츦 ã���� �� �� ����� ��ũ�� ã�� ����� ��� �̱� �����̴�
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
//			pre.link =null; //�� ����� ��ũ�� null�� ���� ���� ��带 �������� �ʴ� ������� ��带 �����Ѵ�.
//			}
//			
//		}
//		
//		public listNode searchNode(String data) {
//			
//			listNode temp = this.head; //listNode��� Ŭ������ �Ӽ����� �θ��� ���� (�� �ڱ� �ڽ��� �Ӽ��� �θ��� ����)head �տ� this�� �ٴ´�
//			
//			while(temp != null) {
//				
//				if(temp.getData()==data) { //getdata�޼ҵ带 ���� ������ ������ string���� ���ؾ� �ϱ� �����̴�. 
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
//				System.out.print("����� ���� �����ϴ�");
//			
//			else {
//			
//			while(temp != null) {
//				System.out.print(temp.getData()); //string���� ����ؾ� �ϹǷ� getData �޼ҵ带 ����Ѵ�.
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
//				System.out.println("���� �����Ǿ����ϴ�.");
//				L.deleteLastNode();
//				L.printList();
//				
//				
//				
//			}
//			else
//			 {
//			System.out.println(" ");
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
//		System.out.println("�� ��� �ڿ� �� ��� �����ϱ�");
//		
//		listNode pre = L.searchNode("��");
//		
//		if(pre == null) {
//			System.out.println("ã�� �����Ͱ� �����ϴ�!");
//		}
//			else {
//				L.insertMiddleNode(pre, "��");
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
