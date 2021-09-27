public class ShellSortDec<T extends Comparable<T>> {

	private T[] array;
	private long sortingTime;

	public ShellSortDec(T[] array) {
		this.array = array;
	}

	public void getResult() {
		sort();
	}

	public void showResult() {
		System.out.println("---------- Shell Sort ----------");
		System.out.println("Before sorting: ");
		printArray(array);

		sort();

		System.out.println("After sorting: ");
		printArray(array);
		System.out.println("Shell sort performance time: " + (sortingTime/1000) + "¥ìs");
	}

	private void sort() {
		long before = System.nanoTime();

		int length = array.length;
		int h = 4;
		while(h > 0) {
			for(int i = h; i < length; i++) {
				for(int j = i; j >= h && array[j].compareTo(array[j - h]) > 0; j -= h) {
					swap(j, j - h);
				}
			}
			h /= 3;
		}
		long after = System.nanoTime();
		sortingTime = after - before;
	}

	private void swap(int i, int j) {
		T temp = array[i];
		array[i] = array[j];
		array[j] = temp;
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