package Question1;

/**
 * @author Shaoshuai Xu
 * @version 1.0
 * @description: Roomba
 * @date 2021/12/14 18:53
 */
public class Roomba implements iRobot{
    private final int[][] room;
    private int[] currentLocation;
    private Direction currentDirection;

    public Roomba(int[][] room) {
        this.room = room;
        currentLocation = new int[]{0, 0};
        currentDirection = Direction.DOWN;
    }

    @Override
    public boolean move() {
        int[] nextLocation = new int[]{currentLocation[0], currentLocation[1]};
        if (currentDirection.equals(Direction.UP)) {
            nextLocation[0] -= 1;
        } else if (currentDirection.equals(Direction.DOWN)) {
            nextLocation[0] += 1;
        } else if (currentDirection.equals(Direction.LEFT)) {
            nextLocation[1] -= 1;
        } else if (currentDirection.equals(Direction.RIGHT)) {
            nextLocation[1] += 1;
        }
        if (nextLocation[0] < 0 || nextLocation[1] >= room.length || nextLocation[1] < 0
                || nextLocation[1] >= room[0].length || room[nextLocation[0]][nextLocation[1]] == -1) {
            return false;
        }
        currentLocation = nextLocation;
        return true;
    }

    @Override
    public void turnLeft() {
        if (currentDirection.equals(Direction.UP)) {
            currentDirection = Direction.LEFT;
        } else if (currentDirection.equals(Direction.DOWN)) {
            currentDirection = Direction.RIGHT;
        } else if (currentDirection.equals(Direction.LEFT)) {
            currentDirection = Direction.DOWN;
        } else if (currentDirection.equals(Direction.RIGHT)) {
            currentDirection = Direction.UP;
        }
    }

    @Override
    public void turnRight() {
        if (currentDirection.equals(Direction.UP)) {
            currentDirection = Direction.RIGHT;
        } else if (currentDirection.equals(Direction.DOWN)) {
            currentDirection = Direction.LEFT;
        } else if (currentDirection.equals(Direction.LEFT)) {
            currentDirection = Direction.UP;
        } else if (currentDirection.equals(Direction.RIGHT)) {
            currentDirection = Direction.DOWN;
        }
    }

    @Override
    public void clean() {
        room[currentLocation[0]][currentLocation[1]] = 1;
    }
}
