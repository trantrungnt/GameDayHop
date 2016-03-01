/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamedayhop;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import org.fusesource.jansi.*;

/**
 *
 * @author TrungNT
 */
public class GameDayHop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)     
    {
        /*String[][] mt = new String[4][4];                
                            
        ProcessMatrix oProcessMatrix = new ProcessMatrix();
        //goi phuong thuc khoi tao
        oProcessMatrix.KhoiTaoMatrix(mt);
        //goi phuong thuc hien thi
        oProcessMatrix.DisplayMatrix(mt);
        //goi phuong thuc di chuyen
        oProcessMatrix.moveLocation();*/
        
        System.out.println("hello world");
        System.out.println();
        
        
    }
    
    public final static void clearConsole()
{
    try
    {
        final String os = System.getProperty("os.name");

        if (os.contains("Windows"))
        {
            Runtime.getRuntime().exec("cls");
        }
        else
        {
            Runtime.getRuntime().exec("clear");
        }
    }
    catch (final Exception e)
    {
        //  Handle any exceptions.
    }
}
    
    
}
