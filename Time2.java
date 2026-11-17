
/**
 * Write a description of class Time2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Time2
{
    private int totalMins;
    
    public Time2(int hours, int mins){
        totalMins = hours*60 + mins;
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