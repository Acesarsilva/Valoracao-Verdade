import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String args[]) throws IOException {
       try {
           Scanner in = new Scanner(new FileReader("Entrada.in"));
           String linha = in.nextLine();
       }catch (IOException exception){}
    }
}