abstract class vehicle{  
abstract void run();  
}  

class bike extends vehicle{  
void run(){System.out.println("running bike");}  
}  
class car extends vehicle{  
void run(){System.out.println("running car");}  
}  

class TestAbstraction1{  
public static void main(String args[]){  
vehicle v=new car();
v.run();  
}  
}  
