/**
 * Write a description of class Flight here.
 *
 * @author Yaz and Saijal
 * @version 2026-11-12
 */
public class Flight
{
    // instance variables
    private String airline;
    private int flightNum;
    private Time depTime;
    private String depCity;
    private Time arrTime;
    private String arrCity;
    

    /**
     * Constructor for objects of class flight
     */
    public Flight(String airlineName, int flightNumber, Time departureTime, String departCity,
        Time arriveTime, String arriveCity)
    {
        // initialise instance variables
        airline = airlineName;
        flightNum = flightNumber;
        depTime = departureTime;
        depCity = departCity;
        arrTime = arriveTime;
        arrCity = arriveCity;
    }
    //-------------------------------------------------------
    // Accessor Methods  "Getters"
    //-------------------------------------------------------
    public Time getArrTime()   { return arrTime;  }
    public Time getDepTime()  { return depTime;  }
    /**
     * Returns a String representing the flight info
     */
    public String toString()
    {
        Time duration = depTime.elapsed(arrTime);
        return airline + flightNum + " will be departing at " + depTime + " from " + depCity + 
        ". The flight will be arriving at " + arrCity + " at " + arrTime + 
        ". The total duration of the flight will be " + duration + ".";
    }
}
