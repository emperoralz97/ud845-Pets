package com.example.android.pets.Data;

import android.provider.BaseColumns;

public final class PetContract {

    private PetContract(){}

    public static class PetEntry implements BaseColumns{
        //Constant for table name
        public static final String TABLE_NAME = "pets";

        //Constant for header column
        public static final String _ID = BaseColumns._ID;
        public static final String COLUMN_PET_NAME = "Name";
        public static final String COLUMN_PET_BREED = "Breed";
        public static final String COLUMN_PET_GENDER = "Gender";
        public static final String COLUMN_PET_WEIGHT = "Weight";

        //Constant for the value of gender
        public static final int GENDER_UNKNOWN = 0;
        public static final int GENDER_MALE = 1;
        public static final int GENDER_FEMALE = 2;
    }
}
