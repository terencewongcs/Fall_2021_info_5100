package edu.northeastern.yanxuan;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[][] room={
                {0,0,0,0},
                {0,0,0,0},
                {-1,0,0,0},
                {0,0,-1,0},
                {0,-1,0,0}
        };

        Robot robot=new Robot(room);

        robot.clean();
        System.out.println(robot.move());
        robot.clean();
        System.out.println(robot.move());
        robot.turnLeft();
        System.out.println(robot.move());
        robot.clean();
        System.out.println(robot.move());
        robot.clean();
        System.out.println(robot.move());
        robot.clean();
        System.out.println(robot.move());
        robot.clean();
        robot.turnRight();
        System.out.println(robot.move());
        robot.clean();
        robot.turnRight();
        System.out.println(robot.move());
        robot.clean();
    }
}
