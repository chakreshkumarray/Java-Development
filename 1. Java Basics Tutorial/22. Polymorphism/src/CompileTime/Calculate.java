package CompileTime;

public class Calculate {
    public static void main(String[] args) {
        System.out.println(Sum(15,20));
        System.out.println(Sum(11,24,12));
        System.out.println(Sum(1.5f,2.3f));
    }
    /*
    Compile Time Polymorphism achieved by Method Over Loading
     */

    public static int Sum(int a , int b){
        return a + b;
    }

    public static int Sum(int a ,int b,int c){
        return a + b + c;
    }

    public static double Sum(float a , float b){
        return a + b;
    }
    
}

/*
🔷 1. What is Polymorphism?
Ans. Polymorphism means “many forms”
     Same method name → different behavior

✅ 1. Compile-Time Polymorphism (Static)
👉 Achieved by Method Overloading

✅ 2. Runtime Polymorphism (Dynamic)
👉 Achieved by Method Overriding

🔷 3. Why Do We Need Polymorphism?
👉 This is the MOST important interview part 👇
    Flexibility -> Same reference → different behavior
    Code Reusability -> Use common interface → reuse logic
    Loose Coupling -> Code depends on parent class, not child -> Easier to change implementation
    Extensibility -> Add new classes without changing existing code

🔷 4. Overloading and Overriding
Ans.

 */