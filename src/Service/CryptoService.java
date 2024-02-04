package Service;

import Exeptions.FileExeption;
import Model.CryptoModel;
import Model.CryptoPaths;

import java.nio.file.Path;
import java.util.List;

public class CryptoService
{
    private final FileService fileService;

    public CryptoService(FileService fileService) {
        this.fileService = fileService;
    }

    public void crypt(CryptoModel model){
        try {
            List<String> dataFromFile = fileService.readFromFile(Path.of(model.getPathTo()));
            //.....
        } catch (FileExeption e){
            System.out.println("Не смог прочитать данные из файла");
        }

    }
    public void decrypt(CryptoModel model){

    }
    public void bruteForce(CryptoPaths cryptoPaths){

    }
    public void staticAnalyze(CryptoPaths cryptoPaths){

    }
}
