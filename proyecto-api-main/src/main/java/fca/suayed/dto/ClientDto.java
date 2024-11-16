package fca.suayed.dto;

import org.jdbi.v3.core.mapper.reflect.ColumnName;

public class ClientDto {
    private Long id;
    private String name;
    private String surnameP;
    private String surnameM;
    private String fedReg;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @ColumnName("nombre")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ColumnName("apellido_paterno")
    public String getSurnameP() {
        return surnameP;
    }

    public void setSurnameP(String surnameP) {
        this.surnameP = surnameP;
    }

    @ColumnName("apellido_materno")
    public String getSurnameM() {
        return surnameM;
    }

    public void setSurnameM(String surnameM) {
        this.surnameM = surnameM;
    }

    @ColumnName("rfc")
    public String getFedReg() {
        return fedReg;
    }

    public void setFedReg(String fedReg) {
        this.fedReg = fedReg;
    }

}
