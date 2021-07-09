/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.spktest;

/**
 *
 * @author shehab
 */
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DataStat {
    private static final String COMMA_DELIMITER = ",";
    private JavaRDD<String> videos;

    
    public void intializeSpark()throws IOException{
        Logger.getLogger ("org").setLevel (Level.ERROR);
        // CREATE SPARK CONTEXT
        SparkConf conf = new SparkConf ().setAppName ("wordCounts").setMaster ("local[3]");
        JavaSparkContext sparkContext = new JavaSparkContext (conf);
        // LOAD DATASETS
        this.videos = sparkContext.textFile ("src/main/resources/data/USvideos.csv");
    }
    private static String extractTag(String videoLine){
        
        try {
            return videoLine.split (COMMA_DELIMITER)[6];
        } catch (ArrayIndexOutOfBoundsException e) {
            return "";
        }
    }
    private static String extractTitle(String videoLine) {
        try {
            return videoLine.split (COMMA_DELIMITER)[2];
        } catch (ArrayIndexOutOfBoundsException e) {
            return "";
        }
           
    }
    public void getTagsCounts(){
        //TRANSFORMATIONS
        JavaRDD<String> titles = this.videos
                .map (DataStat::extractTag)
                .filter (StringUtils::isNotBlank);
       // JavaRDD<String>
        JavaRDD<String> words = titles.flatMap (title -> Arrays.asList (title
                .toLowerCase ()
                .trim ()
               .split ("\\|")).iterator ());
        //System.out.println(words.toString ());
        // COUNTING
        Map<String, Long> wordCounts = words.countByValue ();
        List<Map.Entry> sorted = wordCounts.entrySet ().stream ()
                .sorted (Map.Entry.comparingByValue ()).collect (Collectors.toList ());
        // DISPLAY
        for (Map.Entry<String, Long> entry : sorted) {
            System.out.println (entry.getKey () + " : " + entry.getValue ());
        }
    }
    
        public void getTitleWordsCounts(){
        //TRANSFORMATIONS
        JavaRDD<String> titles = this.videos
                .map (DataStat::extractTitle)
                .filter (StringUtils::isNotBlank);
       // JavaRDD<String>
        JavaRDD<String> words = titles.flatMap (title -> Arrays.asList (title
                .toLowerCase ()
                .trim ()
                .replaceAll ("\\p{Punct}", " ")
               .split (" ")).iterator ());
        //System.out.println(words.toString ());
        // COUNTING
        Map<String, Long> wordCounts = words.countByValue ();
        List<Map.Entry> sorted = wordCounts.entrySet ().stream ()
                .sorted (Map.Entry.comparingByValue ()).collect (Collectors.toList ());
        // DISPLAY
        for (Map.Entry<String, Long> entry : sorted) {
            System.out.println (entry.getKey () + " : " + entry.getValue ());
        }
    }
}
