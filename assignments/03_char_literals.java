class Program {
  /*
   * -> A char literal is represented by a character in single quotes
   * -> You can also type the unicode value of characters using unicode notation
   * (\\u as prefix)
   * -> In java characters are of 2 byte (although in C/C++ chars are of 1 byte)
   * -> int are of 4 byte in Java
   * -> We can assign a number literal to into the character (65535)
   **/

  public static void main(String[] args) {
    char c1 = 'H';
    char c2 = '\u004E'; // unicode for N
    char c3 = '\u2665'; // unicode for heart

    System.out.println(c2 + " " + c3);

    char c4 = 10;
    System.out.println(c4);

    // char c5 = 100000; // will produce an error of precision (becuase this int
    // literal is greater than two byte)
    char c5 = (char) 10000000;

    System.out.println(c5);
  }
}
