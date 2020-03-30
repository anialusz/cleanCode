public class FourthClassToRefactor {
    // metoda na conajmniej 30 linii ( max 50)
    // dwie metody które beda miec wspolne częsci możliwe do wyciagniecia do pomocniczych metod
    // dodawac komentarze
    public static void main(String[] args) {
        method1(7, new int[]{1, 3, 66, 7, 8, 90});
        method2(20);
        method3(20);
        method4(20);
    }

    static boolean method1(int a, int[] b) {
        //metoda sprawdzająca czy liczba znajduje się w zbiorze i wypisująca wynik
        System.out.println("***********************method1***********************");
        boolean c = false;
        for (int i = 0; i < b.length; i++) {
            if (a == b[i]) {
                c = true;
            }
        }
        System.out.println(c);
        return c;
    }

    static int[] method2(int y) {
        //metoda licząca liczbę dzielników podanej liczby i wypisująca listę dzielników
        System.out.println("***********************method2***********************");
        int c = 0;
        for (int i = 1; i <= y; i++) {
            if (y % i == 0) {
                c++;
            }
        }

//        for (int i = 1; i <= y; i++) {
//            if (y % i == 0) {
//                i++;
//            }else if(!(y%i==0)){
//                i--;
//            }
//        }

        int[] t = new int[c];
        int l = 0;

        for (int j = 1; j <= y; j++) {
            if (y % j == 0) {
                t[l] = j;
                System.out.println(t[l]);
                l++;
            }
            c++;
        }
        return t;
    }

    static int method3(int o) {
        //metoda licząca liczbę dzielników podanej liczby i wypisująca wynik
        System.out.println("***********************method3***********************");
        int d = 0;
        for (int i = 1; i <= o; i++) {
            if (o % i == 0) {
                d++;
            }
        }
        System.out.println(d);
        return d;
    }

    static void method4(int a) {
        //metoda wypisujáca dzielniki
        System.out.println("***********************method4***********************");
        for (int i = 1; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                System.out.println(i);
                System.out.println(a / i);
            }
        }
    }
}