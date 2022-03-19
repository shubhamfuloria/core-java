import java.util.ArrayList;

/*
toString(): is a method of java Object class, so this method is available to all objects we create in java.
It converts any object to String

-> When we pass an object reference to System.out.println() method, toString() method is called on the object
   and return of toString() gets printed on the console.
-> When we print an ArrayList or array it is shown in console in a nice bracket look instead of just a reference address.

So how we can achieve the same for our objects ? 
YES you guessed it right, we can simple override toString method. because it is the method which gets called each time we print 
anything into the console.

Let's try it in action
*/

class Animal {
  String name;
  String color;

  public Animal(String name, String color) {
    this.name = name;
    this.color = color;
  }

  public String toString() {
    return "Animal Name: " + this.name + "\nAnimal Color: " + this.color;
  }
}

class Program {

  public static void main(String[] args) {
    ArrayList<Integer> A = new ArrayList<>();
    A.add(10);
    A.add(20);
    A.add(30);
    A.add(40);
    A.add(50);

    String S = A.toString();
    System.out.println(S);

    Animal a1 = new Animal("Dog", "Black");
    System.out.println(a1);
  }
}