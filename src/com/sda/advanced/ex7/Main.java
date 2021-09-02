package com.sda.advanced.ex7;

/**
 *  Create a class imitating a weapon magazine.
 *  The class should be able to define the size of the magazine using the constructor.
 *  Implement the methods:
 *  loadBullet(String bullet) → adding a cartridge to the magazine, does not allow loading more cartridges
 *                              than the capacity of the magazine
 *  isLoaded() → returns information about whether the weapon is loaded (at least one cartridge) or not
 *  shot() → each call shots one bullet (prints string value in console) - the last loaded cartridge - and
 *          prepares the next one, loaded before the last one, if there are no more cartridges, it prints "empty
 *          magazine" in the console
 */
public class Main {
    public static void main(String[] args) {
        WeaponMagazine weaponMagazine = new WeaponMagazine(5);
        System.out.println(weaponMagazine.isLoaded());
        System.out.println("==================================");

        weaponMagazine.loadBullet("4");
        weaponMagazine.shot();
        weaponMagazine.shot();
        weaponMagazine.shot();
        weaponMagazine.shot();
        weaponMagazine.shot();
        weaponMagazine.shot();
        System.out.println(weaponMagazine.isLoaded());

    }
}