   import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;



public class A2
{
    Button b1,b2,b3,b4,b5,b6,b7,b8;
    Label l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
    TextField t1,t2,t3,t4,t7;
    int k=0,p1=0,p2=0,p3=0;
     public static ArrayList<Integer> acc= new ArrayList<Integer>();
     public static ArrayList<Integer> pinno= new ArrayList<Integer>();
     public static ArrayList<Double> bal=new ArrayList<Double>();
     public static ArrayList<String> Slots=new ArrayList<String>();
       public static void acc(){
    acc.add(123456); //already created accounts with respective employee id , password and balance
    acc.add(1);
    acc.add(345678);
    pinno.add(1111);
    pinno.add(1);
    pinno.add(3333);
    bal.add(10.0);
    bal.add(5.0);
    bal.add(10.0);
    Slots.add("Morning Shift 9:00 AM - 5:00 PM" );
    Slots.add("Night Shift 5:00 PM - 12:00 AM");
    Slots.add("Night Shift 5:00 PM - 12:00 AM");
    
   
   }
    public A2(){
        
        Frame f1=new Frame();
        l7= new Label("KRUGER CUISINE - LOGIN PAGE "); // header
        l7.setBounds(150,20,200,50);
       l1=new Label(" EMPLOYEE ID NO " ); //username
       l1.setBounds(50,100,150,50);
        l2=new Label(" PASSWORD");  //password
        l2.setBounds(50,170,150,50);
        b1=new Button(" LOG IN ");   // log in
        b1.setBounds(60,240,100,50);
        b2= new Button(" SIGN UP " ); // sign up redirection button
        b2.setBounds(180,240,100,50);
        t1=new TextField(); 
        t1.setBounds(220,100,150,50);
        t2=new TextField();
        t2.setBounds(220,170,150,50);
        b7=new Button("EXIT");
        b7.addActionListener(new ActionListener() {
       public void actionPerformed(ActionEvent e) {
       System.exit(0);
       }
        });
        //b1.addActionListener(this);
        // b1.setBounds(50,80,60,30);
          b1.addActionListener(new ActionListener(){  
             public void actionPerformed(ActionEvent e){
                 int s1=Integer.parseInt(t1.getText());  //takes username value
                 /*Label l5 = new Label(" k");
                 l5.setBounds(120,110,230,80);
                 f1.add(l5);*/
                 int s2=Integer.parseInt(t2.getText()); //takes password
                 boolean b=check(s1,s2); //to check if account & password match 
                 if(b==true){
                     Frame f2 = new Frame();
                     Button b3=new Button("TAKE ORDER");
                             b3.setBounds(100,200,100,50);
                            Button b4=new Button("WORK TIMINGS");
                            b4.setBounds(220,300,100,50);
                                 Button b5=new Button("APPLY LEAVE");
                                 b5.setBounds(340,200,100,50);
                                 b7.setBounds(450,450,30,30);
                                 f2.add(b7);
                                 
                      b3.addActionListener(new ActionListener(){  
             public void actionPerformed(ActionEvent e){
                 Frame f3 =new Frame();
                 l5 = new Label(" Kruger Cuisine's ORDER WINDOW");
                 l5.setBounds(100,100,500,500);
                 
                 MenuBar mb=new MenuBar();  
                  Menu menu=new Menu("Menu");  
                  Menu submenu=new Menu("Appetizers");  
                  Menu Dessert= new Menu("Desserts");
                    Menu maincourse=new Menu("Burgers");  
                      Menu drinks=new Menu("Drinks");  
                       Menu maincourse2=new Menu("Specialities"); 
                  MenuItem i1=new MenuItem("Chicken Steak with mushrooms $40");  
                  MenuItem i2=new MenuItem("Mashed Potatoes & Steak $45");  
                  MenuItem i3=new MenuItem("Kruger's special burger $55");  
                  MenuItem i4=new MenuItem("Spring rolls 15$");  
                  MenuItem i5=new MenuItem("Chicken tacos 30$");  
                  MenuItem i6=new MenuItem("Cheese Fries  10$");  
                  MenuItem i7=new MenuItem("Barbeque Skewers 30$");  
                  MenuItem i8= new MenuItem("Cheesecake $20");
                  MenuItem i9= new MenuItem("Classic Chocolate Fountain $40");
                  MenuItem i11= new MenuItem("The Impossible Burger $40");
                  MenuItem i10= new MenuItem("Classic Cheesesteak Burger $42");
                  MenuItem i12= new MenuItem("Pepsi $3");
                  MenuItem i13= new MenuItem("7up  $3");
                  MenuItem i14= new MenuItem("Lemonade $5");
                  MenuItem i15= new MenuItem("Water $2");
                  
           
                  t7=new TextField();
                  t7.setBounds(170,100,150,50);
                  menu.add(i1);  
                  menu.add(i2);  
                  menu.add(i3);  
                 submenu.add(i4);  
                 submenu.add(i5); 
                  submenu.add(i6); 
                     submenu.add(i7); 
                 maincourse.add(i11);
                 maincourse.add(i10);
                 maincourse.add(i3);
                      maincourse2.add(i1);
                           maincourse2.add(i2);
                 Dessert.add(i8);
                 Dessert.add(i9);
                 drinks.add(i15);
                 drinks.add(i12);
                  drinks.add(i13);
                 drinks.add(i14);
                                  drinks.add(i15);

                 
                 menu.add(submenu);  
                 menu.add(maincourse);
                 menu.add(maincourse2);
                 menu.add(Dessert);
                 menu.add(drinks);
                 mb.add(menu);
                f3.add(t7);
                     f3.setMenuBar(mb);  
         f3.setSize(400,400);  
         f3.setLayout(null);  
         f3.setVisible(true);  
               
         
     
                 f3.add(l5);
                 t3=new TextField();
                 //t3.setBounds(320,100,1000,1000;
                // f3.add(t3);
                 b6=new Button(" ENTER ");
                 b6.setBounds(150,200,100,50);
                 f3.add(b6);
                 b7.setBounds(450,450,30,30);
                 f3.add(b7);
                 f3.setSize(500,500);
                     f3.setLayout(null);
                     f3.setVisible(true);    
                     b6.addActionListener(new ActionListener(){  
             public void actionPerformed(ActionEvent e){
                 //try{
                     System.out.println(bal.get(k));
                 int s2=Integer.parseInt(t3.getText()); //}
                 //catch(Exception m){
                 boolean d=withdraw(s2);
                 if(d==true){
                                                 l4=new Label(" New balance "+bal.get(k) );
                                                      l4.setBounds(300,200,150,100);
                                                 f3.add(l4);
                                        }  
                                        else{
                                           l4 = new Label(" Insufficient balance" );
                                           l4.setBounds(300,200,150,100);
                                           f3.add(l4);//CHECK
                                           }
                                     //   }
                                    }
                                }
                                );
                }
            }
            );
                f2.add(b3);
                                 f2.add(b4);
                                 f2.add(b5);
                     f2.setSize(500,500);
                     f2.setLayout(null);
                     f2.setVisible(true);    
                     b4.addActionListener(new ActionListener(){  
             public void actionPerformed(ActionEvent e){
                 
                 Frame f4 =new Frame();
                 l5 = new Label("Your time slot for the day");
                 l5.setBounds(50,100,200,50);
                 f4.add(l5);
                // t3=new TextField();
               //  t3.setBounds(320,100,100,50);
               //  f4.add(t3);
               
                 b7.setBounds(450,450,30,30);
                 f4.add(b7);
                 b6=new Button("CHECK ");
                 b6.setBounds(150,200,70,40);
                 f4.add(b6);
                 
           
                     b6.addActionListener(new ActionListener(){  
             public void actionPerformed(ActionEvent e){
                 // try{
               String a= Slots.get(k);
                //}
                //catch(Exception l){}
            bal.set(k,((Double)bal.get(k)+p3));
                 l4=new Label(" Todays slot : "+ a );
                 l4.setBounds(100,350,300,100);
               
                 f4.add(l4);
                }
            });
                 
        //}
                  f4.setSize(500,500);
                     f4.setLayout(null);
                     f4.setVisible(true);
                 
                }
            });
             b5.addActionListener(new ActionListener(){  
             public void actionPerformed(ActionEvent e){
                 Frame f3 =new Frame();
                 l4=new Label("APPLY FOR LEAVE HERE , You have "+bal.get(k) + " paid holidays left");
                  l4.setBounds(50,10,300,50);
                 f3.add(l4);
                 
                 
                 
                 
                 l7= new Label("KRUGER CUISINE - leave application PAGE " ); // header
        l7.setBounds(150,20,200,50);
       l9=new Label(" Enter date " ); 
       l9.setBounds(50,100,150,50);
        l10=new Label("Reason ");  
        l10.setBounds(50,170,150,50);
        b8=new Button(" Apply ");  
        b8.setBounds(60,240,100,50);
      
        t3=new TextField(); 
        t3.setBounds(220,100,150,50);
        t4=new TextField();
        t4.setBounds(220,170,150,50);
        
         
         f3.add(b8);
         f3.add(l9);
         f3.add(l10);
         f3.add(t3);
         f3.add(t4);
      
                
                 f3.add(b7);
                  f3.setSize(500,500);
                     f3.setLayout(null);
                     f3.setVisible(true);
                     
                     
                     b8.addActionListener(new ActionListener(){  
             public void actionPerformed(ActionEvent e){
                 // try{
                 String p3=t3.getText();
                //}
                Double m=bal.get(k);
                m=m-1;
            bal.set(k,m);
                l11= new Label("Leave Applied for  " + p3 + " now only " + (bal.get(k)) + " holidays left" ); // header
        l11.setBounds(50,20,300,100);
        f3.add(l11);
        
                
                }
            });
              
               
                }
            });
           
            //here
                    }
                    else{
                        l4 = new Label("INVALID USERNAME OR PASSWORD" );
                        l4.setBounds(200,250,250,100);
                        f1.add(l4);
                    }
                 
                 
       
             
             }  
         }
          );  
         
          b2.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
         Frame f2=new Frame();
         l3=new Label("Enter EmpID");
         l3.setBounds(50,50,100,50);
         l4=new Label("Enter new PIN");
         l4.setBounds(50,120,100,50);
         t3=new TextField();
         t3.setBounds(170,50,150,50);
         t4=new TextField();
         t4.setBounds(170,120,150,50);
         b3=new Button("Create Account");
         
         b3.setBounds(100,200,100,50);
         b7.setBounds(450,450,30,30);
         f2.add(b7);
         f2.add(l3);
         f2.add(l4);
         f2.add(t3);
         f2.add(t4);
         f2.add(b3);
         //int s1=0,s2=0;
         
         b3.addActionListener(new ActionListener () {
         public void actionPerformed(ActionEvent e) {
            // try {
          p1=Integer.parseInt(t3.getText());
         p2=Integer.parseInt(t4.getText());
         //System.out.println(p1);
         //}
         //catch (Exception z) {}
         acc.add(p1);
         pinno.add(p2);
         bal.add(5.0);
         if ( p1 < 10 )
         {  Slots.add("Morning Shift 9:00 AM to 5:00 PM");
             
            }
            else
{
    Slots.add("Night Shift 5:00 PM to 12:00 AM");
}
         l5=new Label("Your Employee Account has been created");
         l5.setBounds(50,400,300,50);
         f2.add(l5);
        //}
         //System.out.println(acc.size());
         }
         });
         
         f2.setSize(500,500);
         f2.setLayout(null);
         f2.setVisible(true);
         }
          });
          b7.setBounds(750,750,30,30);
          f1.add(b7);

        f1.add(b1);
        f1.add(b2);
        f1.add(t1);
        f1.add(t2);
       f1.add(l1);
        f1.add(l7);
        f1.add(l2);
        f1.setSize(800,800);
        f1.setLayout(null);
        f1.setVisible(true);
       
    }
    public boolean check(int s1,int s2){
        for(int i=0;i<acc.size();i++){
           // System.out.println(acc.get(i));
                  if(s1==((Integer)acc.get(i))){
                     
                      if(s2==((Integer)pinno.get(i))){
                          k=i;
                          return true;
                        }
                       
                    }
                   
                }
        return false;
    }
   public boolean withdraw(int d){
        if(d<(Double)bal.get(k)){
            bal.set(k,((Double)bal.get(k)-d));
            return true;
        }
        else return false;
       
    }
         public static void main(String args[]){
             acc();
             A2 obj1=new A2();
             
            }
}