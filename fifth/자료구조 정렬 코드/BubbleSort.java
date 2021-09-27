public class BubbleSort<T extends Comparable<T>> {

	private T[] arr;
	private long sortingTime;

	public BubbleSort(T[] arr) {
		this.arr = arr;
	}

	public void showResult() {
		System.out.println("---------- Bubble Sort ----------");
		System.out.println("Before sorting: ");
		printArray(arr);

		sort();

		System.out.println("After sorting: ");
		printArray(arr);
		System.out.println("Bubble sort performance time: " + (sortingTime/1000) + "¥ìs");
	}

	private void sort() {
		long before = System.nanoTime();

		for(int i = arr.length - 1; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				if((arr[j].compareTo(arr[j + 1])) > 0) {
					swap(j, j + 1);
				}
			}
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
		if (arr[0] instanceof Student) {
			for (T t : arr) {
				Student st = (Student) t;
				System.out.print(st.getAvg() + " ");
			}
		} else {
			for (T t : arr) {
				System.out.print(t.toString() + " ");
			}
		}
		System.out.println("]");
	}
}