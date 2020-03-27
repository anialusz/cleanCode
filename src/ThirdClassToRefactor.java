import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ThirdClassToRefactor {
    //super dluga metoda  blablabla
    //dwie metody z mozliwoscia wyciagniecia do innych
    //dodawac komentarze
    private static final Logger LOG = Logger.getLogger("ThirdClassToRefactor");

    /**
     * metoda jaPierdzieleTurboMetodaPanaBogaZaPiecemGeneralniePolecam
     * działa bardzo dobrze,
     * generalnie
     * po przekazaniu argumenty wykonuje logike potrzebna do wykorzystania tych danychw przyszlej
     * biznesowej logice programu
     * @param a
     * @return
     */
    protected long jaPierdzieleTurboMetodaPanaBogaZaPiecemGeneralniePolecam(int...a) {
ArrayList<String> szybkaLista = new ArrayList<>();
int columnId = 0;
int columnNazwa = 1;
int columnJedn = 2;
int column = 3;
int columnCena = 4;
int columnKategoria = 5;
int row = -17;
for (int i : a) {
if (i != columnId) {
if (i != columnNazwa) {
if (i != columnJedn) {
if (i != column) {
if (i != columnCena) {
if (i != columnKategoria) {
if (i != row) {
if(szybkaLista instanceof List) {
szybkaLista.add(String.valueOf(i));
}
LOG.log(Level.INFO, String.format("i = %s", i));
}}}}}}}}
String[] tab = szybkaLista.toArray(new String[0]);
List<Character> tempowaListaDodatkowaWCeluWylonienia = new ArrayList<>();
for (String s : tab) {
if(s.length()>1){
for(int i =  0; i<s.length();i++){
char tempChar = s.charAt(i);
tempowaListaDodatkowaWCeluWylonienia.add(tempChar);
}}else{
char tempowyCharDoListy = s.charAt(0);
tempowaListaDodatkowaWCeluWylonienia.add(tempowyCharDoListy);
}}
Map<Long, Character> mapkaChwilowa = new HashMap<>();
long counter = Long.MAX_VALUE;
for (int i = tempowaListaDodatkowaWCeluWylonienia.size() - 1; i >= 0; i--) {
char czarek = tempowaListaDodatkowaWCeluWylonienia.get(i);
counter = counter - i - tempowaListaDodatkowaWCeluWylonienia.size()*2 - columnKategoria;
mapkaChwilowa.put(counter, czarek);
Dziura dziura = new Dziura(czarek);
}
long result = Dziura.count;
return result;
}


/**
 * metoda druga
 * zamienia x na y w stringu
 *
 */
public static String metodB(String str){
    char[] tablica = str.toCharArray();
    String result = "";
    for (int i = 0; i < tablica.length; i++) {
        if(tablica[i] == 'x'){
            tablica[i] ='y';
        }
        result+=tablica[i];
    }
    return result;
}
public static String metodA(String str){
    char[] tablica = str.toCharArray();
    String result = "";
    for (int i = 0; i < tablica.length; i++) {
        if(tablica[i] == 'y'){
            tablica[i] ='x';
        }
        result+=tablica[i];
    }
    return result;
}

}

/**
 * klasa potrzebne do dzialania metody długiej
 */
class Dziura{
    static long count=0;
    char znak;
    Dziura(char znak){
        this.znak = znak;
        count++;
    }
}
