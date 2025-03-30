
   import java.util.* ;


  class Node
  {
     String num ; 
	 String name  ; 
	  Node nxt  ; 
	 
    
	 
	 Node(String name , String num )
	 {
	   this.name = name ; 
	   this.num = num ; 
	   nxt = null  ;
	 
	 }
	 
	
   
  
  }
  
  
  class LinkedlistProject
  {
       Node head  ; 
	   
	   void insertContact(String name , String num)
	   {
	     Node new_node =  new Node(name, num );
		 new_node.nxt = head ; 
		 head = new_node ; 
  
	   }
	   
	   void display()
	   {
		   Node n =  head ; 
		   while(n!= null)
		   {
			   System.out.println(n.name+"  "+n.num);
			   n = n.nxt ;
		   }
		   
	   }
	   
	   boolean search(String key)
	   {
		   Node temp = head ; 
		  
		   while(temp != null)
		   {
			   if(temp.name .equals(key) )
			   {
				  
				  return true  ;
			   }
				   
		   }
		   
		   return false ;
		   
		   
	   }
	   
	   
	  void removeContact(String name)
	  {
	       
           
            if(head == null)
            {
             System.out.println("Empty Contact list !");
			 return ; 
			}
 
            Node n1 = head ;
			
            if(n1.name.equals(name))
			{
				head =  head.nxt ;
				
                 // n1 = n1.nxt ;
			  System.out.println("Contact deleted Successfully !");
			  return ; 
			}
            			
	 	    
			Node n = null ;
			n1= head ;
			
			
			while(n1.nxt != null && n1.nxt.name.equals(name) )
			{
				n=n1 ;
				n1 = n1.nxt ; 
				
				
			}
			n.nxt = n1.nxt ;
			/*
			if(n.nxt != null)
			{
				n.nxt = n.nxt.nxt ; 
				
			} 
			*/
		  
		  
	  }
	   
  
  }
  
  class SinglyLinkedlist
  {
      public static void main(String args[])
	  {
		  Scanner sc =  new Scanner(System.in) ;
		  
		  Node temp ;
		  
		  LinkedlistProject list = new LinkedlistProject();
		  
		 /*
		  list.insertContact("Adarsh","123456789");
		  list.insertContact("Abhishek","123456789");
		  list.insertContact("Abhijeet","123456789");
		  list.display() ;
		  list.search("Adarsh");
		  list.search("Abhishek");
		  list.removeContact("Abhishek");
		  list.display() ;
		  
		  */
		  String name , num ; 
		    int ch ;
		 do
		 {
		  
		  System.out.println();
		  
		  System.out.println("Enter 1 for insert contact ");
		  System.out.println("Enter 2 for search contact ");
		  System.out.println("Enter 3 for remove contact ");
		  System.out.println("Enter 4 for display contact ");
		  System.out.println("Enter 5 to exit ! ");
		  System.out.println();
		  
		  ch =  sc.nextInt();
		  
		  switch(ch)
		  {
			  
			  case 1:
			              System.out.println("Enter contact name :  ");
						  sc.nextLine() ;
		                  name = sc.nextLine() ;
						  System.out.println("Enter contact number :  ");
						  num = sc.nextLine();
						  list.insertContact(name, num) ;
						  break ;
			  case 2:   
			              System.out.println("Enter contact name :  ");
						  sc.nextLine() ; 
		                  name = sc.nextLine() ;
			              boolean r =list.search(name) ;
						  if(r == true)
						  {
							 System.out.println("Contact Found : "); 
						  }
						  else
						  {
							  System.out.println("Contact not Found .");
						  }
						  break ;
			            
			  case 3:
			              System.out.println("Enter contact name :  ");
						  sc.nextLine() ;
		                  name = sc.nextLine() ;
			              list.removeContact(name) ;
						  break;
			           
			  case 4:
			              list.display();
						  break ; 
			  
			  case 5:    
			             System.out.println("Exit Done !");
			             break;
			  
			  default:
			              System.out.println("invalid !");
					      break ;
			  
			  
			  
		  }
		  
		 } while(ch != 5) ;
		  
		  
	  }
  
  
  }
  
  