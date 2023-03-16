package com.example.datavis.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "countries")
public class Country {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "Code")
    private String Code;

    @Column(name = "Display_Name")
    private String Name;

    @Column(name = "Continent")
    private String Continent;

    @Column(name = "Currency_Name")
    private String Currency;

    @Column(name = "Area_Sqkm")
    private int Area;

    @Column(name = "Population")
    private int Population;

    public Integer getArea() {
        return Area;
    }

    public Country() {
    }

    public Country(String Code, String name, String continent, String currency, int area, int population) {
        this.Code = Code;
        Name = name;
        Continent = continent;
        Currency = currency;
        Area = area;
        Population = population;
    }

    public Country(Integer id, String Code, String name, String continent, String currency, int area, int population) {
        this.id = id;
        this.Code = Code;
        Name = name;
        Continent = continent;
        Currency = currency;
        Area = area;
        Population = population;
    }

    public void setArea(Integer area) {
        Area = area;
    }

    public Integer getPopulation() {
        return Population;
    }

    public void setPopulation(Integer population) {
        Population = population;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String Code) {
        this.Code = Code;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getContinent() {
        return Continent;
    }

    public void setContinent(String continent) {
        Continent = continent;
    }

    public String getCurrency() {
        return Currency;
    }

    public void setCurrency(String currency) {
        Currency = currency;
    }



    @Override
    public String toString() {
        return "Country{" +
                "Code='" + Code + '\'' +
                ", Name='" + Name + '\'' +
                ", Continent='" + Continent + '\'' +
                ", Currency='" + Currency + '\'' +
                ", Area=" + Area +
                ", Population=" + Population +
                '}';
    }
}
