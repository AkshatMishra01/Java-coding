// The final keyword in java is used to declare the finl value, final declaration or to stopthe process of inheritance in java

class Bike9{  
 final int speedlimit=90;//final variable  
 void run(){  
  speedlimit=400;  
 }  
 public static void main(String args[]){  
 Bike9 obj=new  Bike9();  
 obj.run();  
 }  
}

// final method in java 

class Bike{  
  final void run(){System.out.println("running");}  
}  
     
class Honda extends Bike{  
   void run(){System.out.println("running safely with 100kmph");}  
     
   public static void main(String args[]){  
   Honda honda= new Honda();  
   honda.run();  
   }  
}  

// java final class
final class Bike{}  
  
class Honda1 extends Bike{  
  void run(){System.out.println("running safely with 100kmph");}  
    
  public static void main(String args[]){  
  Honda1 honda= new Honda1();  
  honda.run();  
  }  
}  

// final method doesnot get inherited injava

class Bike{  
  final void run(){System.out.println("running...");}  
}  
class Honda2 extends Bike{  
   public static void main(String args[]){  
    new Honda2().run();  
   }  
}  
