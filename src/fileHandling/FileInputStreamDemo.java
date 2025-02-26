package fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {
    private static File f=null;
    private static FileInputStream fis =null;
    private static String inputData="D:\\Program Files\\File Handling\\input.txt";

    public static void main(String[] args) throws IOException {
        f=new File(inputData);

        try {
            fis=new FileInputStream(f);
            int i;
            while((i=fis.read())!=-1){
                System.out.print((char)i);
            }
        } catch (FileNotFoundException e) {
         e.printStackTrace();
        } finally {
            fis.close();
        }
    }
}
