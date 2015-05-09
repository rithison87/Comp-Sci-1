/**

   @name: Rithi Son
   @duedate: 04/30/2015

*/

public class Television {
   // declaring variables
   private String manufacturer;  // stores brand of TV
   private int screenSize;       // stores screen size in inches
   private boolean powerOn;      // stores whether the TV is on or off
   private int channel;          // stores channel number
   private int volume;           // stores volume; 0 is no sound
   
   
   // constructor requires brand and size when creating an instance of Television
   // and sets the power to off, channel to 2 and volume to 20
   public Television(String brand, int size) {  // constructor to store brand and size of TV when creating object
      manufacturer = brand;
      screenSize = size;
      powerOn = false;
      channel = 2;
      volume = 20;
   }  
   
   // changes the channel by setting parameter station to channel
   public void setChannel(int station) { 
      channel = station;
   }                
   
   // turns the TV on or off
   public void power() {  
      if (powerOn) {
         powerOn = !powerOn;
      } else {
         powerOn = !powerOn;
      }
   }
                                  
   // mutator that increases the volume
   public void increaseVolume() {                      
      volume += 1;
   }
   
   // mutator that decreases the volume
   public void decreaseVolume() {                      
      volume -= 1;
   }
   
   // accessor that returns the current channel
   public int getChannel() {
      return channel; }  
   
   // accessor that returns the current volume                          
   public int getVolume() {
      return volume; }
   
   // accessor that returns the brand                             
   public String getManufacturer() {
      return manufacturer; }                    
   
   // accessor that returns the screen size
   public int getScreenSize() {
      return screenSize; }                         
  
}
/**
Television
-manufacturer: String
-screenSize: int
-powerOn: boolean
-channel: int
-volume: int

+Television(brand: String, size: int):
+setChannel (station: int): void
+power( ): void
+increaseVolume( ): void
+decreaseVolume( ): void
+getChannel( ): int
+getVolume( ): int
+getManufacturer( ): String
+getScreenSize( ): int
*/