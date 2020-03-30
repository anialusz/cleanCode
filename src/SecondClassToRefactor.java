public class SecondClassToRefactor {
    //tablica z wiekiem osob
    int[] tab = {13, 56, 19, 23, 90, 21, 3, 7, 2, 101, 66};

    //obecny rok
    int buu = 2020;

    //tablica z datami urodzin osob
    int[] person = new int[tab.length];

    //person manager, wyswetlna informacje o wieku osob, jakies info o osobach, ich daty urodzenia, komentarz odnosnie wieku
    public void doingAlotOfStuff() {
        for (int j : tab) { if (j <= 18) { System.out.println("You are underage");
            } else { System.out.println("You are an adult"); } }
        //adding person age to array
        for (int p = 0; p < person.length; p++) { person[p] = buu - tab[p]; }
        //printing date of birth
        for (int j : person) { System.out.println(j); }

        //print info about life
        for (int f : tab) { if (f > 100) { System.out.println("Wow you are really old!");
            } else { if (f > 65) { System.out.println("Congratulations on your retirement!");
                } else { if (f > 30) {
                        System.out.println("Nice! You are working class!"); } else {  if (f > 14) {
                            System.out.println("Still studying?");  } else {
                            System.out.println("The best part of life"); } } }  } }
    }

    //age all people
    public int[] doSomething(int[] tab) {
        //age
        for (int l = 0; l < tab.length; l++) { tab[l] += 1;
        }
        //print new tab
        System.out.println("Wiek za rok:"); for (int p : tab) {
            System.out.println(p);
        }return tab;
    }
    //age twice eaach person in array
    public void fastagingPeople(int[] tab) { for (int l = 0; l < tab.length; l++) {
            tab[l] += 1;
        }for (int l = 0; l < tab.length; l++) {
            tab[l] += 1; }
        //print new tab
        System.out.println("Wiek za dwa lata:");for (int p : tab) {
            System.out.println(p); } }}
