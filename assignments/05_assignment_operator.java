class Program {
  /*
   * -> What is a variable ?
   * Variable is just a bit holder with designated type, We can have int bit
   * holder, double bit holde and so on...
   * 
   * IMP: A literal integer is always implicitely an int
   * 
   * How variables are stored in memory
   * inx = 6;
   * is stored like 00000110
   * 
   * int x = 10 //this is called literal assignment
   * We know int are of 4 byte (32 bits)
   * 
   * byte y = 90 //byte are of 1 byte (8 bits) (-128 to 127)
   * so if literal integer are by default a int, then it must be of 32 bits ..
   * right ?
   * 
   * and here we are assigning a 32 bit integer (int) to a 8 bit variable (byte)
   * .. How is that possible ? It's not producing any error .
   * 
   * Because the compiler automatically narrows the literal value to a byte . In
   * other words, the compiler puts in the cast. the above code is identical to
   * byte y = (byte) 90;
   * 
   * 
   * IMPORTANT: literal integer is always int , the result of an expression
   * involving anything int sized of smaller is always int. eg:
   * 1. add two bytes together, we get int
   * 2. multiply int and an short, we get int
   * 3. devide a short by a byte, we get int
   * 4. devide int by a int, we obviously get int
   * 
   * byte a = 3; //works
   * byte b = 8; //works
   * byte c = a + b; //compilation error
   * 
   * because java doesn't implicitly cast any expression, a + b will be of int
   * type.
   * And we are trying to assign a int (32 bits) to a variable (8 bits), so we are
   * getting an error
   * 
   * to fix it we can simply say byte c = (byte) a + b; (explicit casting)
   * 
   * 
   */

  public static void main(String[] args) {
    byte x = 1000;

    System.out.println(x);
  }
}