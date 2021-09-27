public class SelectionSort<T extends Comparable<T>> {
	private T[] arr;
	private long sortingTime;

	public SelectionSort(T[] arr) {
		this.arr = arr;
	}

	public void showResult() {
		System.out.println("---------- Selection Sort ----------");
		System.out.println("Before sorting: ");
		printArray(arr);

		sort();

		System.out.println("After sorting: ");
		printArray(arr);
		System.out.println("Selection sort performance time: " + (sortingTime/1000) + "¥ìs");
	}

	private void sort() {
		long before = System.nanoTime();

		for(int i = 0; i < arr.length; i++) {
			int min = i;
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[j].compareTo(arr[min]) < 0) {
					min = j;
				}
			}
			swap(i, min);
		}

		long after = System.nanoTime();
		sortingTime = after - before;
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