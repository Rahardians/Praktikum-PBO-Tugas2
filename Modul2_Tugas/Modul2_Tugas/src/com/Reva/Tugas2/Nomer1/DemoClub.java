package com.Reva.Tugas2.Nomer1;

public class DemoClub {
    public static void main(String[] args) {

        // Objek Club
        Club club1 = new Club();
        Club club2 = new Club("Barcelona");
        Club club3 = new Club("Barcelona", " FC Barcelona merupakan salah satu club besar di dunia yang berasal dari Liga Spanyol");
        Club club4 = new Club("Barcelona", 1899, "Camp Nou");
        Club club5 = new Club("Barcelona", 1899, "Camp Nou", 5, " FC Barcelona merupakan salah satu club besar di dunia yang berasal dari Liga Spanyol");

        // Memanggil Method dari Class Club
        club1.getTeam();
        System.out.println();
        club2.getTeam();
        System.out.println();
        club3.getTeam();
        System.out.println();
        club4.getTeam();
        System.out.println();
        club5.getTeam();
    }
}