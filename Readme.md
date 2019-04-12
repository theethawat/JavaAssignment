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
