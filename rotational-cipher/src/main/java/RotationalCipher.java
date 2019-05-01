class RotationalCipher {

    private static final int ALPHABET_MAX_LENGHT = 26;
    private static final int ALPHABET_MIN_LENGHT = 0;
    private final int  shiftKey;
    private final static String ALPHABETS ="abcdefghijklmnopqrstuvwxyz";

    RotationalCipher(int shiftKey) {
        this.shiftKey=shiftKey;

    }

    String rotate(String data) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char s : data.toCharArray()){
            if(shiftKey== ALPHABET_MIN_LENGHT ||shiftKey== ALPHABET_MAX_LENGHT){
                stringBuilder.append(s);
            }
            else if(Character.isLowerCase(s)&&Character.isAlphabetic(s)) {
                stringBuilder.append(Character.toLowerCase(ALPHABETS.charAt(((shiftKey+ ALPHABETS.indexOf(s))%ALPHABET_MAX_LENGHT))));
            }

            else if(Character.isUpperCase(s)&&Character.isAlphabetic(s)) {
                stringBuilder.append(Character.toUpperCase(ALPHABETS.charAt(((shiftKey+ ALPHABETS.indexOf(Character.toLowerCase(s)))%26))));

            }
            else stringBuilder.append(s);
        }
        return stringBuilder.toString();
    }

}
