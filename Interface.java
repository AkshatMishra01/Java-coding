// An interface is a reference type in Java. It is similar to class. It is a collection of abstract methods. A class implements an interface, thereby inheriting the abstract methods of the interface.

// Along with abstract methods, an interface may also contain constants, default methods, static methods, and nested types. Method bodies exist only for default methods and static methods.

// Writing an interface is similar to writing a class. But a class describes the attributes and behaviors of an object. And an interface contains behaviors that a class implements.

// Syntax  :

interface <interface_name> {
    
    // declare constant fields
    // declare methods that abstract 
    // by default.
}

// Program:

import java.io.*; 
  
// A simple interface 
interface In1 
{ 
    // public, static and final 
    final int a = 10; 
  
    // public and abstract  
    void display(); 
} 
  
// A class that implements the interface. 
class TestClass implements In1 
{ 
    // Implementing the capabilities of 
    //  interface. 
    public void display() 
    { 
        System.out.println("Geek"); 
    } 
  
    // Driver Code 
    public static void main (String[] args) 
    { 
        TestClass t = new TestClass(); 
        t.display(); 
        System.out.println(a); 
    } 
} 
