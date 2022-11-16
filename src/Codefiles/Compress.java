/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Codefiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

/**
 *
 * @author soul
 */
public class Compress {
    public static void method(File file) throws FileNotFoundException, IOException{
        String fileDirectory=file.getParent();
        System.out.println(fileDirectory);
        FileOutputStream fos;
        GZIPOutputStream gzipOS;
        try (FileInputStream fis = new FileInputStream(file)) {
            fos = new FileOutputStream(fileDirectory+"/Compressedfile.gz");
            gzipOS = new GZIPOutputStream(fos);
            byte[] buffer=new byte[1024];
            int len;
            while((len=fis.read(buffer))!=-1){
                gzipOS.write(buffer,0,len);
            }
        }
        gzipOS.close();
        fos.close();
        
    }
    public static void main(String[] args) throws FileNotFoundException, IOException{
        File path=new File("‪C:\\Users\\soul\\Documents\\Testfile netbeans.txt");
        method(path);
    }
    
}
