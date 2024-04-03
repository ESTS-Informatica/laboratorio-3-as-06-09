
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

    
}
