import org.junit.Test;

import static org.junit.Assert.*;

public class CaesarCipherTest {

    @Test
    public void caesarCipherEncryptTest() {
        // Given
        CaesarCipher ccTest = new CaesarCipher();
        String beforeEncrypt = "Jello World";
        String expected = "Kfmmp Xpsme";

        // When
        String actual = ccTest.encrypt(beforeEncrypt, 1);

        // Then
        assertEquals(expected, actual);
    }


}
