import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SymbolsCounter {
    public static int[] liczZnakiSlowa(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        int[] result = {0,0,0};
        while(reader.read()!=-1){
            result[0]++;
        }
        //////////////////////////////////////////////////////
        reader = new BufferedReader(new FileReader(fileName));
        String line;
        int lengthWithSpaces = 0;
        int lengthWithoutSpaces = 0;
        while((line=reader.readLine())!=null){
            lengthWithSpaces += line.length();
            lengthWithoutSpaces += line.replace(" ","").
                    replace("\t","").replace("\n","").length();
        }
        result[1] = lengthWithSpaces-lengthWithoutSpaces;
        //////////////////////////////////////////////////////
        int numberOfWords = 0;
        reader = new BufferedReader(new FileReader(fileName));
        while((line=reader.readLine())!=null){
            numberOfWords += line.split("\s").length;
        }
        result[2] = numberOfWords;

        return result;
    }
}
