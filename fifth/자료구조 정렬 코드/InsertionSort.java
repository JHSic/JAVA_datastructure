public class InsertionSort<T extends Comparable<T>> {

	private T[] arr;
	private long sortingTime;

	public InsertionSort(T[] arr) {
		this.arr = arr;
	}

	public void showResult(String type) {
		System.out.println("---------- Insertion Sort(" + type + ") ----------");
		System.out.println("Before sorting: ");
		printArray(arr);

		if(type.equals("Array")) {
			arraySort();
		} 
		else if(type.equals("BinarySearch")) {
			binaryInsertionSort();
		}

		System.out.println("After sorting: ");
		printArray(arr);
		System.out.println("Insertion sort(" + type + ") performance time: " + (sortingTime/1000) + "¥ìs");
	}

	private void arraySort() {
		long before = System.nanoTime();

		for(int i = 1; i < arr.length; i++) {
			T target = arr[i];
			int j = i - 1;
			while(j >= 0 && target.compareTo(arr[j]) <= 0) {
				swap(j, j + 1);
				j--;
			}
			arr[j + 1] = target;
		}

		long after = System.nanoTime();
		sortingTime = after - before;
	}

	private void binaryInsertionSort() {
		long before = System.nanoTime();
		T t;
		int index;

		for(int i = 1; i < arr.length; i++) {
			t = arr[i];
			index = binarySearch(0, i, t);
			for(int j = i - 1; j >= index; j--) {
				arr[j + 1] = arr[j];
			}
			arr[index] = t;
		}

		long after = System.nanoTime();
		sortingTime = after - before;
	}

	private int binarySearch(int left, int right, T t) {
		if(right >= left) {
			int mid = left + ((right - left) / 2);
			if(arr[mid].equals(t)) {
				return mid;
			}
			if(arr[mid].compareTo(t) > 0) {
				return binarySearch(left, mid - 1, t);
			}
			return binarySearch(mid + 1, right, t);
		}
		return left;
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