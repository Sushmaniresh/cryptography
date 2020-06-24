/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crypto;


public final class Password {

    private static String pwd;
    private static String key;

    public static String getPwd(){
        return pwd;
    }

    public static void setPwd( String p ){
        Password.pwd = p;
    }
    
    public static String getKey(){
        return key;
    }

    public static void setKey( String k ){
        Password.key = k;
    }
}

