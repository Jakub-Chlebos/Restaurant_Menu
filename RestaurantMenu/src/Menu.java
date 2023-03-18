import java.util.Scanner;

public class Menu {

    public static String przystawka;
    public static String zupa;
    public static String danieGlowne;
    public static String deser;
    public static String napoj;
    public static String budzet;

    public static String getPrzystawka(String budzet){
        if(budzet.equals("maly")){
            przystawka = "chleb ze smalcem";
        } else if (budzet.equals("sredni")){
            przystawka = "oliwki i kapary";
        } else {
            przystawka = "krewetki";
        }
        return przystawka;
    }

    public static String getZupa(String budzet){
        if(budzet.equals("maly")){
            zupa = "krem z brokulow";
        } else if (budzet.equals("sredni")){
            zupa = "oliwki i kapary";
        } else {
            zupa = "krewetki";
        }
        return zupa;
    }

    public static String getDanieGlowne(String budzet){
        if (budzet.equals("maly")) {
            danieGlowne = "schabowy z ziemniakami i surowka";
        }
        else if (budzet.equals("sredni")){
            danieGlowne = "zeberka BBQ z ziemniakami opiekanymi";
        }
        else {
            danieGlowne = "kaczka w sosie wlasnym z ziemnaiakmi i szparagami";
        }
        return danieGlowne;
        }

        public static String getDeser(String budzet){
        if (budzet.equals("maly")){
            deser = "lody";
        }else if (budzet.equals("sredni")){
            deser = "sernik nowojorski";
        }else {
            deser = "puchar owocow z lodami";
        }
        return deser;
        }

        public static String getNapoj(String budzet){
        if (budzet.equals("maly")){
            napoj = "woda";
        } else if (budzet.equals("sredni")){
            napoj = "cola";
        } else {
            napoj = "mojito";
        }
        return napoj;
        }

    public static void main(String[] args) {
            System.out.println("W naszym menu: \n" +
                    "1.Przystawki\n" +
                    "2.Zupy\n" +
                    "3.Dania glowne\n" +
                    "4.Desery\n" +
                    "5.Napoje i alkohole\n\n" +
                    "Prosze podaj swoj budzet (maly/sredni/duzy)";


            Scanner scanner = new Scanner(System.in);
            String budzet = scanner.nextLine();
            if (budzet != "maly" && budzet != "sredni" && budzet != "duzy"){
                System.out.println("Przykro nam, budzet nieznany");
                System.exit(1);
            }
            getPrzystawka(budzet);
            getZupa(budzet);
            getDanieGlowne(budzet);
            getDeser(budzet);
            getNapoj(budzet);
       // }
        System.out.println("Dzis zjesz:");
        System.out.println("Przystawka: " + przystawka);
        System.out.println("Zupa: " + zupa);
        System.out.println("Danie glowne: " + danieGlowne);
        System.out.println("Deser: " + deser);
        System.out.println("Napoj: " + napoj);



    }

    }










//
//    MENU RESTAURACJI
//1. Stworz nowy projekt menu
//        2. Stworz nowy plik Menu.java
//        3. W klasie Menu zadeklaruj 6 zmiennych publicznych statyczne typu String: przystawka, zupa, danieGlowne, deser, napoj, budzet
//        4. Stworz 5 metod kolejno: getPrzystawka, getZupa, getDanieGlowne, getDeser, getNapoj, ktore przyjmuja za argument budzet.
//        W zaleznosci od budzetu zwroca inne wartosci:
//        - getPrzystawka: budzet maly: chleb ze smalcem, budzet sredni: oliwki i kapary, budzet duzy: krewetki
//        - getZupa: budzet maly: krem z brokul, budzet duzy: rosol, budzet duzy: zurek
//        - getDanieGlowne: budzet maly: schabowy z ziemniakami i surowka, budzet sredni: zeberka BBQ z ziemniakami opiekanymi, budzet duzy: kaczka w sosie wlasnym z ziemnaiakmi i szparagami
//        - getDeser: budzet maly: lody, budzet sredni: sernik nowojorski, budzet duzy: puchar owocow z lodami
//        - getNapoj: budzet maly: woda, budzet sredni: cola, budzet wysoki: mojito
//        4. Stworz funkcje egzekucyjna, w ktorej na dzien dobry wyswietlisz informacje:
//        " W naszym menu:
//        Pod jedynka w menu znajduja sie przystawki
//        Pod dwojka w menu znajduja sie zupy
//        Pod trojka w menu znajduja sie dania glowne
//        Pod czworka w menu znajduja sie desery
//        Pod piatka w menu znajduja sie napoje i alkohole;
//        "
//        5. Popros uzytkownika, zeby podal swoj budzet jako wartosci maly, sredni, duzy. Przypisz ta wartosc do zmiennej budzet.
//        Jesli wartosc bedzie inna niz powyzsze wyswietl informacje: "Przykro nam, budzet nieznany" i wyjdz z programu za pomoca
//        instrukcji:
//        System.exit();
//        6. Stworz petle for, ktora wykona sie 5 razy i w kazdej iteracji wybrane zostanie dla uzytkownika dana pozycja menu.
//        7. Na koncu wyswietl menu uzytkownika:
//        "Dzisiaj bedziesz jadl:
//        - przystawka:  + przystawka
//        - zupa:  + zupa
//        - danie glowne + danieGlowne
//        - deser + deser
//        - napoj + napoj"
