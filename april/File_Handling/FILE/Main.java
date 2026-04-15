package april.File_Handling.FILE;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String args[]) throws IOException{
        File file = new File("input.txt");
        if(file.exists()){
            System.out.println("File exists");
        }else {
            System.out.println("File doesnot exists");
        }
        //create file
        if(file.createNewFile()){
            System.out.println("File created successfully");
        }else{
            System.out.println("File already exist");
        }

        // check if file is readable or not
        if(file.canRead()){
            System.out.println("File is readable");
        }else{
            System.out.println("file is not readable");
        }
        // can we write to a file
        if(file.canWrite()){
            System.out.println("File is writeable");
        }else{
            System.out.println("File is not writeable");
        }
        //to get abs path
        // System.out.println(file.getAbsolutePath());
        // System.out.println(file.length());
        // file.delete();
    }
}
