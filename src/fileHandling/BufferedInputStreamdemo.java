package fileHandling;

import java.io.*;

public class BufferedInputStreamdemo {
    private static File f=null;
    private static FileInputStream fis=null;
    private static BufferedInputStream bis=null;
    private static String inputText="D:\\Program Files\\File Handling//input.txt2";

    public static void main(String[] args) throws IOException {
        f=new File(inputText);

        fis=new FileInputStream(f);
        try {
            bis =new BufferedInputStream(fis);
            int i;
            while((i=bis.read())!=-1){
                System.out.print((char)i);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            bis.close();
        }
    }
}
