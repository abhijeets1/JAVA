public class mainclass implements Cloneable {
	
	int a;
	static mainclass obj1, obj2, obj3;

	public static void main(String[] args) throws CloneNotSupportedException {
		obj1 = new mainclass();
		obj1.a = 1;
		obj2 = obj1; // a is 1
		obj3 = (mainclass)obj1.clone(); // a is 1

		obj1.a = 2;
		System.out.println(obj2.a); // a is 2
		System.out.println(obj3.a); // a is 1
	}

	/*public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}*/
}