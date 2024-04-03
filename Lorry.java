
/**
 * Write a description of class Lorry here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lorry extends GroundTransportation
{
    // instance variables - replace the example below with your own
    private int numberOfPallets;
    private int trailers;

    /**
     * Constructor for objects of class Lorry
     */
    public Lorry(int numberOfPallets, int trailers, String licensePlate)
    {
        super(licensePlate);
        
        this.numberOfPallets = numberOfPallets;
        this.trailers = trailers;
    }
    
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(String.format("\n%15s: %s\n", "Matrícula", getLicensePlate()));
        sb.append(String.format("\n%15s: %s\n", "Nº de paletes", getNumberOfPallets()));
        sb.append(String.format("\n%15s: %s\n", "Nº de atrelados", getTrailers()));
     
        return sb.toString();
    }
    
    
    public int getNumberOfPallets(){return numberOfPallets;}   
    public void setNumberOfPallets(int numberOfPallets) {this.numberOfPallets = numberOfPallets;}
    
    public int getTrailers(){return trailers;}   
    public void setTrailers(int trailers) {this.trailers = trailers;}

}
