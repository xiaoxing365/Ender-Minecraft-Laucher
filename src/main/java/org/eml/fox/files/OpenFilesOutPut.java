package org.eml.fox.files;

import java.io.*;

public class OpenFilesOutPut {
    static String _CON_FIGFILE = "config.json";
    static String _FOLDER = ".minecraft";
    public OpenFilesOutPut() {
        File config = new File(_CON_FIGFILE);
        File folder = new File(_FOLDER);
        if (!config.exists()){
            try {
                FileOutputStream outputStream = new FileOutputStream(config);
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
        if (!folder.exists()){
            folder.mkdirs();
        }
    }
}
