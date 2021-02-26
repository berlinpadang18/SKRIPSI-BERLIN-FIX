/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JarkomOye
 */
public class SocialFeature {

    private static ArrayList<Integer> affiliation, city, nationality, languages, country, position;

    public SocialFeature() {
    }
    
    public static ArrayList<Integer> setAffiliation(String name) {

        affiliation = new ArrayList<Integer>();

        String id = name.substring(name.length() - 2, name.length());
        switch (name) {
            case "p0":
                affiliation.add(15);
                return affiliation;

            case "p1":
                affiliation.add(5);
                return affiliation;

            case "p2":
                affiliation.add(9);
                return affiliation;

            case "p3":
                affiliation.add(22);
                return affiliation;

            case "p4":
                affiliation.add(13);
                return affiliation;

            case "p5":
                affiliation.add(5);
                return affiliation;

            case "p6":
                affiliation.add(25);
                return affiliation;

            case "p7":
                affiliation.add(5);
                return affiliation;

            case "p8":
                affiliation.add(18);
                return affiliation;

            case "p9":
                affiliation.add(9);
                return affiliation;

            case "p10":
                affiliation.add(9);
                return affiliation;

            case "p11":
                affiliation.add(26);
                return affiliation;

            case "p12":
                affiliation.add(16);
                return affiliation;

            case "p13":
                affiliation.add(1);
                return affiliation;

            case "p14":
                affiliation.add(9);
                return affiliation;

            case "p15":
                affiliation.add(9);
                return affiliation;

            case "p16":
                affiliation.add(1);
                return affiliation;

            case "p17":
                affiliation.add(5);
                return affiliation;

            case "p18":
                affiliation.add(3);
                return affiliation;

            case "p19":
                affiliation.add(9);
                return affiliation;

            case "p20":
                affiliation.add(19);
                return affiliation;

            case "p21":
                affiliation.add(12);
                return affiliation;

            case "p22":
                affiliation.add(34);
                return affiliation;

            case "p23":
                affiliation.add(28);
                return affiliation;

            case "p24":
                affiliation.add(10);
                return affiliation;

            case "p25":
                affiliation.add(3);
                return affiliation;

            case "p26":
                affiliation.add(8);
                return affiliation;

            case "p27":
                affiliation.add(35);
                return affiliation;

            case "p28":
                affiliation.add(5);
                return affiliation;

            case "p29":
                affiliation.add(10);
                return affiliation;

            case "p30":
                affiliation.add(6);
                return affiliation;

            case "p31":
                affiliation.add(7);
                return affiliation;

            case "p32":
                affiliation.add(5);
                affiliation.add(10);
                return affiliation;

            case "p33":
                affiliation.add(20);
                return affiliation;

            case "p34":
                affiliation.add(9);
                return affiliation;

            case "p35":
                affiliation.add(2);
                return affiliation;

            case "p36":
                affiliation.add(14);
                return affiliation;

            case "p37":
                affiliation.add(20);
                return affiliation;

            case "p38":
                affiliation.add(9);
                return affiliation;

            case "p39":
                affiliation.add(30);
                return affiliation;

            case "p40":
                affiliation.add(25);
                return affiliation;

            case "p41":
                affiliation.add(29);
                return affiliation;

            case "p42":
                affiliation.add(24);
                return affiliation;

            case "p43":
                affiliation.add(10);
                return affiliation;

            case "p44":
                affiliation.add(9);
                return affiliation;

            case "p45":
                affiliation.add(32);
                return affiliation;

            case "p46":
                affiliation.add(13);
                return affiliation;

            case "p47":
                affiliation.add(17);
                return affiliation;

            case "p48":
                affiliation.add(8);
                return affiliation;

            case "p49":
                affiliation.add(10);
                return affiliation;

            case "p50":
                affiliation.add(19);
                return affiliation;

            case "p51":
                affiliation.add(23);
                return affiliation;

            case "p52":
                affiliation.add(18);
                return affiliation;

            case "p53":
                affiliation.add(10);
                return affiliation;

            case "p54":
                affiliation.add(33);
                return affiliation;

            case "p55":
                affiliation.add(24);
                return affiliation;

            case "p56":
                affiliation.add(11);
                return affiliation;

            case "p57":
                affiliation.add(5);
                return affiliation;

            case "p58":
                affiliation.add(15);
                return affiliation;

            case "p59":
                affiliation.add(21);
                return affiliation;

            case "p60":
                affiliation.add(5);
                return affiliation;

            case "p61":
                affiliation.add(11);
                return affiliation;

            case "p62":
                affiliation.add(9);
                return affiliation;

            case "p63":
                affiliation.add(11);
                return affiliation;

            case "p64":
                affiliation.add(16);
                return affiliation;

            case "p65":
                affiliation.add(26);
                affiliation.add(13);
                return affiliation;

            case "p66":
                affiliation.add(23);
                return affiliation;

            case "p67":
                affiliation.add(27);
                return affiliation;

            case "p68":
                affiliation.add(4);
                return affiliation;

            case "p69":
                affiliation.add(6);
                return affiliation;

            case "p70":
                affiliation.add(26);
                return affiliation;

            case "p71":
                affiliation.add(23);
                return affiliation;

            case "p72":
                affiliation.add(5);
                return affiliation;

            case "p73":
                affiliation.add(16);
                return affiliation;

            case "p74":
                affiliation.add(16);
                return affiliation;

            case "p75":
                affiliation.add(9);
                return affiliation;

            case "p76":
                affiliation.add(5);
                return affiliation;

            case "p77":
                affiliation.add(31);
                return affiliation;

            case "p78":
                affiliation.add(9);
                return affiliation;

            default:
                break;
        }
        affiliation.add(0);
        return affiliation;
    }
    
    public static ArrayList<Integer> setCity(String name) {
        city = new ArrayList<Integer>();

        String id = name.substring(name.length() - 2, name.length());
        switch (name) {
            case "p0":
                city.add(15);
                return city;

            case "p1":
                city.add(5);
                return city;

            case "p2":
                city.add(9);
                return city;

            case "p3":
                city.add(22);
                return city;

            case "p4":
                city.add(5);
                return city;

            case "p5":
                city.add(5);
                return city;

            case "p6":
                city.add(25);
                return city;

            case "p7":
                city.add(5);
                return city;

            case "p8":
                city.add(7);
                return city;

            case "p9":
                city.add(9);
                return city;

            case "p10":
                city.add(9);
                return city;

            case "p11":
                city.add(26);
                return city;

            case "p12":
                city.add(10);
                return city;

            case "p13":
                city.add(1);
                return city;

            case "p14":
                city.add(9);
                return city;

            case "p15":
                city.add(9);
                return city;

            case "p16":
                city.add(1);
                return city;

            case "p17":
                city.add(7);
                return city;

            case "p18":
                city.add(3);
                return city;

            case "p19":
                city.add(9);
                return city;

            case "p20":
                city.add(19);
                return city;

            case "p21":
                city.add(13);
                return city;

            case "p22":
                city.add(32);
                return city;

            case "p23":
                city.add(28);
                return city;

            case "p24":
                city.add(11);
                return city;

            case "p25":
                city.add(3);
                return city;

            case "p26":
                city.add(22);
                return city;

            case "p27":
                city.add(33);
                return city;

            case "p28":
                city.add(5);
                return city;

            case "p29":
                city.add(6);
                return city;

            case "p30":
                city.add(6);
                return city;

            case "p31":
                city.add(7);
                return city;

            case "p32":
                city.add(17);
                return city;

            case "p33":
                city.add(20);
                return city;

            case "p34":
                city.add(9);
                return city;

            case "p35":
                city.add(2);
                return city;

            case "p36":
                city.add(14);
                return city;

            case "p37":
                city.add(10);
                return city;

            case "p38":
                city.add(9);
                return city;

            case "p39":
                city.add(30);
                return city;

            case "p40":
                city.add(20);
                return city;

            case "p41":
                city.add(12);
                return city;

            case "p42":
                city.add(6);
                return city;

            case "p43":
                city.add(11);
                return city;

            case "p44":
                city.add(29);
                return city;

            case "p45":
                city.add(24);
                return city;

            case "p46":
                city.add(5);
                return city;

            case "p47":
                city.add(8);
                return city;

            case "p48":
                city.add(8);
                return city;

            case "p49":
                city.add(11);
                return city;

            case "p50":
                city.add(19);
                return city;

            case "p51":
                city.add(23);
                return city;

            case "p52":
                city.add(18);
                return city;

            case "p53":
                city.add(11);
                return city;

            case "p54":
                city.add(12);
                return city;

            case "p55":
                city.add(24);
                return city;

            case "p56":
                city.add(12);
                return city;

            case "p57":
                city.add(6);
                return city;

            case "p58":
                city.add(21);
                return city;

            case "p59":
                city.add(21);
                return city;

            case "p60":
                city.add(5);
                return city;

            case "p61":
                city.add(12);
                return city;

            case "p62":
                city.add(10);
                return city;

            case "p63":
                city.add(12);
                return city;

            case "p64":
                city.add(27);
                return city;

            case "p65":
                city.add(5);
                return city;

            case "p66":
                city.add(23);
                return city;

            case "p67":
                city.add(27);
                return city;

            case "p68":
                city.add(4);
                return city;

            case "p69":
                city.add(8);
                return city;

            case "p70":
                city.add(12);
                return city;

            case "p71":
                city.add(16);
                return city;

            case "p72":
                city.add(5);
                return city;

            case "p73":
                city.add(10);
                return city;

            case "p74":
                city.add(16);
                return city;

            case "p75":
                city.add(9);
                return city;

            case "p76":
                city.add(5);
                return city;

            case "p77":
                city.add(31);
                return city;

            case "p78":
                city.add(9);
                return city;

            default:
                break;
        }
        city.add(0);
        return city;
    }

    public static ArrayList<Integer> setNationality(String name) {

        nationality = new ArrayList<Integer>();

        String id = name.substring(name.length() - 2, name.length());
        switch (name) {
            case "p0":
                nationality.add(2);
                nationality.add(15);
                return nationality;

            case "p1":
                nationality.add(7);
                return nationality;

            case "p2":
                nationality.add(9);
                return nationality;

            case "p3":
                nationality.add(23);
                return nationality;

            case "p4":
                nationality.add(4);
                return nationality;

            case "p5":
                nationality.add(5);
                nationality.add(6);
                return nationality;

            case "p6":
                nationality.add(9);
                return nationality;

            case "p7":
                nationality.add(4);
                return nationality;

            case "p8":
                nationality.add(6);
                return nationality;

            case "p9":
                nationality.add(9);
                return nationality;

            case "p10":
                nationality.add(9);
                return nationality;

            case "p11":
                nationality.add(24);
                return nationality;

            case "p12":
                nationality.add(12);
                return nationality;

            case "p13":
                nationality.add(1);
                return nationality;

            case "p14":
                nationality.add(18);
                return nationality;

            case "p15":
                nationality.add(16);
                return nationality;

            case "p16":
                nationality.add(1);
                return nationality;

            case "p17":
                nationality.add(17);
                return nationality;

            case "p18":
                nationality.add(3);
                return nationality;

            case "p19":
                nationality.add(9);
                return nationality;

            case "p20":
                nationality.add(1);
                return nationality;

            case "p21":
                nationality.add(1);
                return nationality;

            case "p22":
                nationality.add(1);
                return nationality;

            case "p23":
                nationality.add(2);
                nationality.add(5);
                return nationality;

            case "p24":
                nationality.add(27);
                return nationality;

            case "p25":
                nationality.add(26);
                return nationality;

            case "p26":
                nationality.add(28);
                return nationality;

            case "p27":
                nationality.add(16);
                return nationality;

            case "p28":
                nationality.add(4);
                return nationality;

            case "p29":
                nationality.add(5);
                return nationality;

            case "p30":
                nationality.add(3);
                return nationality;

            case "p31":
                nationality.add(5);
                return nationality;

            case "p32":
                nationality.add(19);
                return nationality;

            case "p33":
                nationality.add(20);
                nationality.add(21);
                return nationality;

            case "p34":
                nationality.add(9);
                return nationality;

            case "p35":
                nationality.add(2);
                return nationality;

            case "p36":
                nationality.add(14);
                return nationality;

            case "p37":
                nationality.add(15);
                return nationality;

            case "p38":
                nationality.add(9);
                return nationality;

            case "p39":
                nationality.add(13);
                return nationality;

            case "p40":
                nationality.add(14);
                return nationality;

            case "p41":
                nationality.add(20);
                return nationality;

            case "p42":
                nationality.add(21);
                return nationality;

            case "p43":
                nationality.add(11);
                return nationality;

            case "p44":
                nationality.add(9);
                return nationality;

            case "p45":
                nationality.add(16);
                return nationality;

            case "p46":
                nationality.add(4);
                return nationality;

            case "p47":
                nationality.add(8);
                return nationality;

            case "p48":
                nationality.add(8);
                return nationality;

            case "p49":
                nationality.add(13);
                return nationality;

            case "p50":
                nationality.add(14);
                return nationality;

            case "p51":
                nationality.add(14);
                return nationality;

            case "p52":
                nationality.add(2);
                return nationality;

            case "p53":
                nationality.add(11);
                return nationality;

            case "p54":
                nationality.add(9);
                return nationality;

            case "p55":
                nationality.add(16);
                return nationality;

            case "p56":
                nationality.add(12);
                return nationality;

            case "p57":
                nationality.add(15);
                return nationality;

            case "p58":
                nationality.add(10);
                return nationality;

            case "p59":
                nationality.add(22);
                return nationality;

            case "p60":
                nationality.add(4);
                return nationality;

            case "p61":
                nationality.add(2);
                return nationality;

            case "p62":
                nationality.add(9);
                return nationality;

            case "p63":
                nationality.add(28);
                return nationality;

            case "p64":
                nationality.add(22);
                return nationality;

            case "p65":
                nationality.add(16);
                return nationality;

            case "p66":
                nationality.add(14);
                return nationality;

            case "p67":
                nationality.add(17);
                return nationality;

            case "p68":
                nationality.add(2);
                return nationality;

            case "p69":
                nationality.add(7);
                return nationality;

            case "p70":
                nationality.add(3);
                return nationality;

            case "p71":
                nationality.add(20);
                return nationality;

            case "p72":
                nationality.add(4);
                return nationality;

            case "p73":
                nationality.add(10);
                return nationality;

            case "p74":
                nationality.add(2);
                nationality.add(15);
                return nationality;

            case "p75":
                nationality.add(17);
                return nationality;

            case "p76":
                nationality.add(4);
                return nationality;

            case "p77":
                nationality.add(25);
                return nationality;

            case "p78":
                nationality.add(10);
                return nationality;

            default:
                break;
        }
        nationality.add(0);
        return nationality;
    }

    public static ArrayList<Integer> setLanguages(String name) {

        languages = new ArrayList<Integer>();

        String id = name.substring(name.length() - 2, name.length());
        switch (name) {
            case "p0":

                languages.add(3);
                languages.add(1);
                languages.add(5);
                return languages;

            case "p1":

                languages.add(8);
                languages.add(5);
                languages.add(1);
                return languages;

            case "p2":
                languages.add(9);
                languages.add(10);
                languages.add(1);
                return languages;

            case "p3":
                languages.add(17);
                languages.add(1);
                return languages;

            case "p4":
                languages.add(5);
                languages.add(1);
                languages.add(14);
                return languages;

            case "p5":

                languages.add(1);
                languages.add(5);
                languages.add(7);
                return languages;

            case "p6":
                languages.add(9);
                languages.add(10);
                languages.add(1);
                return languages;

            case "p7":
                languages.add(5);
                languages.add(1);
                languages.add(7);
                return languages;

            case "p8":
                languages.add(10);
                languages.add(1);
                return languages;

            case "p9":
                languages.add(9);
                languages.add(10);
                languages.add(1);
                return languages;

            case "p10":
                languages.add(9);
                languages.add(10);
                languages.add(1);
                return languages;

            case "p11":
                languages.add(20);
                languages.add(1);
                languages.add(5);
                return languages;

            case "p12":
                languages.add(1);
                return languages;

            case "p13":
                languages.add(1);
                languages.add(2);
                return languages;

            case "p14":
                languages.add(9);
                languages.add(1);
                languages.add(5);
                return languages;

            case "p15":
                languages.add(14);
                languages.add(1);
                languages.add(10);
                return languages;

            case "p16":
                languages.add(2);
                languages.add(1);
                return languages;

            case "p17":
                languages.add(3);
                return languages;

            case "p18":
                languages.add(5);
                return languages;

            case "p19":
                languages.add(9);
                languages.add(10);
                languages.add(1);
                return languages;

            case "p20":
                languages.add(2);
                languages.add(1);
                return languages;

            case "p21":
                languages.add(2);
                languages.add(1);
                return languages;

            case "p22":
                languages.add(1);
                languages.add(2);
                return languages;

            case "p23":
                languages.add(24);
                return languages;

            case "p24":
                languages.add(26);
                languages.add(1);
                return languages;

            case "p25":
                languages.add(7);
                languages.add(1);
                languages.add(5);
                return languages;

            case "p26":
                languages.add(1);
                return languages;

            case "p27":
                languages.add(10);
                languages.add(14);
                languages.add(5);
                languages.add(1);
                return languages;

            case "p28":
                languages.add(5);
                languages.add(1);
                languages.add(16);
                return languages;

            case "p29":
                languages.add(17);
                languages.add(4);
                return languages;

            case "p30":
                languages.add(1);
                languages.add(5);
                languages.add(7);
                return languages;

            case "p31":
                languages.add(1);
                languages.add(7);
                return languages;

            case "p32":
                languages.add(19);
                languages.add(5);
                languages.add(1);
                languages.add(13);
                return languages;

            case "p33":
                languages.add(1);
                return languages;

            case "p34":
                languages.add(9);
                languages.add(10);
                languages.add(1);
                return languages;

            case "p35":
                languages.add(3);
                languages.add(1);
                languages.add(4);
                return languages;

            case "p36":
                languages.add(15);
                languages.add(1);
                return languages;

            case "p37":
                languages.add(1);
                return languages;

            case "p38":
                languages.add(9);
                languages.add(10);
                languages.add(1);
                return languages;

            case "p39":
                languages.add(13);
                languages.add(5);
                languages.add(1);
                return languages;

            case "p40":
                languages.add(1);
                return languages;

            case "p41":
                languages.add(1);
                return languages;

            case "p42":
                languages.add(1);
                return languages;

            case "p43":
                languages.add(11);
                languages.add(1);
                languages.add(5);
                return languages;

            case "p44":
                languages.add(10);
                languages.add(1);
                return languages;

            case "p45":
                languages.add(14);
                languages.add(1);
                return languages;

            case "p46":
                languages.add(5);
                languages.add(1);
                languages.add(16);
                return languages;

            case "p47":
                languages.add(8);
                languages.add(1);
                return languages;

            case "p48":
                languages.add(8);
                languages.add(1);
                return languages;

            case "p49":
                languages.add(13);
                languages.add(5);
                languages.add(1);
                return languages;

            case "p50":
                languages.add(15);
                languages.add(20);
                languages.add(1);
                return languages;

            case "p51":
                languages.add(22);
                languages.add(1);
                languages.add(15);
                return languages;

            case "p52":
                languages.add(3);
                languages.add(1);
                languages.add(7);
                return languages;

            case "p53":
                languages.add(25);
                languages.add(11);
                languages.add(5);
                languages.add(1);
                return languages;

            case "p54":
                languages.add(10);
                languages.add(16);
                languages.add(5);
                languages.add(1);
                return languages;

            case "p55":
                languages.add(14);
                languages.add(1);
                return languages;

            case "p56":
                languages.add(12);
                languages.add(1);
                return languages;

            case "p57":
                languages.add(1);
                return languages;

            case "p58":
                languages.add(1);
                return languages;

            case "p59":
                languages.add(1);
                languages.add(21);
                languages.add(7);
                return languages;

            case "p60":
                languages.add(5);
                languages.add(8);
                languages.add(1);
                return languages;

            case "p61":
                languages.add(3);
                languages.add(1);
                return languages;

            case "p62":
                languages.add(10);
                languages.add(1);
                return languages;

            case "p63":
                languages.add(16);
                languages.add(5);
                languages.add(1);
                return languages;

            case "p64":
                languages.add(1);
                return languages;

            case "p65":
                languages.add(14);
                languages.add(10);
                languages.add(5);
                languages.add(1);
                return languages;

            case "p66":
                languages.add(15);
                languages.add(1);
                return languages;

            case "p67":
                languages.add(18);
                languages.add(1);
                languages.add(5);
                languages.add(23);
                return languages;

            case "p68":
                languages.add(6);
                languages.add(1);
                return languages;

            case "p69":
                languages.add(1);
                return languages;

            case "p70":
                languages.add(1);
                return languages;

            case "p71":
                languages.add(1);
                return languages;

            case "p72":
                languages.add(5);
                languages.add(1);
                return languages;

            case "p73":
                languages.add(1);
                return languages;

            case "p74":
                languages.add(3);
                languages.add(5);
                languages.add(10);
                return languages;

            case "p75":
                languages.add(17);
                languages.add(18);
                languages.add(1);
                languages.add(7);
                languages.add(10);
                return languages;

            case "p76":
                languages.add(5);
                languages.add(1);
                return languages;

            case "p77":
                languages.add(7);
                languages.add(1);
                return languages;

            case "p78":
                languages.add(10);
                languages.add(1);
                languages.add(5);
                return languages;

            default:
                break;
        }
        languages.add(0);
        return languages;

    }

    public static ArrayList<Integer> setCountry(String name) {

        country = new ArrayList<Integer>();

        String id = name.substring(name.length() - 2, name.length());
        switch (name) {
            case "p0":
                country.add(2);
                return country;

            case "p1":
                country.add(5);
                return country;

            case "p2":
                country.add(8);
                return country;

            case "p3":
                country.add(13);
                return country;

            case "p4":
                country.add(5);
                return country;

            case "p5":
                country.add(5);
                return country;

            case "p6":
                country.add(8);
                return country;

            case "p7":
                country.add(5);
                return country;

            case "p8":
                country.add(4);
                return country;

            case "p9":
                country.add(8);
                return country;

            case "p10":
                country.add(8);
                return country;

            case "p11":
                country.add(5);
                return country;

            case "p12":
                country.add(7);
                return country;

            case "p13":
                country.add(1);
                return country;

            case "p14":
                country.add(8);
                return country;

            case "p15":
                country.add(8);
                return country;

            case "p16":
                country.add(1);
                return country;

            case "p17":
                country.add(6);
                return country;

            case "p18":
                country.add(3);
                return country;

            case "p19":
                country.add(8);
                return country;

            case "p20":
                country.add(2);
                return country;

            case "p21":
                country.add(2);
                return country;

            case "p22":
                country.add(1);
                return country;

            case "p23":
                country.add(17);
                return country;

            case "p24":
                country.add(3);
                return country;

            case "p25":
                country.add(3);
                return country;

            case "p26":
                country.add(14);
                return country;

            case "p27":
                country.add(6);
                return country;

            case "p28":
                country.add(5);
                return country;

            case "p29":
                country.add(10);
                return country;

            case "p30":
                country.add(6);
                return country;

            case "p31":
                country.add(2);
                return country;

            case "p32":
                country.add(3);
                return country;

            case "p33":
                country.add(11);
                return country;

            case "p34":
                country.add(8);
                return country;

            case "p35":
                country.add(2);
                return country;

            case "p36":
                country.add(2);
                return country;

            case "p37":
                country.add(12);
                return country;

            case "p38":
                country.add(8);
                return country;

            case "p39":
                country.add(5);
                return country;

            case "p40":
                country.add(16);
                return country;

            case "p41":
                country.add(9);
                return country;

            case "p42":
                country.add(15);
                return country;

            case "p43":
                country.add(3);
                return country;

            case "p44":
                country.add(8);
                return country;

            case "p45":
                country.add(15);
                return country;

            case "p46":
                country.add(5);
                return country;

            case "p47":
                country.add(7);
                return country;

            case "p48":
                country.add(7);
                return country;

            case "p49":
                country.add(3);
                return country;

            case "p50":
                country.add(2);
                return country;

            case "p51":
                country.add(14);
                return country;

            case "p52":
                country.add(10);
                return country;

            case "p53":
                country.add(3);
                return country;

            case "p54":
                country.add(9);
                return country;

            case "p55":
                country.add(15);
                return country;

            case "p56":
                country.add(9);
                return country;

            case "p57":
                country.add(15);
                return country;

            case "p58":
                country.add(17);
                return country;

            case "p59":
                country.add(12);
                return country;

            case "p60":
                country.add(5);
                return country;

            case "p61":
                country.add(9);
                return country;

            case "p62":
                country.add(8);
                return country;

            case "p63":
                country.add(9);
                return country;

            case "p64":
                country.add(1);
                return country;

            case "p65":
                country.add(5);
                return country;

            case "p66":
                country.add(14);
                return country;

            case "p67":
                country.add(16);
                return country;

            case "p68":
                country.add(4);
                return country;

            case "p69":
                country.add(5);
                return country;

            case "p70":
                country.add(2);
                return country;

            case "p71":
                country.add(8);
                return country;

            case "p72":
                country.add(5);
                return country;

            case "p73":
                country.add(10);
                return country;

            case "p74":
                country.add(4);
                return country;

            case "p75":
                country.add(8);
                return country;

            case "p76":
                country.add(5);
                return country;

            case "p77":
                country.add(18);
                return country;

            case "p78":
                country.add(8);
                return country;

            default:
                break;
        }
        country.add(0);
        return country;
    }

    public static ArrayList<Integer> setPosition(String name) {
        position = new ArrayList<Integer>();
        String id = name.substring(name.length() - 2, name.length());
        switch (name) {
            case "p0":
                position.add(3);
                return position;
                
            case "p1":
                position.add(1);
                return position;
                
            case "p2":
                position.add(1);
                return position;
                
            case "p3":
                position.add(1);
                return position;
                
            case "p4":
                position.add(1);
                return position;
                
            case "p5":
                position.add(1);
                return position;
                
            case "p6":
                position.add(3);
                return position;
                
            case "p7":
                position.add(3);
                return position;
                
            case "p8":
                position.add(3);
                return position;
                
            case "p9":
                position.add(1);
                return position;
                
            case "p10":
                position.add(3);
                return position;
                
            case "p11":
                position.add(3);
                return position;
                
            case "p12":
                position.add(1);
                return position;
                
            case "p13":
                position.add(1);
                return position;
                
            case "p14":
                position.add(3);
                return position;
                
            case "p15":
                position.add(2);
                return position;
                
            case "p16":
                position.add(1);
                return position;
                
            case "p17":
                position.add(2);
                return position;
                
            case "p18":
                position.add(3);
                return position;
                
            case "p19":
                position.add(3);
                return position;
                
            case "p20":
                position.add(3);
                return position;
                
            case "p21":
                position.add(1);
                return position;
                
            case "p22":
                position.add(1);
                return position;
                
            case "p23":
                position.add(1);
                return position;
                
            case "p24":
                position.add(3);
                return position;
                
            case "p25":
                position.add(3);
                return position;
                
            case "p26":
                position.add(2);
                return position;
                
            case "p27":
                position.add(3);
                return position;
                
            case "p28":
                position.add(1);
                return position;
                
            case "p29":
                position.add(3);
                return position;
                
            case "p30":
                position.add(3);
                return position;
                
            case "p31":
                position.add(3);
                return position;
                
            case "p32":
                position.add(2);
                return position;
                
            case "p33":
                position.add(2);
                return position;
                
            case "p34":
                position.add(1);
                return position;
                
            case "p35":
                position.add(2);
                return position;
                
            case "p36":
                position.add(1);
                return position;
                
            case "p37":
                position.add(3);
                return position;
                
            case "p38":
                position.add(3);
                return position;
                
            case "p39":
                position.add(3);
                return position;
                
            case "p40":
                position.add(1);
                return position;
                
            case "p41":
                position.add(1);
                return position;
                
            case "p42":
                position.add(2);
                return position;
                
            case "p43":
                position.add(3);
                return position;
                
            case "p44":
                position.add(3);
                return position;
                
            case "p45":
                position.add(3);
                return position;
                
            case "p46":
                position.add(1);
                return position;
                
            case "p47":
                position.add(3);
                return position;
                
            case "p48":
                position.add(4);
                return position;
                
            case "p49":
                position.add(3);
                return position;
                
            case "p50":
                position.add(3);
                return position;
                
            case "p51":
                position.add(3);
                return position;
                
            case "p52":
                position.add(1);
                return position;
                
            case "p53":
                position.add(3);
                return position;
                
            case "p54":
                position.add(1);
                return position;
                
            case "p55":
                position.add(3);
                return position;
                
            case "p56":
                position.add(3);
                return position;
                
            case "p57":
                position.add(2);
                return position;
                
            case "p58":
                position.add(4);
                return position;
                
            case "p59":
                position.add(1);
                return position;
                
            case "p60":
                position.add(3);
                return position;
                
            case "p61":
                position.add(3);
                return position;
                
            case "p62":
                position.add(2);
                return position;
                
            case "p63":
                position.add(3);
                return position;
                
            case "p64":
                position.add(4);
                return position;
                
            case "p65":
                position.add(3);
                return position;
                
            case "p66":
                position.add(3);
                return position;
                
            case "p67":
                position.add(3);
                return position;
                
            case "p68":
                position.add(3);
                return position;
                
            case "p69":
                position.add(1);
                return position;
                
            case "p70":
                position.add(4);
                return position;
                
            case "p71":
                position.add(4);
                return position;
                
            case "p72":
                position.add(3);
                return position;
                
            case "p73":
                position.add(2);
                return position;
                
            case "p74":
                position.add(3);
                return position;
                
            case "p75":
                position.add(3);
                return position;
                
            case "p76":
                position.add(3);
                return position;
                
            case "p77":
                position.add(3);
                return position;
                
            case "p78":
                position.add(3);
                return position;

            default:
                break;
        }
        city.add(0);
        return city;
    }
    
}
