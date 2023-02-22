import java.util.WeakHashMap;

public class App {
    public static void main(String[] args) throws Exception {
        WeatherData weatherDate = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherDate);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherDate);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherDate);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherDate);

        weatherDate.setMeasurements(80,65,30.4f);
        weatherDate.setMeasurements(82,70,29.2f);
        weatherDate.setMeasurements(78,90,29.2f);
     }
}
