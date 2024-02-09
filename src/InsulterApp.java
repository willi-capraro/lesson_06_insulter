import java.util.Scanner;

public class InsulterApp {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input;

        do{
            System.out.print("Rechtfertige dich du Lump! ");
            input = s.nextLine();
            System.out.println("Du hast eingegeben: " + input);
        } while(!input.contentEquals("Stop"));
        s.close();
    }

}
