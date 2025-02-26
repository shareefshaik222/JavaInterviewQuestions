public class Bike {

    String name;
    String colour;
    int year;
    double price;

    //default constructor
    public Bike(){
        System.out.println("This is default constructor ");

    }
    //parameterised constructor
    protected Bike(String name,String colour){
        this.name=name;
        this.colour=colour;
    }
    public Bike(String name,String colour, int year,double price){
        //calling one constructor in another constructor
        this(name,colour);
        this.year=year;
        this.price=price;

    }
    public void dispaly(){
        System.out.println("started excuting display() method :");
        System.out.println("Bike name :"+name);
        System.out.println("Bike colour :"+colour);
        System.out.println("Bike year :"+year);
        System.out.println("Bike price :"+price);
    }

    public static void main(String[] args) {
        Bike b1=new Bike();
        b1.dispaly();
        System.out.println("The hashcode is :"+b1.hashCode());

        Bike b2=new Bike("Bullet 350","Black");
        b2.dispaly();
        System.out.println("The hashcode is:"+b2.hashCode());

        Bike b3=new Bike("ktm","red",2012,12000.0);
        b3.dispaly();
        System.out.println("The hashcode is:"+b3.hashCode());

    }





}