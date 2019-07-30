package com.louis;

public class Triangle {
	
	private int size;
	
	public void RegularTriangle() {
		
		int rows = size;
		for (int i = 1; i <= rows; i++){ 
            for (int j = rows; j >= i; j--){ 
                System.out.print(" "); 
            	} 
            for (int j = 1; j <= i; j++){ 
                System.out.print("* "); 
            	} 
            	System.out.println(); 
        } 		
	}
	public void ReverseTriangle(){
			
		int rows = size;
			for(int i = rows; i >= 1; i--){
				for(int j = rows; j > i; j--){
					System.out.print(" ");
					}
				for(int k = 0; k < i; k++){	
					System.out.print("* ");
					}
				System.out.println();
			}
	}
		
	public void RightTriangle(){
		int rows = size;
		for(int i = 0; i < rows; i++){     
            for(int j = 0; j <= i; j++){          
                System.out.print("* "); 
            	}  
            	System.out.println(); 
        } 	
		
	}
	public void LeftTriangle() {
		int rows = size;
		for(int i=0; i<rows; i++){ 
            for(int j=2*(rows-i); j>=0; j--){ 
                System.out.print(" "); 
            	}  
            for(int j=0; j<=i; j++){      
                System.out.print("* "); 
            	}    
            	System.out.println(); 
        } 	
		
	}
	
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

}
