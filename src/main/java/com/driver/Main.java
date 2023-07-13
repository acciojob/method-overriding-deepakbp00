package com.driver;
class A{
String meth(){
  return "Invoking method from class A";
}
}
class B extends A{
  String meth(){
  return "Method is overridden in Extended class B";
  }
}
public class Main {
  public static void main(String args[]){
   B objB = new A();
    System.out.println(objB.meth);
   B objBoverridden = new B();
    System.out.println(objBoverridden.meth);
  }
}
