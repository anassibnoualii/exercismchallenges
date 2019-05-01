class RotationalCipher {

    private static final int ALPHABETS_MAX_LENGTH = 26;
    private static final int ALPHABETS_MIN_LENGTH = 0;
    private final int  shiftKey;
    private final static String LOWERCASE_ALPHABETS ="abcdefghijklmnopqrstuvwxyz";
    private final static String UPPERCASE_ALPHABETS ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    RotationalCipher(int shiftKey) {
        this.shiftKey=shiftKey;

    }

    String rotate(String data) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char s : data.toCharArray()){
            if(shiftKey== ALPHABETS_MIN_LENGTH ||shiftKey== ALPHABETS_MAX_LENGTH){
                stringBuilder.append(s);
            }
            else if(Character.isLowerCase(s)&&Character.isAlphabetic(s)) {
                stringBuilder.append(LOWERCASE_ALPHABETS.charAt((shiftKey+ LOWERCASE_ALPHABETS.indexOf(s))%ALPHABETS_MAX_LENGTH));
            }

            else if(Character.isUpperCase(s)&&Character.isAlphabetic(s)) {
                stringBuilder.append(UPPERCASE_ALPHABETS.charAt((shiftKey+ UPPERCASE_ALPHABETS.indexOf(s))%ALPHABETS_MAX_LENGTH));

            }
            else stringBuilder.append(s);
        }
        return stringBuilder.toString();
    }

}
