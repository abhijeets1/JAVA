class A { }  
class B extends A {}

class mainclass2 {

  static B Caster_fun(A aref) {  
       B bref = (B)aref; // downcasting  
       return bref;
  }  

   public static void main (String [] args) {  
    A aref = new B();  
    B bref = Caster_fun(aref); // casting through function.
  }  
}