import java.util.ArrayList;
/**
 * Write a description of class ShippingCompany here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ShippingCompany extends Transport
{
    // instance variables - replace the example below with your own
    private String name;
    private ArrayList<Transport> inService;

    /**
     * Constructor for objects of class ShippingCompany
     */
    public ShippingCompany(String name)
    {
        this.name = name;
    }
    
    
    @Override
    public String toString() {
        /*
        final StringBuilder sb = new StringBuilder();
        sb.append(String.format("\n%15s: %s\n", "Matrícula", getName()));
        sb.append(String.format("\n%15s: %s\n", "Tipo Transporte", getTransportType()));
        sb.append(String.format("%15s: %4.2f€\n", "Preço Final", getPriceWithFees()));
     
        return sb.toString();
        */
       String results = "\n";
        for(Transport t : inService) {
            results += t.toString(); 
        }
        return results;
    }
    

    public String getName(){return name;}   
    public void setName(String name) {this.name = name;}
    
    
}
