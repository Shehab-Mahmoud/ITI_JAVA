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

import java.io.BufferedReader;
import java.io.File;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;


public class CountryDAOIMPL implements CountryDAO{
    List<Country> countries = new LinkedList<>();
  
    @Override    
    public List<Country> readCountriesFromCSV(String filename) {

        String[] splitted;
        File f = new File(filename);
        //System.out.println("file exists: "+f.exists());
        if(f.exists()) {
            try {   
                // intialize file reader
                FileReader fr = new FileReader(f);
                // intialize Buffered Reader
                BufferedReader br = new BufferedReader(fr);
                String line;
                line = br.readLine();
                // read 1st line and add it to Countries
                splitted = line.split(",");
                this.countries.add(createCountry(splitted));

                    while(line != null) {
                        splitted = line.split(",");
                        this.countries.add(createCountry(splitted));
                        line = br.readLine();
                    }
                    br.close();
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }		
            }else {
                System.out.println("file not found!");
            }
            return this.countries;
        }    


    @Override
    public Country createCountry(String[] metadata) {
            String code = metadata[0];
            String name = metadata[1];
            String continent = metadata[2];
            double surfaceArea = Double.parseDouble(metadata[3]);
            double population = Double.parseDouble(metadata[4]);
            double gnp = Double.parseDouble(metadata[5]);
            int capital = Integer.parseInt(metadata[6]);

            return new Country(code,name,continent,surfaceArea,population,gnp,capital );
    }  


    @Override
    public Map<String, Double> getCountryPop(List<Country> list) {
        Map<String, Double> countryPopMap = new HashMap<>();
        for(Country c: list) {
                countryPopMap.put(c.getName(), c.getPopulation());
            }
            return countryPopMap;
        }


    @Override
    public List <Double> countryPopulationlist(List<Country> list){

        List<Double> population_list = new ArrayList<>();
        double population;
        for (Country c:list){
            population = c.getPopulation();
            population_list.add(population);
        }
        return population_list;
    }

    @Override
    public double avgPopulation(List<Double> list){

      DoubleSummaryStatistics summaryStats = list.stream()
      .mapToDouble((a) -> a)
      .summaryStatistics();
      double avg = summaryStats.getAverage();
     return avg;

    }

    @Override
    public double maxPopulation(List<Double> list){

      DoubleSummaryStatistics summaryStats = list.stream()
      .mapToDouble((a) -> a)
      .summaryStatistics();
      double max = summaryStats.getMax();
     return max;
    }

}
