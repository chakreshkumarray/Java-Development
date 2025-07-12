package Topic8_GenericWildCards.Syntax;

import java.util.ArrayList;

public class SingleA {
    public static void main(String[] args) {

    }

    public <T> T getFirst(ArrayList<T> list){
        return list.get(0);
    }
}
