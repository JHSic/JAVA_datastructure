public class MergeSort<T extends Comparable<T>> {

	private T[] arr;
	private long sortingTime;

	public MergeSort(T[] arr) {
		this.arr = arr;
	}

	public void showResult(String type) {
		System.out.println("---------- Merge Sort(" + type + ") ----------");
		System.out.print("Before sorting: ");
		printArray(arr);

		if(type.equals("recursive")) {
			recursiveMergeSort();
		} 
		else if(type.equals("iterative")) {
			iterativeMergeSort();
		} 
		else if(type.equals("natural")) {
			naturalMergeSort();
		}

		System.out.print("After sorting: ");
		printArray(arr);
		System.out.println("Merge sort(" + type + ") performance time: " + (sortingTime/1000) + "¥ìs");
	}

	private void recursiveMergeSort() {
		long before = System.nanoTime();

		T[] arr2 = (T[]) new Comparable[arr.length];
		recursiveMergeSort(arr, arr2, 0, arr.length - 1);

		long after = System.nanoTime();
		sortingTime = after - before;
	}

	private void recursiveMergeSort(T[] arr1, T[] arr2, int low, int high) {
		if(low < high) {
			int mid = low + (high - low) / 2;
			recursiveMergeSort(arr1, arr2, low, mid);
			recursiveMergeSort(arr1, arr2, mid + 1, high);
			merge(arr1, arr2, low, mid, high);
		}
	}

	private void iterativeMergeSort() {
		long before = System.nanoTime();

		T[] mergedList = (T[]) new Comparable[arr.length];
		int temp = arr.length - 1;
		for(int size = 1; size <= temp; size += size) {
			for(int i = 0; i <= temp - size; i += (2 * size)) {
				int low = i;
				int mid = i + size - 1;
				int high;

				if((i + (2 * size) - 1) >= temp) {
					high = temp;
				} 
				else {
					high = (i + (2 * size) - 1);
				}
				merge(arr, mergedList, low, mid, high);
			}
		}

		long after = System.nanoTime();
		sortingTime = after - before;
	}

	private void naturalMergeSort() {
		long before = System.nanoTime();
		naturalMergeSort(arr, arr.length);
		long after = System.nanoTime();
		sortingTime = after - before;
	}

	private void naturalMergeSort(T[] arr, int n) {
		Queue<Integer> listLength = new Queue<>();
		int length = 1;

		for(int i = 0; i < n - 1; i++) {
			if(arr[i].compareTo(arr[i + 1]) > 0) {
				listLength.enQueue(length);
				length = 0;
			}
			length++;
			if(i == n - 2) {
				listLength.enQueue(length);
			}
		}

		T[] mergedArr = (T[]) new Comparable[n];
		int index = 0;

		while(listLength.getCount() != 1) {
			int j = listLength.peek();
			listLength.deQueue();

			if(index + j == n) {
				listLength.enQueue(j);
				index = 0;
				continue;
			}
			int k = listLength.peek();
			listLength.deQueue();

			merge(arr, mergedArr, index, index + j - 1, index + j + k - 1);
			index = index + j + k;
			listLength.enQueue(j + k);

			if(index == n) {
				index = 0;
			}
		}
	}

	private void merge(T[] arr1, T[] arr2, int low, int mid, int high) {
		int i = low, j = mid + 1;
		for(int k = low; k <= high; k++) {
			if(i > mid) {
				arr2[k] = arr1[j++];
			} 
			else if(j > high) {
				arr2[k] = arr1[i++];
			} 
			else if(arr1[j].compareTo(arr1[i]) < 0) {
				arr2[k] = arr1[j++];
			} 
			else {
				arr2[k] = arr1[i++];
			}
		}
		for(int k = low; k <= high; k++) {
			arr1[k] = arr2[k];
		}
	}

	private void printArray(T[] array) {
		System.out.print("[ ");
		if(array[0] instanceof Student) {
			for(T t : array) {
				Student st = (Student) t;
				System.out.print(st.getAvg() + " ");
			}
		} 
		else {
			for(T t : array) {
				System.out.print(t.toString() + " ");
			}
		}
		System.out.println("]");
	}
}