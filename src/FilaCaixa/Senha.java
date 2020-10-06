package FilaCaixa;

public class Senha {
    
    private TipoSenha tipoSenha;
    private Integer numero;
    
    public Senha() {}
            
    public Senha(TipoSenha tipoSenha, int numero) {
        this.tipoSenha = tipoSenha;
        this.numero = numero;
    }
    
    public TipoSenha getTipoSenha() {
        return tipoSenha;
    }

    public void setTipoSenha(TipoSenha tipoSenha) {
        this.tipoSenha = tipoSenha;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
