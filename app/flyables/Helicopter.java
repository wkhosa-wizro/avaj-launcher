package app.flyables;

import app.tower.WeatherTower;

public class Helicopter extends Aircraft implements Flyable {
	private WeatherTower weatherTower;

	Helicopter(String name, Coordinates coordinates) {
		super(name, coordinates);
	}

	public void updateCondition() {
		String weather = WeatherProvider.getCurrentWeather(
				coordinates);
	
		if (weather.equals("SUN")) {
			coordinates.setLatitude(coordinates.getLongitude() + 10,
				coordinates.getLatitude(), 
						coordinates.getHeight() + 2);
		
		} else if (weather.equals("RAIN")) {	
			coordinates.setLatitude(coordinates.getLongitude() + 5,
				coordinates.getLatitude(), 
						coordinates.getHeight());
		
		} else if (weather.equals("FOG")) {	
			coordinates.setLatitude(coordinates.getLongitude() + 1,
				coordinates.getLatitude(), 
						coordinates.getHeight());
		
		} else {	
			coordinates.setLatitude(coordinates.getLongitude(),
				coordinates.getLatitude(), 
					coordinates.getHeight() - 12)
		}
	}

	public void registerTower(WeatherTower weatherTower) {
		weatherTower.register(this);
	}
}
