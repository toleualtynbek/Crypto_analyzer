import Model.CryptoModel;
import Service.ConsoleService;
import Service.CryptoService;

import java.util.Scanner;

import static consts.Consts.ENTER_SOURS_CRYPT_FILE;
import static consts.Consts.ENTER_SOURS_DECRYPT_FILE;

public class Main {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        CryptoService cryptoService = new CryptoService();
        CryptoModel cryptoModel = new CryptoModel();
        ConsoleService consoleService = new ConsoleService(scanner);


        int value = 1;

        switch (value) {
            case 1: {
                consoleService.enterData(ENTER_SOURS_CRYPT_FILE, cryptoModel);
                cryptoService.crypt(cryptoModel);
                break;
            }
            case 2: {
                consoleService.enterData(ENTER_SOURS_DECRYPT_FILE, cryptoModel);
                cryptoService.decrypt(cryptoModel);
                break;
            }
        }
    }

}