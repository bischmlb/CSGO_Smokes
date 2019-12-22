package com.example.bisch.csgo_smokes;
import java.util.Random;
import java.util.ArrayList;

public class tips_quotes {

    public String[] tipsS = {

            "In 2016 the leader of Team Snavs and famous player, 'bisch', was considered one of the best in-game leaders in the history of danish Counter-Strike",
            "'Lalagirl is probably one of the best P90 players that is known to mankind'",
            "'han snyder ham der. HAN SNYDER'",
            "'HVEM eR haaan??'",
            "'Do you say a ananas or an ananas?'",
            "''The Snake' was founded as a pistol round strat by famous player Babisco from Team Snavs in November 2018.'",
            "' Hans" + " 'Tommy Knepper Bare' " + "is one of the first players to ever achieve only 1 kill in a game of 30 rounds, whilst not being afk.",
            "'Kom igen drenge, mespee er bare for god til nogen af os ...'",
            "CarlosB: 'Han er squeeky, han er squeeky!' (han er B apps, mirage)",
            "'Dude turn off now or go hvh'",

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
