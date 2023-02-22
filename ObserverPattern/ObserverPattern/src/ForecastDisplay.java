import func.DisplayElement;
import func.Observer;

public class ForecastDisplay implements Observer, DisplayElement {

	private float currentPressure = 29.92f;  
	private float lastPressure;
	private WeatherData weatherData;

    private float prev_humidity = 100;

	public ForecastDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

    public void display() {
		System.out.print("Forecast: ");
		if (currentPressure > lastPressure) {
			System.out.println("Improving weather on the way!");
		} else if (currentPressure == lastPressure) {
			System.out.println("More of the same");
		} else if (currentPressure < lastPressure) {
			System.out.println("Watch out for cooler, rainy weather");
		}
    }


    public void update() {
        lastPressure = currentPressure;
		currentPressure = weatherData.getPressure();
        display();

    }
    
}
