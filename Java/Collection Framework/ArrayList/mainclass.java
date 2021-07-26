import java.util.*;

class mainclass {

	static List<String> list1;
	public static void main(String[] args) {

		list1 = new ArrayList<String>();
		list1.add("A");
		list1.add("B");
		list1.add("C");
		list1.add("D");
		list1.add("E");																								
		list1.add("F");

		// list1.clear();

		Iterator<String> ite = list1.iterator();
		int size = list1.size();
		while(ite.hasNext()) { // for(int i=0; i<size; ++i)

			System.out.println(ite.hasNext() + "\t" + ite.next());
		}

		ListIterator<String> revite = list1.listIterator();
		while(revite.hasPrevious()) {

			System.out.println(revite.hasPrevious() + "\t" + revite.previous());
		}
	}

	public static void editList(List<String> list) {

		List<String> listTemp = new ArrayList<String>();

		listTemp.add("C");
		listTemp.add("D");

		Iterator<String> it = list.iterator();

		while(it.hasNext()) {
			if(listTemp.contains(it.next())) {
				it.remove();
			}
		}
	}

	public static void printList(List<String> list) {

		for(int i = 0; i<list.size(); ++i) {
			System.out.println(list.get(i));
		}

	}

}