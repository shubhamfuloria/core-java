class Program {
  /*
   * -> Casting: converting primitive value from one type to another (object can
   * also be cast though :P)
   * -implicit casting
   * -explicit casting
   * 
   * IMPLICIT CASTING: the conversion happens automatically.Typically implicit
   * cast happens when you are doing widening conversion, which means putting
   * smaller things(short, byte, ) into bigger contianer (int).
   * 
   * Loss of precision compile time error occurs when we try to put bigger thing
   * into a smaller container.
   * 
   */

  public static void main(String[] args) {
    int a = 100;
    long b = a; // legal
    double d = b; // legal
    // bacause long is of 8 byte, double is also of 8 byte
    // so double can store each bit of info that long can store.
    System.out.println(b + " " + d);

    // explicit cast
    float x = 2.3423f;
    int y = (int) x; // here we will lose some information (loses all digits after the decimal point)
    System.out.println(x + " " + y);

    // int z = d; // illegal
    // int (32 bit) can not store a value of 8 byte ( 64 bit )

    int Z = (int) d; // legal
    System.out.println(Z);

    // int to byte

    int A = 80;
    byte B = (byte) A; // Works fine
    System.out.println(B);

    // what if value is larger than 127

    byte C = (byte) 150;
    System.out.println(C); //we get a negative value :(
  }
}