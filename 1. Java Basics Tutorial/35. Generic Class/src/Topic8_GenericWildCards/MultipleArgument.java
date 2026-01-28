package Topic8_GenericWildCards;

import java.util.ArrayList;

public class MultipleArgument {
    public static void main(String[] args) {

        ArrayList<?> num = new ArrayList<String>();
        // num.add("Hello");    not able to add

    }

    public <T> void copy(ArrayList<T> source, ArrayList<T> destination){

        for (T item : source){
            destination.add(item);
        }
    }
}
