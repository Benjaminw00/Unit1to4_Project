
import javax.sound.midi.SysexMessage;
import java.util.Locale;

public class Weather {

    private double temp;
    private String weekday;
    private String weatherCondition;


    public Weather(String weekday, double temp, String weatherCondition){
        this.temp = temp;
        this.weekday = weekday;
        this.weatherCondition = weatherCondition;
    }


    public double getTemperature(){
        return temp;
    }



    public double getAverageWeekTemp(String weather1, String weather2, String weather3, String weather4, String weather5, String weather6, String weather7){
        double total = 0;
        for (int i = 0; i <= 7; i++){
            total = getTemperature();
        }
        return total;
    }


    public String jacket(){
        if (temp<40){
            return "A jacket is recommended for today.";
        }
        return "You don't need a jacket today.";
    }


    public String umbrella(){
        if (weatherCondition.equals("rain")){
            return "Bring an umbrella today.";
        }
        return "No need for an umbrella today";
    }


    public void printInfo(){
        weekday = (weekday.substring(0, 1)).toUpperCase(Locale.ROOT) + weekday.substring(1);
        System.out.println(weekday + "'s temperature is sitting at " + temp +" degrees.");
        if (weatherCondition.equals("rain") || weatherCondition.equals("snow")){
            System.out.println("The weather is looking " + weatherCondition +"y.");
        }
        else if (weatherCondition.equals("hail")){
            System.out.println("It will hail soon.");
        }
        else{
            System.out.println("The weather will be " + weatherCondition + ".");
        }
    }

    public void printTomorrowInfo() {
        weekday = (weekday.substring(0, 1)).toUpperCase(Locale.ROOT) + weekday.substring(1);
        String origWeekday = weekday;
        int i = 0;
        String[] week = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        while (weekday.equals(origWeekday)){
            if (weekday.equals(week[i])) {
                weekday = week[i + 1];
            }
            i++;
        }

        System.out.println(weekday + "'s temperature is sitting at " + temp + " degrees.");
    }
}
