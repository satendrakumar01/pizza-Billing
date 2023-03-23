public class Main {
    public static void main(String[] args) {
        DeluxePizza dp= new DeluxePizza(true);
        System.out.println(dp.getPrice());
        dp.addTakeway();
        dp.addExtraToppings();
        dp.addExtraCheese();
        System.out.println(dp.getBill());


        Pizza p=new Pizza(false);
        p.addExtraCheese();
        p.addExtraToppings();
        p.addTakeway();
        System.out.println(p.getBill());
    }
}