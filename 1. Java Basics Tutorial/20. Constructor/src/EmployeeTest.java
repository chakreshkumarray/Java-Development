public class EmployeeTest {
    public static void main(String[] args) {

        Employee employee = new Employee(); // object

        employee.Name = "Ck";
        employee.emp_id = 123;
        System.out.println(employee.Name);
        System.out.println(employee.emp_id);

        // Garbage Collection

        Employee employee2 = new Employee();
        employee2 = null; // This is Eligible for Garbage Collection
                          // Object has no reference → eligible for GC
    }
}
/*
🔷 1. Garbage Collection (GC) in Java
🔹 What is Garbage Collection?

Garbage Collection is an automatic memory management process in Java.

👉 It removes unused objects from memory (Heap).

🔹 How GC Works (Simple)
Objects created → Heap memory
JVM tracks references
No reference → eligible for GC
Garbage Collection removes it

Q3: What is memory leak in Java?
Ans. When objects are unused but still referenced

🔹 Why do we need GC?
✅ 1. Automatic Memory Management
No need to manually free memory (like C/C++)

✅ 2. Prevent Memory Leaks
Removes unused objects

✅ 3. Improves Performance
Frees memory for new objects
 */