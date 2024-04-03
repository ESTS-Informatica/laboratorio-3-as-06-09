
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

}
