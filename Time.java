public class Time 
{
    // instance variables - replace the example below with your own
    private int hours;
    private int mins;
    /**
     * Constructor for objects of class Time
     */
    public Time(int h, int m)
    {
        // initialise instance variables
        hours = h;
        mins = m;
    }

    public Time elapsed (Time other)
    {
        int elapHrs = other.hours - this.hours;
        int elapMins = other.mins - this.mins;
        if (elapMins < 0) {
            elapMins += 60;
            elapHrs--;
        }
        return new Time (elapHrs, elapMins);
    }
    
    /**
     */
    public String toString(int h, int m)
    {
        String minsText  = mins + "";
        if (minsText.length() == 2){
            return hours + ":" + mins;
        }
        else { 
            return hours + ":0" + mins;
        }
    }
}
