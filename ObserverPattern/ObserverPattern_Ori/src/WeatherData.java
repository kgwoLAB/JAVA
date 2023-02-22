public abstract class WeatherData {
    //public abstract void getTemperature();
    //public abstract void getHumidity();
    //public abstract void getPressure();
    public void measurementsChanged(){

        // 최신 측정값을 가져옵니다. 

        float temp = getTemperature();
        float humidity = getHumidity();
        float pressure = getPressure();


        // 각 디스플레이를 갱신합니다.
        currentConditionsDisplay.update(temp, humidity, pressure);
        statisticsDisplay.update(temp, humidity, pressure);
        forecastDisplay.update(temp, humidity, pressure);


    };    
}
