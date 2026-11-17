
/**
 * Write a description of class TwoFlightTrip here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */


public class TwoFlightTrip 
{
    private Flight f1;
    private Flight f2;
    private Time layover;
    
    public TwoFlightTrip(Flight flt1, Flight flt2)
    {
        f1 = flt1;
        f2 = flt2;
        layover = f1.getArrTime().elapsed(f2.getDepTime());
    }
    
    public String toString()
    {
        String result = f1.toString();
        
        result += "/n   layover  " + layover.toString() + "\n";
        
        result += f2.toString();
    }
}
