package com.example.festivos.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "festivo")
public class Festivo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Relación ManyToOne con Pais
    @ManyToOne
    @JoinColumn(name = "idpais")
    private Pais pais;

    private String nombre;
    private Integer dia;
    private Integer mes;

    /**
     * diasPascua se dejó como Integer (nullable) para evitar problemas
     * al alterar la tabla en bases con datos existentes.
     */
    @Column(name = "dias_pascua", nullable = true)
    private Integer diasPascua;

    @ManyToOne
    @JoinColumn(name = "idtipo")
    private TipoFestivo tipo;

    // getters y setters

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Pais getPais() { return pais; }
    public void setPais(Pais pais) { this.pais = pais; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public Integer getDia() { return dia; }
    public void setDia(Integer dia) { this.dia = dia; }

    public Integer getMes() { return mes; }
    public void setMes(Integer mes) { this.mes = mes; }

    public Integer getDiasPascua() { return diasPascua; }
    public void setDiasPascua(Integer diasPascua) { this.diasPascua = diasPascua; }

    public TipoFestivo getTipo() { return tipo; }
    public void setTipo(TipoFestivo tipo) { this.tipo = tipo; }
}
