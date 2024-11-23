
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

    //Create an object Weather without needing to put in temp; random temp is generated for the user; overloaded
    //constructor
    public Weather(String weekday, String weatherCondition){
        this.weekday = weekday;
        this.weatherCondition = weatherCondition;
        temp = (-50 + (110+50) * Math.random());
        int rounding = (int) (temp*100);
        temp = (double) rounding/100;
    }


    public double getTemperature(){
        return temp;
    }


    public String jacket(){
        if (temp<40){
            return "A jacket is recommended for today.";
        }
        return "You don't need a jacket today.";
    }


    public String umbrella(){
        if (weatherCondition.equals("rain") || weatherCondition.equals("hail")){
            return "Bring an umbrella today.";
        }
        return "No need for an umbrella today";
    }

    /*
    Prints an object's attributes. For example exampleObject.printInfo() would print exampleObject's
    weekday, temp, and weatherCondition. It also converts any lower case starting letters in weekday to
    upper case (monday to Monday). Prints out the attributes with sentences and I included different if
    statements to make the sentences actually make sense. However, it assumes that the object is created
    with the right keywords like "rain", "snow", "hail".
     */
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

    public String toString(){
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
        return"";
    }
    /* switches the day of the week by specified days you want to skip. Example: if weekDay originally was Monday
    and you did day1.switchWeekday(2) it should move two days ahead and switch weekDay to Wednesday. If weekDay
    is going to go over Sunday it should loop back to Monday and then keep going. */
    public void switchWeekday(int daySkipped) {
        weekday = (weekday.substring(0, 1)).toUpperCase(Locale.ROOT) + weekday.substring(1);
        int currentDay=0;
        String[] week = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        for (int i = 0; i<=6;i++){ //gets the current index of the currentDay of the object.
            if (weekday.equals(week[i])){
                currentDay = i;
            }
        }

        //part where it actually changes weekDay
        for (int b = daySkipped; b > 0; b--){
            if (currentDay == 6){
                currentDay = 0;
            }
            else{
                currentDay++;
            }
        }
        weekday = week[currentDay];
    }

    //The below calculate averageTemp from just 2 days to all 7 days, require you to put exampleObject.getTemperature
    //for each parameter; overloaded methods
    public double averageTemp(double temp1, double temp2){
        return (temp1 + temp2)/2;
    }

    public double averageTemp(double temp1, double temp2, double temp3){
        return (temp1 + temp2+ temp3)/3;
    }

    public double averageTemp(double temp1, double temp2, double temp3, double temp4){
        return (temp1 + temp2 + temp3 + temp4)/4;
    }

    public double averageTemp(double temp1, double temp2, double temp3, double temp4, double temp5){
        return (temp1 + temp2 + temp3 + temp4 + temp5)/5;
    }

    public double averageTemp(double temp1, double temp2, double temp3, double temp4, double temp5, double temp6){
        return (temp1 + temp2 + temp3 + temp4 + temp5 + temp6)/6;
    }

    public double averageTemp(double temp1, double temp2, double temp3, double temp4, double temp5, double temp6, double temp7){
        return (temp1 + temp2 + temp3 + temp4 + temp5 + temp6 + temp7)/7;
    }


}
