package com.example.bisch.csgo_smokes;
import java.util.Random;
import java.util.ArrayList;

public class tips_quotes {

    String[] tipsS = {

            "In 2016 the leader of Team Snavs and famous player, 'bisch', was considered one of the best in-game leaders in the history of danish Counter-Strike",
            "'Lalagirl is probably one of the best P90 players that is known to mankind'",
            "'The Snake' might be one of the most underrated strats in a pistol round. Making the enemy think you have no idea what you're doing is not always bad",
            "'han snyder ham der. HAN SNYDER'",
            "'HVEM eR haaan??'",
            "'Do you say a ananas or an ananas?'",
            "''The Snake' was founded as a pistol round strat by famous player Babisco from Team Snavs in November 2018.'",
            "' Hans" + " Tommy Knepper Bare " + "is one of the first players to ever achieve only 1 kill on a game of 30 rounds."

    };

    public tips_quotes(){
        String[] tips = this.tipsS;
    }

     public String getTip(String[] array){
        Random random = new Random();
        int rand = random.nextInt(array.length);
        return array[rand];
    }


    public static void main(String[] args){
        tips_quotes tips = new tips_quotes();
        System.out.println(tips.getTip(tips.tipsS));
    }

}
