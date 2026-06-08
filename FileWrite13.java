import java.io.*;
public class FileWrite13{
    public static void main(String[]args) throws IOException{
      //  File f=new File("first.txt");//created, if already exists then it will be overridden
        FileWriter fw=new FileWriter("first.txt",true);//true for append mode
        
        fw.write("Java is a OOPs language.\n");
        fw.write("Java is platform independent.\n");
        fw.close();
        
    }
}