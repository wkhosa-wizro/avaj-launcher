package app.flyables;

import app.tower.WeatherTower;

public class JetPlane extends Aircraft implements Flyable {
	private WeatherTower weatherTower;

	JetPlane(String name, Coordinates coordinates) {
		super(name, coordinates);
	}

	public void updateCondition() {
		String weather = WeatherProvider.getCurrentWeather(
				coordinates);
	
		if (weather.equals("SUN")) {
			coordinates.setLatitude(coordinates.getLongitude(),
				coordinates.getLatitude() + 10, 
						coordinates.getHeight() + 2);
		
		} else if (weather.equals("RAIN")) {	
			coordinates.setLatitude(coordinates.getLongitude(),
				coordinates.getLatitude() + 5, 
						coordinates.getHeight());
		
		} else if (weather.equals("FOG")) {	
			coordinates.setLatitude(coordinates.getLongitude(),
				coordinates.getLatitude() + 1, 
						coordinates.getHeight());
		
		} else {	
			coordinates.setLatitude(coordinates.getLongitude(),
				coordinates.getLatitude(), 
					coordinates.getHeight() - 7)
		}
	
	}
	}

	public void registerTower(WeatherTower weatherTower) {
		weatherTower.register(this);
	}
}
