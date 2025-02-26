package fileHandling;

import java.io.*;

public class FileReaderDemo {
    private static File f=null;

    private static FileReader fr=null;
    private static BufferedReader br=null;

    static String inputData="D:\\Program Files\\File Handling\\input.txt2";

    public static void main(String[] args) throws IOException {
        f =new File(inputData);

        fr=new FileReader(f);
        br=new BufferedReader(fr);
        String line;
        while ((line=br.readLine())!=null){
            System.out.println(line);

        }
        br.close();


    }
}
