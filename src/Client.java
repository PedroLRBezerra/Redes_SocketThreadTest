import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) throws UnknownHostException, IOException {
		String nome = args[0];

		Socket s = new Socket("localhost", 6166);

		PrintWriter writer = new PrintWriter(s.getOutputStream(), true);
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			String readerInput = bfr.readLine();
			writer.println(nome + ": " + readerInput);
		}
	}

}
