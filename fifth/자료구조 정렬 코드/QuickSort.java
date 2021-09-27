public class QuickSort<T extends Comparable<T>> {

	private T[] arr;
	private long sortingTime;
	private final static int CALLSIZE = 50;

	public QuickSort(T[] arr) {
		this.arr = arr;
	}

	public void showResult(String type) {
		System.out.println("---------- Quick Sort(pivot: " + type + ") ----------");
		System.out.println("Before sorting: ");
		printArray(arr);

		if(type.equals("first")) {
			firstElementQuickSort();
		}
		else if(type.equals("median-of-3")) {
			medianOf3QuickSort();
		}

		System.out.println("After sorting: ");
		printArray(arr);
		System.out.println("Quick sort(pivot: " + type + ") performance time: " + (sortingTime/1000) + "¥ìs");
	}

	private void firstElementQuickSort() {
		long before = System.nanoTime();
		firstElementQuickSort(0, arr.length - 1);
		long after = System.nanoTime();
		sortingTime = after - before;
	}

	private void insertionSort(int left, int right) {
		for(int i = left; i <= right; i++) {
			for(int j = i; j > left; j--) {
				if(arr[j].compareTo(arr[j - 1]) < 0) {
					swap(j, j - 1);
				} 
				else {
					break;
				}
			}
		}
	}

	private void firstElementQuickSort(int low, int high) {
		if(high <= low + CALLSIZE) {
			insertionSort(low, high);
		} 
		else {
			int j = firstPartition(low, high);
			firstElementQuickSort(low, j - 1);
			firstElementQuickSort(j + 1, high);
		}
	}

	private int firstPartition(int pivot, int high) {
		int i = pivot + 1;
		int j = high;
		T p = arr[pivot];
		while(true) {
			while(i < high && arr[i].compareTo(p) <= 0) {
				i++;
			}
			while(j > pivot && arr[j].compareTo(p) > 0) {
				j--;
			}
			if(i >= j) {
				break;
			}
			swap(i, j);
		}
		swap(j, pivot);
		return j;
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
		T p = arr[low];

		while(true) {
			while(i < high && arr[i].compareTo(p) <= 0) {
				i++;
			}
			while(j > low && arr[j].compareTo(p) >= 0) {
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
		if(arr[a].compareTo(arr[b]) > 0) {
			if(arr[b].compareTo(arr[c]) > 0) {
				return b;
			} 
			else {
				if(arr[a].compareTo(arr[c]) > 0) {
					return c;
				} 
				else {
					return a;
				}
			}
		} 
		else {
			if(arr[a].compareTo(arr[c]) > 0) {
				return a;
			} 
			else {
				if(arr[b].compareTo(arr[c]) > 0) {
					return c;
				} 
				else {
					return b;
				}
			}
		}
	}

	private void swap(int i, int j) {
		T temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	private void printArray(T[] arr) {
		System.out.print("[ ");
		if(arr[0] instanceof Student) {
			for(T t : arr) {
				Student st = (Student) t;
				System.out.print(st.getAvg() + " ");
			}
		}
		else {
			for(T t : arr) {
				System.out.print(t.toString() + " ");
			}
		}
		System.out.println("]");
	}
}