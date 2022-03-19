class Program {
  /*
   * equals() : to determine two instances of a given class meaningfully
   * equvalent.
   * 
   * for wrapper classes, two objects are equal if they are of the same type and
   * have the same value;
   */

  public static void main(String[] args) {
    Integer i1 = 1000;
    Integer i2 = 1000;

    System.out.println(i1 != i2); // true because there ref should not be same
    System.out.println(i1.equals(i2)); // true , because their values are same (1000)

    Integer i3 = 127;
    Integer i4 = 127;

    System.out.println(i3 == i4); // true
    /*
     * Isn't it contradictory i1 != i2 is true, and i3 == i4 is also true ? HOw ?
     * lets understand
     * In order to save memory, two instances of the following wrapper object
     * (created through boxing) will always be == (ref wise)when there primitive
     * value is same
     * Boolean
     * Byte
     * Character (from 0 to 127)
     * Short and Integer (from -128 to 127)
     * 
     * 
     * EXTRA: When == is used to compare primitive to a wrapper , the wrappper will
     * be unwrapped and comparison will be primitive to primitive
     */
    System.out.println(i3.equals(i4));

  }
}