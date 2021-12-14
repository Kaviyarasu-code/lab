/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Security_Lab;

/**
 *
 * @author kavi
 */

public class CaesarCipher
{
    
    public static final String common="abcdefghijklmnopqrstuvwxyz";
    static String encrypt(String code,int key)
    {
        code=code.replaceAll(" ","").toLowerCase();
         System.out.println("Encryption");
        char arr[]=code.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
            char temp=arr[i];
            int pos=common.indexOf(temp);
            pos=(pos+key)%26;
            arr[i]=common.charAt(pos);
            
        }
        String finalText=String.valueOf(arr);
        System.out.println(finalText);
        return finalText;
    
    }
    
    
    static void decrypt(String code,int key)
    {
        code=code.replaceAll(" ","").toLowerCase();
         System.out.println("De_cryption");
        char arr[]=code.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
            char temp=arr[i];
            int pos=common.indexOf(temp);
            if(pos-key<0)
                pos=(26+(pos-key))%26;
            else
                pos=(pos-key)%26;
            arr[i]=common.charAt(pos);
            
        }
        String finalText=String.valueOf(arr);
        System.out.println(finalText);
        
    }
    public static void main(String[] args)
    {
       String common="abcdefghijklmnopqrstuvwxyz";
        String encrypted_code=encrypt("az", 3);
        decrypt(encrypted_code,3);
       

    }
}