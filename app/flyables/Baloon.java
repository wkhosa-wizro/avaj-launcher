package app.flyables;

import app.tower.WeatherTower;

public class Baloon extends Aircraft implements Flyable {
	private WeatherTower weatherTower;

	Baloon(String name, Coordinates coordinates) {
		super(name, coordinates);
	}

	public void updateCondition() {
		String weather = WeatherProvider.getCurrentWeather(
				coordinates);
	
		if (weather.equals("SUN")) {
			coordinates.setLatitude(coordinates.getLongitude() + 2,
				coordinates.getLatitude(), 
						coordinates.getHeight() + 4);
		
		} else if (weather.equals("RAIN")) {	
			coordinates.setLatitude(coordinates.getLongitude(),
				coordinates.getLatitude(), 
						coordinates.getHeight() - 5);
		
		} else if (weather.equals("FOG")) {	
			coordinates.setLatitude(coordinates.getLongitude(),
				coordinates.getLatitude(), 
						coordinates.getHeight() - 3);
		
		} else {	
			coordinates.setLatitude(coordinates.getLongitude(),
				coordinates.getLatitude(), 
					coordinates.getHeight() - 15)
		}
	
	}

	public void registerTower(WeatherTower weatherTower) {
		weatherTower.register(this);
	}
}
