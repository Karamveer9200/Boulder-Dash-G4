package boulder_dash_remake;

public class Path extends Element {

    public Path(int x, int y) {
        super(x, y);
        canExplode = true;
        canBeEntered = true;
        name = "Path";
    }

}
