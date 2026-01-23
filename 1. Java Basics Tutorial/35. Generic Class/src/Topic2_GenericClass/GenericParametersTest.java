package Topic2_GenericClass;

class GenericParametersTest {
    public static void main(String[] args) {

        GenericParameters<String,Integer> pair = new GenericParameters<>("Age",23);

        System.out.println("Key: " + pair.getKey());         // Prints: Key: Age
        System.out.println("Value: " + pair.getValue());      // Prints: Value: 30
    }
}
