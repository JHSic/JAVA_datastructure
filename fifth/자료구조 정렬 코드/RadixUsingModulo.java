public class RadixUsingModulo {

	private int[] arr;
	private long sortingTime;

	public RadixUsingModulo(int[] arr) {
		this.arr = arr;
	}

	public void showResult(int n) {
		String type = "";
		if(n == 16) {
			type = "hexadecimal";
		} 
		else if(n == 10) {
			type = "decimal";
		}

		System.out.println("---------- Radix Sort(" + type + ") ----------");
		System.out.println("Before sorting: ");
		printArray(arr);

		radixSort(arr, arr.length, n);

		System.out.println("After sorting: ");
		printArray(arr);
		System.out.println("Radix sort(" + type + ") performance time: " + (sortingTime/1000) + "¥ìs");
	}

	public void radixSort(int[] arr, int n, int k) {
		long before = System.nanoTime();

		int exp, max;
		max = getMax(arr, n);
		for(exp = 1; max / exp > 0; exp *= k) {
			countSort(arr, n, exp, k);
		}

		long after = System.nanoTime();
		sortingTime = after - before;
	}

	private int getMax(int[] array, int n) {
		int max = array[0];
		for(int i = 1; i < n; i++) {
			if(array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}

	private void countSort(int[] array, int n, int exp, int k) {
		int[] output = new int[n];
		int[] count = new int[k];
		int i;

		for(int num = 0; num < k; num++) {
			count[num] = 0;
		}
		for(i = 0; i < n; i++) {
			count[(array[i] / exp) % k]++;
		}
		for(i = 1; i < k; i++) {
			count[i] += count[i - 1];
		}
		for(i = n - 1; i >= 0; i--) {
			output[count[(array[i] / exp) % k] - 1] = array[i];
			count[(array[i] / exp) % k]--;
		}
		for(i = 0; i < n; i++)
			array[i] = output[i];
	}

	private void printArray(int[] arr) {
		System.out.print("[ ");
		for(int n : arr) {
			System.out.print(n + " ");
		}
		System.out.println("]");
	}

}