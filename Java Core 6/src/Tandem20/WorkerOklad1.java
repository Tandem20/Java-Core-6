package Tandem20;

public class WorkerOklad1 extends Oblic implements Zarplataabl {
private String oclad ;

public WorkerOklad1(String name, double time, double price, double zarplata, String oclad) {
	super(name, time, price, zarplata);
	this.oclad = oclad;
}

public String getOclad() {
	return oclad;
}

public void setOclad(String oclad) {
	this.oclad = oclad;
}

@Override
public String toString() {
	return "WorkerOklad1 [oclad=" + oclad + ", toString()=" + super.toString() + "]";
}

@Override
public void addZarplata() {
	// TODO Auto-generated method stub
	
}


}
