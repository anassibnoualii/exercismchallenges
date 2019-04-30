import java.util.*;
import java.util.stream.Collectors;

import static java.util.Collections.reverse;

class HandshakeCalculator {

    private static final int REVERSE = 16;

    List<Signal> calculateHandshake(int number) {
        List<Signal> signalList =  Arrays.stream(Signal.values()).filter(signal -> (number & signal.getIndex()) > 0).collect(Collectors.toList());
        if((number & REVERSE)>0) reverse(signalList);
        return signalList;
    }

}
