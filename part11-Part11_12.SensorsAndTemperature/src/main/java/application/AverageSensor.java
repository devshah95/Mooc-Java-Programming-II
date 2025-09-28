package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {
    private List<Sensor> sensors;
    private List<Integer> readingHistory;

    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.readingHistory = new ArrayList<>();
    }

    @Override
    public boolean isOn() {
        for (Sensor sensor : sensors) {
            if (!sensor.isOn()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void setOn() {
        for (Sensor sensor : sensors) {
            sensor.setOn();
        }
    }

    @Override
    public void setOff() {
        if (!sensors.isEmpty()) {
            this.sensors.get(0).setOff();
        }
    }

    @Override
    public int read() {
        if (!this.isOn() || sensors.isEmpty()) {
            throw new IllegalStateException("Error");
        }
        int sum = 0;
        for (Sensor sensor : this.sensors) {
            sum += sensor.read();
        }
        int average = sum / this.sensors.size();
        this.readingHistory.add(average);
        return average;
    }

    public void addSensor(Sensor toAdd) {
        this.sensors.add(toAdd);
    }

    public List<Integer> readings() {
        return this.readingHistory;
    }
}
