import java.util.ArrayList;

public class myBouquet {
    ArrayList<myFlower> myFlowers = new ArrayList<>();

    public ArrayList<myFlower> getFlowers() {
        return myFlowers;
    }

    public void addMyFlower(myFlower myFlower){
        myFlowers.add(myFlower);
    }

    public Integer getPrice(){
        Integer price = 0;
        for (myFlower myFlower : myFlowers){
            price += myFlower.getFlowerPrice();
        }
        return price;
    }

    public float geFlowerFreshness() {
        Integer freshFlowers = 0;
        for (myFlower myFlower : myFlowers) {
            if (myFlower.getFlowerFreshness().equals(flowerFreshness.FRESH))
                freshFlowers++;
        }
    return (float) freshFlowers/myFlowers.size();
    }

    @Override
    public String toString() {
        return "myBouquet{" +
                "myFlowers=" + myFlowers +
                '}';
    }
}
