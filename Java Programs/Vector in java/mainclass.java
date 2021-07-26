import java.util.Vector;
class mainclass {
	static Vector v = new Vector();
	public static void main(String[] args) {
		v.addElement(1);
		v.addElement(1);
		v.addElement(1);
		v.addElement(1);
		v.addElement(1);
		v.addElement(1);

		for(int i = 0;i<v.size();i++) {
			System.out.println(v.elementAt(i));
		}
	}
}