public class HeapSort<T extends Comparable<T>> {

	private T[] arr;
	private long sortingTime;

	public HeapSort(T[] arr) {
		this.arr = arr;
	}

	public void showResult() {
		System.out.println("---------- Heap Sort ----------");
		System.out.println("Before sorting: ");
		printArray(arr);

		sort();

		System.out.println("After sorting: ");
		printArray(arr);
		System.out.println("Heap sort performance time: " + (sortingTime/1000) + "¥ìs");
	}

	private void sort() {
		long before = System.nanoTime();

		int heapSize = arr.length - 1;
		for(int i = heapSize / 2; i > 0; i--) {
			heapify(i, heapSize);
		}
		while (heapSize > 1) {
			swap(1, heapSize--);
			heapify(1, heapSize);
		}

		long after = System.nanoTime();
		sortingTime = after - before;
	}

	private void heapify(int parent, int heapSize) {
		while(2 * parent <= heapSize) {
			int left = 2 * parent;
			if (left < heapSize && arr[left].compareTo(arr[left + 1]) < 0) {
				left++;
			}
			if (arr[parent].compareTo(arr[left]) >= 0) {
				break;
			}
			swap(parent, left);
			parent = left;
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