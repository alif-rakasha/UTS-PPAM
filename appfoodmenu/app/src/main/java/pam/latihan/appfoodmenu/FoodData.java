package pam.latihan.appfoodmenu;

import android.content.Context;
import android.graphics.drawable.Drawable;

import java.util.ArrayList;

public class FoodData {
    public static ArrayList<Foods> getData(Context context){
        ArrayList<Foods> list = new ArrayList<Foods>();
        list.add(new Foods("Batagor", "Sepiring Campuran Batagor (Baso Tahu Goreng) dan Siomay dengan Bumbu Kacang dan Kecap Manis, dapat ditambahkan pedas", 12000, context.getDrawable(R.drawable.batagor)));
        list.add(new Foods("Mie Goreng", "Sepiring Mie Goreng dengan Tambahan Topping Telur, Udang, dan Sayuran", 23000, context.getDrawable(R.drawable.mie_goreng)));
        list.add(new Foods("Nasi Goreng", "Sepiring Nasi Goreng dengan Telur Iris, Udang, dan Sayuran", 21000, context.getDrawable(R.drawable.nasigoreng)));
        list.add(new Foods("Cappucino", "Secangkir Kopi Cappucino Hangat", 8000, context.getDrawable(R.drawable.cappuchino)));
        list.add(new Foods("Kopi Hitam", "Secangkir Kopi Hitam Hangat", 6000, context.getDrawable(R.drawable.kopi_hitam)));
        list.add(new Foods("Sparkling Tea", "Segelas Sparkling Tea dengan Es", 10000, context.getDrawable(R.drawable.sparkling_tea)));
        list.add(new Foods("Cheese Cake", "Sepotong Cheese Cake Lembut dengan Cream dan Raspberry", 20000, context.getDrawable(R.drawable.cheesecake)));
        list.add(new Foods("Donat", "Donat dengan Macam-Macam Varian Topping", 7000, context.getDrawable(R.drawable.donut)));
        return list;
    }
}
