/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Codefiles;
import java.io.*;
import java.util.zip.*;
/**
 *
 * @author yash
 */
public class Decompress {
    public static void method(File file)
        throws IOException
    {
  
        String fileDirectory = file.getParent();
        FileInputStream fis = new FileInputStream(file);
        GZIPInputStream gzipIS = new GZIPInputStream(fis);
        FileOutputStream fos = new FileOutputStream(fileDirectory + "/Decompressedfile.txt"); 
 
        byte[] buffer = new byte[1024];
  
        int len;
        
        while ((len = gzipIS.read(buffer)) != -1) {
            System.out.println(len);
            fos.write(buffer, 0, len);
        }
        
        gzipIS.close();
        fos.close();
        fis.close();
  
    }
  
    // Method 2
    // Main driver method
    public static void main(String[] args)
        throws IOException
    {
  
        // Creating an object of File class and
        // providing local directory path of a file
        File path = new File("/Users/yash/NetBeansProjects/CompressorDecompressor/src/compressordecompressor/Compressedfile.gz");
  
        // Calling the Method1 in main() to
        // convert file to byte array
        method(path);
  
        // Printing the byte array
//        System.out.print(Arrays.toString(array));
    }
}
