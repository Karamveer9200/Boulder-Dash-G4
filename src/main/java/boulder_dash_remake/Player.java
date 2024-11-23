package boulder_dash_remake;

import javafx.scene.image.Image;
public class Player extends Element {
    public Player(int x, int y){
        super(x,y);
        canExplode = true;
        image = new Image("player.png");
        canBeEntered = true;
        name = "Player";
    }

    @Override
    public String toString() {
        return "Player";
    }
}
