package dz;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	private static final Scanner SCANNER = new Scanner(System.in);

//    public static void main(String[] args) {
//		int[] arr = {1, 1, 0, 0, 1, 1, 0, 1};
//		array(arr);
//	}
//
//	private static void array(int[] arr) {
//		for(int i = 0; i < arr.length; i++ ){
//			if(arr[i] == 0){
//				arr[i] = 1;
//			} else if(arr[i] == 1){
//				arr[i] = 0;
//			}
//
//		}
//		System.out.print(Arrays.toString(arr));
//	}
//}

//	public static void main(String[] args) {
//		int[] arr;
//		arr = new int [8];
//		arr[0] = 1;
//		sumArray(arr);
//	}
//
//	private static void sumArray(int[] arr) {
//		for(int i = 1; i < arr.length; i++){
//			arr[i] = arr[i - 1] + 3;
//		}
//		System.out.print(Arrays.toString(arr));
//	}

//	public static void main(String[] args) {
//		int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
//		Array(arr);
//	}
//
//	private static void Array(int[] arr) {
//		for(int i = 0; i < arr.length; i++){
//			if(arr[i] < 6){
//				arr[i] = arr[i] * 2;
//			}
//		}
//		System.out.print(Arrays.toString(arr));
//	}
//	public static void main(String[] args) {
//		int[] arr = new int[10];
//		Array(arr);
//	}
//
//	private static void Array(int[] arr) {
//		for(int i = 0; i < arr.length; i++){
//			arr[i] = (int)(Math.random() * 20);
//		}
//		int arrMax = arr[0];
//		int arrMin = arr[0];
//		for(int i = 0; i < arr.length; i++){
//			if(arr[i] < arrMin){
//				arrMin = arr[i];
//			} else if (arr[i] > arrMax){
//				arrMax = arr[i];
//			}
//		}
//		System.out.println(Arrays.toString(arr));
//		System.out.print("Max: " + arrMax + "; Min: " + arrMin);
//	}


//	public static void main(String[] args) {
//		int [][] arr = new int[6][6];
//		arrayTab(arr);
//	}
//
//	private static void arrayTab(int[][] arr) {
//		for(int y = 0; y < arr.length; y++){
//			for(int x = 0; x < arr[y].length; x++){
//				if(x == y) {
//					arr[x][y] = 1;
//				}
//			}
//			System.out.println(Arrays.toString(arr[y]));
//		}
//	}

//	public static void main(String[] args) {
//		int sumLeft;
//		int sumRight;
//		int[] arr = new int [8];
//		for(int i = 0; i < arr.length; i++){
//			arr[i] = (int)(Math.random() * 3);
//		}
//		sumLeft = arr[0];
//		sumRight = arr[1] + arr[2] + arr[3] + arr[4] + arr[5] + arr[6]+ arr[7];
//		for(int i = 1; i < arr.length; i++){
//			if(sumLeft == sumRight){
//				System.out.println("true");
//				break;
//			}
//			sumLeft += arr[i];
//			sumRight -= arr[i];
//		}
//		System.out.print(Arrays.toString(arr));
//	}

	public static void main(String[] args) {
		int[] arr = new int[11];
		for (int i = 0; i < arr.length - 1; i++) {
			arr[i] = (int) (Math.random() * 100);
		}
		System.out.println("Выводим массив.");
		System.out.println(Arrays.toString(arr));
		System.out.println("На сколько переместить?");

		int n;
		n = SCANNER.nextInt();
		int x = n % 11;
		System.out.println("Кратное число от массива: " + x);
		System.out.println("Выводим последовательность изменения массива.");

		if(x < 0){
			for(int a = 0; a < Math.abs(x); a++){
				arr[arr.length - 1] = arr[0];
				for(int b = 0; b < arr.length - 1; b++){
					arr[b] = arr[b+1];
				}
				arr[arr.length - 1] = 0;
				System.out.println(Arrays.toString(arr));
			}
		}else if(x > 0){
			for(int a = 0; a < x; a++) {
				for (int b = 0; b < arr.length - 1; b++) {
					arr[arr.length - 1 - b] = arr[arr.length - 2 - b];
				}
				arr[0] = arr[arr.length - 1];
				arr[arr.length - 1] = 0;
				System.out.println(Arrays.toString(arr));
			}
		}
	}
}
