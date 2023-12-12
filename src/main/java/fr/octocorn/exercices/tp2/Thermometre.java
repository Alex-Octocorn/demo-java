package fr.octocorn.exercices.tp2;

public class Thermometre {
    private double temperatureCelsius;

    public Thermometre(double temperatureCelsius) {
        this.temperatureCelsius = temperatureCelsius;
    }

    public Thermometre() {
        this(0);
    }

    public double getCelsius() {
        return this.temperatureCelsius;
    }

    public void setCelsius(double nouvelleTemperatureEnCelsius) {
        this.temperatureCelsius = nouvelleTemperatureEnCelsius;
    }

    public double getKelvin() {
        return  this.temperatureCelsius + 273.15;
    }

    public void setKelvin(double nouvelleTemperatureEnKelvin) {
        this.temperatureCelsius = nouvelleTemperatureEnKelvin - 273.15;
    }

    public double getFahrenheit() {
        return this.temperatureCelsius * 1.8 + 32;
    }

    public void setFahrenheit(double nouvelleTemperaturePourLesAnglaisALED) {
        this.temperatureCelsius = (nouvelleTemperaturePourLesAnglaisALED - 32) / 1.8;
    }
}
