
public class Building implements CarbonFootprint {

	public String heatingType;
	public double annualHeatingExpenditure;
	public double annualElectricityConsumptionkWh;
	
	public Building(String heatingtype , double annualheating , double annualelectricity) {
		this.heatingType= heatingtype;
		this.annualElectricityConsumptionkWh=annualelectricity;
		this.annualHeatingExpenditure= annualheating;
	}
	
	@Override
	public String toString() {
		StringBuilder string = new StringBuilder();
		string.append("House heating type = " + getHeatingType());
		string.append("\nHouse annual heating consumption = " + getAnnualHeatingExpenditure());
		string.append(heatingType=="LPG"?" lt":"");
		string.append(heatingType=="Coal"?" kg":"");
		string.append(heatingType=="NaturalGas"?" m3":"");
		string.append(heatingType!="LPG" && heatingType!="Coal" && heatingType != "NaturalGas" ?" lt":"");
		return string.toString();
	}
	
	public String getHeatingType() {
		return heatingType;
	}




	public void setHeatingType(String heatingType) {
		this.heatingType = heatingType;
	}




	public double getAnnualHeatingExpenditure() {
		return annualHeatingExpenditure;
	}




	public void setAnnualHeatingExpenditure(double annualHeatingExpenditure) {
		this.annualHeatingExpenditure = annualHeatingExpenditure;
	}




	public double getAnnualElectricityConsumptionkWh() {
		return annualElectricityConsumptionkWh;
	}




	public void setAnnualElectricityConsumptionkWh(double annualElectricityConsumptionkWh) {
		this.annualElectricityConsumptionkWh = annualElectricityConsumptionkWh;
	}



	public double getCarbonFootprint() {
		if ( heatingType == "NaturalGas") {
			return 2.020 * getAnnualHeatingExpenditure()+ (annualElectricityConsumptionkWh *0.492);
		}
		if ( heatingType == "Coal") {
			return 2.040 * getAnnualHeatingExpenditure()+ (annualElectricityConsumptionkWh *0.492);
		}
		if ( heatingType == "LPG") {
			return 1.680 * getAnnualHeatingExpenditure()+ (annualElectricityConsumptionkWh *0.492);
		}
		else{
		return 2.020 * getAnnualHeatingExpenditure() + (annualElectricityConsumptionkWh *0.492)  ; }
		
		
	}
}
