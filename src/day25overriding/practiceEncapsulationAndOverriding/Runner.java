package day25overriding.practiceEncapsulationAndOverriding;

public class Runner {
    public static void main(String[] args) {

        BankCard bankCard=new BankCard();

        System.out.println(bankCard.getBankCard());

        //bankCard.setBankName("bank asya");
        System.out.println(bankCard.getBankName());

        bankCard.setCv_Name(234);
        System.out.println(bankCard);

        System.out.println(bankCard.getCv_SSN());

        bankCard.setCv_SSN(5432222);

        System.out.println(bankCard.getCv_SSN());


    }
}
