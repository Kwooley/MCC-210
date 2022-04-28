import java.util.Random;

public class Main {

	// static void fillUpNumbers(myInteger[] numbers, int N) {
	// Random rd = new Random();
	// for (int i = 0; i < N; i++) {
	// numbers[i] = new myInteger();
	// numbers[i].value = Integer.valueOf(rd.nextInt(100));
	// }
	// }
	static void fillUpNumbers1(myInteger[] numbers, int N) {
		int[] n = { 55, 10, 15, 75, 30, 40, 65, 70, 45, 60 };
		for (int i = 0; i < N; i++) {
			numbers[i] = new myInteger();
			numbers[i].value = n[i];
		}
	}

	static void fillUpNumbers2(myInteger[] numbers, int N) {
		int[] n = { 25, 10, 15, 35, 5, 80, 55, 50, 65, 90 };
		for (int i = 0; i < N; i++) {
			numbers[i] = new myInteger();
			numbers[i].value = n[i];
		}
	}

	static void printNumbers(myInteger[] numbers, int N) {
		for (int i = 0; i < N; i++)
			System.out.print(numbers[i] + "\t");
		System.out.println();
	}

	static void selectionSort(myInteger[] numbers, int N) {
		for (int i = 0; i < N - 1; i++) {
			int idx = findMin(numbers, i, N);
			swap(numbers[i], numbers[idx]);
			// printNumbers(numbers, N);
		}
	}

	static void swap(myInteger s1, myInteger s2) {
		int tmp;
		tmp = s1.value;
		s1.value = s2.value;
		s2.value = tmp;
	}

	static int findMin(myInteger[] n, int s, int N) {
		int min;
		int idx = 0;
		// int idx = s;
		min = n[s].value;
		for (int i = s + 1; i < N; i++) {
			if (n[i].value < min) {
				min = n[i].value;
				idx = i;
			}
		}
		return idx;
	}

	public static void main(String[] args) {
		final int N = 10;
		myInteger[] numbers = new myInteger[N];

		fillUpNumbers1(numbers, N);
		printNumbers(numbers, N);
		selectionSort(numbers, N);
		printNumbers(numbers, N);
	}
}