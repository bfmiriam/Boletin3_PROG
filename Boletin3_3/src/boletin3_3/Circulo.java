
package boletin3_3;
   
    
public class Circulo {
    
    private double radio;
    final static double PI=3.14;
    

public Circulo(){
    radio=0;

}

public Circulo(double r){
    
    radio= r; 
            
}

public void setRadio(double r){
    radio=r;
}

public double getRadio(){
    return radio;
}

public double calcularArea (){
double area=PI * Math.pow(radio,2);
return area;


}


public double calcularLonxitude(){
  
double lonxitude = 2 * PI * radio ;
return lonxitude;
}
}
