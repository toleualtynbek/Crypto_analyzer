package Service;

import Model.CryptoModel;

import java.util.Scanner;

import static consts.Consts.ENTER_DESTINATION_FILE;
import static consts.Consts.ENTER_KEY;

public class ConsoleService {
    private final Scanner scanner;
    public ConsoleService(Scanner scanner)
    {
        this.scanner = scanner;
    }
    public void enterData(String enterSoursCryptFile, CryptoModel cryptoModel) {
        System.out.println(enterSoursCryptFile);
        cryptoModel.setPathFrom(scanner.nextLine());

        System.out.println(ENTER_DESTINATION_FILE);
        cryptoModel.setPathTo(scanner.nextLine());

        System.out.println(ENTER_KEY);
        cryptoModel.setKey(scanner.nextInt());
    }
}
