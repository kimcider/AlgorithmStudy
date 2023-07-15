package test;

public class test {
	public static void main(String[]args) {
		int[][] ary = {{1,2},{2,3},{3,4}};
		
		int[] temp = ary[1];
		ary[1] = ary[2];
		ary[2] = temp;

		for(int i = 0; i < ary.length; i++) {
			for(int j = 0; j < ary[i].length; j++) {
				System.out.print(ary[i][j] + " ");
			}
			System.out.println();
		}
	}
}
