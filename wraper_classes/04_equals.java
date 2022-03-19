import java.util.HashMap;
import java.util.HashSet;

class Animal {
  String name;
  String color;

  public Animal(String name, String color) {
    this.name = name;
    this.color = color;
  }

  public String toString() {
    return this.name + " " + this.color;
  }

  public boolean equals(Object o) {
    System.out.println("Running");
    return this.name == ((Animal) o).name;
  }

  public int hashCode() {
    System.out.println("Hashcode running");
    return this.name.hashCode();
  }
}

class Program {
  public static void main(String[] args) {
    Animal a1 = new Animal("Dog", "Black");
    Animal a2 = new Animal("Cat", "White");
    Animal a3 = new Animal("Dog", "Black");
    Animal a4 = new Animal("Dog", "Black");
    Animal a5 = new Animal("Dog", "Black");
    Animal a6 = new Animal("Dog", "Black");
    Animal a7 = new Animal("Dog", "Black");

    HashSet<Animal> set = new HashSet<>();
    HashMap<Animal, Integer> map = new HashMap<>();

    set.add(a1);
    set.add(a2);
    set.add(a3);
    set.add(a4);
    set.add(a5);
    set.add(a6);
    set.add(a7);

    map.put(a1, 1);
    map.put(a2, 1);
    map.put(a3, 1);
    map.put(a4, 1);

    System.out.println(set);
    System.out.println(map);

  }
}