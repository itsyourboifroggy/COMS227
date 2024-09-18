package app.src.main.java.lab2;
import plotter.SimulationPlotter;

public class rabbitSimApp {
    public static void main(String[] args) {
        SimulationPlotter plotter = new SimulationPlotter();
        RabbitModel myModel = new RabbitModel();
        plotter.simulate(myModel);
    }
}
