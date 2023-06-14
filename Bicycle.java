
public class Bicycle implements CarbonFootprint{

	public String Model;
	
	public Bicycle(String model) {
		this.Model= model;
	}
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
	@Override
	public String toString() {

		
		StringBuilder string = new StringBuilder();
		string.append("Bicycle Model = " + getModel());
		return string.toString();
		
	}
	
	public double getCarbonFootprint() {
		return 0;
	}

}
