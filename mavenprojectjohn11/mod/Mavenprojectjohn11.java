/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenprojectjohn11.mod;
import java.util.*;
import java.io.*;

/**
 *
 * @author john
 */
public class Mavenprojectjohn11 {

    @SuppressWarnings("ResultOfMethodCallIgnored")
    public static void main(String[] args, int a, int I) throws FileNotFoundException {
       File fileobj = new File("C:\\Users\\Administrator\\Documents\\NetBeansProjects\\mavenprojectjohn11\\src\\main\\java\\com\\mycompany\\mavenprojectjohn11\\mod\\file\\student-data.txt");
Scanner input = new Scanner(fileobj);


while(input.hasNext()){
String data = scanner.nextLine.replace("#",",");
data.replace("$","\n");
String [] newData = data.split("\n");
String finalData = " ";

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
            }
            

    


        




