package app.tower;

import app.flyables.Coordinates;

public class WeatherProvider {
	private static WeatherProvider weatherProvider = null;
	private static String [] weather = {"RAIN", "FOG", "SNOW", "SUN"};
	
	private WeatherProvider() {}

	public static WeatherProvider getProvider() {
		if (weatherProvider == null) {
			this.weatherProvider = WeatherProvider();
		}

		return weatherProvider;
	}

	public String getCurrentWeather(Coordinates coordinates) {
		// To be done
	}
}
