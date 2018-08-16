package viking;

import pilha.*;

public class Remador extends Viking {
    
    @Override
    public String grita(int pos) {
        return pos+" Remador. ARRGH!";
    }
}