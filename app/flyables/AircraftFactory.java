package app.flyables;

public abstract class AircraftFactory {
	public Flyable newAircraft(String type, String naame, 
					int longitude, int latitude, int height);
}
