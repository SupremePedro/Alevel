package ua.com.alevel.classworks.lesson11.enums;

public class ColorProvider {
    private Colors colors;

    public ColorProvider(Colors color){
        this.colors = color;
    }

    public Colors getColors() {
        return colors;
    }

    public void setColors(Colors colors) {
        this.colors = colors;
    }
}
