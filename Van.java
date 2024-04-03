
/**
 * Write a description of class VAn here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Van extends GroundTransportation
{
    // instance variables - replace the example below with your own
    private int packages;

    /**
     * Constructor for objects of class VAn
     */
    public Van(int packages, String licensePlate)
    {
        super(licensePlate);
        
        this.packages = packages;
    }
    
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(String.format("\n%15s: %s\n", "Matrícula", getLicensePlate()));
        sb.append(String.format("\n%15s: %s\n", "Nº de pacotes", getPackages()));
     
        return sb.toString();
    }
    

    public int getPackages(){return packages;}   
    public void setPackages(int packages) {this.packages = packages;}
}
