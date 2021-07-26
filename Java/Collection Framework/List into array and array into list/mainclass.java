import java.util.*;

class mainclass {

	public static void main(String[] args) {
		
		String s[] = new String[]{"A", "B", "C", "D", "E"};
		LinkedList<String> list = new LinkedList<String>(Arrays.asList(s));

		String s2[] = list.toArray(new String[s.length]);

		s[1] = "Z";

		for(String i: s2) {
			System.out.println(i);
		}
	}
}