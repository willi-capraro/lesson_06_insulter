import java.util.Scanner;
public class Arrays {

    public static void main(String[] args) {
        String[] myArray = {"Du Arsch", "Du Untermensch", "Du Nichtsnutz", "Du Penner"};
        Scanner s = new Scanner(System.in);


        String input;
        int counter = 0;
        do {
            System.out.print("rechtfertige dich ");
            System.out.println(myArray[counter]);
            input = s.nextLine();
            System.out.println("du meinst " + input);
            counter = counter +1;
            if (counter == 4) {
                counter = 0;

            }
        }while (!input.contentEquals("stop"));
    }
}
