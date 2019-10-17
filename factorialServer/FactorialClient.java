import java.io.*;
import java.net.Socket;

public class FactorialClient {

	public static void main(String[] args) {
		try {
			System.out.println("Client started");
			Socket soc = new Socket("localhost", 9806);
			BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Enter a number to find its factorial: ");
			int num = Integer.parseInt(userInput.readLine());
			PrintWriter out = new PrintWriter(soc.getOutputStream(), true);
			out.println(num);
			BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
			System.out.println("Factorial is: " + Integer.parseInt(in.readLine()));
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
