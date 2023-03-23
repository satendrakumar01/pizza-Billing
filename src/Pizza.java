public class Pizza {
    private  int price;
    private boolean isVeg;
    private String bill;
    private int cheese;
    private  int toppings;
    private int basePrice;
    boolean isExtraCheeseAdded;
    boolean isExtraToppingsAdded;

    boolean isTakeawayAdded;
    boolean isBillGenrated;




    public Pizza(Boolean isVeg){
        this.isVeg=isVeg;
        this.isExtraCheeseAdded=false;
        this.isExtraToppingsAdded=false;
        this.isTakeawayAdded=false;
        this.isBillGenrated=false;
        this.bill="";
        if(isVeg){
            this.price=300;
            this.toppings=70;


        }
        else{
            this.price=400;
            this.toppings=120;

        }
        this.cheese=80;
        this.bill+="Base Price of Pizza"+this.price+"\n";


    }
    public int getPrice(){
        return this.price;
    }
    public void addExtraCheese(){

        if(!isExtraCheeseAdded){
            this.price=this.price+cheese;
            this.isExtraCheeseAdded=true;

        }

    }
    public void addExtraToppings(){
        if(!isExtraToppingsAdded){
            this.price=this.price+toppings;
            this.isExtraToppingsAdded=true;

        }

    }
    public void addTakeway(){
        if(!isTakeawayAdded){
            this.price+=20;
            isTakeawayAdded=true;
        }

    }

    public String getBill(){


        if(!isBillGenrated){
            if(isExtraCheeseAdded )
                this.bill+="Extra Cheese Added: "+this.cheese+"\n";
            if(isExtraToppingsAdded)
                this.bill+="Extra toppings Added: "+this.toppings+"\n";
            if(isTakeawayAdded)
                this.bill+="Paper Bag Added: "+"20"+"\n";
            this.bill+="Total Price: "+this.price+"\n";
            isBillGenrated=true;


        }
        return this.bill;
    }





}
