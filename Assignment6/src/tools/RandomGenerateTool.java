package tools;

import java.util.Random;

/**
 * Created by Lysergids on 2016/10/19 0019.
 */
public class RandomGenerateTool {

    private static int cityCount = 1;
    private static int communityCount = 1;
    private static int houseCount = 1;
    private static int familyCount = 1;
    private static int personCount = 1;

    //use for generate name
    public String generateString(int length) {
        Random rng = new Random();
        String characters = "qwertyuiopasdfghjklzxcvbnm";
        char[] text = new char[length];
        for (int i = 0; i < length; i++) {
            text[i] = characters.charAt(rng.nextInt(characters.length()));
        }
        text[0] = (char)(text[0]-32);
        return new String(text);
    }

    public int randInt(int min, int max) {
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;

        return randomNum;
    }

    public double randDouble(double min, double max) {
        Random rand = new Random();
        double randomDoubleRate = rand.nextDouble();
        double randomDouble = randomDoubleRate*max + (1 - randomDoubleRate)*min;
        return randomDouble;
    }


    public boolean randBool(){
        Random rand = new Random();
        boolean randBool = rand.nextBoolean();
        return randBool;
    }

    public boolean randSmoker(){
        Random rand = new Random();
        int i = rand.nextInt(10);
        if (i < 7)
            return false;
        else
            return true;
    }

    public boolean randDiabetes(){
        Random rand = new Random();
        int i = rand.nextInt(100);
        if (i < 90)
            return false;
        else
            return true;
    }

    public String generateCityId(){
        int cityNum = 100000;
        int cityid = cityNum + cityCount++;
        return String.valueOf(cityid);
    }

    public String generateCommunityId(){
        int communityNum = 200000;
        int communityId = communityNum + communityCount++;
        return String.valueOf(communityId);
    }

    public String generateHouseId(){
        int houseNum = 300000;
        int houseId = houseNum + houseCount++;
        return String.valueOf(houseId);
    }

    public String generateFamilyId(){
        int familyNum = 400000;
        int familyId = familyNum + familyCount++;
        return String.valueOf(familyId);
    }

    public String generatePersonId(){
        int personNum = 500000;
        int personId = personNum + personCount++;
        return String.valueOf(personId);
    }

}
