package app.tower;

import app.flyables.Coordinates;

public class WeatherProvider {
	private WeatherProvider weatherProvider;
	private static String [] weather = {"RAIN", "FOG", "SNOW", "SUN"};
	
	private WeatherProvider() {
		// Tone done
	}

	public static WeatherProvider getProvider() {
		// To be done
	}

	public String getCurrentWeather(Coordinates coordinates) {
		// To be done
	}
}
