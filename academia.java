import java.util.Scanner;
import java.util.HashMap;
public class academia {
    
    private HashMap<String,Subject> registry;

    
    
    
    private void registerSubject(){
        
    }
    
    
    private Subject newSubject(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter subject name");
        String n = input.nextLine();
        System.out.println("Enter subject credit count");
        int x = input.nextInt();
        System.out.println("Enter subject teacher name");
        String tn = input.nextLine();
        System.out.println("Enter teacher's email");
        String te = input.nextLine();
        Subject s = new Subject(n,x,tn,te);
        return s;
    }

}
