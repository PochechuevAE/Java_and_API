package HW.HW6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class NoutsDB {
    public static void main(String[] args) {
        Nouts noutOne = new Nouts("ASUS TUF Gaming F15 FX506HC-HN006", 85_000, "ASUS", "Windows 10", 16, 512, "Silver");
        Nouts noutTwo = new Nouts("ASUS Vivobook 15 M1502IA-BQ097", 62_800, "ASUS", "Windows 11", 8, 256, "White");
        Nouts noutThree = new Nouts("MSI GF63-225XRU", 79_900, "MSI", "Windows 10", 16, 512, "Gray");
        Nouts noutFour = new Nouts("HP Victus 16-d000053ur", 95_700, "HP", "Linux", 16, 512, "Black");
        Nouts noutFive = new Nouts("Lenovo IdeaPad Gaming 3 15ACH6", 80_800, "Lenovo", "No operatin system", 16, 512, "White");

        Set<Nouts> noutsDB = new HashSet<Nouts>(Arrays.asList(noutOne, noutTwo, noutThree, noutFour, noutFive));

        for (Nouts nout : noutsDB) {
            System.out.println(nout);
        }
    }
}
