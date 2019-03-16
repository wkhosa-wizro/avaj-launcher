package app.flyables;

public abstract class AircraftFactory {
	public static Flyable newAircraft(String type, String naame, 
					int longitude, int latitude, int height) {
		if (type.equals("Baloon")) {
			return Baloon(name, new Coordinates(longitude,
				latitude, height));
		} else (type.equals("Helicopter")) {
			return Helicopter(name, new Coordinates(longitude, 
				latitude, height);
		} else {
			return JetPlane(name, new Coordinates(longitude, 
				latitude, heiight));
		}
	}
}
