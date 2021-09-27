public class IntQuickSort {

	private int[] arr;
	private long sortingTime;
	private final static int CALLSIZE = 50;

	public IntQuickSort(int[] arr) {
		this.arr = arr;
	}

	public void showResult(String type) {
		System.out.println("---------- Quick Sort(pivot: " + type + ") ----------");
		System.out.println("Before sorting: ");
		printArray(arr);

		if(type.equals("median-of-3")) {
			medianOf3QuickSort();
		}

		System.out.println("After sorting: ");
		printArray(arr);
		System.out.println("Quick sort(pivot: " + type + ") performance time: " + (sortingTime/1000) + "¥ìs");
	}

	private void medianOf3QuickSort() {
		long before = System.nanoTime();
		medianOf3QuickSort(0, arr.length - 1);
		long after = System.nanoTime();
		sortingTime = after - before;
	}

	private void medianOf3QuickSort(int low, int high) {
		if(high <= low + CALLSIZE) {
			insertionSort(low, high);
		} 
		else {
			int j = medianPartition(low, high);
			medianOf3QuickSort(low, j - 1);
			medianOf3QuickSort(j + 1, high);
		}
	}

	private int medianPartition(int low, int high) {
		int i = low + 1;
		int j = high;
		int mid = (low + high) / 2;

		int pivot = getMidIdx(low, mid, high);
		swap(low, pivot);
		int p = arr[low];

		while(true) {
			while(i < high && arr[i] <= p) {
				i++;
			}
			while(j > low && arr[j] > p) {
				j--;
			}
			if(i >= j) {
				break;
			}
			swap(i, j);
		}
		swap(j, low);
		return j;
	}

	private int getMidIdx(int a, int b, int c) {
		if(arr[a] > arr[b]) {
			if(arr[b] > arr[c]) {
				return b;
			} 
			else {
				if(arr[a] > arr[c]) {
					return c;
				} 
				else {
					return a;
				}
			}
		} 
		else {
			if(arr[a] > arr[c]) {
				return a;
			} 
			else {
				if(arr[b] > arr[c]) {
					return c;
				} 
				else {
					return b;
				}
			}
		}
	}

	private void insertionSort(int left, int right) {
		for(int i = left; i <= right; i++) {
			for(int j = i; j > left; j--) {
				if(arr[j] - arr[j - 1] < 0) {
					swap(j, j - 1);
				}
				else {
					break;
				}
			}
		}
	}

	private void swap(int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	private void printArray(int[] arr) {
		System.out.print("[ ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("]");
	}
}