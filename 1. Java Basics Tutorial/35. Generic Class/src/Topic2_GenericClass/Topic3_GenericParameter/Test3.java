package Topic2_GenericClass.Topic3_GenericParameter;

class Test3 {
    public static void main(String[] args) {

        Pair<String,Integer> pair = new Pair<>("Age",23);

        System.out.println("Key: " + pair.getKey());         // Prints: Key: Age
        System.out.println("Value: " + pair.getValue());      // Prints: Value: 30
    }
}
