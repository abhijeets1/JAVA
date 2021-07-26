import java.net.*;
import java.io.*;

public class Server {

	ServerSocket ss;
	Socket s;
	int port;
	DataOutputStream out;
	DataInputStream in;
	Thread readingThread;
	Thread writingThread;
	Boolean running = false;

	public void getReady(Server obj) throws IOException {
		
		obj.formConnection();
		obj.setupStreams();


		readingThread = new Thread(){
			public void run() {
				System.out.println("Server reading :-- (on port " + obj.port +")");
				obj.read();
			}
		};
		readingThread.start();

		writingThread = new Thread(){
			public void run() {
				System.out.println("Server writing :-- (on port " + obj.port +")");
				obj.write();
			}
		};
		writingThread.start();

	}



	public void formConnection() throws IOException {

		s = ss.accept();
		running = true;
		System.out.println("Client Connected :-- ");

	}

	public void setupStreams() throws IOException {

		out = new DataOutputStream(s.getOutputStream());
		in = new DataInputStream(s.getInputStream());

	}

	public void read() {

		while(true) {
			String string;
			try {
				string = (String)in.readUTF();
				System.out.println("Client :- " + string);
				if(string.equals("--CloseClient")) {
					break;
				}
			} catch(Exception e) {}
			
		}

	}

	public void write() {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			String string;
			try {
				string = String.valueOf(reader.readLine());
				out.writeUTF(string);
				if(string.equals("--CloseServer")) {
					running = false;
				}
				if(!running) {
					closeEverything();
					break;
				}
			} 
			catch(Exception e) {}
		}
		System.out.println("Server Closed");
		readingThread.stop();
		writingThread.stop();

	}

	public void closeEverything() throws IOException {

		closeSocket();
		ss.close();
		
	}

	public void closeSocket() throws IOException {

		s.close();
		out.close();
		in.close();

	}
}