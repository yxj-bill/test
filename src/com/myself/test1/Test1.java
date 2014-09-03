package com.myself.test1;

import java.awt.print.Printable;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Test1 {
	
    public static void main(String[] args) {
		final int HOURSE_COUNT = 100;
		int RICE_COUNT = 100;
		for (int i=0;i<=HOURSE_COUNT;i++){
			for (int j = 0; j <= HOURSE_COUNT; j++) {
				if((HOURSE_COUNT-(i+j))%2 != 0){
					continue;
				}else 
				if(3*i+j*2 + (HOURSE_COUNT-(i+j))/2 == RICE_COUNT){
                   System.out.println("大马="+i+"\n小马="+j+"\n小马仔="+ (100-i-j)+"\n\n");
				}
			}
		}
	}
}
