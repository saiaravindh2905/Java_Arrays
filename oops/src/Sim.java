public class Sim
{

    private String operator_name, band_width;
    private double price;


    private Sim(String operator_name,String band_width,double price)
    {
        this.operator_name=operator_name;
        this.band_width=band_width;
        this.price=price;

    }

    public String getOperator_name() {
        return operator_name;
    }
    public String getBand_width() {
        return band_width;
    }
    public double getPrice() {
        return price;
    }






}