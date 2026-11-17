
/**
 * Write a description of class FlightTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FlightTest
{
    public static void main(String[] args)
    {
        Flight flight1 = new Flight("United", 56, new Time2(8, 30), "CLE", new Time2(10, 15), "ORD");
        Flight flight2 = new Flight("United", 387, new Time2(11, 30), "ORD", new Time2(23, 45), "SYD");
        
        TwoFlightTrip myTrip = new TwoFlightTrip(flight1, flight2);
        System.out.println(myTrip);
    }
}
