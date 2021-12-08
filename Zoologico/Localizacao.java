import java.io.Serializable;
public class Localizacao implements Serializable{
    private double latitude;
    private double longitude;   

    public Localizacao(){}

    public Localizacao(double latitude, double longitude){
        this.latitude = latitude;
        this.longitude = longitude;
    }
    public double getLatitude() {
        return latitude;
    }
    public double getLongitude() {
        return longitude;
    }
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
    
}
