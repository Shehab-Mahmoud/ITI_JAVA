/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package titanicdata;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.awt.Color;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.javatuples.Pair;
import org.knowm.xchart.CategoryChart;
import org.knowm.xchart.CategoryChartBuilder;
import org.knowm.xchart.PieChart;
import org.knowm.xchart.PieChartBuilder;
import org.knowm.xchart.SwingWrapper;
import org.knowm.xchart.style.Styler;
//import org.codehaus.jackson.map.ObjectMapper;

/**
 *
 * @author shehab
 */
public class Plotting {
    private List<Person> passengers ;

    public Plotting() {
        this.passengers = new ArrayList<>();
    }
    
    public List<Person> getPassengersFromJson(String path) throws FileNotFoundException, IOException{
        
        ObjectMapper omapper = new ObjectMapper();
        InputStream input = new FileInputStream(path);
        
        omapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        passengers = omapper.readValue(input, new TypeReference<List<Person>> () { });
        return passengers;
    }
    public void graphPassengerAges(List<Person> passengerList)
    {
        //filter to get an array of passenger
        List<Float> pAges= passengerList.stream().map (Person::getAge).limit (8).collect (Collectors.toList());
        List<String> pNames= passengerList.stream().map (Person::getName).limit (8).collect (Collectors.toList());
    
        //Using XCartto graph the Ages 1.Create Chart
        CategoryChart chart = new CategoryChartBuilder().width (1024).height (768).title ("Age Histogram").xAxisTitle("Names").yAxisTitle("Age").build ();
        // 2.Customize Chart
        chart.getStyler().setLegendPosition(Styler.LegendPosition.InsideNW);
        chart.getStyler().setHasAnnotations(true);
        chart.getStyler().setStacked(true);
        // 3.Series
        chart.addSeries("Passenger's Ages", pNames, pAges);
        // 4.Show it
        new SwingWrapper(chart).displayChart();
    
    }
    public void graphPassengerClass(List<Person> passengerList) {
    //filter to get a map of passenger class and total number of passengers in each class
    Map<String, Long> result =
            passengerList.stream()
                    .collect (Collectors.groupingBy(Person::getPclass, Collectors.counting() ) );
    
    // Create Chart
    PieChart chart = new PieChartBuilder().width (800).height (600).title (getClass().getSimpleName()).build ();
    // Customize Chart
    Color[] sliceColors= new Color[]{new Color (180, 68, 50), new Color (130, 105, 120), new Color (80, 143, 160)};
    chart.getStyler().setSeriesColors(sliceColors);
    // Series
    chart.addSeries("First Class", result.get("1"));
    chart.addSeries("Second Class", result.get("2"));
    chart.addSeries("Third Class", result.get("3"));
    // Show it
    new SwingWrapper(chart).displayChart();
    
    
    }
    public void graphPassengerSurvived(List<Person> passengerList) {
    //filter to get a map of passengers survived
    Map<String, Long> result =
            passengerList.stream()
                    .collect (Collectors.groupingBy(Person::getSurvived, Collectors.counting() ) );
    System.out.println(result);
    // Create Chart
    PieChart chart = new PieChartBuilder().width (800).height (600).title (getClass().getSimpleName()).build ();
    // Customize Chart
    Color[] sliceColors= new Color[]{new Color (180, 68, 50), new Color (130, 105, 120)};
    chart.getStyler().setSeriesColors(sliceColors);
    // Series
    chart.addSeries("Didnt Survive", result.get("0"));
    chart.addSeries("Survived", result.get("1"));
    // Show it
    new SwingWrapper(chart).displayChart();
    }

    
    public void graphPassengersurvivedGender(List<Person> passengerList) {
    //filter to get a map of passenger class and total number of passengers in each class
    Map<Pair<String,String>, Long> result =
            passengerList.stream()
                    .collect (Collectors.groupingBy(pairs ->new Pair(pairs.getSurvived(),pairs.getSex()),Collectors.counting() ) );
   
    System.out.println(result);
    // Create Chart
    PieChart chart = new PieChartBuilder().width (800).height (600).title (getClass().getSimpleName()).build ();
    // Customize Chart
    Color[] sliceColors= new Color[]{new Color (180, 68, 50), new Color (130, 105, 120)};
    chart.getStyler().setSeriesColors(sliceColors);
    // Series
    chart.addSeries("males survived", result.get(new Pair<>("1","male")));
    chart.addSeries("females survived", result.get(new Pair<>("1","female")));
    // Show it
    new SwingWrapper(chart).displayChart();
    }
}
