package com.company.StringPractice;


public class Flight {
   private int passengers;
   private int seats;

   public Flight(){

        seats = 150;
        passengers = 0;


       }

    public int getSeats(){
       return seats;
    }

    public void setSeats(int seats){
      this.seats = seats;
    }


   public void add1Passenger(){

        if(passengers < seats)
            passengers += 1;
        else
            handleTooMany();

    }
    private void handleTooMany(){
        System.out.println("Too many");
    }

}

