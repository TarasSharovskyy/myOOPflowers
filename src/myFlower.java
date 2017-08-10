public abstract class myFlower {
    private flowerName flowerName;
    private flowerColor color;
    private Integer flowerPrice;
    private Integer flowerLength;
    private flowerFreshness flowerFreshness;

    public myFlower(flowerName flowerName, flowerColor color, Integer flowerPrice, Integer flowerLength, flowerFreshness flowerFreshness) {
        this.flowerName = flowerName;
        this.color = color;
        this.flowerPrice = flowerPrice;
        this.flowerLength = flowerLength;
        this.flowerFreshness = flowerFreshness;
    }

    public flowerName getFlowerName() {
        return flowerName;
    }

    public void setFlowerName(flowerName flowerName) {
        this.flowerName = flowerName;
    }

    public flowerColor getColor() {
        return color;
    }

    public void setColor(flowerColor color) {
        this.color = color;
    }

    public Integer getFlowerPrice() {
        return flowerPrice;
    }

    public void setFlowerPrice(Integer flowerPrice) {
        this.flowerPrice = flowerPrice;
    }

    public Integer getFlowerLength() {
        return flowerLength;
    }

    public void setFlowerLength(Integer flowerLength) {
        this.flowerLength = flowerLength;
    }

    public flowerFreshness getFlowerFreshness() {
        return flowerFreshness;
    }

    public void setFlowerFreshness(flowerFreshness flowerFreshness) {
        this.flowerFreshness = flowerFreshness;
    }

    @Override
    public String toString() {
        return "myFlower{" +
                "flowerName=" + flowerName +
                ", color=" + color +
                ", flowerPrice=" + flowerPrice +
                ", flowerLength=" + flowerLength +
                ", flowerFreshness=" + flowerFreshness +
                '}';
    }
}
