import java.io.*;
import java.util.List;
import java.util.ArrayList;

public class ListOfNumbers {
    private List<Integer> list;
    private static final int SIZE = 10;
    
    public ListOfNumbers() {
        list = new ArrayList<>(SIZE);
        for (int i = 0; i < SIZE; i++)
            list.add(i);
        this.readList("input.txt");
    }
    public void readList(String inputFile){
        String line =null;
        RandomAccessFile FileToRead=null;
        try{ 
            FileToRead=new RandomAccessFile(inputFile, "r");
            while ((line=FileToRead.readLine())!=null){
                int i=(Integer.parseInt(line));
                list.add(i);
            }
        } catch(FileNotFoundException NotFound){
            System.err.println("File: "+inputFile+" not found");
        } catch(IOException io){
            System.err.println(io.toString());
        } catch(NumberFormatException NumberEx){
            System.err.println(NumberEx.toString());
        }
    }
    public void writeList() {
        PrintWriter out = null;

        try {
            System.out.println("Entering try statement");
            out = new PrintWriter(new FileWriter("OutFile.txt"));

            for (int i = 0; i < list.size(); i++)
                out.println("Value at: " + i + " = " + list.get(i));
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Caught IndexOutOfBoundsException: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Caught IOException: " + e.getMessage());
        } finally {
            if (out != null) {
                System.out.println("Closing PrintWriter");
                out.close();
            } else {
                System.out.println("PrintWriter not open");
            }
        }
    }

    public static void main(String[] args) throws IOException {
        ListOfNumbers listOfNumbers = new ListOfNumbers();
        listOfNumbers.writeList();
    }
}
