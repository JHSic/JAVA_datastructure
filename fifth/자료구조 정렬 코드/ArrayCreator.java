import java.util.Random;

public class ArrayCreator {

	public Integer[] getIntRndArr(int size) {
		Random rnd = new Random();
		Integer[] arr = new Integer[size];

		for (int i = 0; i < size; i++) {
			arr[i] = rnd.nextInt(size);
		}
		return arr;
	}

	public Integer[] getIntDecArr(int size) {
		Integer[] arr = new Integer[size];

		for (int i = 0; i < size; i++) {
			arr[i] = size - i;
		}
		return arr;
	}

	public Integer[] getIntIncArr(int size) {
		Integer[] arr = new Integer[size];

		for (int i = 0; i < size; i++) {
			arr[i] = i;
		}
		return arr;
	}

	public Double[] getDoubleRndArr(int size) {
		Random rnd = new Random();
		Double[] arr = new Double[size];

		for (int i = 0; i < size; i++) {
			arr[i] = rnd.nextDouble();
		}
		return arr;
	}

	public Double[] getDoubleIncArr(int size) {
		Random rnd = new Random();
		Double[] arr = new Double[size];

		for (int i = 0; i < size; i++) {
			arr[i] = rnd.nextDouble();
		}
		ShellSort<Double> doubleShellSort = new ShellSort<Double>(arr);
		doubleShellSort.getResult();
		return arr;
	}

	public Double[] getDoubleDecArr(int size) {
		Random rnd = new Random();
		Double[] arr = new Double[size];

		for (int i = 0; i < size; i++) {
			arr[i] = rnd.nextDouble();
		}
		ShellSortDec<Double> doubleShellSortDec = new ShellSortDec<Double>(arr);
		doubleShellSortDec.getResult();
		return arr;
	}

	public String[] getStringRndArr(int size) {
		Random rnd = new Random();
		String[] arr = new String[size];

		for (int i = 0; i < size; i++) {
			StringBuilder sb = new StringBuilder();

			for (int j = 0; j < 15;) {
				int num = rnd.nextInt(52) + 65;

				if (!(num >= 91 && num <= 96)) {
					sb.append(String.valueOf((char) num));
					j++;
				}
			}
			arr[i] = sb.toString();
		}
		return arr;
	}

	public String[] getStringIncArr(int size) {
		Random rnd = new Random();
		String[] arr = new String[size];

		for (int i = 0; i < size; i++) {
			StringBuilder sb = new StringBuilder();

			for (int j = 0; j < 15;) {
				int num = rnd.nextInt(52) + 65;

				if (!(num >= 91 && num <= 96)) {
					sb.append(String.valueOf((char) num));
					j++;
				}
			}
			arr[i] = sb.toString();
		}
		ShellSort<String> stringShellSort = new ShellSort<String>(arr);
		stringShellSort.getResult();
		return arr;
	}

	public String[] getStringDecArr(int size) {
		Random rnd = new Random();

		String[] arr = new String[size];

		for (int i = 0; i < size; i++) {
			StringBuilder sb = new StringBuilder();

			for (int j = 0; j < 15;) {
				int num = rnd.nextInt(52) + 65;

				if (!(num >= 91 && num <= 96)) {
					sb.append(String.valueOf((char) num));
					j++;
				}
			}
			arr[i] = sb.toString();
		}
		ShellSortDec<String> stringShellSortDec = new ShellSortDec<String>(arr);
		stringShellSortDec.getResult();
		return arr;
	}

	public Student[] getStudentRndArr(int size) {
		Random rnd = new Random();
		Student[] arr = new Student[size];

		for (int i = 0; i < size; i++) {
			arr[i] = new Student(rnd.nextInt(101), rnd.nextInt(101), rnd.nextInt(101), rnd.nextInt(101),
					rnd.nextInt(101));
		}
		return arr;
	}

	public Student[] getStudentDecArr(int size) {
		Random rnd = new Random();
		Student[] arr = new Student[size];

		for (int i = 0; i < size; i++) {
			arr[i] = new Student(rnd.nextInt(101), rnd.nextInt(101), rnd.nextInt(101), rnd.nextInt(101),
					rnd.nextInt(101));
		}
		ShellSortDec<Student> studentShellSortDec = new ShellSortDec<Student>(arr);
		studentShellSortDec.getResult();
		return arr;
	}

	public Student[] getStudentIncArr(int size) {
		Random rnd = new Random();
		Student[] arr = new Student[size];

		for (int i = 0; i < size; i++) {
			arr[i] = new Student(rnd.nextInt(101), rnd.nextInt(101), rnd.nextInt(101), rnd.nextInt(101),
					rnd.nextInt(101));
		}
		ShellSort<Student> studentShellSort = new ShellSort<Student>(arr);
		studentShellSort.getResult();
		return arr;
	}

	public int[] getHexaDecimalIntRndArr(int size) {
		Random rnd = new Random();
		int[] arr = new int[size];

		for (int i = 0; i < size; i++) {
			arr[i] = rnd.nextInt(65536);
		}
		return arr;
	}

	public Integer[] getIntegerRndArr(int size) {
		Random rnd = new Random();
		Integer[] arr = new Integer[size];

		for (int i = 0; i < size; i++) {
			arr[i] = rnd.nextInt(65536);
		}
		return arr;
	}
}