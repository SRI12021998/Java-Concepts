package staticnonstatic;

public class ExecutionOrderDemo 
{

    // Static block (runs only once when class loads)
    static {
        System.out.println("1. Static block - runs first, only once when class is loaded");
    }

    // Non-static block (runs every time before constructor)
    {
        System.out.println("3. Non-static block - runs before constructor for every object");
    }

    // Constructor (runs after non-static block)
    public ExecutionOrderDemo() {
        System.out.println("4. Constructor - runs after non-static block");
    }

    // Static method
    public static void staticMethod() {
        System.out.println("Static method - runs only when called");
    }

    // Non-static method
    public void nonStaticMethod() {
        System.out.println("Non-static method - runs only when called");
    }

    // Main method (runs after static block)
    public static void main(String[] args) {
        System.out.println("2. Main method - runs after static block");

        // Creating first object
        ExecutionOrderDemo obj1 = new ExecutionOrderDemo();

        // Creating second object
        ExecutionOrderDemo obj2 = new ExecutionOrderDemo();

        // Calling methods
        staticMethod();
        obj1.nonStaticMethod();
    }


}
