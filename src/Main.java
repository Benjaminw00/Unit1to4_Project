import javax.sound.midi.SysexMessage;

public class Main {
    public static void main(String[] args) {
        Weather day1 = new Weather("monday", 60, "rain");
        Weather day2 = new Weather("tuesday", 50, "cloudy");
        Weather day3 = new Weather("wednesday", 40, "clear");
        Weather day4 = new Weather("thursday", 70, "cloudy");
        Weather day5 = new Weather("friday", 20, "clear");
        Weather day6 = new Weather("saturday", -2, "snow");
        Weather day8 = new Weather("sunday", "clear");
        System.out.println(day8);
        System.out.println(day1);
        day8.switchWeekday(5);
        System.out.println(day8);
        System.out.println(day8.jacket());
        System.out.println(day8.umbrella());



    }
}
