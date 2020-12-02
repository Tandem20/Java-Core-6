package Tandem20;

public class WorkerHourly extends Oblic implements Zarplataabl {
private String name;

public WorkerHourly(String name, double time, double price, double zarplata, String name2) {
	super(name, time, price, zarplata);
	name = name2;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

@Override
public String toString() {
	return "WorkerHourly [name=" + name + ", toString()=" + super.toString() + "]";
}

@Override
public void addZarplata() {
	double zarplata = getZarplata() + 200;
	setZarplata(zarplata);
	
}
	
}


	


