import java.util.Optional;

class Twofer {
    private static final  String  OUTPUT ="One for %s, one for me.";
    private static final  String  YOU ="you";

    String twofer(String name) {
        String str = Optional.ofNullable(name).orElse(YOU);
        return String.format(OUTPUT, str);
    }
}
