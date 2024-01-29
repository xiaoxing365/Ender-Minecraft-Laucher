package org.eml.fox.util.downloadutils;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

public class FileDownloader {
    public void downloadFiles(String url,String path){
        try {
            URL url1 = new URL(url);
            URLConnection connection = url1.openConnection();
            InputStream inputStream = connection.getInputStream();
            String localFile = path;
            FileOutputStream outputStream = new FileOutputStream(localFile);

            //下载文件
            byte[] buffer = new byte[1024];
            int byteRead;
            while ((byteRead = inputStream.read(buffer))!= -1){
                outputStream.write(buffer,0,byteRead);
            }
            inputStream.close();
            outputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
