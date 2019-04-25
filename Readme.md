# Swing GUI Java Assignment - Ragnarok
![program screenshot](https://raw.githubusercontent.com/theethawat/JavaAssignment/master/Screenshot.jpg)

https://vsrm.dev.azure.com/theethawats/_apis/public/Release/badge/14d899b7-8338-430d-b6b4-8ba2004d2d9d/1/1
## Environment
* IDE: IntelliJ IDEA 19.1 Community (Move From NetBeansIDE10)
* OS : Windows 10 Education
* JavaRuntimeEnviroment (JRE) 1.8.0
* JavaSoftwareDevelopmentKit (JDK) 1.8.0

## Download Game
In Release Page [Download](https://github.com/theethawat/JavaAssignment/releases) Should Download .jar version 
make sure you have Java Runtime Environment in Your Computer

## Knowledge Issue
### การ Handle Event GUI
โดยส่วนหลัก จะใช้ GUI การสร้าง GUI ต่าง ๆ โดยการทำ Listener ต่างๆ มักจะเขียนด้วย
 Annonymous Class มากกว่า Inner Class หรือ การ Overide Method
### การวาง Layout
 มีการวาง Layout ทั้งแบบ Box Layout จากที่เห็นได้ในด้านข้างทั้งสอง Grid Layout บนตารางแสดงค่า Health , 
 Experience ต่างๆ และมีการใช้ Border Layout ในการจัดหน้า MainUI จะเห็นได้ว่ามีการวางหน้าหลักเป็นส่วน ๆ 
### การสร้าง Label Box 
การสร้างข้อความต่าง ๆ พวก JLabel ในตอนแรกต้องการให้ข้อความมีการ Wrap แต่ไม่ทราบว่าทำเช่นไร จึงเปิดหา และ พบบทความใน
 Stack Overflow ให้ใช้ในรูปของ HTML Inside Java Code เป็น html ง่ายๆ มีแค่การเว้นบรรทัด หรือคำสั่งพื้นฐานอื่น ๆ 
 แต่ต่อมาได้พบว่าการใช้ '\n' ก็สามารถใช้ได่
 ### การใช้ไฟล์
 ในเวอร์ชั่นเก่าของ Source Code มีการใช้ไฟล์ เพื่อนำมาใช้เป็นไฟล์ฟอนต์ ทำให้ทราบว่า เราต้องลิงค์ไปยัง Path จริง ๆ ของไฟล์ ทำให้ได้เรียนรู้การทำ Exception แต่เนื่องจากเมื่อฟอนต์สามารถทำงานได้แล้ว กลับไม่ได้เพิ่มขนาดฟอนต์ จึงทำการใช้ฟอนต์พื้นฐานเช่นเดิม 
### การใช้ Extends
 นอกจาก Extends JPanel , JFrame, … แล้ว มีการสร้าง Class Primin แลพ  Oldprime ที่สืบทอดจาก Occupation 
 เราไม่จำเป็นต้อง Overide Method ที่มีใน Occupation ไปยัง Primin แต่เมื่อเราเรียก เราสามารถเรียกใช้ได้ทันที 
### กามพยายามทำให้คอยเซปต์ Object Oriented Programing
พยายาม Private to class มากขึ้น ถึงแม้ว่าอาจจะไม่ได้ทำฟังก์ชันอะไรมากมาย เนื่องจากผู้ทำเองก็ยังสงสัย การเรียก Method ข้าม Panel ข้าม Class ไม่ทราบว่าต้อง new Object หรือไม่ แต่ก็มีบางอย่างที่รู้เข้าใจว่าน่าจะเป็นการเขียนแบบ C-Style Java อยู่บ้าง

### การทำงานของโปรแกรม
![Program Working Model](https://raw.githubusercontent.com/theethawat/JavaAssignment/master/Screenshot2.jpg)

## Credit
ธีร์ธวัช สวาสดิ์ธรรม - Theethawat Savasham

CoEPSU - theethawat.s@outlook.co.th


## Swing Function Working

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
	//Using Inner Class
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

### Annonymous Class
Don't Need to Implement the ActionListener the things that you must is
to making the class inside the mathod call like `AddActionListener()` 
	```
	quitItem.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });	
	```

## GUI Setting
### Setting Layout
	```
	  Container c = getContentPane();
        c.setLayout(new FlowLayout());
	```