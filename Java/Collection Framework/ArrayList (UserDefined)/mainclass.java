import java.util.*;

class Packet {

	String name = "";
	String ph_no = "";
	int income = 0;

	Packet(String n, String p, int i) {
		name = n;
		ph_no = p;
		income = i;
	}
}


public class mainclass {

	public static void main(String[] args) {

		Packet p1, p2, p3;
		p1 = new Packet("abhi", "0000", 5500000);
		p2 = new Packet("adii", "0100", 30000);
		p3 = new Packet("pari", "0020", 5000000);
		
		ArrayList<Packet> list = new ArrayList<Packet>();
		list.add(p1);
		list.add(p2);
		list.add(p3);

		Iterator it = list.iterator();
		while(it.hasNext()) {
			Packet p = (Packet) it.next();
			System.out.println(p.name + "\t" + p.ph_no + "\t" + p.income);
		}
	}

}