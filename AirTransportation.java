
/**
 * Write a description of class AirTransportation here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AirTransportation extends Transport
{
    private String name;
    private int numberOfContainers;

    /**
     * Constructor for objects of class AirTransportation
     */
    public AirTransportation(String name, int numberOfContainers)
    {
        this.name = name;
        this.numberOfContainers = numberOfContainers;
    }
    
    public String getName(){return name;}   
    public void setName(String name) {this.name = name;}
    
    public int getNumberOfContainers(){return numberOfContainers;}   
    public void setNumberOfContainers(int numberOfContainers) {this.numberOfContainers = numberOfContainers;}
    
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(String.format("\n%15s: %s\n", "Matrícula", getName()));
        sb.append(String.format("\n%15s: %s\n", "Nº de contentores", getNumberOfContainers()));
        sb.append(String.format("\n%15s: %s\n", "Tipo Transporte", getTransportType()));
        sb.append(String.format("%15s: %4.2f€\n", "Preço Final", getPriceWithFees()));
     
        return sb.toString();
    }
    
    
    
    @Override
    public double getPriceWithFees() {
        return getPrice() * (1.0 + (4 * 0.01));
    }
    
    @Override
    public String getTransportType() {
        return "Transporte aéreo";
    }
}
