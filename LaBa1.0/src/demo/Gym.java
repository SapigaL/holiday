package demo;


public class Gym {

    private static int totalNabOfSim = 0;
    private String name;
    private int area;
    private int nabmerOfSimulators;
    private int workDays;
    private String type;

    public Gym() {
        totalNabOfSim += nabmerOfSimulators;

    }

    public Gym(String name, String type, int nabmerOfSimulators, int workDays) {
        this.name = name;
        this.type = type;
        this.nabmerOfSimulators = nabmerOfSimulators;
        this.workDays = workDays;
        totalNabOfSim += nabmerOfSimulators;
    }

    public Gym(String name, String type, int area, int nabmerOfSimulators, int workDays) {
        this.name = name;
        this.area = area;
        this.nabmerOfSimulators = nabmerOfSimulators;
        this.workDays = workDays;
        this.type = type;
        totalNabOfSim += nabmerOfSimulators;
    }

    public static void printStaticSum() {
        System.out.println("total Nabmer Of Simulators: " + totalNabOfSim + "\n");
    }


    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNabmerOfSimulators() {
        return nabmerOfSimulators;
    }

    public void setNabmerOfSimulators(int nabmerOfSimulators) {
        this.nabmerOfSimulators = nabmerOfSimulators;
        totalNabOfSim += this.nabmerOfSimulators;
    }

    public int getWorkDays() {
        return workDays;
    }

    public void setWorkDays(int workDays) {
        this.workDays = workDays;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String toString() {

        return "Gym: " + name + "\ntype of Gym:" + type + "\nWorking Days:" + workDays + "\nNumber of simulators:" + nabmerOfSimulators + "\narea:" + area + "\n";
    }

    public void printSum() {
        System.out.println("total Nabmer Of Simulators: " + totalNabOfSim + "\n");
    }

    public void resetValues(String name, String type, int nabmerOfSimulators, int workDays, int area) {
        this.name = name;
        this.area = area;
        this.nabmerOfSimulators = nabmerOfSimulators;
        this.workDays = workDays;
        this.type = type;
    }

}