package Tandem20;

public abstract class Oblic {
	private String name;
	 private double time;
	 private double price;
	private double zarplata;
	public Oblic(String name, double time, double price, double zarplata) {
		super();
		this.name = name;
		this.time = time;
		this.price = price;
		this.zarplata = zarplata;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getTime() {
		return time;
	}
	public void setTime(double time) {
		this.time = time;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getZarplata() {
		return zarplata;
	}
	public void setZarplata(double zarplata) {
		this.zarplata = zarplata;
	}
	@Override
	public String toString() {
		return "Oblic [name=" + name + ", time=" + time + ", price=" + price + ", zarplata=" + zarplata + "]";
	}
}
	
	
	
	
	

