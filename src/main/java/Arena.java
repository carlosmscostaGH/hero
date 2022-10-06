import com.googlecode.lanterna.input.KeyStroke;
import com.googlecode.lanterna.input.KeyType;
import com.googlecode.lanterna.screen.Screen;

import javax.swing.*;

public class Arena {
    private int height;
    private int width;
    private Hero hero;

    public Arena(int height, int width) {
        this.height = height;
        this.width = width;
    }
    public void processKey(KeyStroke key){
        if (key.getKeyType() == KeyType.ArrowLeft) moveHero(hero.moveLeft());
        if (key.getKeyType() == KeyType.ArrowRight) moveHero(hero.moveRight());
        if (key.getKeyType() == KeyType.ArrowUp) moveHero(hero.moveUp());
        if (key.getKeyType() == KeyType.ArrowDown) moveHero(hero.moveDown());
    }
    public void draw(Screen screen){
        hero.draw(screen);
    }
    public void moveHero(Position position) {
        if (canHeroMove(position))
            hero.setPosition(position);
    }
    public boolean canHeroMove(Position position){
        if (position.getX() >= width || position.getY() >= height) return false;
        if (position.getX() < 0 || position.getY() < 0) return false;
        return true;
    }
}
