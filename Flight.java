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
    private Time2 depTime;
    private String depCity;
    private Time2 arrTime;
    private String arrCity;
    

    /**
     * Constructor for objects of class flight
     */
    public Flight(String airlineName, int flightNumber, Time2 departureTime, String departCity,
        Time2 arriveTime, String arriveCity)
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
    public Time2 getArrTime()   { return arrTime;  }
    public Time2 getDepTime()  { return depTime;  }
    /**
     * Returns a String representing the flight info
     */
    public String toString()
    {
        Time2 duration = depTime.elapsed(arrTime);
        return airline + " " + flightNum + " will be departing at " + depTime + " from " + depCity + 
        ".\n The flight will be arriving at " + arrCity + " at " + arrTime + 
        ".\n The total duration of the flight will be " + duration + ".";
    }
}
