package Topic7_GenericMethods.Enumeration;

public enum Operation {

    Add, Subtract, Multiply ,Divide;

    public < T extends Number > double apply(T a , T b){

        switch (this){
            case Add :
                return a.doubleValue() + b.doubleValue();
            case Subtract:
                return a.doubleValue() - b.doubleValue();
            case Multiply:
                return a.doubleValue() * b.doubleValue();
            case Divide:
                return a.doubleValue() / b.doubleValue();
            default:
                throw new AssertionError("Unknown expression "+ this);
        }

    }
}
