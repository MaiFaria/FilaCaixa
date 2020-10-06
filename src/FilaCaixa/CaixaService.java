package FilaCaixa;

import static FilaCaixa.TipoSenha.COMUM;
import static FilaCaixa.TipoSenha.PRIORITARIO;
import static FilaCaixa.TipoSenha.RAPIDO;
import java.util.ArrayList;
import java.util.List;

public class CaixaService {
    
    private Senha senha;
    
    private List<Senha> senhas = new ArrayList<Senha>();
    
    CaixaService(List<Senha> senhas) {
        this.senhas = senhas;
    }
    
    public Senha caixaUm() {
        Senha senha = buscaSenhaByTipoSenha(PRIORITARIO);
        if (isNull(senha)) {
            senha = buscaSenhaByTipoSenha(RAPIDO);
            if (isNull(senha)) {
                senha = buscaSenhaByTipoSenha(COMUM);
            }
        } 
        return senha;
    }
    
    public Senha caixaDois() {
        return BuscaSenhaDoisTres();
    }
    
    public Senha caixaTres() {
        return BuscaSenhaDoisTres();
    }
    
    public Senha caixaQuatro() {
        Senha senha = buscaSenhaByTipoSenha(COMUM);
        if (isNull(senha)) {
            senha = buscaSenhaByTipoSenha(RAPIDO);
            if (isNull(senha)) {
                senha = buscaSenhaByTipoSenha(PRIORITARIO);
            }
        }
        return senha;
    }
    
    private Senha buscaSenhaByTipoSenha(TipoSenha tipoSenha) {
        for (Senha senha : senhas) {
            if (senha.getTipoSenha().equals(tipoSenha)) {
                removeSenha(senha);
                return senha;
            }
        }
        return null;
    }
    
    private void removeSenha(Senha senha) {
        this.senhas.remove(senha);
    }
    
    public boolean isNull(Senha senha) {
        if (senha == null) {
            return true;
        }
        return false;
    }
   
    private Senha BuscaSenhaDoisTres() {
        Senha senha = buscaSenhaByTipoSenha(RAPIDO);
        if (isNull(senha)) {
            senha = buscaSenhaByTipoSenha(PRIORITARIO);
            if (isNull(senha)) {
                senha = buscaSenhaByTipoSenha(COMUM);
            }
        }
        return senha;
    } 
    
    public void salvaUltimaSenhaGerada(Senha senha){
        this.senha = senha;
    }
    
    public Senha getUltimaSenhaGerada() {
        return this.senha;
    }
}