package app.tower;

import java.util.ArrayList;
import app.flyable.Flyable;

public abstract class Tower {
	private ArrayList<Flyable> observers = new ArrayList<Flyable>();
	public void register(Flyable flyable);
	public void unregister(Flyable flyable);
	protected void conditionsChanged();
}
