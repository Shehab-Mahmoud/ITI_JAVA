/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pyramids;

/**
 *
 * @author shehab
 */
public class Pyramid {
    private String pharoh;
    private String modern_name;
    private String site;
    private double height;

    public Pyramid(String pharoh, String modern_name, String site, String height) {
        this.pharoh = pharoh;
        this.modern_name = modern_name;
        this.site = site;
        /* try convert height into a double if 
           if the string is empty
           give the hight a default value of the mean hight of all pyramids
           47.817
        */
        try{
            double height_temp = Double.parseDouble(height);
            this.height = height_temp;
        }
        catch (NumberFormatException ex){
            this.height = 48.817;
        }
    }

    public String getPharoh() {
        return pharoh;
    }

    public String getModern_name() {
        return modern_name;
    }

    public String getSite() {
        return site;
    }

    public double getHeight() {
        return height;
    }
    
    // override toString to print the pyramid object
    @Override
    public String toString(){
        return String.format("Pyramid name : "+this.modern_name+"\n"+
                "pharoh name : "+ this.pharoh + "\n"+ 
                "pyramid site : "+this.site+"\n"+
                "Pyramid height : "+this.height+"\n");
    }

}
