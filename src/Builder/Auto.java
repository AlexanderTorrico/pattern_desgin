package Builder;

public class Auto {
    private String modelo;
    private String motor;
    private String carroceria;
    private String transmision;
    private String interior;

    public Auto(String modelo, String motor, String carroceria, String transmision, String interior) {
        this.modelo = modelo;
        this.motor = motor;
        this.carroceria = carroceria;
        this.transmision = transmision;
        this.interior = interior;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public void setCarroceria(String carroceria) {
        this.carroceria = carroceria;
    }

    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }

    public void setInterior(String interior) {
        this.interior = interior;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "modelo='" + modelo + '\'' +
                ", motor='" + motor + '\'' +
                ", carroceria='" + carroceria + '\'' +
                ", transmision='" + transmision + '\'' +
                ", interior='" + interior + '\'' +
                '}';
    }
}
