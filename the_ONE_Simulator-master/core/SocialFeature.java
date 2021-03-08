/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import java.util.ArrayList;

/**
 *
 * @author JarkomOye
 */
public class SocialFeature {

    private static Integer nationality, languages, affiliation, country;

    public SocialFeature() {
        
    }
    public static Integer setNationality(String name) {
        
        switch (name) {
            case "p0":
                return 2;

            case "p1":
                return 10;

            case "p2":
                return 7;


            case "p3":
                return 7;


            case "p4":
                return 4;


            case "p5":
                return 3;


            case "p6":
                return 2;


            case "p7":
                return 8;


            case "p8":
                return 12;


            case "p9":
                return 11;


            case "p10":
                return 3;


            case "p11":
                return 1;


            case "p12":
                return 5;


            case "p13":
                return 2;


            case "p14":
                return 7;


            case "p15":
                return 9;


            case "p16":
                return 2;


            case "p17":
                return 7;


            case "p18":
                return 8;


            case "p19":
                return 5;


            case "p20":
                return 1;


            case "p21":
                return 6;


            case "p22":
                return 11;


            case "p23":
                return 10;


            case "p24":
                return 11;


            case "p25":
                return 7;


            case "p26":
                return 9;


            case "p27":
                return 2;


            case "p28":
                return 1;


            case "p29":
                return 10;


            case "p30":
                return 10;


            case "p31":
                return 6;


            case "p32":
                return 7;


            case "p33":
                return 12;


            case "p34":
                return 11;


            case "p35":
                return 5;


            case "p36":
                return 8;


            case "p37":
                return 7;


            case "p38":
                return 9;


            case "p39":
                return 7;


            case "p40":
                return 1;


            case "p41":
                return 3;


            case "p42":
                return 7;


            case "p43":
                return 12;


            case "p44":
                return 11;


            case "p45":
                return 3;


            case "p46":
                return 5;


            case "p47":
                return 5;


            case "p48":
                return 11;


            case "p49":
                return 11;


            case "p50":
                return 10;


            case "p51":
                return 7;


            case "p52":
                return 7;


            case "p53":
                return 9;


            case "p54":
                return 7;


            case "p55":
                return 5;


            case "p56":
                return 11;


            case "p57":
                return 11;


            case "p58":
                return 5;


            case "p59":
                return 7;


            case "p60":
                return 5;


            case "p61":
                return 8;


            case "p62":
                return 9;


            case "p63":
                return 4;


            case "p64":
                return 6;


            case "p65":
                return 1;


            case "p66":
                return 11;


            case "p67":
                return 7;


            case "p68":
                return 10;


            case "p69":
                return 1;


            case "p70":
                return 9;


            case "p71":
                return 3;


            case "p72":
                return 9;


            case "p73":
                return 12;


            case "p74":
                return 9;


            case "p75":
                return 1;


            case "p76":
                return 1;


            case "p77":
                return 8;


            case "p78":
                return 11;



            default:
                break;
        }
        return 0;
    }

    public static Integer setLanguages(String name) {

        switch (name) {
            case "p0":
                return 10;


            case "p1":
                return 7;


            case "p2":
                return 10;


            case "p3":
                return 9;


            case "p4":
                return 5;


            case "p5":
                return 2;


            case "p6":
                return 9;


            case "p7":
                return 10;


            case "p8":
                return 10;


            case "p9":
                return 4;


            case "p10":
                return 3;


            case "p11":
                return 3;


            case "p12":
                return 6;


            case "p13":
                return 1;


            case "p14":
                return 6;


            case "p15":
                return 1;


            case "p16":
                return 1;


            case "p17":
                return 3;


            case "p18":
                return 5;


            case "p19":
                return 6;


            case "p20":
                return 9;


            case "p21":
                return 2;


            case "p22":
                return 5;


            case "p23":
                return 4;


            case "p24":
                return 10;


            case "p25":
                return 7;


            case "p26":
                return 7;


            case "p27":
                return 9;


            case "p28":
                return 8;


            case "p29":
                return 7;


            case "p30":
                return 8;


            case "p31":
                return 9;


            case "p32":
                return 8;


            case "p33":
                return 3;


            case "p34":
                return 1;


            case "p35":
                return 10;


            case "p36":
                return 2;


            case "p37":
                return 2;


            case "p38":
                return 5;


            case "p39":
                return 3;


            case "p40":
                return 5;


            case "p41":
                return 4;


            case "p42":
                return 8;


            case "p43":
                return 1;


            case "p44":
                return 3;


            case "p45":
                return 10;


            case "p46":
                return 9;


            case "p47":
                return 6;


            case "p48":
                return 6;


            case "p49":
                return 1;


            case "p50":
                return 3;


            case "p51":
                return 8;


            case "p52":
                return 8;


            case "p53":
                return 6;


            case "p54":
                return 5;


            case "p55":
                return 7;


            case "p56":
                return 4;


            case "p57":
                return 4;


            case "p58":
                return 2;


            case "p59":
                return 3;


            case "p60":
                return 7;


            case "p61":
                return 4;


            case "p62":
                return 6;


            case "p63":
                return 3;


            case "p64":
                return 4;


            case "p65":
                return 8;


            case "p66":
                return 6;


            case "p67":
                return 2;


            case "p68":
                return 4;


            case "p69":
                return 1;


            case "p70":
                return 2;


            case "p71":
                return 4;


            case "p72":
                return 6;


            case "p73":
                return 1;


            case "p74":
                return 7;


            case "p75":
                return 8;


            case "p76":
                return 10;


            case "p77":
                return 8;


            case "p78":
                return 2;
                
            default :
                break;
        }
        return 0;
    }
    
    public static Integer setAffiliation(String name) {

        switch (name) {
           case "p0":
                return 2;


            case "p1":
                return 1;


            case "p2":
                return 2;


            case "p3":
                return 6;


            case "p4":
                return 4;


            case "p5":
                return 3;


            case "p6":
                return 5;


            case "p7":
                return 2;


            case "p8":
                return 3;


            case "p9":
                return 5;


            case "p10":
                return 6;


            case "p11":
                return 5;


            case "p12":
                return 6;


            case "p13":
                return 3;


            case "p14":
                return 6;


            case "p15":
                return 5;


            case "p16":
                return 2;


            case "p17":
                return 5;


            case "p18":
                return 1;


            case "p19":
                return 5;


            case "p20":
                return 1;


            case "p21":
                return 1;


            case "p22":
                return 5;


            case "p23":
                return 4;


            case "p24":
                return 3;


            case "p25":
                return 2;


            case "p26":
                return 5;


            case "p27":
                return 6;


            case "p28":
                return 5;


            case "p29":
                return 4;


            case "p30":
                return 1;


            case "p31":
                return 1;


            case "p32":
                return 2;


            case "p33":
                return 1;


            case "p34":
                return 6;


            case "p35":
                return 1;


            case "p36":
                return 3;


            case "p37":
                return 3;


            case "p38":
                return 5;


            case "p39":
                return 4;


            case "p40":
                return 1;


            case "p41":
                return 2;


            case "p42":
                return 2;


            case "p43":
                return 5;


            case "p44":
                return 4;


            case "p45":
                return 2;


            case "p46":
                return 1;


            case "p47":
                return 5;


            case "p48":
                return 5;


            case "p49":
                return 2;


            case "p50":
                return 2;


            case "p51":
                return 3;


            case "p52":
                return 5;


            case "p53":
                return 2;


            case "p54":
                return 2;


            case "p55":
                return 6;


            case "p56":
                return 3;


            case "p57":
                return 3;


            case "p58":
                return 1;


            case "p59":
                return 5;


            case "p60":
                return 3;


            case "p61":
                return 4;


            case "p62":
                return 3;


            case "p63":
                return 5;


            case "p64":
                return 6;


            case "p65":
                return 2;


            case "p66":
                return 6;


            case "p67":
                return 5;


            case "p68":
                return 5;


            case "p69":
                return 5;


            case "p70":
                return 3;


            case "p71":
                return 3;


            case "p72":
                return 5;


            case "p73":
                return 1;


            case "p74":
                return 6;


            case "p75":
                return 6;


            case "p76":
                return 5;


            case "p77":
                return 1;


            case "p78":
                return 2;
                
            default:
                break;
        }
        return 0;
    }

    public static Integer setCountry(String name) {

        switch (name) {
            case "p0":
                return 4;


            case "p1":
                return 8;


            case "p2":
                return 8;


            case "p3":
                return 6;


            case "p4":
                return 8;


            case "p5":
                return 6;


            case "p6":
                return 7;


            case "p7":
                return 4;


            case "p8":
                return 8;


            case "p9":
                return 6;


            case "p10":
                return 3;


            case "p11":
                return 5;


            case "p12":
                return 2;


            case "p13":
                return 6;


            case "p14":
                return 5;


            case "p15":
                return 7;


            case "p16":
                return 5;


            case "p17":
                return 7;


            case "p18":
                return 4;


            case "p19":
                return 7;


            case "p20":
                return 6;


            case "p21":
                return 7;


            case "p22":
                return 3;


            case "p23":
                return 4;


            case "p24":
                return 2;


            case "p25":
                return 2;


            case "p26":
                return 7;


            case "p27":
                return 8;


            case "p28":
                return 8;


            case "p29":
                return 5;


            case "p30":
                return 5;


            case "p31":
                return 6;


            case "p32":
                return 3;


            case "p33":
                return 3;


            case "p34":
                return 3;


            case "p35":
                return 1;


            case "p36":
                return 8;


            case "p37":
                return 4;


            case "p38":
                return 5;


            case "p39":
                return 3;


            case "p40":
                return 6;


            case "p41":
                return 7;


            case "p42":
                return 1;


            case "p43":
                return 6;


            case "p44":
                return 5;


            case "p45":
                return 1;


            case "p46":
                return 5;


            case "p47":
                return 5;


            case "p48":
                return 1;


            case "p49":
                return 5;


            case "p50":
                return 1;


            case "p51":
                return 3;


            case "p52":
                return 7;


            case "p53":
                return 1;


            case "p54":
                return 1;


            case "p55":
                return 4;


            case "p56":
                return 6;


            case "p57":
                return 3;


            case "p58":
                return 7;


            case "p59":
                return 1;


            case "p60":
                return 1;


            case "p61":
                return 8;


            case "p62":
                return 5;


            case "p63":
                return 2;


            case "p64":
                return 1;


            case "p65":
                return 5;


            case "p66":
                return 1;


            case "p67":
                return 7;


            case "p68":
                return 4;


            case "p69":
                return 1;


            case "p70":
                return 6;


            case "p71":
                return 4;


            case "p72":
                return 1;


            case "p73":
                return 6;


            case "p74":
                return 4;


            case "p75":
                return 8;


            case "p76":
                return 8;


            case "p77":
                return 8;


            case "p78":
                return 2;


            default:
                break;
        }
        return 0;
    }
}