package cat.itacademy.barcelonactiva.sulzbachrilho.lucas.s05.t01.n03.S05T01N03SulzbachRilhoLucas.model.dto;

public class ClientFlorUpdateDTO {

    private Integer pk_FlorID;
    private String nomFlor;
    private String paisFlor;

    public ClientFlorUpdateDTO() {
    }

    public ClientFlorUpdateDTO(Integer pk_FlorID, String nomFlor, String paisFlor) {
        this.pk_FlorID = pk_FlorID;
        this.nomFlor = nomFlor;
        this.paisFlor = paisFlor;
    }

    public Integer getPk_FlorID() {
        return pk_FlorID;
    }

    public void setPk_FlorID(Integer pk_FlorID) {
        this.pk_FlorID = pk_FlorID;
    }

    public String getNomFlor() {
        return nomFlor;
    }

    public void setNomFlor(String nomFlor) {
        this.nomFlor = nomFlor;
    }

    public String getPaisFlor() {
        return paisFlor;
    }

    public void setPaisFlor(String paisFlor) {
        this.paisFlor = paisFlor;
    }

}