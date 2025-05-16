package Ex_31_Wrapper_Class;

public class Lab_217_Wrapper {
    public static void main(String[] args) {
        Mobile iphone = new Mobile( 1   , 120000.00, "Iphone 16" );
        Mobile samsung = new Mobile( 2   , 1350000.00, "Ultra 24" );


        iphone.setPrice(200000.89);
        iphone.display();
        samsung.display();

        System.out.println(Mobile.mobile_carrier);
        Mobile.switchOnAirplaneMode();

    }

}
class Mobile extends OldPhone{
    private Integer phone;
    private String name;
    private Double price;
    static String mobile_carrier = "Airtel";

    Mobile(){
        System.out.println("DC");
    }

    public Mobile(Integer phone, Double price, String name) {
        this.phone = phone;
        this.price = price;
        this.name = name;
    }

    void display(){
        System.out.println(this.name+this.phone+this.price);
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    static void switchOnAirplaneMode(){
        System.out.println("Common Airplane MODE");
    }

    void priceChange(Integer price){
        System.out.println("change price in Integers");
    }
    void priceChange(Double price){
        System.out.println("change price in Decimals");
    }
    @Override
    void calling(){
        System.out.println("dialpad -> touch dialpad now!");
    }
}
class OldPhone implements SIMCard {

    void calling(){
        System.out.println("dialpad");
    }

    public void enterCard(){
        System.out.println("card entered");
    }
}
interface SIMCard{
    void enterCard();

}