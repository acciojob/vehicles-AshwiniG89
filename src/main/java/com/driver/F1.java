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
    public F1(String name,int currentSpeed,int currentDirection, int wheels, int doors, int gears, boolean isManual, String type, int seats){
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
        switch(rate){
            case 1: newSpeed=50;
                    break;

            case 2: newSpeed=100;
                    break;
            case 3: newSpeed=150;
                break;
            case 4: newSpeed=200;
                break;
            case 5: newSpeed=250;
                break;

            }
        }

        //for all other cases, change the gear accordingly


    }

