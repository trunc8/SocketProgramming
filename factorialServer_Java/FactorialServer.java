import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class FactorialServer {
	public static void main(String[] args) {
		try {
			System.out.println("Waiting for clients...");
			ServerSocket ss = new ServerSocket(9806);
			Socket soc = ss.accept();
			System.out.println("Connection established");
			BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
			int num = Integer.parseInt(in.readLine());
			int fact = Factorial(num);
			PrintWriter out = new PrintWriter(soc.getOutputStream(), true);
			out.println(fact);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static int Factorial(int num) {
		int fact = 1;
		for(int i=2; i<=num; i++)
			fact *= i;
		return fact;
	}
}
