package com.socket.client;


import com.socket.client.socket.NonSslSocket;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class ClientApplication {

	public static void main(String[] args) throws InterruptedException{
		String host = "127.0.0.1";
		int port = 9999;
		try {
			System.out.println("Enter message length");
			Scanner sc = new Scanner(System.in);
			int messageLength = Integer.parseInt(sc.nextLine());

			NonSslSocket nonSslSocket = new NonSslSocket(host, port);
			nonSslSocket.run(messageLength);
		} catch (Exception e){
			e.printStackTrace();
		}
	}

}
