/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author T-102
 */
public class Malo {
    public static void main(String[] args) {
        try{
            Autenticacion.autenticar("system", "system");
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
