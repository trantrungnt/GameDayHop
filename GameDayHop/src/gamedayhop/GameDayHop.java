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
public class GameDayHop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[][] a = new String[4][4];        
                               
        ProcessMatrix oProcessMatrix = new ProcessMatrix();
        //goi phuong thuc khoi tao
        oProcessMatrix.KhoiTaoMatrix(a);
        //goi phuong thuc hien thi
        oProcessMatrix.DisplayMatrix(a);
    }
    
    
    
    
}
