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
class quickSort {
	
	public int [] sort(int array[],int s, int e) {
		
		if(s<e) {
			int p = partition(array,s,e);
			sort(array,s,p-1);
			sort(array,p+1,e);
		}
		
		return array;
	}
	
	public int partition(int array[],int s,int e) {
		
		int pivot = array[e];
		int i = s-1; //pivot ������ ���� ���� ���� ��츦 ����� i�� s-1�� �д�.
		int temp;
		
		for(int j = s; j<=e-1; j++ ) {
			if(pivot>=array[j]) {
			i++;
			temp=array[j];
			array[j]=array[i];
			array[i]=temp;
			}
		}
		
		temp = array[e];
		array[e] = array[i+1];
		array[i+1]=temp;
				
		return i+1;
	}
	public void printList(int array[]) {
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]);
			System.out.print(" ");
		}
	}
}

class mergeSort {
	
	
	
	public int [] sort(int array[],int s,int e) {
		
		if(s<e) {
			int h = (s+e)/2;
			sort(array,s,h);
			sort(array,h+1,e);
			merge(array,s,h,e);
		}
		return array;
	}
	
	public int [] merge(int array[],int s, int h ,int e) {
		
		int [] temp = new int [array.length];
		
		int i = s;
		int j = h+1;
		int t = 0;
		while(i<=h && j<=e) {
			if(array[i]<array[j]) {
				temp[t]=array[i];
				i++;
				t++;
			}
				else {
					temp[t]=array[j];
					j++;
					t++;
				}
			
			}
		
		
		while(i<=h) {
			temp[t]=array[i];
			t++;
			i++;
		}
		
		while(j<=e) {
			temp[t]=array[j];
			t++;
			j++;
		}
		i=s;
		t=0;
		while(i<=e) {
			array[i]=temp[t];
			i++;
			t++;		
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

class bubbleSort { //bubble sort�� �����ϴ� Ŭ����, �迭 ������ �ݺ� ���� �ѹ��� ���� �ٲ��� ���� ���� �̹� ���ĵ� ����̹Ƿ� ���ǹ��� �ݺ��� ���ϱ� ���� sorted �Լ��� true�� ������ ��� �ٷ� �迭�� �����ϵ��� �ߴ�.
	
	public int[] sort(int array[], int n) {
		
		
		
		for(int i=0; i<array.length ;i++) {
			boolean sorted = true;
			for(int j=0; j<array.length-(i+1);j++) {
				if(array[j]>array[j+1]) {
					
					int temp=array[j+1];
					array[j+1]=array[j];
					array[j]=temp;
					sorted = false;
				}			
			}
			if(sorted==true) return array;
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
			while(loc>=0 && array[loc]>item  ) { // loc>=0 && array[loc]>item ��  array[loc]>item && loc>=0 �� ���� �ٸ���.
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
	
	static void initial(int [] array1,int [] array2) { //�迭���� ���� ���縦 ���� ���� �Լ�
		for(int i=0; i<array1.length; i++) {
			array1[i]=array2[i];
		}
	}

	public static void main(String[] args) {
		
		randomArray R = new randomArray(); //randomArray���� ���� �迭�� ������ ��ü R ����
		
		selectionSort S = new selectionSort();
		
		bubbleSort B = new bubbleSort();
		
		insertionSort I = new insertionSort();
		
		mergeSort M = new mergeSort();
		
		quickSort Q = new quickSort();
		
		int randArray[]= new int [100]; //������ �迭�� ���� randArray�� �����Ѵ�.
	
		int [] random = R.array(); //�Լ� random�� �������� ������ ������ �迭�� R.array�� �����Ѵ�. ������ �����迭.
		

		initial(randArray,random); 
		
		R.printList(randArray);
		
		System.out.println(" ");
		
		
		
		initial(randArray,random);//������ �̹� ���ĵ� randArray�� initial���� �ٽ� �����ϰԵǸ� �̹� ���ĵ� �迭�� �ٽ� �����ϴ� ���� �ǹ����Ƿ�, �ٸ� ���� ���� ���� �ٽ� ������ �����迭���� �־��ش�.
		long Si = System.nanoTime();
		I.sort(randArray,100);
		long Ei = System.nanoTime();
		System.out.println("InsertionSort = "+(Ei-Si)/1000.00000+"ns");	
		
	
		
		System.out.println(" ");
		
		initial(randArray,random); //������ ����Ǳ� ���� randArray�迭�� ������ ���� �迭�� R.array���� �־��ִ� ������ ���ľ� �Ѵ�. 
		long Sb = System.nanoTime();
		B.sort(randArray,100);
		long Eb = System.nanoTime();
		System.out.println("BubbleSort = "+(Eb-Sb)/1000.00000+"ns");	
		
		
		
		System.out.println(" ");
				
		initial(randArray,random);
		long Ss = System.nanoTime();	 //nanoTime()�� �ڵ����� �ҿ�Ǵ� �ð��� ns(������) ������ �����ϰ� ���ش�.
		S.sort(randArray, 100);
		long Es = System.nanoTime();
		System.out.println("SelectionSort = "+(Es-Ss)/1000.00000+"ns");
		
		
		
		System.out.println(" ");
		
		initial(randArray,random);
		long Sm = System.nanoTime();	
		M.sort(randArray,0,99);
		long Em = System.nanoTime();
		System.out.println("MergeSort = "+(Em-Sm)/1000.00000+"ns");
		
		
		System.out.println(" ");
		
		initial(randArray,random);
		long Sq = System.nanoTime();	
		Q.sort(randArray,0,99);
		long Eq = System.nanoTime();
		System.out.println("QuickSort = "+(Eq-Sq)/1000.00000+"ns");
	
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
	
	}

}


