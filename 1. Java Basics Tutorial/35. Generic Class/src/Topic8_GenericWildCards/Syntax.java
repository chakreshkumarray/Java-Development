package Topic8_GenericWildCards;

import java.util.ArrayList;

public class Syntax {
    public static void main(String[] args) {

    }

    public <T> T getFirst(ArrayList<T> list){
        return list.get(0);
    }
}
