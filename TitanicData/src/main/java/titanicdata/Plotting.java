/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package titanicdata;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import org.codehaus.jackson.map.ObjectMapper;

/**
 *
 * @author shehab
 */
public class Plotting {
    List<Person> passengers = new ArrayList<Person>();
    
    public List<Person> getPassengersFromJson(String path) throws FileNotFoundException{
        
        ObjectMapper mapper = new ObjectMapper();
        InputStream input = new FileInputStream(path);
        
       passengers = mapper.readValue(input, new TypeReference<List<Person>> () { });
    }
}
