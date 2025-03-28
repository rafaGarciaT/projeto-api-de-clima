package rtg.weather.app.rest.api.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "tb_weather")
public class Weather {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String scale;
    private String weatherState;
    private short temperature;
    private short feltTemperature;
    private short windSpeed;
    private short airPressure;
    private double humidity;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getScale() {
        return scale;
    }

    public void setScale(String scale) {
        this.scale = scale;
    }

    public String getWeatherState() {
        return weatherState;
    }

    public void setWeatherState(String weatherState) {
        this.weatherState = weatherState;
    }

    public short getTemperature() {
        return temperature;
    }

    public void setTemperature(short temperature) {
        this.temperature = temperature;
    }

    public short getFeltTemperature() {
        return feltTemperature;
    }

    public void setFeltTemperature(short feltTemperature) {
        this.feltTemperature = feltTemperature;
    }

    public short getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(short windSpeed) {
        this.windSpeed = windSpeed;
    }

    public short getAirPressure() {
        return airPressure;
    }

    public void setAirPressure(short airPressure) {
        this.airPressure = airPressure;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }
}
