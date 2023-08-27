/*
Given an array of n Player objects, write a comparator that sorts them in order of decreasing score;
if 2 or more players have the same score, sort those players alphabetically by name. To do this,
you must create a Checker class that implements the Comparator interface, then write an int
compare(Player a, Player b) method implementing the Comparator.compare(T o1, T o2) method.
 */

import java.util.Comparator;

class Checker implements Comparator<Player> {

    @Override
    public int compare(Player a, Player b) {
        if (a.score < b.score) {
            return 1;
        }
        else if (a.score > b.score) {
            return -1;
        }
        else {
            return a.name.compareTo(b.name);
        }
    }

}

class Player{
    String name;
    int score;

    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}