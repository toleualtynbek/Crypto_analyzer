package Service;

import Model.CryptoModel;
import Model.CryptoPaths;

import java.util.Scanner;

import static consts.Consts.*;

public class ConsoleService {
    private final Scanner scanner;
    public ConsoleService(Scanner scanner)
    {
        this.scanner = scanner;
    }

    public CryptoPaths createCryptoPath() {
        CryptoPaths cryptoPaths = new CryptoPaths();
        System.out.println("Адрес зашифрованного файла");
        cryptoPaths.setPathFrom(scanner.nextLine());

        System.out.println("Адрес файла с примером");
        cryptoPaths.setPathTo(scanner.nextLine());

        System.out.println("Адрес файла с результатом");
        cryptoPaths.setResource(scanner.nextLine());
        return cryptoPaths;
    }
    public CryptoModel createCryptoModel(String enterSoursCryptFile) {
        CryptoModel cryptoModel = new CryptoModel();
        System.out.println(enterSoursCryptFile);
        cryptoModel.setPathFrom(scanner.nextLine());

        System.out.println(ENTER_DESTINATION_FILE);
        cryptoModel.setPathTo(scanner.nextLine());

        System.out.println(ENTER_KEY);
        cryptoModel.setKey(scanner.nextInt());
        return cryptoModel;
    }

    public int chooseAction() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Выберите действие: ");
        System.out.println("1. Шифрование методом цезаря: ");
        System.out.println("2. Дешифрование: ");
        System.out.println("3. bruteForce: ");
        System.out.println("4. Статистический анализ: ");
        System.out.print("->");
        int i = scan.nextInt();
        return i;
    }
}
