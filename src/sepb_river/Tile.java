package sepb_river;

public class Tile {
    DirectionList availableDirections;

    public Tile(Direction oneDirection) {
        availableDirections=new DirectionList();
        availableDirections.add(oneDirection);
    }
    public Tile(Direction firstDirection, Direction secondDirection) {
        availableDirections=new DirectionList();
        availableDirections.add(firstDirection);
        availableDirections.add(secondDirection);
    }  public Tile(Direction firstDirection, Direction secondDirection,
                   Direction thirdDirection) {
        availableDirections=new DirectionList();
        availableDirections.add(firstDirection);
        availableDirections.add(secondDirection);
        availableDirections.add(thirdDirection);
    }
    public Tile(Direction firstDirection, Direction secondDirection,
                Direction thirdDirection, Direction forthDirection) {
        availableDirections=new DirectionList();
        availableDirections.add(firstDirection);
        availableDirections.add(secondDirection);
        availableDirections.add(thirdDirection);
        availableDirections.add(forthDirection);
    }

    public DirectionList getAvailableDirections() {
        return availableDirections;
    }
}
