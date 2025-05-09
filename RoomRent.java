
import java.util.*;

public class RoomRent {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int month=sc.nextInt();
        int rent_day=sc.nextInt();
        int total_days=sc.nextInt();
        
        if(month<1||month>12){
            System.out.println("invalid month");
        }else{
            double totaltarrif;
            if(month==4||month==5||month==6||month==11||month==12){
                totaltarrif=rent_day*1.2*total_days;
            }else{
                totaltarrif=rent_day*total_days;
            }
            System.out.println(totaltarrif);
        }
    

    }
}
