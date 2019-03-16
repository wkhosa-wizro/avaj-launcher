package app.flyables;

public class Coordinates {
	private int longitude;
	private int latitude;
	private int height;

	Coordintes(int longitude, int latitude, int height) {
		this.longitude = longitude;
		this.latitude = latitude;
		this.height = height;
	}

	public int getLongitude() {
		return longitude;
	}

	public int getLatitude() {
		return latitude;
	}

	public int getHeight() {
		return height;
	}

	public void setLongitude(int longitude) {
		this.longitude = longitude;
	}

	public void setLatitude(int latitude) {
		this.latitude = latitude;
	}

	public void setHeight(int height) {
		int newHeight = getHeight() + height;
		
		if (newHeight <= 100 && newHeight >= 0) {
			this.height = newHeight;
		}
	}
}
