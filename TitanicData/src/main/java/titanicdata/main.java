/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package titanicdata;

import java.io.IOException;
import java.util.List;
import joinery.DataFrame;
import tech.tablesaw.api.Table;
import tech.tablesaw.columns.Column;

import tech.tablesaw.io.csv.CsvReadOptions;


/**
 *
 * @author shehab
 */
public class main {
    public static void main(String[] args) throws IOException{
        
        System.out.println("Using joinery : \n ---------------------------------");
        String path = "D:\\iti\\Java\\day5\\Data_to_use\\titanic.csv";
        DataFrame<Object> df = DataFrame.readCsv(path);
        
        DataFrame<Object> df1 = df.retain("survived","age","fare")
                .groupBy(s -> s.get(0))
                .mean();
  
        System.out.println("1.mean ages of survided and not survived :\n"+df1);
        
        DataFrame<Object> df2 = df.retain("pclass","survived")
                .groupBy(s -> s.get(0))
                .mean();
        
        System.out.println("2.precentage of survived with ticket  :\n"+df2);
        
        DataFrame<Object> df3 = df.retain("fare")
                .max();
        
        System.out.println("3. Maximam paid fare : "+df3.get(0,0));
        
        DataFrame<Object> df4 = df.retain("fare")
                .stddev();
        System.out.println("4. Fare standard diviation : "+df4.get(0,0));
        
        // using tablesaw
        System.out.println("\n Using TableSaw \n -------------------------");
        
        Table titanicData;
        titanicData = Table.read().csv(path);
        List<String> colNames = titanicData.columnNames();
        List<Column<?>> dataStructure = titanicData.columns();
        System.out.println("1.Column structure : \n"+dataStructure);
        System.out.println("2.Full Structure:\n"+titanicData.structure());
        System.out.println("3.Summary statstics : \n"+titanicData.summary());
        
        // using xChart
        
    }
}
