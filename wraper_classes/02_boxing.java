class Program {
  /*
   * REMEMBER WRAPPER OBJECTS ARE IMMUTABLE
   * Autoboxing is a feature which was introduced in Java5
   * Before java5, if you want to use the wrapper object
   * you have to do the following:
   * 1. make it
   * 2. unwrap it
   * 3. use it
   * 4. rewrap it
   * 
   */

  public static void main(String[] args) {
    // before java5
    Integer y = new Integer(5); // creating it
    // now I want to increment the value of y by 1 and print it
    int x = y.intValue();
    x++;
    y = new Integer(x);
    System.out.println(x);

    // after java5
    // no need to wrap and rewrap
    Integer a = new Integer(5);
    a++;
    /*
     * As we know wrapper objects are immutable, but here we are mutating them ..
     * right?
     * How is that possible ?
     * for a++, under the hood java
     * unwraps it
     * increments the value
     * creates a new wrapper object with incremented value
     * and assign the new wrapper object to a
     */
    System.out.println(a);

    Integer x1 = 520;
    Integer x2 = x1;
    // both are pointing to same reference
    System.out.println(x1 == x2); // true

    x2++;// a new wrapper object is created
    /*
     * UNDER THE HOOD
     * int temp = x2.intValue(); //unwrap it
     * temp++; //increment
     * x2 = new Integer(temp) //rewrap it
     * 
     * x1 remains untouched.
     */
    System.out.println(x1 == x2); // false
    System.out.println(x1 + "  " + x2);
    // now they are pointing to different memory location, they are not same anymore

  }
}
/*
 * Wrapping and unwrapping is done for us automatically with us doing anything
 * this is called autoboxing.
 * 
 */