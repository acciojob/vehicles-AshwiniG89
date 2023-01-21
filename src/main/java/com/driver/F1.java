package com.driver;

public class F1 extends Car {
    //private boolean isManual;

    public F1(String name,boolean isManual){
        //super();
        super(name,isManual);
        this.setName(name);

    }
    public F1(String name, int currentSpeed,int currentDirection) {
        super(name, currentSpeed, currentDirection);
        this.setName(name);



        //Use arbitrary values for parameters which are not mentioned

    }

    @Override
    public void move(int speed, int direction) {
        super.move(speed, direction);
    }

    public F1(String name, int currentSpeed, int currentDirection, int wheels, int doors, int gears, boolean isManual, String type, int seats){
        super(name, currentSpeed,currentDirection,wheels, doors, gears, isManual, type, seats);
        this.setName(name);
        //this.isManual=false;
    }

//    public F1(String name, int wheels, int doors, int gears, boolean isManual, String type, int seats) {
//        super(name, wheels, doors, gears, isManual, type, seats);
//    }

    public void accelerate(int rate){
        int newSpeed = 0; //set the value of new speed by using currentSpeed and rate
        /**
         * speed 0: gear 1
         * speed 1-50: gear 1
         * speed 51-100: gear 2
         * speed 101-150: gear 3
         * speed 151-200: gear 4
         * speed 201-250: gear 5
         * speed more than 250: gear 6
         */

         newSpeed=rate+getCurrentSpeed(); //set the value of new speed by using currentSpeed and rate


        if(newSpeed == 0) {
            //Stop the car, set gear as 1
            stop();
            this.changeGear(1);
            setCurrentGear(1);
            }
        else if(newSpeed>=1&&newSpeed<=50){
            this.changeGear(1);
            setCurrentGear(1);}
        else if(newSpeed>=51&&newSpeed<=100){
            this.changeGear(2);
             setCurrentGear(2);}
        else if(newSpeed>=101&&newSpeed<=150){
            this.changeGear(3);
        setCurrentGear(3);}
        else if(newSpeed>=151&&newSpeed<=200){
            this.changeGear(4);
        setCurrentGear(4);}
        else if(newSpeed>=201&&newSpeed<=250){
            this.changeGear(5);
        setCurrentGear(5);}
        else if(newSpeed>250){
            this.changeGear(6);
        setCurrentGear(6);

        setCurrentSpeed(newSpeed);

        if(newSpeed > 0) {
            changeSpeed(newSpeed, getCurrentDirection());
        }
        }

        //for all other cases, change the gear accordingly

    }
}

