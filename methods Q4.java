public class Program {
    // Constructor
    public Program() {
        System.out.println("Constructor called.");
    }

    // Non-static method
    public void nonStaticMethod() {
        System.out.println("This is a non-static method.");
    }

    // Static method 1
    public static void staticMethod1() {
        System.out.println("This is static method 1.");
    }

    // Static method 2
    public static void staticMethod2() {
        System.out.println("This is static method 2.");
    }

    // Main method
    public static void main(String[] args) {
        // Creating an instance of the Program class
        Program program = new Program();

        // Calling the non-static method
        program.nonStaticMethod();

        // Calling the static methods
        staticMethod1();
        staticMethod2();
    }
}
