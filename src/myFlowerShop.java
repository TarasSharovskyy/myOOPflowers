import java.util.ArrayList;

public class myFlowerShop {
    private ArrayList<myBouquet> bouquets = new ArrayList<>();

    public ArrayList<myBouquet> getBouquets() {
        return bouquets;
    }

    public void addBouquets(myBouquet bouquet){
        bouquets.add(bouquet);
    }
}
