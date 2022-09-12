/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nominas_edgarortiz;

/**
 *
 * @author Edgar O
 */
public class Comerciales {
    
    private String Nombre;
    private int SalarioBase;
    private double EpsEmpleado;
    private double EpsEmpleador ;
    private double ResultadoEps;
    private double Pension;
    private double PensionEmpleador;
    private double Arl;
    private double PrimaMensual;
    private double Vacaciones;
    private double Cesantias;
    private double ParaFiscales;
    private double InteresesCesantias;
    private double AuxilioTransporte;
    private double Salud;
    private double Prima;
    
    
    public Comerciales(String nombre){
     
        SalarioBase = 1500000;
        Pension = 0.04;
        PensionEmpleador = 0.12 ;
        EpsEmpleado = 0.04;
        EpsEmpleador = 0.085;  
        AuxilioTransporte = 117172;
        Salud = 0.04;
        Arl = 0.00522;
        Prima = 0.0833;
        Cesantias = 0.0833;
        InteresesCesantias = 0.01;
        Vacaciones = 0.0417;
        this.Nombre = nombre;
    }
    
    
    public double empleado (){
        double epsLiquidacion = this.SalarioBase * this.EpsEmpleado;
        double pensionLiquidacion = this.SalarioBase * this.Pension;      
        double salarioPension = this.SalarioBase - pensionLiquidacion;
        double salarioEps = this.SalarioBase - epsLiquidacion;       
        double saludDescuento = this.SalarioBase * this.Salud;
        double pagoTotal = this.SalarioBase - saludDescuento - pensionLiquidacion + this.AuxilioTransporte;              
        String Nombre_empleado = this.Nombre;
        
        System.out.println( "\n" + "NOMBRE DE EMPLEADO: " + Nombre_empleado + "\n");
        System.out.println( "" + Nombre_empleado + " TIENE UN SALARIO DE: " + SalarioBase +"\n");
        
        System.out.println( "TOTAL DESCUENTO EMPLEADO (EPS LIQUIDACIÓN): " + epsLiquidacion);
        System.out.println( "TOTAL DESCUENTO EMPLEADO (PENSIÓN LIQUIDACIÓN): " + pensionLiquidacion);
        
        System.out.println("SALARIO CON DESCUENTO DE PENSIÓN: " + salarioPension);
        System.out.println( "SALARIO CON DESCUENTO EPS: "  + salarioEps + "\n"  );
        
        System.out.println( "PAGO TOTAL: "  + pagoTotal + "\n"  );
        
        return pensionLiquidacion;
       
    }
     public double empleador (){
        double epsLiquidacion = this.SalarioBase * this.EpsEmpleador;
        double pensionLiquidacion = this.SalarioBase * this.PensionEmpleador;
        double salarioPension = this.SalarioBase - pensionLiquidacion;
        double salarioEps = this.SalarioBase - epsLiquidacion ;
        double pagoPension = this.SalarioBase  * this.PensionEmpleador;
        double pagoEps = this.SalarioBase  * this.EpsEmpleador;
        double pagoArl = this.SalarioBase  * this.Arl;
        double pagoPrima = this.SalarioBase  * this.Prima;
        double pagoCesantias = this.SalarioBase  * this.Cesantias;
        double interesesCesantias = this.SalarioBase  * this.InteresesCesantias;
        double pagoVacaciones = this.SalarioBase  * this.Vacaciones;
        double pagoParafiscales = this.SalarioBase  * this.ParaFiscales;
        
        
        System.out.println( "----------------------------------------------" );
        System.out.println( "TOTAL DE DESCUENTO EMPLEADOR (LIQUIDACIÓN EPS): " + epsLiquidacion);
        System.out.println( "TOTAL DE DESCUENTO EMPLEADOR (LIQUIDACIÓN PENSIÓN): " + pensionLiquidacion);
        System.out.println("SALARIO CON DESCUENTO DE PENSION (EMPLEADOR): " + salarioPension);
        System.out.println("SALARIO CON DESCUENTO DE EPS (EMPLEADOR): " + salarioEps + "\n" );
        System.out.println( "\t VALOR PAGAR POR EL EMPLEADOR DE: " + "\n"  );
        
        System.out.println( "- PENSIÓN: " + pagoPension);
        System.out.println( "- EPS: " +  pagoEps);
        System.out.println( "- ARL: " + pagoArl );
        System.out.println( "- PRIMA: " + pagoPrima );
        System.out.println( "- CESANTIAS: " + pagoCesantias);
        System.out.println( "- INTERESES A LA CESANTIA: " + interesesCesantias);
        System.out.println( "- VACACIONES: " + pagoVacaciones );
        System.out.println( "- PARAFISCALES: " + pagoParafiscales + "\n" );
    
        return pensionLiquidacion;
    }
    
       public Comerciales (String nombre, int salariobase, double eps, double pension, 
               double arl, double prima, double vacaciones, double cesantias, 
               double parafiscales, double interesesCesantias,double eps_empleador, double pension_empleador){
       this.Nombre = nombre;
       this.SalarioBase = salariobase;
       this.EpsEmpleado = eps;
       this.Pension = pension;
       this.Arl = arl;
       this.Prima = prima;
       this.Vacaciones = vacaciones;
       this.Cesantias = cesantias;
       this.ParaFiscales = parafiscales;
       this.InteresesCesantias = interesesCesantias;
       this.EpsEmpleador = eps_empleador;
       this.PensionEmpleador = pension_empleador;
       
   }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String NombreOperario) {
        this.Nombre = Nombre;
    }

    public int getSalarioBase() {
        return SalarioBase;
    }

    public void setSalarioBase(int SalarioBase) {
        this.SalarioBase = SalarioBase;
    }

    public double getEpsEmpleado() {
        return EpsEmpleado;
    }

    public void setEpsEmpleado(double EpsEmpleado) {
        this.EpsEmpleado = EpsEmpleado;
    }

    public double getEpsEmpleador() {
        return EpsEmpleador;
    }

    public void setEpsEmpleador(double EpsEmpleador) {
        this.EpsEmpleador = EpsEmpleador;
    }

    public double getResultadoEps() {
        return ResultadoEps;
    }

    public void setResultadoEps(double ResultadoEps) {
        this.ResultadoEps = ResultadoEps;
    }

    public double getPension() {
        return Pension;
    }

    public void setPension(double Pension) {
        this.Pension = Pension;
    }

    public double getPensionEmpleador() {
        return PensionEmpleador;
    }

    public void setPensionEmpleador(double PensionEmpleador) {
        this.PensionEmpleador = PensionEmpleador;
    }

    public double getArl() {
        return Arl;
    }

    public void setArl(double Arl) {
        this.Arl = Arl;
    }

    public double getPrimaMensual() {
        return PrimaMensual;
    }

    public void setPrimaMensual(double PrimaMensual) {
        this.PrimaMensual = PrimaMensual;
    }

    public double getVacaciones() {
        return Vacaciones;
    }

    public void setVacaciones(double Vacaciones) {
        this.Vacaciones = Vacaciones;
    }

    public double getCesantias() {
        return Cesantias;
    }

    public void setCesantias(double Cesantias) {
        this.Cesantias = Cesantias;
    }

    public double getParaFiscales() {
        return ParaFiscales;
    }

    public void setParaFiscales(double ParaFiscales) {
        this.ParaFiscales = ParaFiscales;
    }

    public double getInteresesCesantias() {
        return InteresesCesantias;
    }

    public void setInteresesCesantias(double InteresesCesantias) {
        this.InteresesCesantias = InteresesCesantias;
    }

    public double getAuxilioTransporte() {
        return AuxilioTransporte;
    }

    public void setAuxilioTransporte(double AuxilioTransporte) {
        this.AuxilioTransporte = AuxilioTransporte;
    }

    public double getSalud() {
        return Salud;
    }

    public void setSalud(double Salud) {
        this.Salud = Salud;
    }

    public double getPrima() {
        return Prima;
    }

   
}


