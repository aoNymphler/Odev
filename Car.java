
public class Car implements CarbonFootprint{

	public String Type;
	public double Consumption;
	public Car(String type, double consumption) {
		this.Type=type;
		this.Consumption=consumption;
	}
	public String getModel() {
		return Type;
	}
	public void setModel(String model) {
		Type = model;
	}
	public double getConsumption() {
		return Consumption;
	}
	public void setConsumption(double consumption) {
		Consumption = consumption;
	}
	
	@Override
	public String toString() {
		StringBuilder string = new StringBuilder();
		string.append("Car fuel type = " + getModel());
		string.append("\nAnnual fuel consumption = " + getConsumption() +" lt." );
		return string.toString();
	}
	
	public double getCarbonFootprint() {
		if(Type == "diesel") {
			return 2.6*getConsumption();
		}
		if(Type == "LPG") {
			return 1.680 *getConsumption();
		}
		if(Type == "Gas") {
			return 2.240 *getConsumption();
		}
		else {
			return 2.240 * getConsumption();
		}
	}
	

}
