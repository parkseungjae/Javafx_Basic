package tcp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server02 {
	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(12345);
		System.out.println("server02");
		Socket sock = server.accept();
		
		InputStream is = sock.getInputStream();
		DataInputStream di = new DataInputStream(is);
		
		System.out.println("수신 대기...");
		String readData = di.readUTF();
		System.out.println("수신 데이터 : " + readData);
		
		System.out.println("서버 메세지 :");
		String s = new Scanner(System.in).next();
		
		OutputStream os = sock.getOutputStream();
		DataOutputStream dos = new DataOutputStream(os);
		
		dos.writeUTF(s);
		
		di.close(); is.close(); sock.close();
	}
}
