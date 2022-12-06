package day25overriding.practiceEncapsulationAndOverriding;

public class BankCard {
    private int bankCard=2323223;

    private  String bankName="Halifax";

    private int cv_Name=123;

    public int getBankCard(){
        return bankCard;
    }

    public String getBankName(){

        return bankName;
    }

    public void setBankName(String bankName){
        this.bankName=bankName;
    }


    public void setCv_Name(int cv_Name){
        this.cv_Name=cv_Name;
    }

    public int getCv_Name(){
        return cv_Name;
    }


}
