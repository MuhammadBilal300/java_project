/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corona;

/**
 *
 * @author Bilal
 */
public class Database {
    
    // Intials
    static String name = "";
    static String cnic = "";
    
    // Cases 
    static int punjab = 9044;
    static int kpk = 32243;
    static int sindh = 114000;
    static int balochistan = 11411;
    
    // Deaths
    static int punjab_d = 100;
    static int kpk_d = 1000;
    static int sindh_d = 10000;
    static int balochistan_d = 900;
    
    // Recovered 
    static int punjab_r = 8894;
    static int kpk_r = 30990;
    static int sindh_r = 102870;
    static int balochistan_r = 10388;
    
    // Critical
    static int punjab_c = 50;
    static int kpk_c = 253;
    static int sindh_c = 1130;
    static int balochistan_c = 123;
    
    public static void changeValue (String province, String caseType , int a , String name , String cnic){
        
        Database.name = name;
        Database.cnic = cnic;
        
        if (province.equalsIgnoreCase("Punjab") & caseType.equalsIgnoreCase("Critical")){
            punjab = punjab + a;
            punjab_c = punjab_c + a;
        }
        else if(province.equalsIgnoreCase("Punjab") & caseType.equalsIgnoreCase("Recovered")){
            punjab_r = punjab_r + a;
        }
        else if(province.equalsIgnoreCase("Punjab") & caseType.equalsIgnoreCase("Death")){
            punjab_d = punjab_d + a;
        }
        else if (province.equalsIgnoreCase("Sindh") &  caseType.equalsIgnoreCase("Critical")){
            sindh = sindh + a;
            sindh_c = sindh_c + a;
        }
        else if (province.equalsIgnoreCase("Sindh") &  caseType.equalsIgnoreCase("Recovered")){
            sindh_r = sindh_r + a;
        }
        else if (province.equalsIgnoreCase("Sindh") &  caseType.equalsIgnoreCase("Death")){
            sindh_d = sindh_d + a;
        }
        else if (province.equalsIgnoreCase("KPK") & caseType.equalsIgnoreCase("Critical")){
            kpk = kpk + a;
            kpk_c = kpk_c + a;
        }
        else if (province.equalsIgnoreCase("KPK") & caseType.equalsIgnoreCase("Recovered")){
            kpk_r = kpk_r + a;
        }
        else if (province.equalsIgnoreCase("KPK") & caseType.equalsIgnoreCase("Death")){
            kpk_d = kpk_d + a;
        }
        else if (province.equalsIgnoreCase("Balochistan") & caseType.equalsIgnoreCase("Critical")){
            balochistan = balochistan + a;
            balochistan_c = balochistan_c + a;
        }
        else if (province.equalsIgnoreCase("Balochistan") & caseType.equalsIgnoreCase("Recovered")){
            balochistan_r = balochistan_r + a;
        }
        else if (province.equalsIgnoreCase("Balochistan") & caseType.equalsIgnoreCase("Death")){
            balochistan_d = balochistan_d + a;
        }
    }
    
}
