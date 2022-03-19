class Program {
  public static void main(String[] args) {
    int n1 = 10; // decimal representation
    int n2 = 0123; // octail representation
    int n3 = 0x12F; // hexa decimal representation
    // float n5 = 23.234; // compiler error, loss of precision
    float n4 = 23.234f; //
    double n6 = 23.234; // no error
    double n7 = 23.234d;
    /*
     * floating points numbers defined as numbers with decimal symbol
     * 
     * 23. 234 is a floating point number;
     * 
     * -> Floating point literals are defined as double(64 bit) by default
     * 
     * -> if we assign a floating point literals to a float type variable,
     * compiler willcomplain about loosy conversion from double to float (we are
     * trying to fit a number into a less precise number)
     * 
     * -> if we want to assign a floating point literal to a variable of type float
     * (32bit), then you must add f/F as suffix of that literal
     * 
     * -> We can also add d as suffix to double literal, but it is optional, as
     * floating point literals are double by default
     * 
     */

    System.out.println(n1 + " " + n2 + " " + n3);

    System.out.println(n4 + " " + n6 + " " + n7);
  }
}