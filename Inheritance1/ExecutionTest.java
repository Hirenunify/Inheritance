package Inheritance1;

public class ExecutionTest {

    public static void main(String[] args) {


        SuperMarket t = new SuperMarket();
        t.StockCheck();
        t.DamageItem();
        t.PriceTag();

        System.out.println("Food Section Tasks");
        Food ft = new Food();
        ft.StockCheck();
        ft.DamageItem();
        ft.PriceTag();

        System.out.println("Toys Section Tasks");
        Toys tt = new Toys();
        tt.StockCheck();
        tt.DamageItem();
        tt.PriceTag();

        System.out.println("DIY Section Tasks");
        DIY dt = new DIY();
        dt.StockCheck();
        dt.DamageItem();
        dt.PriceTag();


    }
}