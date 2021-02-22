package enums;

public enum ConfiguracionConexion {

    DRIVER("org.postgresql.Driver"),
    PROTOCOLO("jdbc:postgresql"),
    SERVIDOR("127.0.0.1:5432"),
    BD("BdLocal"),
    USUARIO("postgres"),
    CONTRASENA("yani7864243");

    private final String value;

    ConfiguracionConexion(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
