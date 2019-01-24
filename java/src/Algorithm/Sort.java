package Algorithm;




class randomArray { //1���� 100���� ������ ���ڰ� ����ִ� �迭�� ����� Ŭ����
	
	int[] arr = new int [100]; //�迭�� ũ�⸦ 100���� �����ش�
	
	
	public int[] array() { //array��� �޼ҵ带 ����, �� �޼ҵ�� ������ ����ִ� 100������ �迭�� �������ش�.
				
		for(int i =0 ;  i <100 ; i++) {
			arr[i]=(int) (Math.random()*100+1); //Math.random()�� ���� ������ ���� �� �ִ�. Math.random()*�ִ밪+�ּҰ��� ������ ���ϰ� �ִ�.
		}
		return arr; //������ ����ִ� �迭�� ��ȯ
		
	}	
	
	public void printList(int array[]) {
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]);
			System.out.print(" ");
		}
	}	
}
class bubbleSort { //bubble sort�� �����ϴ� Ŭ����, �迭 ������ �ݺ� ���� �ѹ��� ���� �ٲ��� ���� ���� �̹� ���ĵ� ����̹Ƿ� ���ǹ��� �ݺ��� ���ϱ� ���� sorted �Լ��� true�� ������ ��� �ٷ� �迭�� �����ϵ��� �ߴ�.
	
	public int[] sort(int array[], int n) {
		
		for(int i=0; i<array.length;i++) {
			boolean sorted = true;
			for(int j=0; j<array.length-(i+1);i++) {
				if(array[j]>array[j+1]) {
					int temp;
					temp=array[j+1];
					array[j+1]=array[j];
					array[j]=temp;
					sorted = false;
				}
				if(sorted=true) return array;
			}
		}
		return array;		
	}
	
	public void printList(int array[]) {
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]);
			System.out.print(" ");
		}
	}	
	
}
class insertionSort { //insertion sort�� �����ϴ� Ŭ����, �迭�� 2��° ��Ҹ� item ������ ��� �� �ٷ� �Ʒ� ��ȣ�� loc ������ ���� �� loc���� ��Ұ� item���� Ŭ������ loc+1�� loc���� ��Ұ� �ǰ� �ϰ� loc�� 1�� �ٿ� ��ĭ�� ��� �з����� �Ͽ���. 
					  //item�� ���ڸ��� ã�� ��(item���� loc���� ��Ұ� �� ���� ��) loc+1�� ��ҿ� item�� ��� i��°�� �ݺ��� �������� �Ͽ���.
	
	public int[] sort(int array[], int n) {
		
		for(int i=1; i<array.length; i++) {
			int loc = i-1;
			int item = array[i];
			while(array[loc]>item && loc>=0) {
				array[loc+1]=array[loc];
				loc--;
			}
			array[loc+1]=item;
		
		}
		return array;
	}
	public void printList(int array[]) {
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]);
			System.out.print(" ");
		}
	}	
}

class selectionSort { //selection sort�� �����ϴ� Ŭ����, �迭 ������ ū ���� ���ϴ� largest�޼ҵ带 ���� �Ű������� �޾� sort �޼ҵ尡 ���ĵ��� ���� �迭�� �� ���� ���� ū ���� �ٲ��ش�.
	
	public int[] sort(int array[], int n) {
		
		for(int i = n-1 ; i>=0 ; i--) {
			int temp = array[i];
			array[i]=array[largest(array,i)];
			array[largest(array,i)]=temp;
			
		}
		return array;	
	}
	
	
	
	public int largest(int array[], int n) {
		
		int largest = 0;
		
		for(int i=0; i<=n;i++) {
		if(array[i]>array[largest]) {
			largest = i;
		}
			}
		return largest;		
	}
	
	public void printList(int array[]) {
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]);
			System.out.print(" ");
		}
	}	
}

		

public class Sort {

	public static void main(String[] args) {
		
		randomArray R = new randomArray(); //randomArray���� ���� �迭�� ������ ��ü R ����
		
		selectionSort S = new selectionSort();
		
		bubbleSort B = new bubbleSort();
		
		insertionSort I = new insertionSort();
		
		
		int randArray[] = R.array(); //intArray�� R�� �����迭���� �־��ش�
		
//		for(int i=0; i<100 ; i++) {
//			System.out.print(randArray[i]); //for���� ���� intArray�� ���
//			System.out.print(" ");
//			}
//				
//		System.out.println(" ");
		R.printList(randArray);
		
		System.out.println(" ");
		
		long Ss = System.nanoTime();	 //nanoTime()�� �ڵ����� �ҿ�Ǵ� �ð��� ns(������) ������ �����ϰ� ���ش�.
		S.sort(randArray, 100);
		long Es = System.nanoTime();
		System.out.println("SelectionSort = "+(Es-Ss)/1000.00000+"ns");
	
					
		long Sb = System.nanoTime();
		B.sort(randArray,100);
		long Eb = System.nanoTime();
		System.out.println("BubbleSort = "+(Eb-Sb)/1000.00000+"ns");
		
		long Si = System.nanoTime();
		I.sort(randArray,100);
		long Ei = System.nanoTime();
		System.out.println("InsertionSort = "+(Ei-Si)/1000.00000+"ns");
		
		
		
		
	}

}


