/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamedayhop;

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
}
