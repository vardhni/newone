package org.newgit;

public class Scanner {
	
	public static void main(String[] args) {
		 
		 String s="vardhni";
			     char[] a=s.toCharArray();
			    for(int i=0;i<s.length();i++){
			    for(int j=i+1;j<s.length();j++){
			       if(a[i]>a[j]){
			  char c= a[i];
			   a[i]=a[j];
			    a[j]=c;
			}}
			System.out.print(a[i]);
			}
			   
}}