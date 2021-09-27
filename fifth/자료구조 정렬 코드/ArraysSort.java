import java.util.Arrays;

public class ArraysSort<T> {

	private T[] arr;

	public ArraysSort(T[] arr) {
		this.arr = arr;
	}

	public void showResult() {
		System.out.println("---------- Arrays.sort() ----------");
		System.out.println("Before sorting: ");
		printArray(arr);
		long before = System.nanoTime();

		Arrays.sort(arr);

		long after = System.nanoTime();
		System.out.println("After sorting: ");
		printArray(arr);
		System.out.println("Arrays.sort() performance time: " + ((after - before) / 1000) + "¥ìs");
	}

	private void printArray(T[] arr) {
		System.out.print("[ ");
		if(arr[0] instanceof Student) {
			for (T t : arr) {
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