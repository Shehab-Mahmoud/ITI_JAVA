/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isletter;

/**
 *
 * @author shehab
 */
public class StringOps {
    private String s;

    public StringOps(String s) {

          this.s = s;   
    }
    public boolean isAlphapet(){
        if(this.s != null){
            if( !this.s.isEmpty()|| !this.s.isBlank()){
                boolean alpha = this.s.chars()
                    .mapToObj(c -> (char)c)
                    .allMatch(Character::isLetter);
                return alpha;
            }
            else return false;       
        }
        else return false;
    }

    public String getS() {
        return s;
    }
}
