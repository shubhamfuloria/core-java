class Animal {
  private String name;

  Animal(String name) {
    this.name = name;
  }
}

class Program {
  public static void main(String[] args) {

    Animal a1 = new Animal("Dog");
    Animal a2 = new Animal("Dog");

    System.out.println(a1.equals(a2)); // false
    System.out.println(a1 instanceof Animal); // true
    System.out.println(a2 instanceof Object); // true

    // ---------------------------------//
    System.out.println(a1.hashCode());
    System.out.println(a1.toString());
  }
}

/*
 * We can see we are using equals method on a1 object which is an instance of
 * Animal
 * but if we look into our Animal class we do not see any equals method ?
 * Then how we are able to use it ?
 * 
 * And on line 17
 * a1 is an instance of Object returning true ...OMG?
 * We just created the object a2 from Animal class... what's going on damn it !
 * 
 * 
 * Actually whenever we create any class in java it automatically inherits
 * (extends) from the class Object, which is root in the class hierarchy.
 * 
 * class Object contains some important methods:
 * -> equals()
 * -> toString()
 * -> hashCode()
 * 
 * 
 * So in a nutsheel every class in Java has Object as superclass.
 */