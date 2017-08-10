public class Main {
    public static void main(String args[]) {
        myFlowerShop flowerShop = new myFlowerShop();

    //add myBouquet #1
        myBouquet myBouquet = new myBouquet();
        myBouquet.addMyFlower(new Tulip(flowerName.TULIP, flowerColor.YELLOW, 23, 45, flowerFreshness.FRESH));
        myBouquet.addMyFlower(new Rose(flowerName.ROSE, flowerColor.RED, 55, 60, flowerFreshness.FRESH));
        flowerShop.addBouquets(myBouquet);

     //add myBouquet #2
        myBouquet = new myBouquet();
     //second method to add flower with enums
        myBouquet.addMyFlower(new myFlower(flowerName.SUNFLOWER, flowerColor.YELLOW,13,77,flowerFreshness.FRESH) {});

        myBouquet.addMyFlower(new Tulip(flowerName.TULIP, flowerColor.VIOLET, 13, 21, flowerFreshness.STALE));
        myBouquet.addMyFlower(new Rose(flowerName.SUNFLOWER, flowerColor.PINK, 100, 70, flowerFreshness.FRESH));
        myBouquet.addMyFlower(new Rose(flowerName.ROSE, flowerColor.WHITE, 111, 30, flowerFreshness.STALE));
        flowerShop.addBouquets(myBouquet);

        for (myBouquet bouquet1:flowerShop.getBouquets()){
            System.out.println(String.format("Bouquet cost: " + bouquet1.getPrice()+"$"));
        }

    //freshest myBouquet
        myBouquet myFreshBouquet = null;
        for (myBouquet testBouquet: flowerShop.getBouquets()){
            if (myFreshBouquet==null|| testBouquet.geFlowerFreshness()>myFreshBouquet.geFlowerFreshness()){
                myFreshBouquet = testBouquet;
            }}
        if (myFreshBouquet!=null){
            System.out.println("fresh bouquet: " + myFreshBouquet.toString() );
        } else {
            System.out.println("Please add more bouquets...");
        }
    //longest flower
        myFlower myLongestFlower = null;
        for (myBouquet testBouquet : flowerShop.getBouquets()) {
            for (myFlower myFlower : testBouquet.getFlowers()) {
                if (myLongestFlower == null || myFlower.getFlowerLength() > myLongestFlower.getFlowerLength()) {
                    myLongestFlower = myFlower;
                }}
                if (myLongestFlower != null) {
                    System.out.println("Longest flower: " + myLongestFlower.getFlowerLength() + "cm " + myLongestFlower.getFlowerName() + " " + myLongestFlower.getFlowerPrice() + "$");
                } else {
                    System.out.println("please, add more flowers");
                }
            }
        }







    }

