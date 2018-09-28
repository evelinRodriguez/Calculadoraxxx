package calculadora;
import static java.lang.Math.*; 
 import java.lang.StrictMath;
public class CalculadoraT{
    
   
  
    
    
    double angulo1;
    //double anguloRadianes=angulo;
    public boolean seno;
    public boolean cos;
    public boolean tan;
    public boolean cotan;
    public boolean csc;
    public boolean sec;
    public boolean raiz;
    public boolean log;
    public double resultado1;
    public String digito1;
   

    public CalculadoraT(){
     this.digito1="";
     this.seno=false;
     this.cos=false;
     this.tan=false;
     this.cotan=false;
     this.csc=false;
     this.sec=false;
     this.raiz=false;
     this.log=false;
     this.resultado1 = 0;
}
    public String getDigito1() {
        return digito1;
    }

    public void setDigito1(String digito) {
        this.digito1 = digito;
    }
    public void agregarNum(int angulo){
        setDigito1(digito1+angulo);
    }
    
    
  
    
   public void seno(String angulo){//metodo
   this.resultado1=Double.parseDouble(angulo);
   angulo1=Double.parseDouble(angulo);
   this.resultado1=Math.toRadians(angulo1);
   seno=true;
   setDigito1("");
    }
    public void cos(String angulo){//metodo
   this.resultado1=Double.parseDouble(angulo);
   angulo1=Double.parseDouble(angulo);
   this.resultado1=Math.toRadians(angulo1);
   seno=true;
   setDigito1("");
    }
   public void tan(String angulo){//metodo
   this.resultado1=Double.parseDouble(angulo);
   angulo1=Double.parseDouble(angulo);
   this.resultado1=Math.toRadians(angulo1);
   seno=true;
   setDigito1("");
    }
     public void cotan(String angulo){//metodo
   this.resultado1=Double.parseDouble(angulo);
   angulo1=Double.parseDouble(angulo);
   this.resultado1=Math.toRadians(angulo1);
   seno=true;
   setDigito1("");
    }
       public void csc(String angulo){//metodo
   this.resultado1=Double.parseDouble(angulo);
   angulo1=Double.parseDouble(angulo);
   this.resultado1=Math.toRadians(angulo1);
   seno=true;
   setDigito1("");
    }
   public void sec(String angulo){//metodo
   this.resultado1=Double.parseDouble(angulo);
   angulo1=Double.parseDouble(angulo);
   this.resultado1=Math.toRadians(angulo1);
   seno=true;
   setDigito1("");
    }
    public void raiz(String angulo){//metodo
        this.resultado1=Double.parseDouble(angulo);
        raiz=true;
        setDigito1("");
    }
    public void log (String angulo){//metodo
        this.resultado1=Double.parseDouble(angulo);
        log=true;
        setDigito1("");
    } 
    public double calculo(String numero){
   
   if(seno==true){
            resultado1=Math.asin(resultado1);
        }
   if(cos==true){
            resultado1=Math.acos(resultado1);
        }
   if(tan==true){
            resultado1=Math.atan(resultado1);
        }
   if(cotan==true){
            resultado1=1/(Math.atan(resultado1));
        }
    if(csc==true){
            resultado1=1/(Math.asin(resultado1));
        }
    if(sec==true){
            resultado1=1/(Math.acos(resultado1));
        }
    if(raiz==true){
            resultado1=Math.sqrt(resultado1);
        }
    if(log==true){
            resultado1=Math.log(resultado1);
        }
    
   seno=false;
   cos=false;
   tan=false;
   cotan=false;
   sec=false;
   csc=false;
   raiz=false;
   log=false;
   
   return resultado1;
    }  
   
     
}
    

 