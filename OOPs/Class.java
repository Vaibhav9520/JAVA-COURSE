//package JAVA COURSE.OOPs;

public class Class {
    public static void main(String[] args) {
        pen p1 = new pen();
        p1.setBrand("Win");
        System.out.println(p1.brand);
        p1.setPrice(8);
        System.out.println(p1.price);
        p1.setColor("Red");
        System.out.println(p1.color);

    }
    
    
}

class pen{
    String brand;
    int price;
    String color;

    void setBrand(String Writometer){
        brand = Writometer;
    }
    void setPrice(int newPricw){
        price = newPricw;
    }

    void setColor(String Black){
        color = Black;
    }
}
