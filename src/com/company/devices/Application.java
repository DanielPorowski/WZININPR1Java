package com.company.devices;

public class Application implements Comparable<Application> {
    public Double price;
    public String appName;
    public String version;

    @Override
    public int compareTo(Application  app) {
        return this.appName.compareTo(app.appName);
    }
}