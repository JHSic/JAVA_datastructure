import java.util.Collections;
import java.util.ArrayList;

public class CollectionsSort<T extends Comparable<T>> {

	private ArrayList<T> list;

	public CollectionsSort(ArrayList<T> list) {
		this.list = list;
	}

	public void showResult() {
		System.out.println("---------- Collections.sort() ----------");
		System.out.println("Before sorting: ");
		printArray(list);
		long before = System.nanoTime();

		Collections.sort(list);

		long after = System.nanoTime();
		System.out.println("After sorting: ");
		printArray(list);
		System.out.println("Collections.sort() performance time: " + ((after - before) / 1000) + "¥ìs");
	}

	private void printArray(ArrayList<T> list) {
		System.out.print("[ ");
		if(list.get(0) instanceof Student) {
			for (T t : list) {
				Student st = (Student) t;
				System.out.print(st.getAvg() + " ");
			}
		} 
		else {
			for(T t : list) {
				System.out.print(t.toString() + " ");
			}
		}
		System.out.println("]");
	}
}