package enums;

import org.testng.annotations.Test;

public enum USER {
    YUSUF("yusuf", "bayram", "yusuf@gmail.com"),
    FATMA("fatma", "bayram", "yusufas@gmail.com");
    String promoCodeName;

    //ENUM class adi buyuk harfle baslar.
    private String username, lastName, email;

    //constructor
    USER(String username, String lastName, String email) {
        this.username = username;
        this.lastName = lastName;
        this.email = email;
    }

    //getter lari yaziyorum
    public String getUsername() {
        return username;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    @Test
    public void sdas(){


    }

}
