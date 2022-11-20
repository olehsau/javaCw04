import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        var result = SymbolsCounter.liczZnakiSlowa("src/file.txt");
        System.out.println(result[0]);
        System.out.println(result[1]);
        System.out.println(result[2]);

        //////////////////////////////////////////

        WordFinder.szukaj("src/file.txt","src/output.txt","world");
    }
}
