package app.flyables;

import app.tower.WeatherTower;

public class JetPlane extends Aircraft implements Flyable {
	private WeatherTower weatherTower;

	JetPlane(String name, Coordinates coordinates) {
		super(name, coordinates);
	}

	public void updateCondition() {
		// Tobe done
	}

	public void registerTower(WeatherTower weatherTower) {
		weatherTower.register(this);
	}
}
