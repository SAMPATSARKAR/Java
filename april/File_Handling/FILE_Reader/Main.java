import java.util.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;
class Main {
    public static void main(String args[] ) throws IOException{
        File file = new File("input.txt");
        // if(file.exists()){
        //     System.out.println("File exists");
        // }else {
        //     System.out.println("File doesnot exists");
        // }
        // if(file.createNewFile()){
        //     System.out.println("File created successfully");
        // }else{
        //     System.out.println("File already exist");
        // }
        // file.createNewFile();
        FileReader fr = new FileReader("input.txt");
        // int input=fr.read();
        // System.out.println(input);
        // while((input = fr.read()) != -1){
        //     System.out.print((char)input);
        // }
        // System.out.println(fr.readAllAsString());
        //
        
        // int input;
        // FileWriter fw = new FileWriter("output.txt", true);
        // while((input = fr.read()) != -1){
        //     fw.write(input);//dont need to type cast into char
        // }
        // fw.close();

        //fileInputStream- for binary(not special char)--can be used to copy audio,img
        // FileInputStream fis = new FileInputStream("image.png");
        // FileOutputStream fos = new FileOutputStream("output.jpg", true);
        // int inp;
        // while((inp = fis.read()) != -1){
        //     fos.write(inp);//dont need to type cast into char
        // }
        //scanner
        Scanner sc = new Scanner(new File("input.txt"));
        String str = sc.nextLine();
        System.out.print(str);

        //Buffer Reader


    }
}
