package Builder;

public class Director {

    public Director() {
    }

    public Auto buildAutoDeportivo(IBuilder builder) {
        builder.buildCarroceria("Carrocería de fibra de carbono");
        builder.buildModelo("Deportivo");
        builder.buildMotor("Motor V8");
        builder.buildTransmision("Transmisión automática de 8 velocidades");
        builder.buildInterior("Interior de cuero premium");

        return builder.getAuto();
    }

    public  Auto buidAutoFamiliar(IBuilder builder){
        builder.buildCarroceria("Carrocería de acero");
        builder.buildModelo("Familiar");
        builder.buildMotor("Motor V6");
        builder.buildTransmision("Transmisión automática de 6 velocidades");
        builder.buildInterior("Interior de tela");

        return builder.getAuto();
    }

}
