package matrixOfOne;

public class MaxRecOfOne {

	public static int fullSearch(int mat[][]) {
		int row = mat.length;
		int col = mat[0].length;
		int maxArea = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (mat[i][j] == 1) {
					for (int p = i; p < row; p++) {
						for (int q = j; q < col; q++) {
							int area = checkFor_1(mat, i, j, p, q);
							if (maxArea < area)
								maxArea = area;
						}
					}
				}
			}
		}
		return maxArea;
	}

	private static int checkFor_1(int[][] mat, int i, int j, int p, int q) {
		boolean flag = true;
		int ans = 0;
		for (int m = i; m <= p && flag; m++) {
			for (int n = j; n <= q && flag; n++) {
				if (mat[m][n] == 0)
					flag = false;
			}
		}
		if (flag) {
			ans = (p - i + 1) * (q - j + 1);
		}
		return ans;
	}

	public static void main(String[] args) {
		int mat[][] = { { 1, 0, 0, 1, 1, 1 }, { 1, 0, 1, 1, 0, 1 }, { 0, 1, 1, 1, 1, 1 }, { 0, 0, 1, 1, 1, 1 } };
		System.out.println(fullSearch(mat));

	}

}
