package Service;

import Exeptions.FileExeption;
import Model.Alphabet;
import Model.CryptoModel;
import Model.CryptoPaths;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class CryptoService
{
    private final FileService fileService;
    private final Alphabet alphabet;

    public CryptoService(FileService fileService, Alphabet alphabet)
    {
        this.fileService = fileService;
        this.alphabet = alphabet;
    }



    public void crypt(CryptoModel model){
        try {

            List<String> encryptedList = new ArrayList<>();
            List<String> textFromFile = fileService.readFromFile(Path.of(model.getPathFrom()));

            for(String line: textFromFile)
            {
                StringBuilder result = new StringBuilder();
                for(int i = 0; i < line.length(); i++)
                {
                    Character symbol = Character.toLowerCase(line.charAt(i));
                    Integer originalCharIndex = alphabet.getCharIndex(symbol);
                        Integer newCharIndex = (alphabet.getSize() + (originalCharIndex + model.getKey())) % alphabet.getSize();
                        result.append(alphabet.getCharByIndex(newCharIndex));
                }
                encryptedList.add(result.toString());
                fileService.writeToFile(model.getPathTo(),encryptedList);
            }

        } catch (FileExeption e){
            System.out.println("Не смог прочитать данные из файла");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    public void decrypt(CryptoModel model){
        try {

            List<String> decryptedList = new ArrayList<>();
            List<String> textFromFile = fileService.readFromFile(Path.of(model.getPathFrom()));

            for(String line: textFromFile)
            {
                StringBuilder result = new StringBuilder();
                for(int i = 0; i < line.length(); i++)
                {
                    Character symbol = Character.toLowerCase(line.charAt(i));
                    Integer originalCharIndex = alphabet.getCharIndex(symbol);
                        Integer newCharIndex = (alphabet.getSize() + (originalCharIndex - model.getKey())) % alphabet.getSize();
                        result.append(alphabet.getCharByIndex(newCharIndex));

                }
                decryptedList.add(result.toString());
                fileService.writeToFile(model.getPathTo(),decryptedList);
            }

        } catch (FileExeption e){
            System.out.println("Не смог прочитать данные из файла");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
    public void bruteForce(CryptoPaths cryptoPaths){
        try {
            List<String> textFromFile = fileService.readFromFile(Path.of(cryptoPaths.getPathFrom()));
            for (int key=1; key<textFromFile.size(); key++)
            {
                List<String> decryptedList = bruteForceDecript(textFromFile,key);
                fileService.writeToFile(cryptoPaths.getResource(),decryptedList);
            }


        } catch (FileExeption e)
        {
            System.out.println("Не смог прочитать данные из файла");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public List<String> bruteForceDecript(List<String> textFromFile, int key) {
        List<String> decryptedList = new ArrayList<>();
        for(String line: textFromFile) {
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < line.length(); i++) {
                Character symbol = Character.toLowerCase(line.charAt(i));
                Integer originalCharIndex = alphabet.getCharIndex(symbol);

                Integer newCharIndex = (alphabet.getSize() + (originalCharIndex - key)) % alphabet.getSize();
                result.append(alphabet.getCharByIndex(newCharIndex));

            }
            decryptedList.add(result.toString());

        }
        return decryptedList;
    }

    public void staticAnalyze(CryptoPaths cryptoPaths){

    }
}
