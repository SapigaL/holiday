package demo;

public class main {

    public static void main(String[] args) {
        Gym boxing = new Gym();
        boxing.setName("Kick Him");
        boxing.setArea(300);
        boxing.setNabmerOfSimulators(32);
        boxing.setType("Boxing");
        boxing.setArea(642);

        System.out.println(boxing.toString());
        Gym.printStaticSum();

        Gym weightlifting = new Gym("Fixsiki", "Kachalka", 87, 5);
        weightlifting.setArea(843);
        System.out.println(weightlifting.toString());
        Gym.printStaticSum();


        Gym gym = new Gym("Dynamo", "pool", 1000, 120, 6);
        System.out.println(gym.toString());
        Gym.printStaticSum();


        boxing.resetValues("Kick Him", "Boxing", 20, 500, 4);
        System.out.println(boxing.toString());
        Gym.printStaticSum();


    }
}
