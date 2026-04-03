package org.example;

public class FabricaCargo {

    private FabricaCargo() {};
    private static FabricaCargo instance = new FabricaCargo();
    public static FabricaCargo getInstance() {
        return instance;
    }

    public static ICargo obterCargo(String cargo) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("org.example.Cargo" + cargo);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Cargo inexistente");
        }
        if (!(objeto instanceof ICargo)) {
            throw new IllegalArgumentException("Cargo inválido");
        }
        return (ICargo) objeto;
    }
}
