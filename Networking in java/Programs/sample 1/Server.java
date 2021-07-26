import java.io.*;
import java.net.*;


class Server {


	public static void main(String[] args) throws Exception {
		
		System.out.println("Waiting...");

		ServerSocket ss = new ServerSocket(6666);
		while(true) {
			Socket s1 = ss.accept();
			System.out.println("Connected!");

			DataInputStream in = new DataInputStream(s1.getInputStream());
			while(true) {
				String string = (String)in.readUTF();
				System.out.println("Client = "+string);
				if(string.equals("")) break;
			}
			s1.close();
			in.close();	
			System.out.println("Disconnected!");
		}

	}
}