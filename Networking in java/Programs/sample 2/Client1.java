import java.net.*;
import java.io.*;

class Client1 {

	public static void main(String[] args) throws IOException {

		Socket s = new Socket("localhost", 3693);
		DataOutputStream out = new DataOutputStream(s.getOutputStream());
		DataInputStream in = new DataInputStream(s.getInputStream());
		BufferedReader b_read = new BufferedReader(new InputStreamReader(System.in));

		Thread reading = new Thread() {
			public void run() {
				while(true) {
					String string;
					try {
						string = (String)in.readUTF();
						System.out.println("Server :- " + string);
						if(string.equals("--CloseServer")) {
							break;
						}
					} catch (Exception e) {}
				}
			}
		};
		reading.start();

		Thread writing = new Thread() {
			public void run() {
				while(true) {
					String string;
					try {
						string = b_read.readLine();
						out.writeUTF(string);
						out.flush();
						if(string.equals("--CloseClient")){
							break;	
						}
					} catch(Exception e) {}
				}
				reading.stop();
			}
		};
		writing.start();

		

		s.close();
		out.close();
		in.close();
		b_read.close();
		
	}
}