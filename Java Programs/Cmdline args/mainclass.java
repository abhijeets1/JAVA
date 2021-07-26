class mainclass {
	public static void main(String a[]) {
		System.out.println(a[0]);
		// System.out.println(a[1]); // error if only one arg is passed

		for(int i = 0;i<a.length;i++){
			System.out.println(a[i]);			
		}
	}
}