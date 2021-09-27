public class RadixUsingMaskingAndShift {

	private int[] arr;
	private long sortingTime;

	public RadixUsingMaskingAndShift(int[] arr) {
		this.arr = arr;
	}

	public void showResult() {
		System.out.println("---------- Radix Sort ----------");
		System.out.println("Before sorting: ");
		printArray(arr);

		radixSort(arr, arr.length);

		System.out.println("After sorting: ");
		printArray(arr);
		System.out.println("Radix sort(&, <<) performance time: " + (sortingTime/1000) + "¥ìs");
	}

	public void radixSort(int[] array, int n) {
		long before = System.nanoTime();
		int exp, max;
		max = getMax(array, n);
		
		for(exp = 0; (max >> exp) > 0; exp += 4) {
			countSort(array, n, exp);
		}
		long after = System.nanoTime();
		sortingTime = after - before;
	}

	private int getMax(int[] array, int n) {
		int max = array[0];
		for(int i = 1; i < n; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}

	private void countSort(int[] array, int n, int exp) {
		int[] output = new int[n];
		int[] count = new int[16];
		int i;

		for(int num = 0; num < 16; num++) {
			count[num] = 0;
		}
		for(i = 0; i < n; i++) {
			count[(array[i] >> exp) & 0xf]++;
		}
		for(i = 1; i < 16; i++) {
			count[i] += count[i - 1];
		}
		for(i = n - 1; i >= 0; i--) {
			output[count[(array[i] >> exp) & 0xf] - 1] = array[i];
			count[(array[i] >> exp) & 0xf]--;
		}
		for(i = 0; i < n; i++) {
			array[i] = output[i];
		}
	}

	private void printArray(int[] arr) {
		System.out.print("[ ");
		for(int n : arr) {
			System.out.print(n + " ");
		}
		System.out.println("]");
	}
}