import java.net.*;
import java.io.*;

class startServer {
	public static void main(String[] args) throws IOException {

		Server obj = new Server();
		obj.port = 3693;
		obj.ss = new ServerSocket(obj.port);
		System.out.println("Server Ready :-- (on port " + obj.port +")");
		obj.getReady(obj);

	}
}