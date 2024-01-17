import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.io.File;
import java.io.IOException;

public class Cat{
    public static void main(String[] args){
        File inputFile=new File("test.txt");
        cat(inputFile);
    }
public static void cat(File file) {
    RandomAccessFile input = null;
    String line = null;

    try {
        input = new RandomAccessFile(file, "r");
        while ((line = input.readLine()) != null) {
            System.out.println(line);
        }
        return;
    }catch(FileNotFoundException fnf){
        System.err.format("File: %s nof found%", file);
    }catch(IOException io){
        System.err.println("Reading error: "+ io.getMessage());
    }
    finally {
        if (input != null) {
            try{
            input.close();
        }catch(IOException io){
            System.err.println("Reading error: "+ io.getMessage());
        }
    }
}
}
}