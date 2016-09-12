/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.whileapp.pruebastrutsbook.action;

/**
 *
 * @author eduardo
 */
public class SimpleAction {
    public String execute(){
        System.out.println("execute");
        return "success";
    }
    
    public String metodo1(){
        System.out.println("Metodo1");
        return "success";
    }
}
