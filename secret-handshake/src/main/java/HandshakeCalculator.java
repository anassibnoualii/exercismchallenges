import java.util.*;
import java.util.stream.Collectors;

import static java.util.Collections.reverse;

class HandshakeCalculator {

    List<Signal> calculateHandshake(int number) {
        List<Signal> signalList =  Arrays.stream(Signal.values()).filter(signal -> (number & signal.getIndex()) > 0).collect(Collectors.toList());
        if((number&16 )>0) reverse(signalList);
        return signalList;
    }

}
