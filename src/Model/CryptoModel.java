package Model;

import java.nio.file.Path;

public class CryptoModel {
    private String pathFrom;
    private String pathTo;
    private int key;

    public String getPathFrom() {
        return pathFrom;
    }

    public void setPathFrom(String pathFrom) {
        this.pathFrom = pathFrom;
    }

    public Path getPathTo() {
        return Path.of(pathTo);
    }

    public void setPathTo(String pathTo) {
        this.pathTo = pathTo;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public CryptoModel(){

    }
    public CryptoModel(String pathFrom, String pathTo, int key) {
        this.pathFrom = pathFrom;
        this.pathTo = pathTo;
        this.key = key;
    }
}
