package Tandem20;

public class Application1 {
	//@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		 WorkerOklad1 O = new WorkerOklad1 ("Ivan", 160.0, 50.0, 8000.0, "Oclad" );
		 System.out.println(O);
		 WorkerHourly h = new WorkerHourly (" Vasyl", 40.0, 50.0,2000.0,  "Hourly");{
		 System.out.println(h);
		 h.addZarplata();
		 System.out.println(h);
	}
	}
	}

