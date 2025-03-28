package rtg.weather.app.rest.api.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "tb_time")
public class Time {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private short currentHour;
    private short currentMinute;
    private short sunriseHour;
    private short sunriseMinute;
    private short sunsetHour;
    private short sunsetMinute;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public short getCurrentHour() {
        return currentHour;
    }

    public void setCurrentHour(short currentHour) {
        this.currentHour = currentHour;
    }

    public short getCurrentMinute() {
        return currentMinute;
    }

    public void setCurrentMinute(short currentMinute) {
        this.currentMinute = currentMinute;
    }

    public short getSunriseHour() {
        return sunriseHour;
    }

    public void setSunriseHour(short sunriseHour) {
        this.sunriseHour = sunriseHour;
    }

    public short getSunriseMinute() {
        return sunriseMinute;
    }

    public void setSunriseMinute(short sunriseMinute) {
        this.sunriseMinute = sunriseMinute;
    }

    public short getSunsetHour() {
        return sunsetHour;
    }

    public void setSunsetHour(short sunsetHour) {
        this.sunsetHour = sunsetHour;
    }

    public short getSunsetMinute() {
        return sunsetMinute;
    }

    public void setSunsetMinute(short sunsetMinute) {
        this.sunsetMinute = sunsetMinute;
    }
}
