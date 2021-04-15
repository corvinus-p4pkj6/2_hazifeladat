import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.sql.Timestamp;

public class Naplozo implements Runnable {
	private Socket s;

	public Naplozo(Socket s) {
		super();
		this.s = s;
	}

	@Override
	public void run() {
		BufferedReader bf;
		try {
			bf = new BufferedReader(new InputStreamReader(this.s.getInputStream()));
			Timestamp tp = new Timestamp(System.currentTimeMillis());
			String tarolando = bf.readLine();
			
			PrintWriter outFile = new PrintWriter(new FileWriter("./A/kiir.txt", true));
			outFile.write(tp.toString() + " " + tarolando + '\n');
			outFile.close();
			System.out.println(tarolando);			
			bf.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
