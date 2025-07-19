import java.util.Scanner;

public class NameInitializ {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first name :");
        String s1=sc.nextLine();
        System.out.println("enter the middle name :");
        String s2=sc.nextLine();
        System.out.println("enter the last name :");
        String s3=sc.nextLine();
        char initial1 = Character.toUpperCase(s1.trim().charAt(0));
        char initial2 = Character.toUpperCase(s2.trim().charAt(0));
        String surname = s3.trim().substring(0,1).toUpperCase() + s3.trim().substring(1).toLowerCase();

        System.out.println(initial1 + ". " + initial2 + ". " + surname);

        sc.close();
    }
}
