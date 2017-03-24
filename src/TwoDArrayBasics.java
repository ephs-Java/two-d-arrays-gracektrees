import java.util.Random;

public class TwoDArrayBasics {

	public static void main(String[] args) {
		// Create a 3 x 5 array of ints
		int[][] nums = new int [3][5];
		// Fill the array with random numbers using fillRandom
		fillRandom(nums, 1, 100);
		// test each method you create below.
		printArray(nums);
		int rowTotal = sumRow(nums, 0);
		System.out.println(rowTotal);
		int[] theSums = rowSums(nums);
		print(theSums);
		int[] n = new int [3];
		boolean itUnique = unique(n);
		System.out.println(itUnique);
		int targetIndex = target(n, 0);
		System.out.println(targetIndex);
		System.out.println(min(nums));
		System.out.println(max(nums));
	}
	/*
	 * given the lower and upper bounds of the random numbers
	 * fill an array with of random numbers 
	 */
	public static void fillRandom(int[][] nums, int low, int high) {
		Random random = new Random();
		for (int r = 0; r < nums.length; r++) {
			for (int c = 0; c < nums[0].length; c++) {
				nums[r][c] = random.nextInt(high) + low;
			}
		}
	}
	/*
	 * create a method that prints a 2D array
	 */
	public static void printArray(int [][] nums) {
		for (int r = 0; r < nums.length; r++) {
			System.out.print(" { ");
			for (int c = 0; c < nums[0].length; c++) {
				System.out.print(nums[r][c] + ", ");
			}
			System.out.println("} ");
		}
	}
	/*
	 * return the sum of a row (r) in a 2D array (nums)
	 */
	public static int sumRow(int[][] nums, int row) {
		int total = 0;
		for (int c = 0; c < nums[0].length; c++) {
			total = total + nums[row][c];
		}
		return total;
	}
	/*
	 * return an array of row sums of a 2D array (nums)
	 */
	public static int[] rowSums(int[][] nums) {
		int [] sums = new int[nums.length];
		for (int r = 0; r < nums.length; r++) {
			sums[r] = sumRow(nums, r);
		}
		return sums;
	}
	public static void print(int[] n) {
		System.out.print(" { ");
		for (int r = 0; r < n.length; r++) {
			System.out.print(n[r] + ", ");
		}
		System.out.println("}");
	}
	/*
	 * check an 1D array for repeats, return true if all 
	 * elements of the array are unique
	 */
	public static boolean unique(int[] n) {
		for (int r = 0; r < n.length - 1; r++) {
			for (int j = r + 1; j < n.length; j++) {
				if (n[r] == n[j]) {
					return true;
				}
			}
		}
		return false;
	}
	/*
	 * given an array
	 * return the index of the target value, 
	 * return -1 if it is not found
	 */
	public static int target(int[] n, int target) {
		for (int r = 0; r < n.length; r++) {
			if (n[r] == target) {
				return n[r];
			}
		}
		return -1;
	}
	/*
	 * return the min value in a 2D array
	 */
	public static int min(int[][] nums) {
		int m = 100;
		for (int r = 0; r < nums.length; r++){ //find lowest value
			  for (int c = 0; c < nums.length; c++){
				if (nums[r][c] < m) {
					  m = nums[r][c];
				 }
			  }
		}
		return m;
	}
	/*
	 * return the max value in a 2D array
	 */
	public static int max(int[][] nums) {
		int x = 0;
	    for (int row = 1; row < nums.length; row++){ //find highest value
	        for (int col = 1; col < nums.length; col++){
	          if (nums[row][col] > x){
	           x = nums[row][col]; 
	          }
	        }
	      }
	    return x;
	}

}
