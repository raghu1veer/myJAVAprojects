import java.util.Scanner;

import static javax.print.attribute.standard.MediaSizeName.A;

class Products{
    private int productID;
    private String name;
    private int price;


    public void discountAvailability(){

    }
    Products(int productID,String name,int price){
        this.productID = productID;
        this.name = name;
        this.price=price;

    }

    public int getProductID() {
        return productID;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}

class Electronics extends Products{
    private boolean isAvailability;
    private boolean isWarranty;
    private double newPrice;


    public Electronics(int productID, String name, int price,boolean isWarranty) {
        super(productID, name, price);
        this.isWarranty = isWarranty;

    }

    public double getnewPrice(){
        newPrice = getPrice()*0.9;
        return newPrice;
    }


    @Override
    public void discountAvailability() {
        System.out.println("Electronic items has a discount of 10%");
        System.out.println("after discount new price is " + getnewPrice());

    }
    public void Maintenance(){
        if(isWarranty){
            System.out.println("Your product can be maintained without any cost");
        }else{
            System.out.println("you have yo pay for the maintenance");
        }
    }

}
class Clothing extends Products{
    private String size;
    private double newprice;

    public Clothing(int productID, String name, int price, String size) {
        super(productID, name, price);
        this.size = size;
    }

    public String getSize() {
        return size;
    }
    public double getnewPrice(){
        newprice = getPrice()*0.5;
        return newprice;
    }


    public void discountAvailability() {
        System.out.println("50% discount is available");
        System.out.println("New price is " + getnewPrice());
    }
}
class Groceries extends Products{
    private boolean isExpired;

    public Groceries(int productID, String name, int price, boolean isExpired) {
        super(productID, name, price);
        this.isExpired = isExpired;
    }

    @Override
    public void discountAvailability() {
        System.out.println("no discount available");
    }



    public void checkExpiry(){
        if(!isExpired){
            System.out.println("the product is fresh");
        }else{
            System.out.println("product is expired");
        }

    }
  
}




public class OnlineShoppingSystem {
    public static void main(String[] args) {
        System.out.println("welcome to ths the online shopping system");
        System.out.println("choose what you want to order :");
        System.out.println(" 1.ELECTRONICS    2.CLOTHES     3.GROCERIES    ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        if (choice == 1) {
            System.out.println("you want to buy or maintenance something(press A for buying B for maintenance  :");
            Scanner sc1 = new Scanner(System.in);
            String ans = sc1.nextLine();

            if (ans.equalsIgnoreCase("A")){

                System.out.println("welcome to the electronic shops");
                System.out.println("suppose you have chosed macbook ");
                Electronics electronics = new Electronics(123, "Macbook", 100000,true);
                electronics.discountAvailability();
                electronics.getnewPrice();

            } else {
                System.out.println("you have choosed maintenace(suppore for dell laptop");
                Electronics electronics = new Electronics(321, "dell laptop", 50000 ,true);
                electronics.Maintenance();

            }


        }if(choice == 2){
            System.out.println("welcome to the clothe section :");
            System.out.println("select the size :");
            Scanner sc2 = new Scanner(System.in);
            String s = sc2.nextLine();
            Clothing clothing = new Clothing(11,"T-shirt",200,"M");
            ;clothing.getSize();
            clothing.discountAvailability();
            clothing.getnewPrice();
        }
        if( choice == 3 ){
            System.out.println("you have selected groceries :");
            System.out.println("say you selected mustard oil");
            Groceries groceries = new Groceries(001,"Mustard oil",120,false);
            groceries.checkExpiry();
            groceries.discountAvailability();
        }
    }

    }

