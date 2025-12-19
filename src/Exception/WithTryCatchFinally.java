package Exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WithTryCatchFinally {
    public static void main(String[] args) {
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader("input.txt"));
            // logic here

        } catch (IOException | NullPointerException ex) {
            // handling code
            ex.printStackTrace();

        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException closeEx) {
                    closeEx.printStackTrace();
                }
            }
        }

        try(BufferedReader br1 = new BufferedReader(new FileReader("input.txt"))) {
            //
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
