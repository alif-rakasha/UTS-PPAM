package pam.latihan.appfoodmenu;

import android.graphics.drawable.Drawable;

public class Foods {
    String name;
    String desc;
    int price;
    Drawable image;

    Foods(String name, String desc, int price, Drawable image) {
        this.name = name;
        this.desc = desc;
        this.price = price;
        this.image = image;
    }
}
