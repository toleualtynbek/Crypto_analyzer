package Model;

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

    public String getPathTo() {
        return pathTo;
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
