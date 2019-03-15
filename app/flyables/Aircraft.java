package app.flyables;

public abstract class Aircraft {
	protected long id;
	protected String name;
	protected Coordinates coordinates;
	private long id = 0;

	protected Aircraft(String name, Coordidates coordinates) {
		this.name = name;
		this.coordinates = Coordinates;
		this.id = nextId();
	}

	private long nextId() {
		return ++id;
	}
}
