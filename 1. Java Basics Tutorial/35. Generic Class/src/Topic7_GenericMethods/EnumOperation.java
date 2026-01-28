package Topic7_GenericMethods;

public enum EnumOperation {

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

    public static void main(String[] args) {
        double res1 = EnumOperation.Add.apply(12,31);
        System.out.println(res1);
    }
}
