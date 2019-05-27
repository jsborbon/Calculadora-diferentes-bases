/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;


/**
 *
 * @author USUARIO
 */
public class Operaciones {
  
    private int a,b;
    private int resultado;
    public int error=0;
    Suma s=new Suma();
    Resta r=new Resta();
    Multiplicacion m=new Multiplicacion();
    Division d=new Division();
    CBinario bin=new CBinario();
    COctal oct=new COctal();
    CDecimal dec=new CDecimal();
    CHexadecimal hex=new CHexadecimal();
    

    public Operaciones(){
          
        
    }

    public int geta() {
        return a;
    }

    public void seta(String A,int Opc) {
    switch(Opc){
                case 1:
                    this.a =dec.ConvertirD(A);
                    break;
                case 2:
                    this.a =dec.ConvertirD(String.valueOf(bin.ConvertirB(A)));
                    break;
                case 3:
                    this.a =dec.ConvertirD(String.valueOf(hex.ConvertirH(A)));
                    break;
                case 4:
                    this.a =dec.ConvertirD(String.valueOf(oct.ConvertirO(A)));
                    break;
            }
    }

    public int getb() {
        return b;
    }

    public void setB(String B, int Opc) {
        switch(Opc){
                case 1:
                    this.b =dec.ConvertirD(B);
                    break;
                case 2:
                    this.b =dec.ConvertirD(String.valueOf(bin.ConvertirB(B)));
                    break;
                case 3:
                    this.b =dec.ConvertirD(String.valueOf(hex.ConvertirH(B)));
                    break;
                case 4:
                    this.b =dec.ConvertirD(String.valueOf(oct.ConvertirO(B)));
                    break;
            }
    }



    public int getResultado() {
        
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    public void Reset(){
        this.a = 0;
        this.b = 0;
        this.resultado = 0;
    }

    public int CambioSigno(String Valor){
        int ops=Integer.parseInt(Valor);
        ops=ops*-1;
        return ops;
    }
    
    public void Porcentaje(){
        this.resultado=((this.b*this.a)/100);
    }
    
     public void Suma(){
    
    this.resultado=s.sumar(this.a,this.b);
    
     }
    public void Resta(){
    
    this.resultado=r.restar(this.a,this.b);
    
    }
    public void Multiplicacion(){
    
    this.resultado=m.multiplicar(this.a,this.b);

    }
    public void Division(){
    
    this.resultado=d.dividir(this.a,this.b);
        
    }
    public void Resultado(int c){
         switch(c){
            case 0:
        setResultado(getb());
                break;
            case 1:
                Suma();
                break;
            case 2:
                Multiplicacion();
                break;
            case 3:
                if(getb()!=0){
                Division();}
                else{
                error=1;
                }
                break;
            case 4:
                Porcentaje();
                break;
            case 5:
                Resta();
                break;
        }
    }

    public String Imprimir(int Opc) {
    String Impresion="";
            switch(Opc){
                case 1:
                    Impresion=String.valueOf(getResultado());
                    break;
                case 2:
                    Impresion=Integer.toBinaryString(getResultado());
                    break;
                case 3:
                    Impresion=Integer.toHexString(getResultado());
                    break;
                case 4:
                    Impresion=Integer.toOctalString(getResultado());
                    break;
            }
   
    return Impresion;
    }
    
}

