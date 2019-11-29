package com.wangqichao1.test1;

import java.util.Scanner;
import org.apache.commons.math3.stat.descriptive.moment.Mean; 
import org.apache.commons.math3.stat.descriptive.moment.Variance; 
import org.apache.commons.math3.stat.descriptive.rank.Max; 
import org.apache.commons.math3.stat.descriptive.rank.Min; 
import org.apache.commons.math3.stat.descriptive.summary.Product; 
import org.apache.commons.math3.stat.descriptive.summary.Sum; 

	public class App {
		    double[] values = new double[10]; 
	     public  void  getnum() { 
	        Scanner in = new Scanner(System.in);
	        System.out.println("请输入十个数字:");
	        int a=10;
	        for(int i=0;i<a;i++)
	        {
	        	values[i]=in.nextDouble();
	        }
	  }
	       
	       public void count(){
	    	    Mean mean = new Mean(); // 算术平均值 
		        Min min = new Min(); //最大
		        Max max = new Max(); //最小
		        Product product = new Product();//乘积 
		        Sum sum = new Sum(); //和
		        Variance variance = new Variance();//方差 
		        System.out.println("mean: " +mean.evaluate(values)); 
		        if(mean.evaluate(values)>0)
		        {
		        	 System.out.println("min: " +min.evaluate(values)); 
		 	         System.out.println("max: " +max.evaluate(values)); 
		        }
		       if(mean.evaluate(values)<0)
		       {
		    	   System.out.println("sum: " +sum.evaluate(values)); 
		    	   if(product.evaluate(values)>0)
		    	   {
		    		   System.out.println("product:" + product.evaluate(values));
		    	   }
		    	   else
		    	   {
		    		   System.out.println("variance:" + variance.evaluate(values));  
		    	   }
		    	   
		       } 
	       }
	}
	        
