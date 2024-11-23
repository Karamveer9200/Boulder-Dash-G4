package boulder_dash_remake;

import javafx.scene.image.Image;
public abstract class Element {

    protected String name;
    protected Image image;
    protected int column;
    protected int row;
    protected boolean canExplode;
    protected boolean canBeEntered;

    public Element(int column, int row) {
        this.column = column;
        this.row = row;
    }

    public String getName() {
        return name;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public boolean isCanExplode() {
        return canExplode;
    }

    public boolean isCanBeEntered() {
        return canBeEntered;
    }

}
