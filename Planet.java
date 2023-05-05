

public enum Planet {
    MERCURY(1, 0, 1.9, null, "VEN"),
    VENUS(2, 4, 7.3, MERCURY, "EAR"),
    EARTH(3, 7.7, 6, VENUS, null);
//    MARS(3,8.1,5.2, EARTH),
//    JUPITER(4,3.09, 3.1, MARS ),
//    SATURN(5, 7.1, 4.56, JUPITER),
//    URAN(6,1.8, 1.44, SATURN),
//    NEPTUN(7,2.3,5.1, URAN);
    private Integer orderFromSun;
    private double distanceFromPlanet;
    private double rad;
    private double distanceFromSun;
    private Planet prevPlanet;
    private String nextPlanet;
    Planet(Integer orderFromSun, double distanceFromPlanet, double rad, Planet prevPlanet, String nextPlanet ) {
        this.orderFromSun = orderFromSun;
        this.distanceFromPlanet = distanceFromPlanet;
        this.rad = rad;
        this.distanceFromSun = prevPlanet != null ? prevPlanet.distanceFromSun + distanceFromPlanet:distanceFromPlanet;
        this.prevPlanet = prevPlanet;
        this.nextPlanet = nextPlanet;

    }




    public Planet getPrevPlanet() {
        return prevPlanet;
    }

    public Integer getOrderFromSun() {
        return orderFromSun;
    }

    public double getDistanceFromPlanet() {
        return distanceFromPlanet;
    }

    public double getRad() {
        return rad;
    }

    public double getDistanceFromSun() {
        return distanceFromSun;
    }

    public String getNextPlanet() {
        return nextPlanet;
    }
}

