import java.io.*;
public class BufferedReadWrite16{
    public static void main(String[]args) throws IOException{
        BufferedReader br=new BufferedReader(new FileReader("ReadWrite15.java"));
        BufferedWriter bw=new BufferedWriter(new FileWriter("CopyBufferedReadWrite16.txt"));

        String line;
        int count=0;
        while((line=br.readLine())!=null){
            bw.write(line);
            bw.newLine();
            System.out.println(line);
            count++;
        }
        bw.write("Total lines: " + count);
        System.out.println("\nFile copied successfully.");

        br.close();
        bw.close();
    }
}