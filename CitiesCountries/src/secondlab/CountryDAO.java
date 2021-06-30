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
import java.util.List;
import java.util.Map;

public interface CountryDAO {
    public List<Country> readCountriesFromCSV(String filename);    
    public Country createCountry(String[] metadata);
    public List <Double> countryPopulationlist(List<Country> list);
    public double avgPopulation(List<Double> list);
    public double maxPopulation(List<Double> list);
    public Map<String, Double> getCountryPop(List<Country> list);
   // public List<Country> sortCountries(List<Country> list);
}
