import java.util.HashMap;

class mainclass {

	public static void main(String[] args) {

		HashMap<String, String> map = new HashMap<String, String>();

		map.put("abhijeet1212", "passme1212");
		map.put("abhijeet1212", "passme22");
		
		System.out.println(map.get("abhijeet1212"));

		System.out.println(map.containsValue("passme22"));
		System.out.println(map.containsValue("passme1212")); // false

		System.out.println(map.containsKey("abhijeet1212"));
	}
}