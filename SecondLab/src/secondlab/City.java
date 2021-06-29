package secondlab;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kimo Store
 */
public class City {
    private int id;
    private String name;
    private int population;
    private String countryCode;
    
    public City (int id ,String name, int population ,String countryCode){
        
        super();
        this.id =id;
        this.name =name;
        this.population =population;
        this.countryCode =countryCode;
                
    }



    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    public String getCountrycode() {
        return countryCode;
    }

    
    @Override
    public String toString() {
	String s = "";
	s += "City ID: " + this.id + "\n";
	s += "City Name: " + this.name + "\n";
	s += "City Population: " + this.population + "\n";
	s += "Country Code: " + this.countryCode + "\n";
	s += "----------------------------------\n";
	return s;
	}
    
    
    
    
}
