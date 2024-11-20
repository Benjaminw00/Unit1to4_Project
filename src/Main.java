public class Main {
    public static void main(String[] args) {
        Weather day1 = new Weather("monday", 60, "rain");
        Weather day2 = new Weather("tuesday", 50, "cloudy");
        Weather day3 = new Weather("wednesday", 40, "clear");
        Weather day4 = new Weather("thursday", 70, "cloudy");
        Weather day5 = new Weather("friday", 20, "clear");
        Weather day6 = new Weather("saturday", -2, "snow");
        Weather day7 = new Weather("sunday", 40, "hail");
        day7.printTomorrowInfo();


    }
}
