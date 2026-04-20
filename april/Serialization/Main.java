import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
class student implements Serializable{
    int age;
    String name;
    student(String name,int age){
        this.age=age;
        this.name=name;
    }
}
class Main {
    public static void main(String args[]){
        student obj = new student("Riya",20);
        System.out.println(obj.name + " " + obj.age);
        FileOutputStream fos = new FileOutputStream("input.txt");
        ObjectInputStream ois = new ObjectInputStream(fos);
        ois.writeObject(obj);

    }
}
