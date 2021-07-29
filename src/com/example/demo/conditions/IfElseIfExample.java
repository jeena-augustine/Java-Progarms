package com.example.demo.conditions;

public class IfElseIfExample {
	public static void main(String[] args) {  
	    int marks=65;  
	      System.out.println(CalculateGrade(marks));   ;
	   
	}

	 static public String CalculateGrade(int marks) {
		String grade="";
		 if(marks<50){  
			 grade="fail";  
		    }  
		    else if(marks>=50 && marks<60){  
		    	grade="D grade";  
		    }  
		    else if(marks>=60 && marks<70){  
		    	grade="C grade";  
		    }  
		    else if(marks>=70 && marks<80){  
		    	grade="B grade";  
		    }  
		    else if(marks>=80 && marks<90){  
		    	grade="A grade";  
		    }else if(marks>=90 && marks<100){  
		    	grade="A+ grade";  
		    }else{  
		    	grade="Invalid!";  
		    }  
		 return grade;
		
	}  

}
