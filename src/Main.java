import Service.CryptoService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        CryptoService cryptoService = new CryptoService();
        Scanner scanner = new Scanner(System.in);
        int value = 1;

        switch (value)
        {
            case 1:
            {
                System.out.println("Введите имя файла, который нужно зашифровать");
                String path_1 = scanner.nextLine();

                System.out.println("Введите имя файла куда сложить результат");
                String path_2 = scanner.nextLine();

                System.out.println("Введите ключь");
                int key = scanner.nextInt();

                cryptoService.crypt(path_1,path_2,key);
            }
        }
    }
}