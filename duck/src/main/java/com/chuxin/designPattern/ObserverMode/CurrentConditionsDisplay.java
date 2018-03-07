package com.chuxin.designPattern.ObserverMode;

public class CurrentConditionsDisplay implements DisplayElement,Observer {
    private float temperature;
    private float humidity;
    private float pressure;
    private Subject subject;
    public CurrentConditionsDisplay(Subject subject){
        this.subject = subject;
        subject.registerObserver(this);
    }



    @Override
    public void display() {

    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity =humidity;
        this.pressure = pressure;
    }
}
