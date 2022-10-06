import com.googlecode.lanterna.TextCharacter;
import com.googlecode.lanterna.screen.Screen;

public class Hero {
    private Position position;

    public Hero(Position position) {
        this.position = position;
    }

    public Position moveUp() {
        return new Position(position.getX(), position.getY() - 1);
    }
    public Position moveDown() {
        return new Position(position.getX(), position.getY() + 1);
    }
    public Position moveRight() {
        return new Position(position.getX()+ 1, position.getY());
    }
    public Position moveLeft() {
        return new Position(position.getX() - 1, position.getY());
    }

    public void draw(Screen screen){
        screen.setCharacter(getPosition().getX(), getPosition().getY(), TextCharacter.fromCharacter('X')[0]);
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}