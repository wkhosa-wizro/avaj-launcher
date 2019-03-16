package app.tower;

import app.flyable.Coordinates;

public class WeatherTower extends Tower {
	public String getWeather(Coordinates coordinates) {
		return WeatherProvider().getCurrentWeather(coordinates);
	}

	void changeWeather() {
		conditionsChanged();
	}
}
