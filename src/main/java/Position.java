public class Position {
    private int x;
    private int y;

    public Position(int x, int i) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public void moveUp(){
        y -= 1;
    }
    public void moveDown(){
        y += 1;
    }
    public void moveRight(){
        x += 1;
    }
    public void moveLeft(){
        x -= 1;
    }
}
