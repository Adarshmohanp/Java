import java.io.*;
public class FileRead14{
    public static void main(String[]args) throws IOException{
        FileReader fr=new FileReader("first.txt");
        //read()-reads a single character and returns its ASCII value, returns -1 when end of file is reached
        int i;
        int count=0;

        while((i=fr.read())!=-1){
            System.out.print((char)i);
            count++;
        }
        System.out.println("\nTotal characters: " + count);


        fr.close();
    }
}