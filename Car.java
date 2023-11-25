
public class Car {
	
	int make;
	String model;
	String Company;
	int Hp;
	int Mileage;
	public int getMake() {
		return make;
	}
	public void setMake(int make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getCompany() {
		return Company;
	}
	public void setCompany(String company) {
		Company = company;
	}
	public int getHp() {
		return Hp;
	}
	public void setHp(int hp) {
		Hp = hp;
	}
	public int getMileage() {
		return Mileage;
	}
	public void setMileage(int mileage) {
		Mileage = mileage;
	}
	@Override
	public String toString() {
		return "Car model [Car model=" + model + ", Company=" + Company + ", Hp=" + Hp + ", Mileage " + Mileage + "]";
	}
	

}
