class mainclass {
	public static void main(String[] args) {
		Derived obj = new Derived();
		obj.num = 11;
		System.out.println(obj.num);
	}
}

class Base {
	static int num;
}
class Derived extends Base {

} 