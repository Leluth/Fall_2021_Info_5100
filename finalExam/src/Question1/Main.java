package Question1;

import java.util.Arrays;

/**
 * @author Shaoshuai Xu
 * @version 1.0
 * @description: Main
 * @date 2021/12/14 19:12
 */
public class Main {
    public static void main(String[] args) {
        int[][] map = new int[][]{
                {0, -1, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}};
        Roomba roomba = new Roomba(map);
        roomba.turnLeft();
        System.out.println(roomba.move());
        roomba.turnRight();
        System.out.println(roomba.move());
        roomba.clean();
        System.out.println(Arrays.deepToString(map));
        roomba.turnRight();
        System.out.println(roomba.move());
    }
}
