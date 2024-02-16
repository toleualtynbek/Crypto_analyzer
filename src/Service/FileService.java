package Service;

import Exeptions.FileExeption;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.util.List;

public class FileService {
    public List<String> readFromFile(Path path) throws FileExeption, IOException {
        try{
            Path filePath = Path.of(path.toUri());
            return Files.readAllLines(filePath);
        } catch (IOException ex){
            throw new FileExeption(ex.getMessage(), ex);
        }
    }

    public void writeToFile(Path path, List<String> data) throws FileExeption {
        try{
            Path filePath = Path.of(path.toUri());
            Files.writeString(filePath, data.toString());
        } catch (IOException ex){
            throw new FileExeption(ex.getMessage(), ex);
        }
    }
}
