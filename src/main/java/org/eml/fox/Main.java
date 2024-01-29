package org.eml.fox;

import org.eml.fox.JUI.MainFrame;
import org.eml.fox.files.OpenFilesOutPut;

/**
 * @author liangcha_hh
 * @author xiaoxing365
 */
public class Main {
    public static String[] args;
    public static void main(String[] args) {
        Main.args = args;
        System.out.println("Hello EnderMinecraftLauncher!");
        new MainFrame();
        //openFiles();
    }
    public static void openFiles(){
        new OpenFilesOutPut();
    }
}