package fileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterDemo {
    public static File f=null;
    public static FileWriter fw=null;
    public static BufferedWriter bw=null;

    public static String ouput ="D:\\\\Program Files\\\\File Handling\\\\WriteOutput.txt2";

    public static void main(String[] args) throws IOException {
        f=new File(ouput);
        if(!f.exists()){
            f.createNewFile();
        }
        Scanner sc =new Scanner(System.in);
        System.out.println("Please enter the data :");
        String str =sc.nextLine();
        //overWrite the data
        fw=new FileWriter(f,true);
        bw=new BufferedWriter(fw);
        bw.newLine();
        bw.write(str);
        bw.flush();
        bw.newLine();
    }

}
