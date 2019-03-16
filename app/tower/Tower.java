package app.tower;

import java.util.ArrayList;
import app.flyable.Flyable;

public abstract class Tower {
	private ArrayList<Flyable> observers = new ArrayList<Flyable>();
	public void register(Flyable flyable) {
		observers.add(flyable);
	}

	public void unregister(Flyable flyable) {
		observers.remove(flyable);
	}

	protected void conditionsChanged() {
		for (Flyable flyble : observers) {
			flyble.updateConditions();
		}
	}
}
