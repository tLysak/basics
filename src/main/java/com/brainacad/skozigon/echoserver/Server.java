package com.brainacad.skozigon.echoserver;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by skozigon on 25.07.2016.
 */
public class Server {
    public static void main(String[] args) {
        int port = 4445;

        try {
            ServerSocket ss = new ServerSocket(port);
            System.out.println("Waiting...");
            Socket socket = ss.accept();

            InputStream sin = socket.getInputStream();
            OutputStream sout = socket.getOutputStream();

            DataInputStream in = new DataInputStream(sin);
            DataOutputStream out = new DataOutputStream(sout);


            String list[];

            String string = null;
            while (true){
                string = in.readUTF();
                System.out.println("Client send line: " + string);

                System.out.println("Sending back...");

                 list = new File(string).list();
                for(int i = 0; i < list.length; i++){
                    out.writeUTF(list[i]);
            }

                out.flush();
                System.out.println("Waiting next line...");
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
