//package LIS;
//
//public class LISFullSearch {
//
//	public static int[] plus1(int[] arr) {
//		int i = arr.length-1;
//		while (i >= 0 && arr[i] == 1)
//			arr[i--] = 0;
//		if (i >= 0)
//			arr[i] = 1;
//		return arr;
//	}
//
//	public static int[][] allCombinations(int[] x) {
//		int count = x.length * x.length;
//		int[][] list = new int[count][];
//		int[] bin = new int[x.length];
//		int k = 0;
//		for (int i = 0; i < count; i++) {
//			bin = plus1(bin);
//			int realLength = lenReal(bin);
//			int[] t = new int[realLength];
//			for (int j = 0; j < realLength; j++) {
//				if (bin[j] == 1)
//					t[k++] = x[j];
//			}
//			list[i] = t;
//		}
//		return list;
//	}
//
//	public static int lenReal(int[] arr) {
//		int res = 0;
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] == 1)
//				res++;
//		}
//		return res;
//	}
//
//	public static int[][] buildIncreasingMatrix(int[][] mat) {
//		int[][] res = new int[mat.length][];
//		boolean flag = true;
//		int k = 0;
//		for (int i = 0; i < mat.length; i++) {
//			for (int j = 1; j < mat[i].length; j++) {
//				if (mat[i][j] < mat[i][j - 1]) {
//					flag = false;
//					break;
//				}
//
//			}
//			if (flag)
//				res[k++] = mat[i];
//			flag = true;
//		}
//		int[][] res1 = new int[--k][];
//		for(int i = 0 ; i < k ; i++)
//			res1[i] = res[i];
//		
//		return res1;
//	}
//	
//	public static int maxLength(int[][]mat) {
//		int res = 1, len = 0;
//		for(int i = 0 ; i < mat.length ; i++) {
//			len = mat[i].length;
//			if(len > res)
//				res = len;
//		}
//		return res;
//	}
//	
//	public static int[][] LIS(int[][]mat, int len){
//		int[][] res = new int [mat.length][];
//		int k = 0;
//		for(int i = 0 ; i < mat.length ; i++) {
//			if(mat[i].length == len)
//				res[k++] = mat[i];
//		}
//		int[][] lis = new int [k][];
//		for(int i = 0 ; i < k ; i++) {
//			lis[i] = res[i];
//		}
//		return lis;
//	}
//	
//	public static void printIntMatrix(int[][] mat){
//		for (int i = 0; i < mat.length ; i++) {
//			for (int j = 0; j < mat[i].length ; j++) {
//				System.out.print(mat[i][j] + ", ");
//			}
//			System.out.println();
//		}
//	}
//
//	public static void main(String[] args) {
//		int[] arr = {29, 6, 14, 31, 39, 78, 63, 50, 13, 64, 61, 62, 19, 64, 20, 70, 43, 84, 35, 98};
//		int mat[][] = allCombinations(arr);
//		int incMat[][] = buildIncreasingMatrix(mat);
//		int max = maxLength(incMat);
//		int lis[][] = LIS(incMat, max);
//		printIntMatrix(lis);
//	}
//
//}
