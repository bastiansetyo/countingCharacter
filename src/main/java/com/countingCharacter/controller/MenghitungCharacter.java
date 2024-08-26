package com.countingCharacter.controller;

@RestController
public class MenghitungCharacter {
    @PostMapping("/cekinput")
    public String hitung(@RequestBody String input) {
        int huruf = 0;
        int bilangan = 0;
        int karakterLainnya = 0;

        // Menghitung jumlah karakter, bilangan, dan huruf
        for (int i = 0; i < input.length(); i++) {
            char karakter = input.charAt(i);
            if (Character.isLetter(karakter)) {
                huruf++;
            } else if (Character.isDigit(karakter)) {
                bilangan++;
            } else {
                karakterLainnya++;
            }
        }
        // Menampilkan hasil
        return "Jumlah karakter: " + input.length() + "\n" + "jumlah huruf: " + huruf + "\n" + "jumlah bilangan "
                + bilangan + "\n" + "karakterlain: " + karakterLainnya;
    }
}
