package FilaCaixa;

import java.util.List;

public class GeradorSenha {
    
    public Senha gerarSenhaComum(List<Senha> senhas) {
        Senha senha = new Senha(TipoSenha.COMUM, geraNumeralSenha(senhas));
        senhas.add(senha);
        return senha;
    }
        
    public Senha gerarSenhaPrioritaria(List<Senha> senhas) {
        Senha senha = new Senha(TipoSenha.PRIORITARIO, geraNumeralSenha(senhas));
        senhas.add(senha);
        return senha;
    }
    
    public Senha gerarSenhaRapido(List<Senha> senhas) {
        Senha senha = new Senha(TipoSenha.RAPIDO, geraNumeralSenha(senhas));
        senhas.add(senha);
        return senha;
    }
    
    public String formatadorMensagem(Senha senha) {
        return senha.getTipoSenha().getValue().concat("-").concat(senha.getNumero().toString());
    }
    
    private int geraNumeralSenha(List<Senha> senhas) {
        int maior = 0;
        for (Senha senha : senhas) {
            if (senha.getNumero() >= maior) {
                maior = senha.getNumero();
            }
        }
        return ++maior;
    }
    
    
    
}
