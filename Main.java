/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Felix
 */
public class Main {
    public static void main(String[] args){
        Dadu dadu1=new Dadu(8);
        for(int i=0;i<3*dadu1.getJumSisi();i++){
            dadu1.lempar();
            System.out.println(dadu1.toString());
        }
    }
}
