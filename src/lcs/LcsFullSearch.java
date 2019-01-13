//package lcs;
//
//public class LcsFullSearch {
//	private String ans;
//	
//	
//	public LcsFullSearch(String x, String y) {
//		int m = x.length();
//		int n = y.length();
//		ans = "";
//		int maxLen = 0, len = 0;
//		String strShort = x;
//		String strLong = y;
//		if(m > n) {
//			strShort = y;
//			strLong = x;
//		}
//		
//		String[] tshort = allCombinations(strShort);
//		String[] tlong = allCombinations(strLong);
//		
//		for(int i = 0 ; i < tshort.length ; i++) {
//			for(int j = 0 ; j < tlong.length ; j++) {
//				len = tshort[i].length();
//				if(tshort[i].equals(tlong[j]) && len > maxLen) {
//					maxLen = len;
//					ans = tshort[i];
//				}
//			}
//		}
//	}
//	
//	public void plus1(int[] arr) {
//		int i = arr.length-1;
//		while(i >= 0 && arr[i] == 1)
//			arr[i--] = 0;
//		if(i >= 0)
//			arr[i] = 1;
//	}
//	
//	public String[] allCombinations(String x) {
//		int n = x.length();
//		int count = n*n-1;
//		String[] list = new String[count];
//		int[] bin = new int [n];
//		
//		for(int i = 0 ; i < count ; i++) {
//			plus1(bin);
//			String t = "";
//			for(int j = 0 ; j < n ; j++) {
//				if(bin[j] == 1)
//					t += x.charAt(j);
//			}
//			list[i] = t;
//		}
//		return list;
//	}
//	
//	
//	public String toString() {
//		return ans;
//	}
//	
//	public static void main(String[] args) {
//		String x = "ahfffbc";
//		String y = "abc";
//		LcsFullSearch xGy = new LcsFullSearch(x,y);
//		System.out.println(xGy);
//	
//		
//	}
//
//}
