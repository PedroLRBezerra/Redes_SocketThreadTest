import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.Socket;

public class ServerThread extends Thread {
	Socket socket;
	
	ServerThread(Socket socket){
		this.socket=socket;
	}
	
	@Override
	public void run() {
		InputStreamReader ipts;
		try {
			BufferedReader bfr = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String msg = "";
			do {
				System.out.println("Cliente : "+msg);
			}while((msg= bfr.readLine())!= null);
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
