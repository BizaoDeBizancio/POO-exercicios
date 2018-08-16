package viking;

import pilha.*;

public class Timoneiro extends Viking {
    
    @Override
    public String grita(int pos) {
        return pos+" Timoneiro. ARRGH!";
    }
}