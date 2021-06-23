/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consolereadfile;



/**
 *
 * @author shehab
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Writer;
/**
 *
 * @author shehab
 */
public class main {
    public static void main(String [] args) throws IOException{
        // Create file object
        File file = new File ("D:\\iti\\Java\\ITI_JAVA2\\ConsoleRead\\src\\main\\java\\files\\test.txt");
        // Create new file
        if(file.createNewFile()){
            System.out.println("file created : "+ file.getName());
        }
        else{
            System.out.println("file : "+file.getName()+" already exists");
            // clear old file by removing and creating it again
            file.delete();
            if(file.createNewFile()){
                System.out.println("file cleared !.");
            }
        }
        
        // intialize reader
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(r);
        // intialize writer
        Writer w = new FileWriter("D:\\iti\\Java\\ITI_JAVA2\\ConsoleRead\\src\\main\\java\\files\\test.txt");
        BufferedWriter bw = new BufferedWriter(w);
        
        // intialize empty string
        String temp = "";
        // if temp == "stop" stop taking input
        while(!temp.equals("stop")){
            // read from console
            System.out.println("Enter data: ");
            temp = br.readLine();
            // write to the file
            bw.write(temp+"\n");
            System.out.println("Data "+temp+" written to test file.");
        }
        //close reader and writer
        br.close();
        bw.close();
        
    }
    
}
