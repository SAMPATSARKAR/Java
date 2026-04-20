// import java.util.*;
import java.io.File;
import java.io.*;
class Main {
    public static void main(String args[]) throws IOException{
        // FileReader fr = new FileReader("input.txt");
        // BufferedReader br = new BufferedReader(fr);
        // String str;
        // while((str = br.readLine()) != null){
        //     System.out.print(str);

        // }
        // FileWriter fw = new FileWriter("output.txt");
        // BufferedWriter bw = new BufferedWriter(fw);
        // bw.write("hello");
        // bw.close();
        // fw.close();

        // PrintWriter pw = new PrintWriter(System.out);

        // pw.println("hello");
        // pw.close();
        
        
        PrintWriter pw  =  new PrintWriter(new File("output1.txt"));
        pw.println("hello");
        pw.printf("hello,i am %s","sam");
        pw.close();





    }    
}
