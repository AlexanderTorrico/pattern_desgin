package Builder;

public interface IBuilder {
    void buildModelo(String modelo);
    void buildMotor(String motor);
    void buildCarroceria(String carroceria);
    void buildTransmision(String transmision);
    void buildInterior(String interior);
    Auto getAuto();
}
