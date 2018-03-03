package pl.sternik.aw.gpw;

import java.util.Observable;
import java.util.Observer;

public class WyswietlaczTikow implements Observer {

    public void update(Observable o, Object arg) {
        Tik tik = (Tik) arg;
        System.out.println("WT:Spółka: " + tik.getNazwa() + " cena: " + tik.getCena());
    }
}
