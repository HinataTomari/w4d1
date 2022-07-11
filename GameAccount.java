public class GameAccount<S1, S2> {
 
    private int status;
    private int playTime;
    private final S1 userName;
    private final S1 userPassword;

    public GameAccount(S1 userName, S1 userPassword) {
        this.userName = userName;
        this.userPassword = userPassword;
    }

    public S1 getUserName() {
        return userName;
    }

    public S1 getUserPassword() {
        return userPassword;
    }


    
    /**
     * playTime
     * onlineStatus
     * friend
     * errorMessage
     * showMenu
     */


     void showMenu(){
         char Option;
         Scanner Scanner = new Scanner(System.in);

         do{
             System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=");
             System.out.println("welcome to CICCC GAME");
             System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=");
             System.out.println("A: Check your PlayTime");
             System.out.println("B: Online Status");
             System.out.println("C: Friend");
             System.out.println("D: Quit");
             option = scanner.next().charAt(0);

            switch (option){
                case 'a':
                    System.out.println("-------------------");
                    System.out.println("status: " + status);
                    System.out.println("-------------------");
                    break;   

                case 'b':
                    System.out.println("------------------------------");
                    System.out.println("Choose a game you want to see playTime");
                    System.out.println("------------------------------");
                    System.out.println("\n");

                    try{
                        int amount = scanner.nextInt();
                        playTime(amount);
                    }catch (Exception e){
                        errorMessage("Wrong Input! Only integers please");
                    }
                
                    break;

                case 'c':
                    System.out.println("-------------------------------");
                    System.out.println("Choose a friend you want to see");
                    System.out.println("-------------------------------");
                    System.out.println("\n");

                    try{
                        int amount2 = scanner.nextInt();
                        friend(amount2);
                    }catch (Exception e){
                        errorMessage("Wrong Input! Only integers please");
                    }

                    break;

                case 'd':
                    System.out.println("-------------------------------")
                    break;


                default:
                    System.out.println("Invalid option. Please try again.")
                    break;
            }
         }while(Character.toLowerCase(option) != 'e');
         System.out.println("thank you for playing with us!");
         scanner.close();
     }

     void playTime(int amount){
        if(amount > 0){
            playTime = playTime + amount;
        }
     }
     void status(int amount){

     }
     void friend(int amount){

     }
     void errorMessage(String message){
         System.out.println("\n------------------------------------------");
         System.out.println("!!!" + message);
         System.out.println("------------------------------------------\n");
     }

     
}
