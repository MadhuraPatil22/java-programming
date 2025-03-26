class StaticDemo{
 static int count;
  
 static {
 count=100;
 System.out.println("Static block executed . Initial count set to : "+count);
  }

 static void incrementCount(){
 count++;
 System.out.println("Count incremented. Current count : "+ count);
 }

 void display(){
  System.out.println("Non-Static method called ."+ count);
  }
  }

 class StaticExample{
  public static void main(String[] args){
  StaticDemo.incrementCount();
 
  StaticDemo obj1 = new StaticDemo();
  StaticDemo obj2 = new StaticDemo();

  obj1.display();
  obj2.display();
 
  StaticDemo.incrementCount();
  }
  }


