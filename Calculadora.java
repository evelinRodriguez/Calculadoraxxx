package calculadora;

public class Calculadora {
 public String digito;
 public double resultado;
 public boolean suma;
 public  boolean resta;
 public boolean multiplicacion;
 public boolean division;
 public boolean Borrar;
 

    public Calculadora() {
        this.resultado = 0;
        this.digito="";
        this.suma=false;
         this.resta=false;
          this.multiplicacion=false;
           this.division=false;
    }
    
    //getter and setter

    public String getDigito() {
        return digito;
    }

    public void setDigito(String digito) {
        this.digito = digito;
    }
    
    public void agregarNum(int num){
        setDigito(digito+num);
    }
    
    public void suma(String num){//metodo
        this.resultado=Double.parseDouble(num);
        suma=true;
        setDigito("");
    }
     public void resta(String num){//metodo
        this.resultado=Double.parseDouble(num);
        resta=true;
        setDigito("");
    }
      public void multiplicacion(String num){//metodo
        this.resultado=Double.parseDouble(num);
        multiplicacion=true;
        setDigito("");
    }
       public void division(String num){//metodo
        this.resultado=Double.parseDouble(num);
        division=true;
        setDigito("");
    }
       public void Borrar(String num){//metodo
        this.resultado=Double.parseDouble(num);
        Borrar=true;
        setDigito("");
    }
    public double calculo(String numero){
        if(suma==true){
            resultado=resultado+Double.parseDouble(numero);
        }
        if(resta==true){
            resultado=resultado-Double.parseDouble(numero);
        }
        if(multiplicacion==true){
            resultado=resultado*Double.parseDouble(numero);
        }
        if(division==true){
            resultado=resultado/Double.parseDouble(numero);
        }
        if(Borrar==true){
           setDigito(""); 
        }
        //resetear valores
        suma=false;
        resta=false;
        multiplicacion=false;
        division=false;
        Borrar=false;
        
        //retornar el valor de resultado
        return resultado;
        
        
    }
}
