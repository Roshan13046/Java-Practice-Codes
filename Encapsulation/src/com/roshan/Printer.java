package com.roshan;

public class Printer {
    private int noOfPagesPrinted = 0;
    private double percentTonerLevel = -1;
    private boolean isDuplex = false;

    public Printer(double percentTonerLevel, boolean isDuplex) {
        this.noOfPagesPrinted = 0;
        if(percentTonerLevel>=0 && percentTonerLevel <=100) {
            this.percentTonerLevel = percentTonerLevel;
        }else{
            this.percentTonerLevel=-1;
        }
        this.isDuplex = isDuplex;
    }

    public double fillTonerLevel(double percentTonerLevel){
        if(percentTonerLevel>=0 && percentTonerLevel <=100){
            if(this.percentTonerLevel + percentTonerLevel >100 ) {
                return -1;
            }else{
                this.percentTonerLevel += percentTonerLevel;
                return this.percentTonerLevel;
            }
        }else{
            return -1;
        }
    }

    public int noOfPagesPrint(int pages){
        int pagesToPrint = pages ;
        if(isDuplex){
            System.out.println("PRINTING IN DUPLEX MODE");
            pagesToPrint = pages /2 + pages %2 ;
        }
        this.noOfPagesPrinted += pagesToPrint ;
        return pagesToPrint;
    }

    public int totalPagesPrinted (){
        return this.noOfPagesPrinted ;
    }
}
