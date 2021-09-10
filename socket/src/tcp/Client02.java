package tcp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client02 {
	public static void main(String[] args) throws Exception {
		Socket sock = new Socket("localhost",12345);
		
		OutputStream os = sock.getOutputStream();
		DataOutputStream dos = new DataOutputStream(os);		
		System.out.println("메세지 입력");
		String s = new Scanner(System.in).next();
		dos.writeUTF(s);	
		System.out.println("전송완료");
		
		InputStream is = sock.getInputStream();
		DataInputStream dis = new DataInputStream(is);
		
		System.out.println("수신데이터 : "+dis.readUTF());
		
		
		
		dos.close(); os.close(); sock.close();
		
			
			
	}
}
