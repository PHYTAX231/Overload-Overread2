/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package terlaluover;

import java.util.Scanner;

/**
 *
 * @author MOKLET-2
 */
public class TerlaluOver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner cin = new Scanner(System.in);
        
        class Gadget{
            
            private String merek;
            private String kelas;
            private String kellayar;
            private String mtBody;
            
            public Gadget()
            {
        
            }
            
            public Gadget(String _merek,String _kelas,String _kelayar,String _mtBody)
            {
                this.merek = _merek;
                this.kelas = _kelas;
                this.kellayar = _kelayar;
                this.mtBody = _mtBody;
            }
            
            void tampilSeldata()
            {
                System.out.println("Gadget bermerek : " + this.merek);
                System.out.println("Kelas : " + this.kelas);
                System.out.println("Ukuran : " + this.kellayar);
                System.out.println("Dengan material : " + this.mtBody);
            }
            
            void tampilSeldata(String VROM)
            {
                System.out.println("Gadget bermerek : " + this.merek);
                System.out.println("Kelas : " + this.kelas);
                System.out.println("Ukuran : " + this.kellayar);
                System.out.println("Dengan material : " + this.mtBody);
                System.out.println("Versi ROM : " + VROM);
            }
            
        }
        
        
        class Samsung extends Gadget{
            
            void tampilSeldata()
            {
                System.out.println("Samsung Brand Baru");
            }
        }
        
        
        Gadget Handphone = new Gadget("Samsung","Tinggi","6 Inc","Plastik");
        Handphone.tampilSeldata("Funtouch OS_10");
        
        Samsung m62 = new Samsung ();
        m62.tampilSeldata();
        
    }
  
}
