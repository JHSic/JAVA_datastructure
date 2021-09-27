import java.util.ArrayList;
import java.util.Scanner;

public class SortProgram {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		ArrayCreator ac = new ArrayCreator();
		
		boolean flag = true;
		while(flag) {
			mainMenu();
			
			int mainInsert = s.nextInt();
			int sortType;
			int dataType;
			int size;
			switch(mainInsert) {
			case 1:
				System.out.println("\nArray Insertion Sort");
				sortTypeMenu();
				
				sortType = s.nextInt();
				switch(sortType) {
				case 1:
					System.out.println("\nRandom");
					
					dataTypeMenu();
					dataType = s.nextInt();
					
					sizeMenu();
					size = selectSize(s.nextInt());
					switch(dataType) {
					case 1:
						Integer[] iArr = ac.getIntRndArr(size);
						InsertionSort<Integer> intInSort = new InsertionSort<Integer>(iArr);
						intInSort.showResult("Array");
						break;
					case 2:
						Double[] dArr = ac.getDoubleRndArr(size);
						InsertionSort<Double> doubleInSort = new InsertionSort<Double>(dArr);
						doubleInSort.showResult("Array");
						break;
					case 3:
						String[] sArr = ac.getStringRndArr(size);
						InsertionSort<String> stringInSort = new InsertionSort<String>(sArr);
						stringInSort.showResult("Array");
						break;
					case 4:
						Student[] studentArr = ac.getStudentRndArr(size);
						InsertionSort<Student> studentInSort = new InsertionSort<Student>(studentArr);
						studentInSort.showResult("Array");
						break;
					}
					break;
				case 2:
					System.out.println("\nIncrease");
					
					dataTypeMenu();
					dataType = s.nextInt();
					
					sizeMenu();
					size = selectSize(s.nextInt());
					switch(dataType) {
					case 1:
						Integer[] iArr = ac.getIntIncArr(size);
						InsertionSort<Integer> intInSort = new InsertionSort<Integer>(iArr);
						intInSort.showResult("Array");
						break;
					case 2:
						Double[] dArr = ac.getDoubleIncArr(size);
						InsertionSort<Double> doubleInSort = new InsertionSort<Double>(dArr);
						doubleInSort.showResult("Array");
						break;
					case 3:
						String[] sArr = ac.getStringIncArr(size);
						InsertionSort<String> stringInSort = new InsertionSort<String>(sArr);
						stringInSort.showResult("Array");
						break;
					case 4:
						Student[] studentArr = ac.getStudentIncArr(size);
						InsertionSort<Student> studentInSort = new InsertionSort<Student>(studentArr);
						studentInSort.showResult("Array");
						break;
					}
					break;
				case 3:
					System.out.println("\nDecrease");

					dataTypeMenu();
					dataType = s.nextInt();

					sizeMenu();
					size = selectSize(s.nextInt());
					switch (dataType) {
					case 1:
						Integer[] iArr = ac.getIntDecArr(size);
						InsertionSort<Integer> intInSort = new InsertionSort<Integer>(iArr);
						intInSort.showResult("Array");
						break;
					case 2:
						Double[] dArr = ac.getDoubleDecArr(size);
						InsertionSort<Double> doubleInSort = new InsertionSort<Double>(dArr);
						doubleInSort.showResult("Array");
						break;
					case 3:
						String[] sArr = ac.getStringDecArr(size);
						InsertionSort<String> stringInSort = new InsertionSort<String>(sArr);
						stringInSort.showResult("Array");
						break;
					case 4:
						Student[] studentArr = ac.getStudentDecArr(size);
						InsertionSort<Student> studentInSort = new InsertionSort<Student>(studentArr);
						studentInSort.showResult("Array");
						break;
					}
					break;
				}
				break;
			case 2:
				System.out.println("\nBinarySearch Insertion Sort");
				sortTypeMenu();
				
				sortType = s.nextInt();
				switch(sortType) {
				case 1:
					System.out.println("\nRandom");
					
					dataTypeMenu();
					dataType = s.nextInt();
					
					sizeMenu();
					size = selectSize(s.nextInt());
					switch(dataType) {
					case 1:
						Integer[] iArr = ac.getIntRndArr(size);
						InsertionSort<Integer> intInSort = new InsertionSort<Integer>(iArr);
						intInSort.showResult("BinarySearch");
						break;
					case 2:
						Double[] dArr = ac.getDoubleRndArr(size);
						InsertionSort<Double> doubleInSort = new InsertionSort<Double>(dArr);
						doubleInSort.showResult("BinarySearch");
						break;
					case 3:
						String[] sArr = ac.getStringRndArr(size);
						InsertionSort<String> stringInSort = new InsertionSort<String>(sArr);
						stringInSort.showResult("BinarySearch");
						break;
					case 4:
						Student[] studentArr = ac.getStudentRndArr(size);
						InsertionSort<Student> studentInSort = new InsertionSort<Student>(studentArr);
						studentInSort.showResult("BinarySearch");
						break;
					}
					break;
				case 2:
					System.out.println("\nIncrease");
					
					dataTypeMenu();
					dataType = s.nextInt();
					
					sizeMenu();
					size = selectSize(s.nextInt());
					switch(dataType) {
					case 1:
						Integer[] iArr = ac.getIntIncArr(size);
						InsertionSort<Integer> intInSort = new InsertionSort<Integer>(iArr);
						intInSort.showResult("BinarySearch");
						break;
					case 2:
						Double[] dArr = ac.getDoubleIncArr(size);
						InsertionSort<Double> doubleInSort = new InsertionSort<Double>(dArr);
						doubleInSort.showResult("BinarySearch");
						break;
					case 3:
						String[] sArr = ac.getStringIncArr(size);
						InsertionSort<String> stringInSort = new InsertionSort<String>(sArr);
						stringInSort.showResult("BinarySearch");
						break;
					case 4:
						Student[] studentArr = ac.getStudentIncArr(size);
						InsertionSort<Student> studentInSort = new InsertionSort<Student>(studentArr);
						studentInSort.showResult("BinarySearch");
						break;
					}
					break;
				case 3:
					System.out.println("\nDecrease");

					dataTypeMenu();
					dataType = s.nextInt();

					sizeMenu();
					size = selectSize(s.nextInt());
					switch (dataType) {
					case 1:
						Integer[] iArr = ac.getIntDecArr(size);
						InsertionSort<Integer> intInSort = new InsertionSort<Integer>(iArr);
						intInSort.showResult("BinarySearch");
						break;
					case 2:
						Double[] dArr = ac.getDoubleDecArr(size);
						InsertionSort<Double> doubleInSort = new InsertionSort<Double>(dArr);
						doubleInSort.showResult("BinarySearch");
						break;
					case 3:
						String[] sArr = ac.getStringDecArr(size);
						InsertionSort<String> stringInSort = new InsertionSort<String>(sArr);
						stringInSort.showResult("BinarySearch");
						break;
					case 4:
						Student[] studentArr = ac.getStudentDecArr(size);
						InsertionSort<Student> studentInSort = new InsertionSort<Student>(studentArr);
						studentInSort.showResult("BinarySearch");
						break;
					}
					break;
				}
				break;
			case 3:
				System.out.println("\nShell Sort(Shell Size = 4");
				sortTypeMenu();
				
				sortType = s.nextInt();
				switch(sortType) {
				case 1:
					System.out.println("\nRandom");
					
					dataTypeMenu();
					dataType = s.nextInt();
					
					sizeMenu();
					size = selectSize(s.nextInt());
					switch(dataType) {
					case 1:
						Integer[] iArr = ac.getIntRndArr(size);
						ShellSort<Integer> intShellSort = new ShellSort<Integer>(iArr);
						intShellSort.showResult();
						break;
					case 2:
						Double[] dArr = ac.getDoubleRndArr(size);
						ShellSort<Double> doubleShellSort = new ShellSort<Double>(dArr);
						doubleShellSort.showResult();
						break;
					case 3:
						String[] sArr = ac.getStringRndArr(size);
						ShellSort<String> stringShellSort = new ShellSort<String>(sArr);
						stringShellSort.showResult();
						break;
					case 4:
						Student[] studentArr = ac.getStudentRndArr(size);
						ShellSort<Student> studentShellSort = new ShellSort<Student>(studentArr);
						studentShellSort.showResult();
						break;
					}
					break;
				case 2:
					System.out.println("\nIncrease");
					
					dataTypeMenu();
					dataType = s.nextInt();
					
					sizeMenu();
					size = selectSize(s.nextInt());
					switch(dataType) {
					case 1:
						Integer[] iArr = ac.getIntIncArr(size);
						ShellSort<Integer> intShellSort = new ShellSort<Integer>(iArr);
						intShellSort.showResult();
						break;
					case 2:
						Double[] dArr = ac.getDoubleIncArr(size);
						ShellSort<Double> doubleShellSort = new ShellSort<Double>(dArr);
						doubleShellSort.showResult();
						break;
					case 3:
						String[] sArr = ac.getStringIncArr(size);
						ShellSort<String> stringShellSort = new ShellSort<String>(sArr);
						stringShellSort.showResult();
						break;
					case 4:
						Student[] studentArr = ac.getStudentIncArr(size);
						ShellSort<Student> studentShellSort = new ShellSort<Student>(studentArr);
						studentShellSort.showResult();
						break;
					}
					break;
				case 3:
					System.out.println("\nDecrease");

					dataTypeMenu();
					dataType = s.nextInt();

					sizeMenu();
					size = selectSize(s.nextInt());
					switch (dataType) {
					case 1:
						Integer[] iArr = ac.getIntDecArr(size);
						ShellSort<Integer> intShellSort = new ShellSort<Integer>(iArr);
						intShellSort.showResult();
						break;
					case 2:
						Double[] dArr = ac.getDoubleDecArr(size);
						ShellSort<Double> doubleShellSort = new ShellSort<Double>(dArr);
						doubleShellSort.showResult();
						break;
					case 3:
						String[] sArr = ac.getStringDecArr(size);
						ShellSort<String> stringShellSort = new ShellSort<String>(sArr);
						stringShellSort.showResult();
						break;
					case 4:
						Student[] studentArr = ac.getStudentDecArr(size);
						ShellSort<Student> studentShellSort = new ShellSort<Student>(studentArr);
						studentShellSort.showResult();
						break;
					}
					break;
				}
				break;
			case 4:
				System.out.println("\nRecursiveQuickSort(first pivot)");
				sortTypeMenu();
				
				sortType = s.nextInt();
				switch(sortType) {
				case 1:
					System.out.println("\nRandom");
					
					dataTypeMenu();
					dataType = s.nextInt();
					
					sizeMenu();
					size = selectSize(s.nextInt());
					switch(dataType) {
					case 1:
						Integer[] iArr = ac.getIntRndArr(size);
						QuickSort<Integer> intQuickSort = new QuickSort<Integer>(iArr);
						intQuickSort.showResult("first");
						break;
					case 2:
						Double[] dArr = ac.getDoubleRndArr(size);
						QuickSort<Double> doubleQuickSort = new QuickSort<Double>(dArr);
						doubleQuickSort.showResult("first");
						break;
					case 3:
						String[] sArr = ac.getStringRndArr(size);
						QuickSort<String> stringQuickSort = new QuickSort<String>(sArr);
						stringQuickSort.showResult("first");
						break;
					case 4:
						Student[] studentArr = ac.getStudentRndArr(size);
						QuickSort<Student> studentQuickSort = new QuickSort<Student>(studentArr);
						studentQuickSort.showResult("first");
						break;
					}
					break;
				case 2:
					System.out.println("\nIncrease");
					
					dataTypeMenu();
					dataType = s.nextInt();
					
					sizeMenu();
					size = selectSize(s.nextInt());
					switch(dataType) {
					case 1:
						Integer[] iArr = ac.getIntIncArr(size);
						QuickSort<Integer> intQuickSort = new QuickSort<Integer>(iArr);
						intQuickSort.showResult("first");
						break;
					case 2:
						Double[] dArr = ac.getDoubleIncArr(size);
						QuickSort<Double> doubleQuickSort = new QuickSort<Double>(dArr);
						doubleQuickSort.showResult("first");
						break;
					case 3:
						String[] sArr = ac.getStringIncArr(size);
						QuickSort<String> stringQuickSort = new QuickSort<String>(sArr);
						stringQuickSort.showResult("first");
						break;
					case 4:
						Student[] studentArr = ac.getStudentIncArr(size);
						QuickSort<Student> studentQuickSort = new QuickSort<Student>(studentArr);
						studentQuickSort.showResult("first");
						break;
					}
					break;
				case 3:
					System.out.println("\nDecrease");

					dataTypeMenu();
					dataType = s.nextInt();

					sizeMenu();
					size = selectSize(s.nextInt());
					switch (dataType) {
					case 1:
						Integer[] iArr = ac.getIntDecArr(size);
						QuickSort<Integer> intQuickSort = new QuickSort<Integer>(iArr);
						intQuickSort.showResult("first");
						break;
					case 2:
						Double[] dArr = ac.getDoubleDecArr(size);
						QuickSort<Double> doubleQuickSort = new QuickSort<Double>(dArr);
						doubleQuickSort.showResult("first");
						break;
					case 3:
						String[] sArr = ac.getStringDecArr(size);
						QuickSort<String> stringQuickSort = new QuickSort<String>(sArr);
						stringQuickSort.showResult("first");
						break;
					case 4:
						Student[] studentArr = ac.getStudentDecArr(size);
						QuickSort<Student> studentQuickSort = new QuickSort<Student>(studentArr);
						studentQuickSort.showResult("first");
						break;
					}
					break;
				}
				break;
			case 5:
				System.out.println("\nRecursiveQuickSort(Median-of-3)");
				sortTypeMenu();
				
				sortType = s.nextInt();
				switch(sortType) {
				case 1:
					System.out.println("\nRandom");
					
					dataTypeMenu();
					dataType = s.nextInt();
					
					sizeMenu();
					size = selectSize(s.nextInt());
					switch(dataType) {
					case 1:
						Integer[] iArr = ac.getIntRndArr(size);
						QuickSort<Integer> intQuickSort = new QuickSort<Integer>(iArr);
						intQuickSort.showResult("median-of-3");
						break;
					case 2:
						Double[] dArr = ac.getDoubleRndArr(size);
						QuickSort<Double> doubleQuickSort = new QuickSort<Double>(dArr);
						doubleQuickSort.showResult("median-of-3");
						break;
					case 3:
						String[] sArr = ac.getStringRndArr(size);
						QuickSort<String> stringQuickSort = new QuickSort<String>(sArr);
						stringQuickSort.showResult("median-of-3");
						break;
					case 4:
						Student[] studentArr = ac.getStudentRndArr(size);
						QuickSort<Student> studentQuickSort = new QuickSort<Student>(studentArr);
						studentQuickSort.showResult("median-of-3");
						break;
					}
					break;
				case 2:
					System.out.println("\nIncrease");
					
					dataTypeMenu();
					dataType = s.nextInt();
					
					sizeMenu();
					size = selectSize(s.nextInt());
					switch(dataType) {
					case 1:
						Integer[] iArr = ac.getIntIncArr(size);
						QuickSort<Integer> intQuickSort = new QuickSort<Integer>(iArr);
						intQuickSort.showResult("median-of-3");
						break;
					case 2:
						Double[] dArr = ac.getDoubleIncArr(size);
						QuickSort<Double> doubleQuickSort = new QuickSort<Double>(dArr);
						doubleQuickSort.showResult("median-of-3");
						break;
					case 3:
						String[] sArr = ac.getStringIncArr(size);
						QuickSort<String> stringQuickSort = new QuickSort<String>(sArr);
						stringQuickSort.showResult("median-of-3");
						break;
					case 4:
						Student[] studentArr = ac.getStudentIncArr(size);
						QuickSort<Student> studentQuickSort = new QuickSort<Student>(studentArr);
						studentQuickSort.showResult("median-of-3");
						break;
					}
					break;
				case 3:
					System.out.println("\nDecrease");

					dataTypeMenu();
					dataType = s.nextInt();

					sizeMenu();
					size = selectSize(s.nextInt());
					switch (dataType) {
					case 1:
						Integer[] iArr = ac.getIntDecArr(size);
						QuickSort<Integer> intQuickSort = new QuickSort<Integer>(iArr);
						intQuickSort.showResult("median-of-3");
						break;
					case 2:
						Double[] dArr = ac.getDoubleDecArr(size);
						QuickSort<Double> doubleQuickSort = new QuickSort<Double>(dArr);
						doubleQuickSort.showResult("median-of-3");
						break;
					case 3:
						String[] sArr = ac.getStringDecArr(size);
						QuickSort<String> stringQuickSort = new QuickSort<String>(sArr);
						stringQuickSort.showResult("median-of-3");
						break;
					case 4:
						Student[] studentArr = ac.getStudentDecArr(size);
						QuickSort<Student> studentQuickSort = new QuickSort<Student>(studentArr);
						studentQuickSort.showResult("median-of-3");
						break;
					}
					break;
				}
				break;
			case 6:
				System.out.println("\nRecursiveMergeSort");
				sortTypeMenu();
				
				sortType = s.nextInt();
				switch(sortType) {
				case 1:
					System.out.println("\nRandom");
					
					dataTypeMenu();
					dataType = s.nextInt();
					
					sizeMenu();
					size = selectSize(s.nextInt());
					switch(dataType) {
					case 1:
						Integer[] iArr = ac.getIntRndArr(size);
						MergeSort<Integer> intMergeSort = new MergeSort<Integer>(iArr);
						intMergeSort.showResult("recursive");
						break;
					case 2:
						Double[] dArr = ac.getDoubleRndArr(size);
						MergeSort<Double> doubleMergeSort = new MergeSort<Double>(dArr);
						doubleMergeSort.showResult("recursive");
						break;
					case 3:
						String[] sArr = ac.getStringRndArr(size);
						MergeSort<String> stringMergeSort = new MergeSort<String>(sArr);
						stringMergeSort.showResult("recursive");
						break;
					case 4:
						Student[] studentArr = ac.getStudentRndArr(size);
						MergeSort<Student> studentMergeSort = new MergeSort<Student>(studentArr);
						studentMergeSort.showResult("recursive");
						break;
					}
					break;
				case 2:
					System.out.println("\nIncrease");
					
					dataTypeMenu();
					dataType = s.nextInt();
					
					sizeMenu();
					size = selectSize(s.nextInt());
					switch(dataType) {
					case 1:
						Integer[] iArr = ac.getIntIncArr(size);
						MergeSort<Integer> intMergeSort = new MergeSort<Integer>(iArr);
						intMergeSort.showResult("recursive");
						break;
					case 2:
						Double[] dArr = ac.getDoubleIncArr(size);
						MergeSort<Double> doubleMergeSort = new MergeSort<Double>(dArr);
						doubleMergeSort.showResult("recursive");
						break;
					case 3:
						String[] sArr = ac.getStringIncArr(size);
						MergeSort<String> stringMergeSort = new MergeSort<String>(sArr);
						stringMergeSort.showResult("recursive");
						break;
					case 4:
						Student[] studentArr = ac.getStudentIncArr(size);
						MergeSort<Student> studentMergeSort = new MergeSort<Student>(studentArr);
						studentMergeSort.showResult("recursive");
						break;
					}
					break;
				case 3:
					System.out.println("\nDecrease");

					dataTypeMenu();
					dataType = s.nextInt();

					sizeMenu();
					size = selectSize(s.nextInt());
					switch (dataType) {
					case 1:
						Integer[] iArr = ac.getIntDecArr(size);
						MergeSort<Integer> intMergeSort = new MergeSort<Integer>(iArr);
						intMergeSort.showResult("recursive");
						break;
					case 2:
						Double[] dArr = ac.getDoubleDecArr(size);
						MergeSort<Double> doubleMergeSort = new MergeSort<Double>(dArr);
						doubleMergeSort.showResult("recursive");
						break;
					case 3:
						String[] sArr = ac.getStringDecArr(size);
						MergeSort<String> stringMergeSort = new MergeSort<String>(sArr);
						stringMergeSort.showResult("recursive");
						break;
					case 4:
						Student[] studentArr = ac.getStudentDecArr(size);
						MergeSort<Student> studentMergeSort = new MergeSort<Student>(studentArr);
						studentMergeSort.showResult("recursive");
						break;
					}
					break;
				}
				break;
			case 7:
				System.out.println("\nIterativeMergeSort");
				sortTypeMenu();
				
				sortType = s.nextInt();
				switch(sortType) {
				case 1:
					System.out.println("\nRandom");
					
					dataTypeMenu();
					dataType = s.nextInt();
					
					sizeMenu();
					size = selectSize(s.nextInt());
					switch(dataType) {
					case 1:
						Integer[] iArr = ac.getIntRndArr(size);
						MergeSort<Integer> intMergeSort = new MergeSort<Integer>(iArr);
						intMergeSort.showResult("iterative");
						break;
					case 2:
						Double[] dArr = ac.getDoubleRndArr(size);
						MergeSort<Double> doubleMergeSort = new MergeSort<Double>(dArr);
						doubleMergeSort.showResult("iterative");
						break;
					case 3:
						String[] sArr = ac.getStringRndArr(size);
						MergeSort<String> stringMergeSort = new MergeSort<String>(sArr);
						stringMergeSort.showResult("iterative");
						break;
					case 4:
						Student[] studentArr = ac.getStudentRndArr(size);
						MergeSort<Student> studentMergeSort = new MergeSort<Student>(studentArr);
						studentMergeSort.showResult("iterative");
						break;
					}
					break;
				case 2:
					System.out.println("\nIncrease");
					
					dataTypeMenu();
					dataType = s.nextInt();
					
					sizeMenu();
					size = selectSize(s.nextInt());
					switch(dataType) {
					case 1:
						Integer[] iArr = ac.getIntIncArr(size);
						MergeSort<Integer> intMergeSort = new MergeSort<Integer>(iArr);
						intMergeSort.showResult("iterative");
						break;
					case 2:
						Double[] dArr = ac.getDoubleIncArr(size);
						MergeSort<Double> doubleMergeSort = new MergeSort<Double>(dArr);
						doubleMergeSort.showResult("iterative");
						break;
					case 3:
						String[] sArr = ac.getStringIncArr(size);
						MergeSort<String> stringMergeSort = new MergeSort<String>(sArr);
						stringMergeSort.showResult("iterative");
						break;
					case 4:
						Student[] studentArr = ac.getStudentIncArr(size);
						MergeSort<Student> studentMergeSort = new MergeSort<Student>(studentArr);
						studentMergeSort.showResult("iterative");
						break;
					}
					break;
				case 3:
					System.out.println("\nDecrease");

					dataTypeMenu();
					dataType = s.nextInt();

					sizeMenu();
					size = selectSize(s.nextInt());
					switch (dataType) {
					case 1:
						Integer[] iArr = ac.getIntDecArr(size);
						MergeSort<Integer> intMergeSort = new MergeSort<Integer>(iArr);
						intMergeSort.showResult("iterative");
						break;
					case 2:
						Double[] dArr = ac.getDoubleDecArr(size);
						MergeSort<Double> doubleMergeSort = new MergeSort<Double>(dArr);
						doubleMergeSort.showResult("iterative");
						break;
					case 3:
						String[] sArr = ac.getStringDecArr(size);
						MergeSort<String> stringMergeSort = new MergeSort<String>(sArr);
						stringMergeSort.showResult("iterative");
						break;
					case 4:
						Student[] studentArr = ac.getStudentDecArr(size);
						MergeSort<Student> studentMergeSort = new MergeSort<Student>(studentArr);
						studentMergeSort.showResult("iterative");
						break;
					}
					break;
				}
				break;
			case 8:
				System.out.println("\nNaturalMergeSort");
				sortTypeMenu();
				
				sortType = s.nextInt();
				switch(sortType) {
				case 1:
					System.out.println("\nRandom");
					
					dataTypeMenu();
					dataType = s.nextInt();
					
					sizeMenu();
					size = selectSize(s.nextInt());
					switch(dataType) {
					case 1:
						Integer[] iArr = ac.getIntRndArr(size);
						MergeSort<Integer> intMergeSort = new MergeSort<Integer>(iArr);
						intMergeSort.showResult("natural");
						break;
					case 2:
						Double[] dArr = ac.getDoubleRndArr(size);
						MergeSort<Double> doubleMergeSort = new MergeSort<Double>(dArr);
						doubleMergeSort.showResult("natural");
						break;
					case 3:
						String[] sArr = ac.getStringRndArr(size);
						MergeSort<String> stringMergeSort = new MergeSort<String>(sArr);
						stringMergeSort.showResult("natural");
						break;
					case 4:
						Student[] studentArr = ac.getStudentRndArr(size);
						MergeSort<Student> studentMergeSort = new MergeSort<Student>(studentArr);
						studentMergeSort.showResult("natural");
						break;
					}
					break;
				case 2:
					System.out.println("\nIncrease");
					
					dataTypeMenu();
					dataType = s.nextInt();
					
					sizeMenu();
					size = selectSize(s.nextInt());
					switch(dataType) {
					case 1:
						Integer[] iArr = ac.getIntIncArr(size);
						MergeSort<Integer> intMergeSort = new MergeSort<Integer>(iArr);
						intMergeSort.showResult("natural");
						break;
					case 2:
						Double[] dArr = ac.getDoubleIncArr(size);
						MergeSort<Double> doubleMergeSort = new MergeSort<Double>(dArr);
						doubleMergeSort.showResult("natural");
						break;
					case 3:
						String[] sArr = ac.getStringIncArr(size);
						MergeSort<String> stringMergeSort = new MergeSort<String>(sArr);
						stringMergeSort.showResult("natural");
						break;
					case 4:
						Student[] studentArr = ac.getStudentIncArr(size);
						MergeSort<Student> studentMergeSort = new MergeSort<Student>(studentArr);
						studentMergeSort.showResult("natural");
						break;
					}
					break;
				case 3:
					System.out.println("\nDecrease");

					dataTypeMenu();
					dataType = s.nextInt();

					sizeMenu();
					size = selectSize(s.nextInt());
					switch (dataType) {
					case 1:
						Integer[] iArr = ac.getIntDecArr(size);
						MergeSort<Integer> intMergeSort = new MergeSort<Integer>(iArr);
						intMergeSort.showResult("natural");
						break;
					case 2:
						Double[] dArr = ac.getDoubleDecArr(size);
						MergeSort<Double> doubleMergeSort = new MergeSort<Double>(dArr);
						doubleMergeSort.showResult("natural");
						break;
					case 3:
						String[] sArr = ac.getStringDecArr(size);
						MergeSort<String> stringMergeSort = new MergeSort<String>(sArr);
						stringMergeSort.showResult("natural");
						break;
					case 4:
						Student[] studentArr = ac.getStudentDecArr(size);
						MergeSort<Student> studentMergeSort = new MergeSort<Student>(studentArr);
						studentMergeSort.showResult("natural");
						break;
					}
					break;
				}
				break;
			case 9:
				System.out.println("\nHeapSort");
				sortTypeMenu();
				
				sortType = s.nextInt();
				switch(sortType) {
				case 1:
					System.out.println("\nRandom");
					
					dataTypeMenu();
					dataType = s.nextInt();
					
					sizeMenu();
					size = selectSize(s.nextInt());
					switch(dataType) {
					case 1:
						Integer[] iArr = ac.getIntRndArr(size);
						HeapSort<Integer> intHeapSort = new HeapSort<Integer>(iArr);
						intHeapSort.showResult();
						break;
					case 2:
						Double[] dArr = ac.getDoubleRndArr(size);
						HeapSort<Double> doubleHeapSort = new HeapSort<Double>(dArr);
						doubleHeapSort.showResult();
						break;
					case 3:
						String[] sArr = ac.getStringRndArr(size);
						HeapSort<String> stringHeapSort = new HeapSort<String>(sArr);
						stringHeapSort.showResult();
						break;
					case 4:
						Student[] studentArr = ac.getStudentRndArr(size);
						HeapSort<Student> studentHeapSort = new HeapSort<Student>(studentArr);
						studentHeapSort.showResult();
						break;
					}
					break;
				case 2:
					System.out.println("\nIncrease");
					
					dataTypeMenu();
					dataType = s.nextInt();
					
					sizeMenu();
					size = selectSize(s.nextInt());
					switch(dataType) {
					case 1:
						Integer[] iArr = ac.getIntIncArr(size);
						HeapSort<Integer> intHeapSort = new HeapSort<Integer>(iArr);
						intHeapSort.showResult();
						break;
					case 2:
						Double[] dArr = ac.getDoubleIncArr(size);
						HeapSort<Double> doubleHeapSort = new HeapSort<Double>(dArr);
						doubleHeapSort.showResult();
						break;
					case 3:
						String[] sArr = ac.getStringIncArr(size);
						HeapSort<String> stringHeapSort = new HeapSort<String>(sArr);
						stringHeapSort.showResult();
						break;
					case 4:
						Student[] studentArr = ac.getStudentIncArr(size);
						HeapSort<Student> studentHeapSort = new HeapSort<Student>(studentArr);
						studentHeapSort.showResult();
						break;
					}
					break;
				case 3:
					System.out.println("\nDecrease");

					dataTypeMenu();
					dataType = s.nextInt();

					sizeMenu();
					size = selectSize(s.nextInt());
					switch (dataType) {
					case 1:
						Integer[] iArr = ac.getIntDecArr(size);
						HeapSort<Integer> intHeapSort = new HeapSort<Integer>(iArr);
						intHeapSort.showResult();
						break;
					case 2:
						Double[] dArr = ac.getDoubleDecArr(size);
						HeapSort<Double> doubleHeapSort = new HeapSort<Double>(dArr);
						doubleHeapSort.showResult();
						break;
					case 3:
						String[] sArr = ac.getStringDecArr(size);
						HeapSort<String> stringHeapSort = new HeapSort<String>(sArr);
						stringHeapSort.showResult();
						break;
					case 4:
						Student[] studentArr = ac.getStudentDecArr(size);
						HeapSort<Student> studentHeapSort = new HeapSort<Student>(studentArr);
						studentHeapSort.showResult();
						break;
					}
					break;
				}
				break;
			case 10:
				System.out.println("\nBubbleSort");
				sortTypeMenu();
				
				sortType = s.nextInt();
				switch(sortType) {
				case 1:
					System.out.println("\nRandom");
					
					dataTypeMenu();
					dataType = s.nextInt();
					
					sizeMenu();
					size = selectSize(s.nextInt());
					switch(dataType) {
					case 1:
						Integer[] iArr = ac.getIntRndArr(size);
						BubbleSort<Integer> intBubbleSort = new BubbleSort<Integer>(iArr);
						intBubbleSort.showResult();
						break;
					case 2:
						Double[] dArr = ac.getDoubleRndArr(size);
						BubbleSort<Double> doubleBubbleSort = new BubbleSort<Double>(dArr);
						doubleBubbleSort.showResult();
						break;
					case 3:
						String[] sArr = ac.getStringRndArr(size);
						BubbleSort<String> stringBubbleSort = new BubbleSort<String>(sArr);
						stringBubbleSort.showResult();
						break;
					case 4:
						Student[] studentArr = ac.getStudentRndArr(size);
						BubbleSort<Student> studentBubbleSort = new BubbleSort<Student>(studentArr);
						studentBubbleSort.showResult();
						break;
					}
					break;
				case 2:
					System.out.println("\nIncrease");
					
					dataTypeMenu();
					dataType = s.nextInt();
					
					sizeMenu();
					size = selectSize(s.nextInt());
					switch(dataType) {
					case 1:
						Integer[] iArr = ac.getIntIncArr(size);
						BubbleSort<Integer> intBubbleSort = new BubbleSort<Integer>(iArr);
						intBubbleSort.showResult();
						break;
					case 2:
						Double[] dArr = ac.getDoubleIncArr(size);
						BubbleSort<Double> doubleBubbleSort = new BubbleSort<Double>(dArr);
						doubleBubbleSort.showResult();
						break;
					case 3:
						String[] sArr = ac.getStringIncArr(size);
						BubbleSort<String> stringBubbleSort = new BubbleSort<String>(sArr);
						stringBubbleSort.showResult();
						break;
					case 4:
						Student[] studentArr = ac.getStudentIncArr(size);
						BubbleSort<Student> studentBubbleSort = new BubbleSort<Student>(studentArr);
						studentBubbleSort.showResult();
						break;
					}
					break;
				case 3:
					System.out.println("\nDecrease");

					dataTypeMenu();
					dataType = s.nextInt();

					sizeMenu();
					size = selectSize(s.nextInt());
					switch (dataType) {
					case 1:
						Integer[] iArr = ac.getIntDecArr(size);
						BubbleSort<Integer> intBubbleSort = new BubbleSort<Integer>(iArr);
						intBubbleSort.showResult();
						break;
					case 2:
						Double[] dArr = ac.getDoubleDecArr(size);
						BubbleSort<Double> doubleBubbleSort = new BubbleSort<Double>(dArr);
						doubleBubbleSort.showResult();
						break;
					case 3:
						String[] sArr = ac.getStringDecArr(size);
						BubbleSort<String> stringBubbleSort = new BubbleSort<String>(sArr);
						stringBubbleSort.showResult();
						break;
					case 4:
						Student[] studentArr = ac.getStudentDecArr(size);
						BubbleSort<Student> studentBubbleSort = new BubbleSort<Student>(studentArr);
						studentBubbleSort.showResult();
						break;
					}
					break;
				}
				break;
			case 11:
				System.out.println("\nSelectionSort");
				sortTypeMenu();
				
				sortType = s.nextInt();
				switch(sortType) {
				case 1:
					System.out.println("\nRandom");
					
					dataTypeMenu();
					dataType = s.nextInt();
					
					sizeMenu();
					size = selectSize(s.nextInt());
					switch(dataType) {
					case 1:
						Integer[] iArr = ac.getIntRndArr(size);
						SelectionSort<Integer> intSelectionSort = new SelectionSort<Integer>(iArr);
						intSelectionSort.showResult();
						break;
					case 2:
						Double[] dArr = ac.getDoubleRndArr(size);
						SelectionSort<Double> doubleSelectionSort = new SelectionSort<Double>(dArr);
						doubleSelectionSort.showResult();
						break;
					case 3:
						String[] sArr = ac.getStringRndArr(size);
						SelectionSort<String> stringSelectionSort = new SelectionSort<String>(sArr);
						stringSelectionSort.showResult();
						break;
					case 4:
						Student[] studentArr = ac.getStudentRndArr(size);
						SelectionSort<Student> studentSelectionSort = new SelectionSort<Student>(studentArr);
						studentSelectionSort.showResult();
						break;
					}
					break;
				case 2:
					System.out.println("\nIncrease");
					
					dataTypeMenu();
					dataType = s.nextInt();
					
					sizeMenu();
					size = selectSize(s.nextInt());
					switch(dataType) {
					case 1:
						Integer[] iArr = ac.getIntIncArr(size);
						SelectionSort<Integer> intSelectionSort = new SelectionSort<Integer>(iArr);
						intSelectionSort.showResult();
						break;
					case 2:
						Double[] dArr = ac.getDoubleIncArr(size);
						SelectionSort<Double> doubleSelectionSort = new SelectionSort<Double>(dArr);
						doubleSelectionSort.showResult();
						break;
					case 3:
						String[] sArr = ac.getStringIncArr(size);
						SelectionSort<String> stringSelectionSort = new SelectionSort<String>(sArr);
						stringSelectionSort.showResult();
						break;
					case 4:
						Student[] studentArr = ac.getStudentIncArr(size);
						SelectionSort<Student> studentSelectionSort = new SelectionSort<Student>(studentArr);
						studentSelectionSort.showResult();
						break;
					}
					break;
				case 3:
					System.out.println("\nDecrease");

					dataTypeMenu();
					dataType = s.nextInt();

					sizeMenu();
					size = selectSize(s.nextInt());
					switch (dataType) {
					case 1:
						Integer[] iArr = ac.getIntDecArr(size);
						SelectionSort<Integer> intSelectionSort = new SelectionSort<Integer>(iArr);
						intSelectionSort.showResult();
						break;
					case 2:
						Double[] dArr = ac.getDoubleDecArr(size);
						SelectionSort<Double> doubleSelectionSort = new SelectionSort<Double>(dArr);
						doubleSelectionSort.showResult();
						break;
					case 3:
						String[] sArr = ac.getStringDecArr(size);
						SelectionSort<String> stringSelectionSort = new SelectionSort<String>(sArr);
						stringSelectionSort.showResult();
						break;
					case 4:
						Student[] studentArr = ac.getStudentDecArr(size);
						SelectionSort<Student> studentSelectionSort = new SelectionSort<Student>(studentArr);
						studentSelectionSort.showResult();
						break;
					}
					break;
				}
				break;
			case 12:
				System.out.println("\nArrays.sort");
				sortTypeMenu();
				
				sortType = s.nextInt();
				switch(sortType) {
				case 1:
					System.out.println("\nRandom");
					
					dataTypeMenu();
					dataType = s.nextInt();
					
					sizeMenu();
					size = selectSize(s.nextInt());
					switch(dataType) {
					case 1:
						Integer[] iArr = ac.getIntRndArr(size);
						ArraysSort<Integer> intArraysSort = new ArraysSort<Integer>(iArr);
						intArraysSort.showResult();
						break;
					case 2:
						Double[] dArr = ac.getDoubleRndArr(size);
						ArraysSort<Double> doubleArraysSort = new ArraysSort<Double>(dArr);
						doubleArraysSort.showResult();
						break;
					case 3:
						String[] sArr = ac.getStringRndArr(size);
						ArraysSort<String> stringArraysSort = new ArraysSort<String>(sArr);
						stringArraysSort.showResult();
						break;
					case 4:
						Student[] studentArr = ac.getStudentRndArr(size);
						ArraysSort<Student> studentArraysSort = new ArraysSort<Student>(studentArr);
						studentArraysSort.showResult();
						break;
					}
					break;
				case 2:
					System.out.println("\nIncrease");
					
					dataTypeMenu();
					dataType = s.nextInt();
					
					sizeMenu();
					size = selectSize(s.nextInt());
					switch(dataType) {
					case 1:
						Integer[] iArr = ac.getIntIncArr(size);
						ArraysSort<Integer> intArraysSort = new ArraysSort<Integer>(iArr);
						intArraysSort.showResult();
						break;
					case 2:
						Double[] dArr = ac.getDoubleIncArr(size);
						ArraysSort<Double> doubleArraysSort = new ArraysSort<Double>(dArr);
						doubleArraysSort.showResult();
						break;
					case 3:
						String[] sArr = ac.getStringIncArr(size);
						ArraysSort<String> stringArraysSort = new ArraysSort<String>(sArr);
						stringArraysSort.showResult();
						break;
					case 4:
						Student[] studentArr = ac.getStudentIncArr(size);
						ArraysSort<Student> studentArraysSort = new ArraysSort<Student>(studentArr);
						studentArraysSort.showResult();
						break;
					}
					break;
				case 3:
					System.out.println("\nDecrease");

					dataTypeMenu();
					dataType = s.nextInt();

					sizeMenu();
					size = selectSize(s.nextInt());
					switch (dataType) {
					case 1:
						Integer[] iArr = ac.getIntDecArr(size);
						ArraysSort<Integer> intArraysSort = new ArraysSort<Integer>(iArr);
						intArraysSort.showResult();
						break;
					case 2:
						Double[] dArr = ac.getDoubleDecArr(size);
						ArraysSort<Double> doubleArraysSort = new ArraysSort<Double>(dArr);
						doubleArraysSort.showResult();
						break;
					case 3:
						String[] sArr = ac.getStringDecArr(size);
						ArraysSort<String> stringArraysSort = new ArraysSort<String>(sArr);
						stringArraysSort.showResult();
						break;
					case 4:
						Student[] studentArr = ac.getStudentDecArr(size);
						ArraysSort<Student> studentArraysSort = new ArraysSort<Student>(studentArr);
						studentArraysSort.showResult();
						break;
					}
					break;
				}
				break;
			case 13:
				System.out.println("\nCollections.sort");
				sortTypeMenu();
				
				sortType = s.nextInt();
				switch(sortType) {
				case 1:
					System.out.println("\nRandom");
					
					dataTypeMenu();
					dataType = s.nextInt();
					
					sizeMenu();
					size = selectSize(s.nextInt());
					switch(dataType) {
					case 1:
						Integer[] iArr = ac.getIntRndArr(size);
						ArrayList<Integer> intList = new ArrayList<Integer>();
						for (int i = 0; i < size; i++) {
							intList.add(iArr[i]);
						}
						CollectionsSort<Integer> intCollectionsSort = new CollectionsSort<Integer>(intList);
						intCollectionsSort.showResult();
						break;
					case 2:
						Double[] dArr = ac.getDoubleRndArr(size);
						ArrayList<Double> doubleList = new ArrayList<Double>();
						for (int i = 0; i < size; i++) {
							doubleList.add(dArr[i]);
						}
						CollectionsSort<Double> doubleCollectionsSort = new CollectionsSort<Double>(doubleList);
						doubleCollectionsSort.showResult();
						break;
					case 3:
						String[] sArr = ac.getStringRndArr(size);
						ArrayList<String> stringList = new ArrayList<String>();
						for (int i = 0; i < size; i++) {
							stringList.add(sArr[i]);
						}
						CollectionsSort<String> stringCollectionsSort = new CollectionsSort<String>(stringList);
						stringCollectionsSort.showResult();
						break;
					case 4:
						Student[] studentArr = ac.getStudentRndArr(size);
						ArrayList<Student> studentList = new ArrayList<Student>();
						for (int i = 0; i < size; i++) {
							studentList.add(studentArr[i]);
						}
						CollectionsSort<Student> studentCollectionsSort = new CollectionsSort<Student>(studentList);
						studentCollectionsSort.showResult();
						break;
					}
					break;
				case 2:
					System.out.println("\nIncrease");
					
					dataTypeMenu();
					dataType = s.nextInt();
					
					sizeMenu();
					size = selectSize(s.nextInt());
					switch(dataType) {
					case 1:
						Integer[] iArr = ac.getIntIncArr(size);
						ArrayList<Integer> intList = new ArrayList<Integer>();
						for (int i = 0; i < size; i++) {
							intList.add(iArr[i]);
						}
						CollectionsSort<Integer> intCollectionsSort = new CollectionsSort<Integer>(intList);
						intCollectionsSort.showResult();
						break;
					case 2:
						Double[] dArr = ac.getDoubleIncArr(size);
						ArrayList<Double> doubleList = new ArrayList<Double>();
						for (int i = 0; i < size; i++) {
							doubleList.add(dArr[i]);
						}
						CollectionsSort<Double> doubleCollectionsSort = new CollectionsSort<Double>(doubleList);
						doubleCollectionsSort.showResult();
						break;
					case 3:
						String[] sArr = ac.getStringIncArr(size);
						ArrayList<String> stringList = new ArrayList<String>();
						for (int i = 0; i < size; i++) {
							stringList.add(sArr[i]);
						}
						CollectionsSort<String> stringCollectionsSort = new CollectionsSort<String>(stringList);
						stringCollectionsSort.showResult();
						break;
					case 4:
						Student[] studentArr = ac.getStudentIncArr(size);
						ArrayList<Student> studentList = new ArrayList<Student>();
						for (int i = 0; i < size; i++) {
							studentList.add(studentArr[i]);
						}
						CollectionsSort<Student> studentCollectionsSort = new CollectionsSort<Student>(studentList);
						studentCollectionsSort.showResult();
						break;
					}
					break;
				case 3:
					System.out.println("\nDecrease");

					dataTypeMenu();
					dataType = s.nextInt();

					sizeMenu();
					size = selectSize(s.nextInt());
					switch (dataType) {
					case 1:
						Integer[] iArr = ac.getIntDecArr(size);
						ArrayList<Integer> intList = new ArrayList<Integer>();
						for (int i = 0; i < size; i++) {
							intList.add(iArr[i]);
						}
						CollectionsSort<Integer> intCollectionsSort = new CollectionsSort<Integer>(intList);
						intCollectionsSort.showResult();
						break;
					case 2:
						Double[] dArr = ac.getDoubleDecArr(size);
						ArrayList<Double> doubleList = new ArrayList<Double>();
						for (int i = 0; i < size; i++) {
							doubleList.add(dArr[i]);
						}
						CollectionsSort<Double> doubleCollectionsSort = new CollectionsSort<Double>(doubleList);
						doubleCollectionsSort.showResult();
						break;
					case 3:
						String[] sArr = ac.getStringDecArr(size);
						ArrayList<String> stringList = new ArrayList<String>();
						for (int i = 0; i < size; i++) {
							stringList.add(sArr[i]);
						}
						CollectionsSort<String> stringCollectionsSort = new CollectionsSort<String>(stringList);
						stringCollectionsSort.showResult();
						break;
					case 4:
						Student[] studentArr = ac.getStudentDecArr(size);
						ArrayList<Student> studentList = new ArrayList<Student>();
						for (int i = 0; i < size; i++) {
							studentList.add(studentArr[i]);
						}
						CollectionsSort<Student> studentCollectionsSort = new CollectionsSort<Student>(studentList);
						studentCollectionsSort.showResult();
						break;
					}
					break;
				}
				break;
			case 14: 
				System.out.println("\nLSD HexadecimalRadix Sort");
				sizeMenu();
				size = selectSize(s.nextInt());
				
				RadixUsingModulo intHexaModulo = new RadixUsingModulo(ac.getHexaDecimalIntRndArr(size));
				intHexaModulo.showResult(16);
				break;
			case 15:
				System.out.println("\nLSD Hexadecimal RadixSort Using Shift, Masking");
				sizeMenu();
				size = selectSize(s.nextInt());

				RadixUsingMaskingAndShift intMSModulo = new RadixUsingMaskingAndShift(ac.getHexaDecimalIntRndArr(size));
				intMSModulo.showResult();
				break;
			case 16:
				System.out.println("\nLSD Decimal RadixSort");
				sizeMenu();
				size = selectSize(s.nextInt());
				
				RadixUsingModulo intModulo = new RadixUsingModulo(ac.getHexaDecimalIntRndArr(size));
				intModulo.showResult(10);
				break;
			case 17:
				System.out.println("\nRecursiveQuickSort(first pivot) - Int Type");
				sizeMenu();
				size = selectSize(s.nextInt());
				
				IntQuickSort iarr = new IntQuickSort(ac.getHexaDecimalIntRndArr(size)); 
				iarr.showResult("median-of-3");
		        break;
			case 18:
				System.out.println("\nExit Program");
				flag = false;
			}
		}
	}
	
	public static void mainMenu() {
		System.out.println("---------------------------------------------------");
		System.out.println("1. Array Insertion Sort");
		System.out.println("2. BinarySearch Insertion Sort");
		System.out.println("3. Shell Sort(Shell Size = 4)");
		System.out.println("4. RecursiveQuickSort(first pivot)");
		System.out.println("5. RecursiveQuickSort(Median-of-3)");
		System.out.println("6. RecursiveMergeSort");
		System.out.println("7. IterativeMergeSort");
		System.out.println("8. NaturalMergeSort");
		System.out.println("9. HeapSort");
		System.out.println("10. BubbleSort");
		System.out.println("11. SelectionSort");
		System.out.println("12. Arrays.sort");
		System.out.println("13. Collections.sort");
		System.out.println("14. LSD Hexadecimal RadixSort");
		System.out.println("15. LSD Hexadecimal RadixSort Using Shift, Masking");
		System.out.println("16. LSD Decimal RadixSort");
		System.out.println("17. RecursiveQuickSort(Median-of-3) - Int Type");
		System.out.println("18. EXIT");
		System.out.print("Choose : ");
	}
	
	public static void sortTypeMenu() {
		System.out.println("---------------------------------------------------");
		System.out.println("1. Random");
		System.out.println("2. Increase");
		System.out.println("3. Decrease");
		System.out.print("Choose : ");
	}
	
	public static void dataTypeMenu() {
		System.out.println("---------------------------------------------------");
		System.out.println("1. Integer");
		System.out.println("2. Double");
		System.out.println("3. String");
		System.out.println("4. Student");
		System.out.print("Choose : ");
	}
	
	public static void sizeMenu() {
		System.out.println("---------------------------------------------------");
		System.out.println("1. 1000");
		System.out.println("2. 5000");
		System.out.println("3. 10000");
		System.out.println("4. 25000");
		System.out.println("5. 50000");
		System.out.println("6. 100000");
		System.out.print("Choose : ");
	}
	
	public static int selectSize(int choiceNum) {
		if(choiceNum == 1) {
			return 1000;
		}
		else if(choiceNum == 2) {
			return 5000;
		}
		else if(choiceNum == 3) {
			return 10000;
		}
		else if(choiceNum == 4) {
			return 25000;
		}
		else if(choiceNum == 5) {
			return 50000;
		}
		else if(choiceNum == 6) {
			return 100000;
		}
		return 0;
	}
}