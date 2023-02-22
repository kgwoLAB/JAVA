import java.util.List;
import java.util.*;
import func.DisplayElement;
import func.Observer;

public class StatisticsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private float pressure;
    private ArrayList<Float> temperature_Arr = new ArrayList<>();
    private WeatherData weatherData;
    
    public StatisticsDisplay (WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void display() {
        float sum = 0;
        for (float num: temperature_Arr){
            sum += num;
        }
        float mean  = sum / temperature_Arr.size();
        Collections.sort(temperature_Arr);
        float min = temperature_Arr.get(0);
        float max = temperature_Arr.get(temperature_Arr.size() -1);
        System.out.println("평균/최고/최저 온도 = "+mean+"//"+min+"//"+max);
    }


    public void update() {
        this.temperature = weatherData.getTemperature();
        this.temperature_Arr.add(temperature);
        display();
    }
    
}
