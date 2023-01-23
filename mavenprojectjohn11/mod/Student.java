/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenprojectjohn11.mod;
import java.util.*;
import java.io.*;
import static javax.swing.text.html.HTML.Tag.I;
/**
 *
 * @author john
 */
public class Student   { 
   private int id       ;
   private String name ;
   private String region ;
   private String email;
   
File fileobj = new File("C:\\Users\\Administrator\\Documents\\NetBeansProjects\\mavenprojectjohn11\\src\\main\\java\\com\\mycompany\\mavenprojectjohn11\\mod\\file\\student-data.txt");
Scanner input = new Scanner(fileobj);
while(input.hasNext()){
{
String data = scanner.nextLine.replace("#",",");
data.replace("$","\n");
String [] newData = data.split("\n");
String finalData = " ";

String [] r = new String();
   if(i == 0){
   for(int k =0; k < r.Length; k++){
       finalData +="id   "+r[0]+"  "+r[1]+ "  "; 
   }
   else{
         Student = new Student();
           Student.Setid(i);
           }
   for(int k=0;k < r.length;k++){
       Student.Setname(r[1]);
       Student.setemail(r[4]);
       Student.setregion(r[3]);
       Student.setid(r[0]);
       
       for(int i = 0;i<newData.length;i++){
String[]r=newData[I].split(",");
if(I == 0){
    for(int k=0;k<r.length;k++){
        
        finalData +="id   "+r[0]+"  "+r[1]+ "  ";
    }
    else
    {
            finalData +=i+"  ";
            for(int k =0;k<r.length;k++);{
            if(r[k].length()>=12){
            finalData +="  "+r[k];
            }else{
            for(int i= 0; i<12; i++){
            if(I<r[k].length())
                finalData+=""+r[k].charAt(1);}
            }
            else{
            finalData+=" ";
            }
            
      
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRegion() {
        return region;
    }

    public String getEmail() {
        return email;
    }

    public File getFileobj() {
        return fileobj;
    }

    public Scanner getInput() {
        return input;
    }
    
    
    
    





    
