package com.sda.advanced.ex8;

public class ParcelValidator implements Validator<Parcel>{

    @Override
    public boolean validate(Parcel parcel) {
        int dimensionSum = parcel.getXLength() + parcel.getYLength() + parcel.getZLength();
        if (dimensionSum > 300) {
            System.out.println("TOO BIG");
            return false;
        }
        if (parcel.getXLength() > 30 || parcel.getYLength() > 30 || parcel.getZLength() > 30) {
            System.out.println("NOT VALID DIMENSIONS");
            return false;
        }
        if (parcel.isExpress() && parcel.getWeight() > 15 && parcel.getWeight() < 30) {
            System.out.println("NOT VALID WEIGHT FOR EXPRESS PARCEL");
            return false;
        }
        if (parcel.isExpress() && parcel.getWeight() >= 30) {
            System.out.println("NOT VALID WEIGHT FOR REGULAR PARCEL");
            return false;
        }
        System.out.println("VALID");
        return true;
    }


}