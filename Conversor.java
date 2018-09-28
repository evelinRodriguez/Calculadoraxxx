
package calculadora;


public class Conversor {
     public double res1,res2,res3,res4,res5,res6,res7,valor1;
     public String valor;
     String Unidades;
     public boolean milimetros;
    public Conversor() {
        this.valor="";
        this.milimetros=false;
        
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

  public void agregarNum(int num){
        setValor(valor+num);
    }
    public void milimetros(String num){//metodo
        this.valor1=Double.parseDouble(num);
        milimetros=true;
        setValor("");
    }
    //MILIMETROS A ...
    public double calculoM1(String numero){
        if(milimetros==true){
            res1=valor1*0.1;//CM
                            }
                    return res1;
      
    }
    public double calculoM2(String numero){
        if(milimetros==true){
            res2=valor1*0.03937;//PULAGAS
                            }
                    return res2;
      
    }
     public double calculoM3(String numero){
        if(milimetros==true){
            res3=valor1*0.00328084;//PIES
                            }
                    return res3;
      
    }
      public double calculoM4(String numero){
        if(milimetros==true){
            res4=valor1*0.001;//METROS
                            }
                    return res4;
      
    }
       public double calculoM5(String numero){
        if(milimetros==true){
            res5=valor1*0.0010936;//YARDAS
                            }
                    return res5;
      
    }
        public double calculoM6(String numero){
        if(milimetros==true){
            res6=valor1*0.000001;//KILOMETROS
                            }
                    return res6;
      
    }
        
        public double calculoM7(String numero){
        if(milimetros==true){
            res7=valor1*0.0000006;//MILLAS
                            }
                    return res7;
    
    }
        
           
        }
