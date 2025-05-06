import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        System.out.println("CHOOSE THE OPTION BELOW 'mobile is on'");
        System.out.println("1. PLAY GAME    2.DIAL   " +
                "3.CLICK A PICTURE    4.PLAY MUSIC    5.POWER OFF   :: ");
        Scanner sc = new Scanner(System.in);
        Mobile mobile = new Mobile();
        int choice = sc.nextInt();
        if(choice == 1){
             mobile.playGame();
        } else if (choice ==2) {
            System.out.println("enter the number to dial");
            Scanner sc1 = new Scanner(System.in);
            String number = sc1.nextLine();
            mobile.dial(number);
        } else if (choice == 3) {
            mobile.takePicture();
        } else if (choice == 4) {
            mobile.playMusic();

        } else if (choice == 5) {
            mobile.powerOFF();

        } else{
            System.out.println("chose the correct choice");
        }
    }
}