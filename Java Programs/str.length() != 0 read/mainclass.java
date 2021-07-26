import java.util.Scanner;
class mainclass {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String str = " "; int i = 0;
		StringBuilder obj = new StringBuilder("");

		while(str.length() != 0) {
			str = sc.nextLine();
			if(str.length() != 0) {
				i++;
				obj.append(i + " " +str + "\n");
			}
		}
		System.out.println(obj.toString());
	}
}

/*

string length is 0 if u have entered \n as input.

*/