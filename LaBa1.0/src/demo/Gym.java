package demo;


public class Gym {
	
	private String Name;
    private int Area;
    private int NabmerOfSimulators;
    private int WorkDays;
    private String Type;
    
    static int totalNabOfSim = 0; 
    public Gym () {
    	totalNabOfSim+=	NabmerOfSimulators;   
      	
    }
    public Gym (String Name,String Type,int NabmerOfSimulators,int WorkDays) {
    	this.Name = Name;
    	this.Type = Type;
    	this.NabmerOfSimulators = NabmerOfSimulators;
    	this.WorkDays = WorkDays;
    	totalNabOfSim+=	NabmerOfSimulators;   
    }
    
    public Gym (String Name,String Type, int Area,int NabmerOfSimulators,int WorkDays) {
    	this.Name = Name;
    	this.Area = Area;
    	this.NabmerOfSimulators = NabmerOfSimulators;
    	this.WorkDays = WorkDays;
    	this.Type = Type;
    	totalNabOfSim+=	NabmerOfSimulators;   
    }
    
    
    public void setArea(int Area) {
    	this.Area = Area;
    }
    public int getArea() {
		return Area;
    }
    public void setName(String Name) {
    	this.Name = Name;
    }
    public String getName() {
    	return Name;
    }
    public void setNabmerOfSimulators(int NabmerOfSimulators) {
    	this.NabmerOfSimulators = NabmerOfSimulators;
    	totalNabOfSim+=	this.NabmerOfSimulators;   
    }
    public int getNabmerOfSimulators() {
		return NabmerOfSimulators;
    }
    
    public void setWorkDays(int WorkDays) {
    	this.WorkDays = WorkDays;
    }
    public int getWorkDays() {
		return WorkDays;
    }
    
   
    public void setType(String Type) {
    	this.Type = Type;
    }
    public String getType() {
    	return Type;
    }
    
    public String toString() {
		
       return "Gym: " +  Name + "\nType of Gym:" + Type + "\nWorking Days:" + WorkDays + "\nNumber of simulators:" + NabmerOfSimulators +"\nArea:" + Area +  "\n";
    }
    
    public static void printStaticSum() {
     	System.out.println("total Nabmer Of Simulators: " + totalNabOfSim + "\n");
    }

    public void printSum() {
        System.out.println("total Nabmer Of Simulators: " + totalNabOfSim + "\n");
    }
    
    public void resetValues(String Name,String Type,int NabmerOfSimulators,int WorkDays,int Area) {
    	this.Name = Name;
    	this.Area = Area;
    	this.NabmerOfSimulators = NabmerOfSimulators;
    	this.WorkDays = WorkDays;
    	this.Type = Type;
        }
    public static void main(String[] args) {
    	Gym boxing = new Gym();
    	boxing.setName("Kick Him");
    	boxing.setArea(300);
    	boxing.setNabmerOfSimulators(32);
    	boxing.setType("Boxing");
       	boxing.setArea(642);
    	System.out.println(boxing.toString());
    	
    	Gym.printStaticSum();
		boxing.printSum();
    	
    	Gym weightlifting = new Gym("Fixsiki","Важка атлетика", 87,5 );
       	weightlifting.setArea(843);
       	System.out.println(weightlifting.toString());
       
       	Gym.printStaticSum();
		boxing.printSum();
    	
		Gym gym = new Gym ("Спорт-це життя","Тренажерний", 1000, 120,6 );
    	System.out.println(gym.toString());
    	
    	Gym.printStaticSum();
		boxing.printSum();
    	
    	boxing.resetValues("Kick Him", "Boxing", 20,500 ,4);
		System.out.println(boxing.toString());
		
		Gym.printStaticSum();
		boxing.printSum();
	
    }

}