
package boletin2.pkg5;


public class Satelite {
   
    
      private double meridiano ;
     private double paralelo;
     private double distanciaTerra ;
 
 public Satelite ( ) {

  this.meridiano = meridiano;
  this.paralelo = paralelo;
  this.distanciaTerra = distanciaTerra;
}

public Satelite( double m, double p , double d) {

meridiano = m ;
paralelo = p;
distanciaTerra = d ;

}
 public void verPosicion () {

 }
        
      public double getMeridiano(){
            return meridiano;
        }
       public double getParalelo(){
           return paralelo;
       }
        public double getDistanciaTerra(){
         return distanciaTerra;
                 
             }
       
}

