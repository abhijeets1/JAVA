import java.util.*;

class mainclass {

	public static void main(String[] args) {
		
		List<String> list1 = new LinkedList<String>();

		list1.add("A");
		list1.add("B");
		list1.add("C");
		list1.add("D");

		list1.subList(1,3).clear(); // clears 1 to 2

		ListIterator<String> lite = list1.listIterator();

		while(lite.hasNext()) {
			System.out.println(lite.next());			
		}

		while(lite.hasPrevious()) {
			System.out.println(lite.previous());
		}

	}

}

/*

OP :-

	A
	D
	D
	A
	
*/