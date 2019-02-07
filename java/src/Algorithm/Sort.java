package Algorithm;


	



class randomArray { //1부터 100까지 랜덤한 숫자가 들어있는 배열을 만드는 클래스
	
	int[] arr = new int [100]; //배열의 크기를 100으로 정해준다
	
	
	public int[] array() { //array라는 메소드를 생성, 이 메소드는 난수가 들어있는 100까지의 배열을 생성해준다.
				
		for(int i =0 ;  i <100 ; i++) {
			arr[i]=(int) (Math.random()*100+1); //Math.random()을 통해 난수를 만들 수 있다. Math.random()*최대값+최소값의 구성을 지니고 있다.
		}
		return arr; //난수가 들어있는 배열을 반환
		
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
		int i = s-1; //pivot 값보다 작은 값이 없을 경우를 대비해 i를 s-1로 둔다.
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

class bubbleSort { //bubble sort를 구현하는 클래스, 배열 내에서 반복 도중 한번도 값이 바뀌지 않은 경우는 이미 정렬된 경우이므로 무의미한 반복을 피하기 위해 sorted 함수가 true로 유지될 경우 바로 배열을 리턴하도록 했다.
	
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
class insertionSort { //insertion sort를 구현하는 클래스, 배열의 2번째 요소를 item 변수에 담고 그 바로 아래 번호를 loc 변수에 담은 뒤 loc번의 요소가 item보다 클때마다 loc+1이 loc번의 요소가 되게 하고 loc를 1씩 줄여 한칸씩 계속 밀려나게 하였다. 
					  //item이 제자리를 찾을 시(item보다 loc번의 요소가 더 작을 시) loc+1번 요소에 item을 담고 i번째의 반복을 끝내도록 하였다.
	
	public int[] sort(int array[], int n) {
		
		
		
		for(int i=1; i<array.length; i++) {
			int loc = i-1;
			int item = array[i];
			while(loc>=0 && array[loc]>item  ) { // loc>=0 && array[loc]>item 와  array[loc]>item && loc>=0 의 값이 다르다.
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

class selectionSort { //selection sort를 구현하는 클래스, 배열 내에서 큰 값을 구하는 largest메소드를 통해 매개변수를 받아 sort 메소드가 정렬되지 않은 배열의 맨 끝과 가장 큰 값을 바꿔준다.
	
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
	
	static void initial(int [] array1,int [] array2) { //배열끼리 값의 복사를 위해 만든 함수
		for(int i=0; i<array1.length; i++) {
			array1[i]=array2[i];
		}
	}

	public static void main(String[] args) {
		
		randomArray R = new randomArray(); //randomArray에서 만든 배열을 구현할 객체 R 생성
		
		selectionSort S = new selectionSort();
		
		bubbleSort B = new bubbleSort();
		
		insertionSort I = new insertionSort();
		
		mergeSort M = new mergeSort();
		
		quickSort Q = new quickSort();
		
		int randArray[]= new int [100]; //랜덤한 배열을 담을 randArray를 생성한다.
	
		int [] random = R.array(); //함수 random에 무작위로 생성된 수들의 배열인 R.array를 지정한다. 최초의 난수배열.
		

		initial(randArray,random); 
		
		R.printList(randArray);
		
		System.out.println(" ");
		
		
		
		initial(randArray,random);//위에서 이미 정렬된 randArray를 initial없이 다시 정렬하게되면 이미 정렬된 배열을 다시 정렬하는 것이 되버리므로, 다른 정렬 시행 전에 다시 최초의 난수배열값을 넣어준다.
		long Si = System.nanoTime();
		I.sort(randArray,100);
		long Ei = System.nanoTime();
		System.out.println("InsertionSort = "+(Ei-Si)/1000.00000+"ns");	
		
	
		
		System.out.println(" ");
		
		initial(randArray,random); //정렬이 시행되기 전에 randArray배열을 최초의 난수 배열인 R.array값을 넣어주는 과정을 거쳐야 한다. 
		long Sb = System.nanoTime();
		B.sort(randArray,100);
		long Eb = System.nanoTime();
		System.out.println("BubbleSort = "+(Eb-Sb)/1000.00000+"ns");	
		
		
		
		System.out.println(" ");
				
		initial(randArray,random);
		long Ss = System.nanoTime();	 //nanoTime()은 코드수행시 소요되는 시간을 ns(나노초) 단위로 측정하게 해준다.
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


