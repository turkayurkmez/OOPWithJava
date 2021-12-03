package com.company;

public class Report {

  private String excelFilePath;
  public Report(String filePath){
      excelFilePath=filePath;
  }
  public void WriteToExcelFile(){
      System.out.println(excelFilePath +  " dosyasına veriler yazıldı");
  }
  public String ReadFromExcelFile(){
      System.out.println(excelFilePath +  " dosyasından veri okundu");
      return "Okunan veri";
  }

}
