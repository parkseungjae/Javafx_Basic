package quiz;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Guest {
	public static void main(String[] args) throws Exception{
		Socket sock = new Socket("localhost",12345);

		OutputStream os = sock.getOutputStream();
		DataOutputStream dos = new DataOutputStream(os);		
		System.out.println("메세지 입력");
		String s = new Scanner(System.in).next();
		dos.writeUTF(s);	
		System.out.println("전송완료");

		dos.close(); os.close(); sock.close();

	}
}
