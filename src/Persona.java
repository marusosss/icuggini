import java.time.LocalDate;

public class Persona {
    private String nome;
    private String cognome;
    private int eta;
    private LocalDate dataNascita;
    private String ciaoTu = "miao te";

    public String getCiaoTu() {
        return ciaoTu;
    }

    public void setCiaoTu(String ciaoTu) {
        this.ciaoTu = ciaoTu;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascita() {
        return dataNascita;
    }

    public void setDataNascita(LocalDate dataNascita) {
        this.dataNascita = dataNascita;
    }
    
    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }
}


