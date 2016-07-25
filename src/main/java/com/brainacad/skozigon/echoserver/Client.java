package com.brainacad.skozigon.echoserver;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * Created by skozigon on 25.07.2016.
 */
public class Client {
    public static void main(String[] args) {
        int serverPort = 4445;
        String adress = "127.0.0.1";


        try {
            InetAddress inetAddress = InetAddress.getByName(adress);
            System.out.println("Server adress: " + adress + " port: " +serverPort);

            Socket socket = new Socket(inetAddress, serverPort);
            System.out.println("Connect to server...");

            InputStream sin = socket.getInputStream();
            OutputStream sout = socket.getOutputStream();

            DataInputStream in = new DataInputStream(sin);
            DataOutputStream out = new DataOutputStream(sout);

            BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
            String string = null;
            System.out.println("Enter path: ");


            while (true){
                string = kb.readLine();
                System.out.println("Sending to server");
                out.writeUTF(string);
                out.flush();

                string = in.readUTF();
                System.out.println("Server answered: " + string.toString());
                System.out.println("Enter new path");
                System.out.println();

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
