import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static final int PORT = 6166;
	public static void main(String[] args) throws IOException {
		new Server().runServer();
	}
	
	public void runServer() throws IOException {
		ServerSocket ss = new ServerSocket(PORT);
		System.out.println("Servidor Up");
		while(true){
			Socket s = ss.accept();
			new ServerThread(s).start();
		}
	}
	
}
