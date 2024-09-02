package Builder;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        IBuilder builderDeportivo = new AutoDeportivoBuilder();
        IBuilder builderFamiliar = new AutoFamiliarBuilder();

        Auto familiar = director.buidAutoFamiliar(builderDeportivo);
        Auto deportivo = director.buildAutoDeportivo(builderFamiliar);

        System.out.println(familiar);
        System.out.println(deportivo);

    }
}
