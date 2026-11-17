
/**
 * Find total minutes of the flights
 *
 * @author Vidhi and Laiha
 * @version 11/17/26
 */
public class Time2
{
    private int totalMins;
    
    public Time2(int hours, int mins){
        totalMins = hours*60 + mins;
    }

    public Time elapsed(Time other)
    {
        elapsedMins = other.totalMins - this.totalMins;
        int hrs = elapsedMins / 60;
        int mins = elapsedMins % 60;
        return new Time (hrs, mins);
    }
    
    public String toString(){
        int hours = totalMins/60;
        int mins = totalMins%60;
        String mins1 = mins + "";
        
        if (mins1.length() == 1){
            return hours + "0" + mins;
        }
        else{
        return hours + ":" + mins;
        }
    }
}
