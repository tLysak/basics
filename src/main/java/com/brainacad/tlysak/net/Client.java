package com.brainacad.tlysak.net;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

/**
 * Created by tymur on 7/25/16.
 */
public class Client {
    public static void main(String[] ar) {
        int serverPort = 8834;
        String address = "127.0.0.1";
        try {

            Socket socket = new Socket(address, serverPort);

            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());

            File file = new File("/");
            traverse(file, out, in);

        } catch (Exception x) {
            x.printStackTrace();
        }
    }

    private static void traverse(File folderToTraverse, DataOutputStream out, DataInputStream in) throws IOException {
        if(folderToTraverse.list() == null) {
            return;
        }

        for(String fileName : folderToTraverse.list()) {
            File internalFile = new File(folderToTraverse.getAbsolutePath() +"/"+ fileName);
            out.writeUTF(internalFile.getAbsolutePath());
            out.flush();
            String response = in.readUTF();
            System.out.println("<<<" + response);
            if(internalFile.isDirectory()) {
                traverse(internalFile, out, in);
            }
        }


    }
}
