import java.util.Scanner;

public class Mobile implements Telephone{
    String number;


    @Override

    public void powerON() {


    }

    @Override
    public void playMusic() {
        System.out.println("music starts playing JAGJIT SINGH GHAZALS ARE GOING ONN");

    }

    @Override
    public void dial(String number) {
        System.out.println("calling " + number );
    }

    @Override
    public boolean isRinging() {
        if (isRinging()) {
            System.out.println("pick up the call ");
            System.out.println("Press Y for answer N for cut the call");
            Scanner sc2 = new Scanner(System.in);
            String result = sc2.nextLine();
            if (result == "Y") {
                System.out.println("phone is answered ");
            } else if (result == "X") {
                System.out.println("you have cut the phone");
            } else {
                System.out.println("choose the correct option");
            }


        }return false;
    }

    @Override
    public void takePicture() {
        System.out.println("SAY CHEESE !!");

    }
    @Override
    public void playGame(){
        System.out.println("YOU ARE  PALYING  A GAME");

    }
    @Override
    public void powerOFF(){
        System.out.println("THANYOU FOR USING PHONE 'PHONE IS GOING TO OFF'");

    }

}
