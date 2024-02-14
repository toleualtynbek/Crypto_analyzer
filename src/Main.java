import Model.Alphabet;
import Model.CryptoModel;
import Model.CryptoPaths;
import Service.ConsoleService;
import Service.CryptoService;
import Service.FileService;

import java.util.Scanner;

import static consts.Consts.ENTER_SOURS_CRYPT_FILE;
import static consts.Consts.ENTER_SOURS_DECRYPT_FILE;

public class Main {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        FileService fileService = new FileService();
        Alphabet alphabet = new Alphabet();
        CryptoService cryptoService = new CryptoService(fileService,alphabet);
        ConsoleService consoleService = new ConsoleService(scanner);

        while (true) {
            int value = consoleService.chooseAction();
            if (value == 5)
                break;
        switch (value) {
            case 1: {
                cryptoService.crypt(consoleService.createCryptoModel(ENTER_SOURS_CRYPT_FILE));
                break;
            }
            case 2: {
                cryptoService.decrypt(consoleService.createCryptoModel(ENTER_SOURS_DECRYPT_FILE));
                break;
            }
            case 3: {
                cryptoService.bruteForce(consoleService.createCryptoPath());
                break;
            }
            case 4: {
                cryptoService.staticAnalyze(consoleService.createCryptoPath());
                break;
            }
            default: {
                System.out.println("Выберите число от 1 по 5!");
            }
        }
        }
    }




}