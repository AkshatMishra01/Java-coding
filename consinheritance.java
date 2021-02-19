class Base
{ 
    int x;
    public:
    // default constructor
    Base() 
    { 
        cout << "Base default constructor\n"; 
    }
};

class Derived : public Base
{ 
    int y;
    public:
    // default constructor
    Derived() 
    { 
        cout << "Derived default constructor\n"; 
    }
    // parameterized constructor
    Derived(int i) 
    { 
        cout << "Derived parameterized constructor\n"; 
    }
};

int main()
{
    Base b;        
    Derived d1;    
    Derived d2(10);
}
