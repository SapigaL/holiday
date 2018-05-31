package demo;


public class Gym {
	
    private static int totalNabOfSim = 0;
	private String name;
    private int Area;
    private int nabmerOfSimulators;
    private int workDays;
    private String Type;
    public Gym () {
    	totalNabOfSim+= nabmerOfSimulators;
      	
    }
    public Gym (String Name,String Type,int NabmerOfSimulators,int WorkDays) {
    	this.name = Name;
    	this.Type = Type;
    	this.nabmerOfSimulators = NabmerOfSimulators;
    	this.workDays = WorkDays;
    	totalNabOfSim+=	NabmerOfSimulators;   
    }
    
    public Gym (String Name,String Type, int Area,int NabmerOfSimulators,int WorkDays) {
    	this.name = Name;
    	this.Area = Area;
    	this.nabmerOfSimulators = NabmerOfSimulators;
    	this.workDays = WorkDays;
    	this.Type = Type;
    	totalNabOfSim+=	NabmerOfSimulators;   
    }
    
    public static void printStaticSum() {
     	System.out.println("total Nabmer Of Simulators: " + totalNabOfSim + "\n");
    }


    public int getArea() {
		return Area;
    }

    public void setArea(int Area) {
    	this.Area = Area;
    }

    public String getName() {
    	return name;
    }

    public void setName(String Name) {
    	this.name = Name;
    }
    
    public int getNabmerOfSimulators() {
		return nabmerOfSimulators;
    }

    public void setNabmerOfSimulators(int NabmerOfSimulators) {
    	this.nabmerOfSimulators = NabmerOfSimulators;
    	totalNabOfSim+=	this.nabmerOfSimulators;
    }
    
    public int getWorkDays() {
		return workDays;
    }

    public void setWorkDays(int WorkDays) {
    	this.workDays = WorkDays;
    }
    
    public String getType() {
    	return Type;
    }
    
    public void setType(String Type) {
    	this.Type = Type;
    }

    public String toString() {

       return "Gym: " + name + "\nType of Gym:" + Type + "\nWorking Days:" + workDays + "\nNumber of simulators:" + nabmerOfSimulators +"\nArea:" + Area +  "\n";
    }
    
    public void printSum() {
        System.out.println("total Nabmer Of Simulators: " + totalNabOfSim + "\n");
    }

    public void resetValues(String name,String Type,int nabmerOfSimulators,int workDays,int area) {
    	this.name = name;
    	this.Area = area;
    	this.nabmerOfSimulators = nabmerOfSimulators;
    	this.workDays = workDays;
    	this.Type = Type;
        }

}