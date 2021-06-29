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

public class SecondLab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        create a city object 
        and a country object
        */
        CityDAOIMPL cityObject  = new CityDAOIMPL();
        CountryDAOIMPL countryObject = new CountryDAOIMPL();
        // csv file paths
        String cityPath = "./src/secondlab/Cities.csv";
        String countryPath ="./src/secondlab/Countries.csv";
        
        //create city and country list from csv files
        List<City> cityList = cityObject.readCitiesFromCSV(cityPath);
        List<Country> countryList = countryObject.readCountriesFromCSV(countryPath);
        
        //Country populations
        Map<String,Double> popForCountry = countryObject.getCountryPop(countryList);
        List <Double> countriesPop = countryObject.countryPopulationlist(countryList);
        popForCountry.forEach((k, v) -> System.out.println("Country is: "+ k+ ", Population is: "+ v));
        
        //average population and maximum population
        double averagePopulation = countryObject.avgPopulation(countriesPop);
        System.out.println("The average population for all countries is: "+ averagePopulation);
        double maxPopulation = countryObject.maxPopulation(countriesPop);
        System.out.println("The maximum population for all countries is: "+ maxPopulation);


        // Create a map that uses the country code as keys and a list of cities as the value for each country.
        Map<String,List<City>> cities =cityObject.codeCityMap();
        System.out.println(cities);
        
        // Sorted cities for a given country
        List<City> sorted = cityObject.getSortedCities("NZL");
        System.out.println(sorted);
        
        // Sort cities by population
        Map<String,City> sortedCity = cityObject.highestPopPerCity();
        System.out.println(sortedCity);
        
        // Highest population capital
        City capital = countryObject.highestPopCapital(cityList);
        System.out.println("Highest population capital is:\n \n"+capital);
    }
    
}
