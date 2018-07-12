/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemsolving;

/**
 *
 * @author bulbul
 */
public class  BlockStatic {
    static int s = 10;
    int y=20;
    
    public static void main(String[] args) {
        BlockStatic bs = new BlockStatic();
        bs.y=999;
        bs.s=888;
        BlockStatic bs2 = new BlockStatic();
        System.out.println(bs2.s+"......"+bs2.y);
    }
}
