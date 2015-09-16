import java.util.Scanner;

public class encapsulation {
    public static void main(String arg[]) {

        System.out.println("Enter a String");
        Scanner scan = new Scanner(System.in);
        String data = scan.nextLine();
        System.out.println("You entered " + data);
        Scanner scan2 = new Scanner(System.in);
        String data2 = scan2.nextLine();
        System.out.println("New next is " + data + " " +data2);
    }
    public void protocol1(String[] data){
    }
}