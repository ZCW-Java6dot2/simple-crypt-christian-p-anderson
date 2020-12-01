import org.junit.Test;

import java.io.*;

import static org.junit.Assert.assertEquals;

public class Sonnet18Test {

    @Test
    public void sonnetEncryptionTest() throws IOException {
        ROT13 testCipher = new ROT13();

        String inputFile = "sonnet18.txt";
        String encryptedFile = "sonnet18.enc";
        String decryptedFile = "sonnet18.dec";

        testCipher.encryptSonnet(new File(inputFile));
        testCipher.decryptSonnet(new File(encryptedFile));

        BufferedReader original = new BufferedReader(new FileReader(inputFile));
        BufferedReader decrypted = new BufferedReader(new FileReader(decryptedFile));

        String originalLine;
        String decryptedLine;

        while ((originalLine = original.readLine()) != null) {
            decryptedLine = decrypted.readLine();
            assertEquals(originalLine, decryptedLine);
        }
    }
}
