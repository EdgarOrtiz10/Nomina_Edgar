/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nominas_edgarortiz;

/**
 *
 * @author Edgar O
 */
public class Operativos {
    
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
    
    
    public Operativos(String nombre){
        SalarioBase = 1000000;
        EpsEmpleado = 0.04;
        EpsEmpleador = 0.085;
        ResultadoEps = EpsEmpleado + EpsEmpleador;
        Pension = 0.04;
        PensionEmpleador = 0.12 ;
        Arl = 0.00522;
        PrimaMensual = 0.0833;
        Vacaciones = 0.0417;
        Cesantias = 0.0833;
        InteresesCesantias = 0.01;
        AuxilioTransporte = 117172;
        this.Nombre = nombre ;
    }
    
    
     public double empleador (){
         
        double liquidacionEps = this.SalarioBase * this.EpsEmpleador;
        double liquidacionPension = this.SalarioBase * this.Pension;
        double salarioPension = this.SalarioBase - liquidacionPension;
        double salarioEps= this.SalarioBase - liquidacionEps ;
        double PagoPension = this.SalarioBase  * this.PensionEmpleador;
        double PagoEps = this.SalarioBase  * this.EpsEmpleador;
        double PagoArl = this.SalarioBase  * this.Arl;
        double pagoPrima = this.SalarioBase  * this.Prima;
        double pagoCesantias = this.SalarioBase  * this.Cesantias;
        double interesesCesantias = this.SalarioBase  * this.InteresesCesantias;
        double pagoVacaciones = this.SalarioBase  * this.Vacaciones;
        double pagoParafiscales = this.SalarioBase  * this.ParaFiscales;

        
        
        System.out.println( "----------------------------------------------" );
        System.out.println( "LIQUIDACIÓN EPS (EMPLEADOR): " + liquidacionEps);
        System.out.println( "LIQUIDACIÓN PENSIÓN (EMPLEADOR):" + liquidacionPension);
        System.out.println("SALARIO CON DESCUENTO DE PENSIÓN (EMPLEADOR): " + salarioPension);
        System.out.println("SALARIO CON DESCUENTO DE EPS (EMPLEADOR): " + salarioEps + "\n" );
        System.out.println( "VALOR A PAGAR (EMPLEADOR): " + "\n"  );
        System.out.println( "PENSIÓN: " + PagoPension);
        System.out.println( "EPS: " +  PagoEps);
        System.out.println( "ARL: " + PagoArl);
        System.out.println( "PRIMA: " + pagoPrima);
        System.out.println( "CESANTIAS : " + pagoCesantias);
        System.out.println( "INTERESES CESANTIA: " + interesesCesantias);
        System.out.println( "VACACIONES: " + pagoVacaciones );
        System.out.println( "PARAFISCALES: " + pagoParafiscales + "\n" );
            
        
         
        return liquidacionPension;
    }
    
     public Operativos (String nombre, int salarioBase, double eps, double pension, double resultado, double arl, double prima, double vacaciones, double cesantias, double paraFiscales,
       double interesesCesantias, double epsEmpleador){
       this.Nombre = nombre;
       this.SalarioBase = salarioBase;
       this.EpsEmpleado = eps;
       this.Pension = pension;
       this.ResultadoEps = resultado;
       this.Arl = arl;
       this.Prima = prima;
       this.Vacaciones = vacaciones;
       this.Cesantias = cesantias;
       this.ParaFiscales = paraFiscales;
       this.InteresesCesantias = interesesCesantias;
       this.EpsEmpleador = epsEmpleador;
   }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String NombreOperario) {
        this.Nombre = NombreOperario;
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

    public void setPensionEmpleador(double Pension_empleador) {
        this.PensionEmpleador = Pension_empleador;
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
 
    
}
