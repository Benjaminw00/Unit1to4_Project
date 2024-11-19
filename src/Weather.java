import java.https://api.openweathermap.org/data/3.0/onecall?lat=40.7128&lon=74.0060&exclude=alerts&appid=4c0a4ed90318d02598a0c04e89f1b691;


public class Weather {

    private int temp;

    public void weather(){
    }

    public String getTemperature(String weather){

    }

    public String jacket(int temperature){
        if (temp<40){
            return "A jacket is recommended for today.";
        }
        return "No, you don't need a jacket today.";
    }

    public String umbrella(boolean rain){
        if (rain){
            return "Bring an umbrella today.";
        }
        return "No need for an umbrella today";
    }


}
