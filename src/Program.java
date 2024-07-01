import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
       byte[] myArray = new byte[3];
       myArray[0] = 5;
       myArray[1] = 7;
       myArray[2] = 9;

       System.out.println(myArray[0]);

       for(byte num : myArray){
           System.out.println(num);
       }

        String name = "Vitaliy";
        System.out.println(name);

        byte age = 25;
        System.out.println(age);
    }

    public static void Foo(){
        System.out.println("Hello World");
    }

}
