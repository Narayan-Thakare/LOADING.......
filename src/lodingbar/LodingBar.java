package lodingbar;

public class LodingBar {

	 public static void main(String[] args) throws InterruptedException
	 {
		 
		 

		 
		 
// 			 
//			 
//			 
//			 
//		 }
		 // if ascci use
		// int code =500;
		 //char ch= (char) code;
		  int total = 100;
      	System.out.print("loding");

	        for (int i = 0; i <=10; i++) {
	        	System.out.print(".");
	        	System.out.print('\u0007');
	            Thread.sleep(200); // Simulate a time-consuming task
	           
	        }
        System.out.println("\nLoading completed!");
 
		 

		
//	        while (true) {
//	        	
//	        	
//	            // Calculate time elapsed since animation started
//	            long elapsedTime = System.currentTimeMillis() - startTime;
//	            
//	            // Update frame every 200 milliseconds
//	            if (elapsedTime > 200) {
//	                startTime = System.currentTimeMillis();
//	                frameIndex = (frameIndex + 1) % animationFrames.length;
//	            }
//	            
//	            // Calculate color code based on current frame
//	            int colorIndex = (frameIndex * colorCodes.length) / animationFrames.length;
//	            String colorCode = colorCodes[colorIndex];
//	            
//	            // Print loading bar to console with color
//	            System.out.print("\r" + colorCode + animationFrames[frameIndex] + "\033[0m");
//	            
//	            // Pause for a short time to slow down the animation
//	            try {
//	                Thread.sleep(50);
//	            } catch (InterruptedException e) {
//	                e.printStackTrace();
//	            }
//	        }



		 
		 
		 
	 }
	
	
	
	

}
