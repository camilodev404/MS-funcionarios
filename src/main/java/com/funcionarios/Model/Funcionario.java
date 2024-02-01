package com.funcionarios.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "funcionarios")
public class Funcionario {

    @Id
    @Column(name = "idfuncionario")
    private String idFuncionario;

    @Column(name = "nombres")
    private String nombres;

    @Column(name = "apellidos")
    private String apellidos;

    @Column(name = "cargo")
    private String cargo;

    @Column(name = "rol")
    private String rol;

    @Column(name = "idugt")
    private String idugt;

    @Column(name = "correo")
    private String correo;

    @Column(name = "passw")
    private String password;

    @Column(name = "tipodoc")
    private String tipodoc;

    @Column(name = "documento")
    private String documento;

    public Funcionario() {
    }

    public Funcionario(String idFuncionario, String nombres, String apellidos, String cargo, String rol, String idugt, String correo, String password, String tipodoc, String documento) {
        this.idFuncionario = idFuncionario;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.cargo = cargo;
        this.rol = rol;
        this.idugt = idugt;
        this.correo = correo;
        this.password = password;
        this.tipodoc = tipodoc;
        this.documento = documento;
    }

    public String getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(String idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getIdugt() {
        return idugt;
    }

    public void setIdugt(String idugt) {
        this.idugt = idugt;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTipodoc() {
        return tipodoc;
    }

    public void setTipodoc(String tipodoc) {
        this.tipodoc = tipodoc;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }
}
