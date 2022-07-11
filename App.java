import java.io.IOException;
import java.util.Scanner;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);
        //assume an account has already been created
        GameAccount<> account = new GameAccount<>("hoge", "12345");

        System.out.println("welcome to CICCC GAME");

        while(true){
            System.out.println("Please enter your username");
            String user = input.nextLine();
            System.out.println("Please enter your password");
            String pass = input.nextLine();

            if(user.equels(account.getUserName()) && pass.equals(account.getUserPassword())){
                System.out.println("welcome" + account.getUserName());
                break;
            }

            System.out.println(
                "Invalid credentials\n\n"+
                "Press [enter] key to try again or press [Q] to exit\n\n"
            );

            if(input.nextLine().toLowerCase().equals("q")){
                System.out.println("Thank you for playing with us!");
                System.exit(0);
            }
        }

        account.showMenu();
        input.close();
    }

    public static void clrscr(){
        try {
            if (System.getProperty("os.name").contains("windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                Runtime.getRuntime().exec("clear");
                System.out.print("\033\143");
        } catch(IOException | InterruptedException ex) {}
    }
}
