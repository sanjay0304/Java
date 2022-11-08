class Fruits {
    int id;
    String name;
    int price;
    Boolean available;
    
    public void display(){
        System.out.print(id+"\t"+name+"\t"+price);    
        System.out.println();	
    }    
   Fruits(){
    }
    Fruits(int id,String name,int price,Boolean available){
        this.id=id;
        this.name=name;
        this.price=price;
        this.available=available;
    }
}

class Electronics extends Fruits {
   Electronics(){
    }
  public Electronics(int id,String name,int price,Boolean available){
       super(id,name,price,available);
    }
}

class Mobiles extends Electronics{
	Mobiles(){
	}
	public Mobiles(int id,String Brand,int price,Boolean available){
	super(id,Brand,price,available);
	}

}
     class Category{
        public static void main(String[] args){
	if(args.length>0 && args[0].equals("fruits")){
	    System.out.println("ID\tFruit\tPrice");
            	Fruits apple = new Fruits(1,"Apple",99,true);
           	 Fruits orange = new Fruits(2,"Orange",50,true);
            	Fruits pine = new Fruits(3,"Pine",50,true);
            	Fruits grapes = new Fruits(4,"Grapes",50,true);
            	apple.display();
            	orange.display();
            	pine.display();
            	grapes.display();
	}else if(args.length>0 && args[0].equals("Electronics")){
		System.out.println("ID\tItem\t\t\tPrice");
            	Electronics wm  = new Electronics(1,"Washing Machine\t",15999,true);
           	 Electronics Fridge  = new Electronics(2,"Fridge\t\t",11999,true);
            	Electronics airConditioner = new Electronics(3,"Air-Conditioner\t",30000,true);
            	Electronics Laptop = new Electronics(4,"Laptop\t\t",30000,true);
            	wm.display();
            	Fridge.display();
            	airConditioner.display();
            	Laptop.display();
	}else if(args.length>0 && args[0].equals("Mobiles")){
		System.out.println("ID\tBrand\t\t\tPrice");
            	Mobiles samsung  = new Mobiles(1,"Samsung\t\t",21999,true);
           	Mobiles vivo  = new Mobiles(2,"Vivo\t\t",14999,true);
            	Mobiles nokia = new Mobiles(3,"Nokia\t\t",30000,true);
            	Mobiles iphone = new Mobiles(4,"Iphone\t\t",100000,true);
	Mobiles samsung1  = new Mobiles(5,"Samsung\t\t",21999,true);
           	Mobiles vivo1  = new Mobiles(6,"Vivo\t\t",14999,true);
            	Mobiles nokia1 = new Mobiles(7,"Nokia\t\t",30000,true);
            	Mobiles iphone1 = new Mobiles(8,"Iphone\t\t",100000,true);
            	samsung.display();
            	vivo.display();
            	nokia.display();
            	iphone.display();
	samsung1.display();
            	vivo1.display();
            	nokia1.display();
            	iphone1.display();
	}else{
	  System.out.println(" Type a suitable category:");
	}
           
        }
    }
