package app.flyables;

import app.tower.WeatherTower;

public interface Flyable {
	public void updateCondition();
	public void registerTower(WeatherTower weatherTower);
}
