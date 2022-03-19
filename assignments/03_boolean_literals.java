/*
 * -> boolean value can be true or false;
 * -> In some languages (C / C++), it is allowed to use number representation of true or false (1 and 0)
 * -> But this behaviour is not allowed in Java
 * -> Also we can not use numbers, where booleans are requires (in if condition)
*/

class Program {

  public static void main(String[] args) {
    boolean x = 1; // error
    if (1) { // error

    }
  }
}