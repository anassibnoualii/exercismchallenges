import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.reverse;

class HandshakeCalculator {

    List<Signal> calculateHandshake(int number) {
        List<Signal> signalList = new ArrayList<>();
            if((number&1 )>0) signalList.add(Signal.WINK);
            if((number&2 )>0) signalList.add(Signal.DOUBLE_BLINK);
            if((number&4 )>0) signalList.add(Signal.CLOSE_YOUR_EYES);
            if((number&8 )>0) signalList.add(Signal.JUMP);
            if((number&16 )>0) reverse(signalList);

        return signalList;
    }

}
