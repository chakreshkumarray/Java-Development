public class FinalKeyword {

    /*
    not update value or variable
    not override method
    not inherit same class, not able to extend class
     */
    public static void main(String[] args) {

        // int i = 10;
        final int i = 10;
        // i = i + 20;       --> error not able to update
        System.out.println(i);

    }

}
/*
🔷 1. What is final Keyword?
final is used to restrict modification.

It can be applied to:
Variable
Method
Class

🔷 2. final Variable
Once assigned → value cannot be changed

🔷 3. final Method
Cannot be overridden


 */