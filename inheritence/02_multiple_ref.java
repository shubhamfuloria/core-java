class GameShape {
  public void displayShape() {
    System.out.println("Displaying the shape");
  }
}

interface Animatable {
  public void animate();
}

class PlayerPiece extends GameShape implements Animatable {
  public void movePiece() {
    System.out.println("Moving the piece.");
  }

  public void animate() {
    System.out.println("Animating the player piece.");
  }
}

class Program {
  public static void main(String[] args) {
    PlayerPiece player = new PlayerPiece();
    GameShape shape = player;
    Animatable mover = player;
    Object o = player;

    shape.displayShape();
    player.displayShape();
    Animatable.displayShape();// displayShape is undefined for type Animatable.

    /*
     * These all are valid , we can reference an object from either it's class or
     * the classes or interfaces from which it is inherting.
     * 
     * But which reference variable will be able to call displayShape() ? Why ?
     * GameShape.displayShape();
     * PlayerPiece.displayShape();
     * 
     * 
     * 
     */
  }
}