/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pyramids;
import java.util.*;
import java.io.*;

/**
 *
 * @author shehab
 */
public class PyramidCsvDao {
    private List<Pyramid> pyramids = new ArrayList<Pyramid>();

    public PyramidCsvDao() {
    }
    
    /**
     * 
     * @param filePath path to CSV file.
     * @return list of pyramid objects
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public List<Pyramid> readPyramidsFromCsv(String filePath) throws FileNotFoundException, IOException{
        BufferedReader br;
        br = new BufferedReader(new FileReader(filePath));
        // read the line containing the header to skip it in the loop
        String line = br.readLine();
        String header = line;
        
        do{
            line = br.readLine();
            if(line != null){
                String [] line_parts = line.split(",");
                Pyramid temp = new Pyramid(line_parts[0],line_parts[2],line_parts[4],line_parts[7]);
                this.pyramids.add(temp); 
            }
        }
        while(line != null);
        
        return this.pyramids;
    }
    /**
     * private inner class that implements comparator and overrides
     * compare in order to use Collections.sort().
     */
    private class SortByHeight implements Comparator<Pyramid>{
        @Override
        public int compare(Pyramid a, Pyramid b){
           return (int)a.getHeight() - (int)b.getHeight();
        }
    }
    /**
     * This method sorts the list of pyramids in ascending order and returns
     * the sorted list.
     * @return list of pyramid
     */
    public List<Pyramid> getSortedPyramids(){
        List<Pyramid> sorted = this.pyramids;
        Collections.sort(sorted,new SortByHeight());
        return sorted;
    }
    
    /**
     * This method generates a map of pyramid sites and pyramid counts.
     * @return map 
     */
    public Map<String,Integer> mapSites(){
        // intialize a map
        Map<String,Integer> sites = new HashMap<>();
        // intialize iterator over pyramids
        Iterator<Pyramid>iter = this.pyramids.iterator();
        /* loop over a the pyramids list and look into hashmap
            if it doesn't exist : create key with value 1
            if the key exists : add 1 to its value
        */
        while(iter.hasNext()){
            Pyramid temp = iter.next();
            String key = temp.getSite();
            
            if(!sites.containsKey(key)){
                sites.put(key,1 );
            }
            else{
                int count =sites.get(key);
                sites.put(key, count + 1);
            }
        }
        return sites;
    }
}
