package com.company;

public class FootballTeam {
    public String name;
    public String country;
    public String[] acters = new String[11];
    public int grading;
    public int rating;





    public void changeRating(int number) {
        rating = number;
    }

    public void replacePlayer(String oldActor, String newActor) {
        for (int index =0; index < acters.length; index++ )   {
            if (acters[index] == oldActor )   {
                acters[index] = newActor;
            }
            else  {
                break;
            }
        }





    }

}
