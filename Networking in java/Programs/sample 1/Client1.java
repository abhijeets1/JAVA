import java.io.*;
import java.net.*;


class Client1 {


	public static void main(String[] args) throws Exception {
		
		Socket s = new Socket("localhost", 1693);

		DataOutputStream out = new DataOutputStream(s.getOutputStream());

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			String string = br.readLine();

			out.writeUTF(string);
			out.flush();
			if(string.equals("")) break;
		}
		s.close();
		out.close();
		
	}
}