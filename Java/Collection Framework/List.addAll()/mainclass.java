import java.util.*;

class mainclass {

	public static void main(String[] args) {
		
		List<String> list1 = new ArrayList();
		list1.add("A");
		list1.add("B");
		list1.add("C");

		List<String> list2 = new ArrayList();
		list2.addAll(list1);
		list2.add("D");

		System.out.println(list1);
		System.out.println(list2);
	}

}