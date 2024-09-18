package lab02;
import plotter.SimulationPlotter;

public class rabbitSimApp {
    public static void main(String[] args) {
        SimulationPlotter plotter = new SimulationPlotter();
        RabbitModel myModel = new RabbitModel();
        plotter.simulate(myModel);
    }
}
