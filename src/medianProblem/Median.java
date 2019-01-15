package medianProblem;

public class Median {

	/**
	 * This function recives an array of integers and finds a number the bigger then
	 * median. O(1).
	 * 
	 * @param a = an array of intigers.
	 * @return = the max value between the first 64 elemts in the array.
	 */
	public static int biggerThenMedian(int a[]) {
		int max = a[0];
		for (int i = 1; i < a.length && i < 63; i += 2) {
			if (a[i] > a[i + 1]) {
				if (a[i] > max)
					max = a[i];
			} else { // a[i+1] > a[i]
				if (a[i + 1] > max)
					max = a[i + 1];
			}
		}
		return max;
	}

	/**
	 * This function recives two arrays of integers(a,b - same length) and create c-
	 * array that contains all the values the bigger then median.
	 * 
	 * O(n)
	 * @param a = an array of intigers.
	 * @param b = an array of intigers.
	 * @return = c- array that contains all the values the bigger then median.
	 */
	public static int[] arrBiggerThenMedian(int a[], int b[]) {
		int n = b.length;
		int c[] = new int[n];
		int i = 0 , j = n-1, k = 0;
		while(k < n) {
			if(a[i] > b[j])
				c[k++] = a[i++];
			else
				c[k++] = b[j--];
		}
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
