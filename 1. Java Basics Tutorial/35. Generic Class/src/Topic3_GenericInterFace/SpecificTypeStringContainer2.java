package Topic3_GenericInterFace;

public class SpecificTypeStringContainer2 implements SpecificTypeContainer2<String> {

    private String item;

    @Override
    public void add(String item) {
        this.item = item;
    }

    @Override
    public String get() {
        return item;
    }
}
