/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondlab;

/**
 *
 * @author Kimo Store
 */
public class Country {
    private String code;
    private String name;
    private String continent;
    private double surfaceArea;
    private double population;
    private double gnp;
    private int capital;
    
    
    
    public Country(String code,String name,String continent,double surfaceArea,
    
           double population,double gnp,int capital ){
        
        super();
        this.capital = capital;
        this.code =code;
        this.continent =continent;
        this.gnp=gnp;
        this.name =name;
        this.population = population;
        this.surfaceArea =surfaceArea;
                
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public double getSurfaceArea() {
        return surfaceArea;
    }

    public void setSurfaceArea(double surfaceArea) {
        this.surfaceArea = surfaceArea;
    }

    public double getPopulation() {
        return population;
    }

    public void setPopulation(double population) {
        this.population = population;
    }

    public double getGnp() {
        return gnp;
    }

    public void setGnp(double gnp) {
        this.gnp = gnp;
    }

    public int getCapital() {
        return capital;
    }

    public void setCapital(int capital) {
        this.capital = capital;
    }
    
    
    public String toString() {
    String s = "";
    s += "Country Code: " + this.code + "\n";
    s += "Country Name: " + this.name + "\n";
    s += "Continent: " + this.continent + "\n";
    s += "Country Surface Area: " + this.surfaceArea + "\n";
    s += "Country population: " + this.population + "\n";
    s += "Country GNP: " + this.gnp + "\n";
    s += "Country capital: " +this.capital + "\n";
    s += "----------------------------------";
    return s;
    
    }
    
    
    
}
