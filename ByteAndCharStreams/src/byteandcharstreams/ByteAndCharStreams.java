/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package byteandcharstreams;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.CharArrayReader;
import java.io.CharArrayWriter;
/**
 *
 * @author Aslam
 */
public class ByteAndCharStreams {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        char b[]={'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        CharArrayReader  charinput=new CharArrayReader(b);
        int x;
        while((x=charinput.read())!=-1){
            System.out.print(x);
            System.out.print((char)x);
        }
        System.out.println("\nprint using read All Bytes");
        //String str= new String(charinput.readAllBytes());
        //if(str.length()==0) System.out.println("ByteArrayInputStream i s empty");
        //else System.out.println("Str i s "+ str);
//        String str= new String(charinput.read());
        CharArrayWriter charoutput=new CharArrayWriter(20);
        charoutput.write(b);
        System.out.println(b);
        System.out.println("charoutput is " + charoutput);
        //byte newb[]=charoutput.toCharArray();
        char newb[]=charoutput.toCharArray();
        for(char each: newb){
            System.out.printf(" %3c", each);
            System.out.println((char)each);
        }
        System.out.println(charoutput);
        //writing to a file
        //replace "/Users/Aslam/OneDrive/Desktop/mdaslam/java/FileIOStreamProgram/ByteOutputData.txt" with location you prefer to save the output of this byte array
        //also REMOVE C: AND START THE FILE LOCATION from HOME DIRECTORY /USER/... and so on
        
//        charoutput.writeTo(new FileOutputStream("/Users/Aslam/OneDrive/Desktop/mdaslam/java/FileIOStreamProgram/CharOutputData.txt"));
        System.out.println("still charoutput has data "+charoutput);
        System.out.println("still charoutput has data "+charoutput);
        charoutput.flush();
        System.out.println("still charoutput has data "+charoutput);
        charoutput.reset();
        System.out.println("still charoutput has data "+charoutput);

    }
    
}