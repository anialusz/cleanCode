public class FirstClassToRefactor {
    public static void main(String[] args) {

    }

    public int Dod(String a, String b)
    {
        //czy da się zrobić parse
        boolean cds;
        //czy da się zrobić parse 2
        boolean cds1;
        //tu może będą liczby
        int a1=0; //pierwsza liczba
        int b1=0; //druga liczba
        //sprawdzimy sobie
        try { //sprawdzam
            Integer.parseInt(a); //o spoko da się
            cds = true; //no to da się
        } catch (NumberFormatException e) { //o jednak nie da się
            cds = false; //no to sie nie da, trudno
        }
        if(cds==true) //a jak się da
        {
            a1 = Integer.parseInt(a); //to proszę bardzo tutaj mamy fajną liczbę już
        }
        try { //i tu znowu sobie sprawdzimy
            Integer.parseInt(b); //takie rzeczy
            cds = true; //da się, to super
        } catch (NumberFormatException e) { //buuuuuuuuu
            cds = false; //buuuuuuuuuuuuuuuuuuuuuuuuu
        }
        if(cds==true)
        {
            b1 = Integer.parseInt(b); //proszę proszę
        }
        return a1+b1; //jeeeej brawo koniec tej metodki
    }

    public int Ode(String a, String b)
    {
        //tutaj w sumie też sobie sprawdzimy czy się da parsować a potem dla odmiany sobie odejmiemy, a co
        
        boolean cds;
        boolean cds1;
        int a1=0;
        int b1=0;

        try {
            Integer.parseInt(a);
            cds = true;
        } catch (NumberFormatException e) {
            cds = false;
        }
        if(cds==true)
        {
            a1 = Integer.parseInt(a);
        }
        try {
            Integer.parseInt(b);
            cds = true;
        } catch (NumberFormatException e) {
            cds = false;
        }
        if(cds==true)
        {
            b1 = Integer.parseInt(b);
        }
        return a1-b1;

    }

    public int[][] cosZrob(int[][] wej)
    {
        //wyswietlimy sobie co tu mamy
        for (int i = 0; i < wej.length; i++) {
            for (int j = 0; j < wej[i].length; j++) {
                System.out.println(wej[i][j]);
            }
        }
        //tu sobie cos pozmieniamy
        for (int i = 0; i < wej.length; i++) {
            for (int j = 0; j < wej[i].length; j++) {
                if(i!=j){
                    if(wej[i][j]>10)
                    {
                        wej[i][j]= 100;
                    }
                    else if(wej[i][j]<0)
                    {
                        wej[i][j]=-1;
                    }
                    else{
                        int temp = wej[i][j]*wej[i][j];
                        wej[i][j] = temp;
                    }
                }
                else{
                    wej[i][j]=0;
                }
            }
        }
        //wyswietlimy sobie co tu mamy znow
        for (int i = 0; i < wej.length; i++) {
            for (int j = 0; j < wej[i].length; j++) {
                System.out.println(wej[i][j]);
            }
        }
        return wej;
    }
}