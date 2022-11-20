import java.io.*;

public class WordFinder {
    public static void szukaj(String nazwaPlikWe, String nazwaPlikWy, String slowo) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(nazwaPlikWe));
        BufferedWriter writer = new BufferedWriter(new FileWriter(nazwaPlikWy));
        int i=0;
        String line;
        while((line = reader.readLine())!=null){
            String[] lineArr = line.split("\s");
            for(String word : lineArr){
                if(word.equals(slowo)){
                    writer.write(i+": "+line+'\n');
                    break;
                }
            }
            i++;
        }
        writer.close();
    }
}
