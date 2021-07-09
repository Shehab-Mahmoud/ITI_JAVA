package com.mycompany.spktest;


import java.io.IOException;


public class YoutubeTitleWordCount {
//    private static final String COMMA_DELIMITER = ",";
    public static void main(String[] args) throws IOException {

          DataStat tags = new DataStat();
          tags.intializeSpark();
          tags.getTagsCounts();
          //tags.getTitleWordsCounts();
          
          
    }
    

}
