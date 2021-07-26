import java.util.Arrays;

class mainclass {
	public static void main(String[] args) {

		int arr[] = fun(new int[]{1, 2, 3, 4});

		for(int i:arr) {
			System.out.println(i);
		}

	}

	static int[] fun(int nums[]) {

		// Arrays.fill(array, start, start + poss, value);
		Arrays.fill(nums, 0, 0 + 4, 300);

        return nums;
	}
}