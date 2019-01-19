package com.ragrainbat.jerksensor;

// Will listen to step alerts
public interface StepListener {

    public void step(long timeNs);

}