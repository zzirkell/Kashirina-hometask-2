package classes;

public class Vehicle {
    int speed = -1;
    int consumption100km = -1;
    String type = null;

    public Vehicle(String type, int consumption100km, int speed) {
        settype(type);
        setspeed(speed);
        setConsumption100km(consumption100km);
    }

    public void setspeed(int velocity) {
        if (velocity <= 0) {
            throw new RuntimeException("speed is <= 0");
        }
        this.speed = velocity;
    }

    public void setConsumption100km(int consumption100km) {
        if (consumption100km <= 0) {
            throw new RuntimeException("consumption100km is <= 0");
        }
        this.consumption100km = consumption100km;
    }

    public void settype(String type) {
        if ((type.equals("")) || type == null ) {
            throw new RuntimeException("type error");
        }
        this.type = type;
    }

    public int calculTime(int distance) {
        if ((distance < 0) || (speed == -1)) {
            throw new RuntimeException("distance  or velocity err");
        }
        return distance/speed;
    }

    public int calculFuel(int distance) {
        if ((distance < 0) || (consumption100km == -1)) {
            throw new RuntimeException("distance or consumption100km err");
        }
        return (distance / 100) * speed;
    }
}