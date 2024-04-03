
/**
 * Write a description of class GroundTransportation here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GroundTransportation extends Transport
{
    // instance variables - replace the example below with your own

    private String licensePlate;

    /**
     * Constructor for objects of class GroundTransportation
     */
    public GroundTransportation(String licensePlate)
    {
        this.licensePlate = licensePlate;
    }
    
    public String getLicensePlate(){return licensePlate;}   
    public void setLicensePlate(String licensePlate) {this.licensePlate = licensePlate;}

    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(String.format("\n%15s: %s\n", "Matrícula", getLicensePlate()));
        sb.append(String.format("\n%15s: %s\n", "Tipo Transporte", getTransportType()));
        sb.append(String.format("%15s: %4.2f€\n", "Preço Final", getPriceWithFees()));
     
        return sb.toString();
    }
    
    
    @Override
    public double getPriceWithFees() {
        return getPrice() * (1.0 + (3 * 0.01));
    }
    
    @Override
    public String getTransportType() {
        return "Transporte terrestre";
    }
}
