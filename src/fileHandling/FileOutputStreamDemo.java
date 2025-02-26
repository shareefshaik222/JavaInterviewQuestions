package fileHandling;

import java.io.*;

public class FileOutputStreamDemo {
    private static File f=null;
    private static FileInputStream fis=null;
    private static FileOutputStream fos=null;

    private static String input="D:\\Program Files\\File Handling\\input.txt2";
    private static String output="D:\\Program Files\\File Handling\\output.txt2";

    public static void main(String[] args) throws IOException {
        File f1=new File(output);
        if(!f1.exists()){
            f1.createNewFile();
        }
        f=new File(input);


        fos=new FileOutputStream(f1.getAbsoluteFile());
        try {
           fis =new FileInputStream(f);
            int i;
            while ((i=fis.read())!=-1){
                System.out.print((char)i);
                fos.write(i);
            }
        } catch (Exception e) {
           e.printStackTrace();
        } finally {
            fis.close();

        }

    }


}
