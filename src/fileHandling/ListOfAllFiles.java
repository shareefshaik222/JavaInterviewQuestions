package fileHandling;

import java.io.File;

public class ListOfAllFiles {

    static String dir ="D:\\Movies";

    public static void filesList(String dir){
        File f=new File(dir);

        File[] farray=f.listFiles();

        for(File fa:farray) {
            if (fa.getName().endsWith("mkv")){
                System.out.println(fa.getName());

            }
        }

    }

    public static void main(String[] args) {
        filesList(dir);
    }
}
