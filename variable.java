//local static and instance variable in java



class variable {
  static int b=20;
  int c=30;
   void fun(){
    System.out.println(variable.b);
    //  System.out.println(a);
    //  System.out.println(Ref.c);  
   }

 
  public static void main(String args[]){

variable ref= new variable();

    int a= 10;//local variable
    System.out.println(a);
    System.out.println(variable.b);
    System.out.println(ref.c);
    ref.fun();


  }
  
  
  }
  


