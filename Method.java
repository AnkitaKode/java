public class Method {

  // Constructor method
  Method() { // Corrected the constructor name to match the class name
      System.out.println("Constructor method is called when an object of its class is created");
  }

  // Non-static method
  void nonStaticMethod() {
      System.out.println("Non-static method must be called by creating an object");
  }

  // Static method
  static void myStaticMethod() {
      System.out.println("Static methods can be called without creating objects");
  }

  // Public method
  public void myPublicMethod() {
      System.out.println("Public methods must be called by creating objects");
  }

  // Main method
  public static void main(String[] args) {
      myStaticMethod(); // Call the static method
      // myPublicMethod(); This would compile an error

      Method myObj = new Method(); // Create an object of Method
      myObj.myPublicMethod(); // Call the public method on the object
      myObj.nonStaticMethod();
  }
}
