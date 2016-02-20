/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamedayhop;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author TrungNT
 */
public class ProcessMatrix {
    public void KhoiTaoMatrix(String[][] a)
    {
        for(int i=0; i<4; i++)
            for(int j=0; j<4; j++)
                a[i][j] = "-";
        //Xac dinh vi tri khoi dau
        a[0][0] = "p";
        a[1][1] = "b";
        a[2][1] = "g";  
    }
    
    public void DisplayMatrix(String[][] a)
    {
        for(int i=0; i<4; i++)
        {    
            for(int j=0; j<4; j++)
                System.out.print(a[i][j] + " ");
            System.out.println();
        }
    }
    
    public String moveLocation()
    {
        String c="";
        
        try{
            
            System.out.println("Ban di chuyen cac vi tri bang cac phim: a, d, s, w");
            System.out.print("\nPhim a: sang trai");
            System.out.print("\nPhim d: sang phai");
            System.out.print("\nPhim w: di chuyen len");
            System.out.print("\nPhim s: di chuyen xuong");
            
            BufferedReader oBufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("\nNhan 1 phim de di chuyen: ");    
            c = oBufferedReader.readLine();
        }catch(Exception e){
            System.out.println(e.toString());
        }           
        return c;   
    }
    
    //dinh nghia ham tim kiem vi tri cua gia tri x
    public void Search(String[][] a, String x)
    {
        int hang, cot;
        
        for(int i=0; i<4; i++)
            for(int j=0; j<4; j++)
                if(a[i][j]==x)
                {
                    hang = i;
                    cot = j;
                    return;
                }
    }
    
    //HIen thi nguoi choi va kiem tra vi tri cua box
    public void displayPlayerAndCheck(String[][] a, String c)
    {
        c = moveLocation();
        
        
    }
}
