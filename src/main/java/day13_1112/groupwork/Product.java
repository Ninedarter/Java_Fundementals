package day13_1112.groupwork;

public class Product {
    private String name;
   private int quantity;
    private String id;
    private final String origin = "Lithuania";
    private  int price;


    public Product() {
    }

    public Product(String name, int quantity, String id, String origin) {
        this.name = name;
        this.quantity = quantity;
        this.id = id;

    }


    public String getName() {
        return name;
    }

    public int getQuantity() {

        return quantity;
    }

    public String getId() {
        return id;
    }

    public String getOrigin() {
        return origin;
    }

    public void setName(final String name) {
        if(name !=null && name.length()>25){
            System.out.println("Name is too long");
        }
        else {
            this.name = name;
        }

    }

    public void setQuantity(int quantity) {

        if( quantity<=0){
            System.out.println("Wrong countity value ");
        } else if (quantity > 1000 ) {
            System.out.println("Not allowed quantity(too big)");
        }

        this.quantity = quantity;
    }

    public void setPrice(int price) {
        if (price<= 0 ){
            System.out.println("Wrong value ");
        }
        else{
            this.price = price;
        }


    }
}
