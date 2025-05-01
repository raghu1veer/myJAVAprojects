import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;




public class Main {
    public static void main(String[] args) {
        WalterWhite WalterWhite = new WalterWhite(78, 45, 88, 90);
        Gus Gus = new Gus(82, 55, 85, 85);
        LaloSalamanca LaloSalamanca = new LaloSalamanca(85, 80, 90, 89);
        HectorSalamanca HectorSalamanca = new HectorSalamanca(75, 66, 70, 79);

        System.out.println("average power of BB characters are :");
        System.out.println("WALTER WHITE " + WalterWhite.Avg());
        System.out.println("GUSTAVO FRING " + Gus.Avg());
        System.out.println("LALO SALAMANCA " + LaloSalamanca.Avg());
        System.out.println("HECTOR SALAMANCA " + HectorSalamanca.Avg());
    }
}


