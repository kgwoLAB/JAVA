

import func.DisplayElement;
import func.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private WeatherData weatherData;


    //생성자에 weatherData라는 주제가 전달되며, 그 객체를 써서 디스플레이를 옵저버로 등록합니다.
    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(){
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        display();
    }

    public void display(){
        System.out.println("현재상태: 온도 " + temperature + "F, 습도 "+humidity+"%");
    }
}
