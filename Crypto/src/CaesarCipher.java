

public class CaesarCipher extends ROT13{

    private Integer shift = 0;

    public String encrypt(String text, Integer shift) throws UnsupportedOperationException { // char 'A' = 65, char 'a' = 97
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            if (Character.isUpperCase(text.charAt(i))) {
                char ch = (char) (((int) text.charAt(i) + shift - 65) % 26 + 65); // % 26 provides for a simpler offset
                sb.append(ch);
            } else if (Character.isLowerCase(text.charAt(i))) {
                char ch = (char) (((int) text.charAt(i) + shift - 97) % 26 + 97);
                sb.append(ch);
            } else {
                sb.append(text.charAt(i));
            }
        }
        return sb.toString();
    }

}
