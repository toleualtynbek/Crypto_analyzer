package Exeptions;

public class FileExeption extends Exception {
    String myExeption;
    public FileExeption(String myExeption){
        this.myExeption = myExeption;
    }
    public FileExeption(String myExeption, Throwable cause){
        super(cause);
        this.myExeption = myExeption;
    }
    public String getMyExeption(){
        return this.myExeption;
    }
}
