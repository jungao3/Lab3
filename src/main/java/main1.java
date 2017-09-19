import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class main1 {
    public static String urlToString(final String url) {
        Scanner urlScanner;
        try {
            urlScanner = new Scanner(new URL(url).openStream(), "UTF-8");
        } catch (IOException e) {
            return "";
        }
        String contents = urlScanner.useDelimiter("\\A").next();
        urlScanner.close();
        return contents;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println(urlToString("http://erdani.com/tdpl/hamlet.txt"));
        String str1 = urlToString("http://erdani.com/tdpl/hamlet.txt");
        int count = 1;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == ' ') {
                count ++;
            }
        }
        System.out.println("Word Count is " + count);
    }

}

