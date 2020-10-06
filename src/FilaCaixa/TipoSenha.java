package FilaCaixa;

public enum TipoSenha {
    
    COMUM("C"),
    RAPIDO("R"),
    PRIORITARIO("P");
    
    private String value;
    
    TipoSenha(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
