package composite;

import java.util.ArrayList;
import java.util.List;

import observer.Observer;
import observer.Subject;

public class Modulo implements Componente ,Subject{
    private String title;
    private List<Componente> components = new ArrayList<>();
    List<Observer> observers = new ArrayList<>();

    public Modulo(String title) {
        this.title = title;
    }

    public void add(Componente component) {
        components.add(component);
        notifyObservers("Se añade recurso");
    }

    public void remove(Componente component) {
        components.remove(component);
        notifyObservers("Se elimina recurso");
    }

    @Override
    public void showInfo() {
        System.out.println("Module: " + title);
        for (Componente component : components) {
            component.showInfo();
        }
    }

	@Override
	public void addObserver(Observer observer) {
		observers.add(observer);
		
	}
	
	private void notifyObservers(String message) {
		for (Observer observer : observers) {
			observer.update(message);
		}
	}
}

