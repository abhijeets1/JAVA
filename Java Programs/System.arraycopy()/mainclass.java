class mainclass {

	public static void main(String[] args) {
		
		int arr1[] = new int[]{1, 2, 3, 4, 5};
		int arr2[] = new int[arr1.length];

		System.arraycopy(arr1, 0, arr2, 0, arr1.length);

		for(int i: arr2) {
			System.out.println(i);
		}

	}

}