package enums;

import org.testng.annotations.Test;

import java.sql.SQLOutput;

public class deneme {

    @Test
    public void name(){
        ismiNormalclass(USER.YUSUF.getUsername(), USER.YUSUF.getLastName(),USER.YUSUF.getEmail());
        System.out.println("==========");
        ismiYazdirEnum(USER.YUSUF);

        System.out.println("===========");
        for (USER user:USER.values()){
            ismiYazdirEnum(user);
        }

    }


    void ismiNormalclass(String isim, String soyadi, String email){
        System.out.println(isim + " " + soyadi + " " + email);
    }

    void ismiYazdirEnum(USER user){
        System.out.println(user.getUsername()+ " " + user.getLastName()+ " " + user.getEmail());


        }

    }



