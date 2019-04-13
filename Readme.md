# JavaAssignment

## Handling
### Basic Handling 
Implements `ActionListener` Interface and re-modify ActionPerformed(ActionEvent event) method like
	```
 	public void actionPerformed(ActionEvent event){
        	Object source = event.getSource();
        	if(source == profileItem)
            		System.out.println("Your Profile isn't Avaliable coming soon");
        	else if(source == quitItem)
            		System.exit(0);
        	else
            		System.out.println("Cannot Working");
    	}	 
	```
### Inner Class
Don't Need to Implement the ActionListener at the beginning of class,
make the class Inside it. It can work only in this class and it can use `private` 
field or attribute of the home class. 
To use the method in there using like the other class.
	```
	[200~//Using Inner Class
	    class MenuHandler implements ActionListener{
	        //actionPerformed is a method not a constructor
		    public void actionPerformed(ActionEvent event){
		            Object source = event.getSource();
			            if(source == profileItem)
				                System.out.println("Your Profile isn't Avaliable coming soon");
						        else if(source == quitItem)
							            System.exit(0);
								            else
									                System.out.println("Cannot Working");
											    } 
											        
												    }
	```
