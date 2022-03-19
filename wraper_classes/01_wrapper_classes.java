class Program {
  /*
   * Wrapper class mainly serves two purposes in java
   * 1. to provide a mechanism to wrap primitive values in an object so primitives
   * can be included in activies, reserved for objects only like being added to
   * collections or return from an method with object return value;
   * 
   * 2. To provide assortment of utility functions to primitives.
   * 
   * 
   * primitive --> Wrapper Class --> Constructor Arguments
   * 
   * boolean --> Boolean --> booelean or String
   * byte --> Byte --> byte or String
   * char --> Character --> char
   * double --> Double --> double or String
   * float --> Float --> float, double or String
   * int --> Integer --> int or String
   * long --> Long --> long or String
   * short --> Short --> short or String
   *
   * Wrapper Objects are immutable, once they have been given a value that value
   * can not be changed.
   * 
   * 
   * --> valueOf : returns a newly created wrapped object of the type that invoked
   * the function
   * --> xxxValue() : converts value of a wrapped primitive object to primitive
   * value
   * ---> parseXXX() : similar to valueOf, but returns a primitive
   * 
   * toString() method is overloaded in all wapper classes, so when we print any
   * wrapper object, we get the value of that object instead of just a reference
   */

  public static void main(String[] args) {

    Integer x = new Integer(23);
    Integer y = new Integer("23");
    // Integer z = new Integer("2a3");

    System.out.println(x + " " + y);

    Integer z = Integer.valueOf("99");
    System.out.println(z);

    System.out.println(z.intValue());
    Character c = 'a';
    System.out.println(c.charValue());
  }
}