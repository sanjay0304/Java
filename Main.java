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


     class Category{
        public static void main(String[] args){
            System.out.println("ID\tFruit\tPrice");
            
            Fruits apple = new Fruits(1,"Apple",99,true);
            Fruits orange = new Fruits(2,"Orange",50,true);
            Fruits pine = new Fruits(3,"Pine",50,true);
            Fruits grapes = new Fruits(4,"Grapes",50,true);
            apple.display();
            orange.display();
            pine.display();
            grapes.display();
	
            
        }
    }
