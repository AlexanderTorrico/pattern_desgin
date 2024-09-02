package Builder;

public class AutoDeportivoBuilder implements  IBuilder{
    private String modelo;
    private String motor;
    private String carroceria;
    private String transmicion;
    private String interior;



    @Override
    public void buildModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void buildMotor(String motor) {
        this.motor = motor;
    }

    @Override
    public void buildCarroceria(String carroceria) {
        this.carroceria = carroceria;
    }

    @Override
    public void buildTransmision(String transmission) {
        this.transmicion = transmission;
    }

    @Override
    public void buildInterior(String interior) {
        this.interior = interior;
    }

    @Override
    public Auto getAuto() {
        return new Auto(modelo,  motor, carroceria, transmicion, interior);
    }
}
