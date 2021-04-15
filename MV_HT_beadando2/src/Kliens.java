import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Kliens {

	public static void main(String[] args) throws IOException, UnknownHostException {
		Socket s = new Socket("127.0.0.1", 1234);

		BufferedReader beolvaso = new BufferedReader(new InputStreamReader(System.in));
		String tarolando = beolvaso.readLine();
		
		PrintWriter pw = new PrintWriter(s.getOutputStream());
		pw.print(tarolando);
		pw.flush();
		pw.close();
		s.close();
	}
}
