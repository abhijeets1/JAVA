class mainclass extends Thread {
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(i + " Multithread");
		}
	}
	public static void main(String[] args) {
		mainclass obj = new mainclass();
		obj.start();
		for(int i=0;i<10;i++) {
			System.out.println(i + " Mainthread");
		}
	}
}