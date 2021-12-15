package edu.northeastern.yanxuan;

public class Robot implements iRobot{

    int roomMatrix[][];
    int spotX;
    int spotY;
    Direction direction;
    public Robot(int[][] roomMatrix) {
        this.roomMatrix = roomMatrix;
        spotX=0;
        spotY=0;
        direction=Direction.DOWN;
    }

    @Override
    public boolean move() {
        int m=roomMatrix.length;
        int n=roomMatrix[0].length;
        if(this.direction==Direction.UP){
            if(spotY-1<0){
                return false;
            }
            if(roomMatrix[spotY-1][spotX]==-1){
                return false;
            }
            spotY--;
            return true;
        }
        else if(this.direction==Direction.DOWN){
            if(spotY+1>=m){
                return false;
            }
            if(roomMatrix[spotY+1][spotX]==-1){
                return false;
            }
            spotY++;
            return true;
        }
        else if(this.direction==Direction.LEFT){
            if(spotX-1<0){
                return false;
            }
            if(roomMatrix[spotY][spotX-1]==-1){
                return false;
            }
            spotX--;
            return true;
        }
        else if(this.direction==Direction.RIGHT){
            if(spotX+1>=n){
                return false;
            }
            if(roomMatrix[spotY][spotX+1]==-1){
                return false;
            }
            spotX++;
            return true;
        }
        return false;
    }

    @Override
    public void turnLeft() {
        if(this.direction==Direction.UP){
            this.direction=Direction.LEFT;
        }
        else if(this.direction==Direction.DOWN){
            this.direction=Direction.RIGHT;
        }
        else if(this.direction==Direction.LEFT){
            this.direction=Direction.DOWN;
        }
        else if(this.direction==Direction.RIGHT){
            this.direction=Direction.UP;
        }
    }

    @Override
    public void turnRight() {
        if(this.direction==Direction.UP){
            this.direction=Direction.RIGHT;
        }
        else if(this.direction==Direction.DOWN){
            this.direction=Direction.LEFT;
        }
        else if(this.direction==Direction.LEFT){
            this.direction=Direction.UP;
        }
        else if(this.direction==Direction.RIGHT){
            this.direction=Direction.DOWN;
        }
    }

    @Override
    public void clean() {
        if(roomMatrix[spotY][spotX]!=-1){
            roomMatrix[spotY][spotX]=1;
        }
    }
}
