/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pyramids;

import java.io.IOException;
import java.util.*;

/**
 *
 * @author shehab
 */

public class main {
    public static void main(String[] args) throws IOException{

        // intialize DAO object.
        PyramidCsvDao pDao = new PyramidCsvDao();
        // intialize pyramids list.
        List<Pyramid> pyramids;
        // intialize pyramids list for sorted output.
        List<Pyramid> pyramids_sorted ;
        
        // implementing DAO
        pyramids = pDao.readPyramidsFromCsv("./src/main/java/pyramids/pyramids.csv");
        System.out.println("Print Pyramid Test \n ---------------------------\n"
                            +pyramids.get(0));
        
        // implementing sorted pyramids hights.
        pyramids_sorted = pDao.getSortedPyramids();
        System.out.println("shortest pyramid \n----------------------------- \n"
                            +pyramids_sorted.get(0)
                            +"-----------------------------");
        System.out.println("Tallest Pyramid :\n-----------------------------\n"
                            +pyramids_sorted.get(61));
        
        // implementing the map of sites and counts.
        Map<String,Integer> sites;
        sites = pDao.mapSites();
        System.out.println(sites);

    }
}
