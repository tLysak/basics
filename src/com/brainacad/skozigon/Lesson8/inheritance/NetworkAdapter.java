package com.brainacad.skozigon.Lesson8.inheritance;

/**
 * Created by skozigon on 13.05.2016.
 */
public class NetworkAdapter extends Device{
    private long speed = 1000;

    public NetworkAdapter(double price, long serialNumber, String manufacture) {
        super(price, serialNumber, manufacture);
    }

    public NetworkAdapter() {

    }

    public void setSpeed(long speed) {
        this.speed = speed;
    }

    public long getSpeed() {
        return speed;
    }

@Override
    public String toString() {
        return String.format("Network speed: %d",speed);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return true;
        NetworkAdapter networkAdapter = (NetworkAdapter) obj;
        if (speed!=networkAdapter.speed) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = (int)(speed^(speed>>>32));
        return result*31;
    }
}
