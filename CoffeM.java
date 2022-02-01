package com.Rishabh;

import java.util.Scanner;

public class CoffeM {
        public static void main(String[] args) {
		/*
		  System.out.println("Starting to make a coffee");

		  System.out.println("Grinding coffee beans");
		 System.out.println("Boiling water");
		 System.out.println("Mixing boiled water with crushed coffee beans");
		 System.out.println("Pouring coffee into the cup");
		 System.out.println("Pouring some milk into the cup");
		 System.out.println("Coffee is ready!");

		 Scanner scanner = new Scanner(System.in);
		 System.out.println("Write how many cups of coffee you will need:");
		 int amountOfCups = scanner.nextInt();
		 System.out.println("For " + amountOfCups + " cups of coffee you will need:");
		 System.out.println((amountOfCups * 200) + " ml of water");
		 System.out.println((amountOfCups * 50) + " ml of milk");
		 System.out.println((amountOfCups * 15) + " g of coffee beans");

		*/

            Scanner scanner = new Scanner(System.in);
/*
		System.out.println("Write how many ml of water the coffee machine has:");
		int amountOfWater = scanner.nextInt();

		System.out.println("Write how many ml of milk the coffee machine has:");
		int amountOfMilk = scanner.nextInt();

		System.out.println("Write how many grams of coffee beans the coffee machine has:");
		int amountOFBeans = scanner.nextInt();

		System.out.println("Write how many cups of coffee you will need:");
		int amountOfCupsNeeded = scanner.nextInt();

		int waterNeeded = 200;
		int milkNeeded = 50;
		int beansNeeded = 15;

		int resultWater = amountOfWater / waterNeeded;
		int resultMilk = amountOfMilk / milkNeeded;
		int resultBeans = amountOFBeans / beansNeeded;

		int result;

		if (resultWater > resultMilk || resultWater > resultBeans) {
			if (resultMilk > resultBeans) {
				result = resultBeans;
			} else {
				result = resultMilk;
			}
		} else {
			result = resultWater;
		}

		if (amountOfCupsNeeded > result) {
			System.out.println("No, I can make only " + result + " cup(s) of coffee");
		} else if (amountOfCupsNeeded == result) {
			System.out.println("Yes, I can make that amount of coffee");
		} else {
			System.out.println("Yes, I can make that amount of coffee (and even " + (result - amountOfCupsNeeded) + " more than that)");
		}
		*/

            boolean Testcase = false;
            int amountOfWater = 400;
            int amountOfMilk = 540;
            int amountOfCupsNeeded = 120;
            int disposableCups = 9;
            int money = 550;
            int amountOfCupsNeeded1 = 1;
            int waterNeeded = 1;
            int milkNeeded = 1;
            int beansNeeded = 1;
/*
            System.out.println("The coffee machine has: ");
            System.out.println(amountOfWater + " ml of water");
            System.out.println( amountOfMilk + " ml of milk");
            System.out.println(amountOfCupsNeeded + " g of coffee beans");
            System.out.println(disposableCups+ " disposable Cups");
            System.out.println("$"+money+ " of money");
            System.out.println();
*/
            while(!Testcase){
                boolean loop = true;
                while(loop){

                    System.out.println("Write action (buy, fill, take , remaining, exit):");
                    String option = scanner.next();

                    if(option.equals("buy")){

                        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
                        String type = scanner.next();
                         if (type.equals("1")){
                             waterNeeded = 250;
                             milkNeeded = 1;
                             beansNeeded = 16;
                         }else if (type.equals("2")){
                             waterNeeded = 350;
                             milkNeeded = 75;
                             beansNeeded = 20;
                         }else if (type.equals("3")){
                             waterNeeded = 200;
                             milkNeeded = 100;
                             beansNeeded = 12;
                         }

                        int resultWater = amountOfWater / waterNeeded;
                        int resultMilk = amountOfMilk / milkNeeded;
                        int resultBeans = amountOfCupsNeeded / beansNeeded;
                        int result;
                        if (amountOfCupsNeeded1 <= resultWater && amountOfCupsNeeded1 <= resultMilk || amountOfCupsNeeded1 < resultBeans && amountOfCupsNeeded1 < resultWater){
                             result = resultWater;
                        }else {
                            result = 0;
                        }

                        if (amountOfCupsNeeded1 <= result) {
                            switch (type) {
                                case "1":
                                    amountOfWater -= 250;
                                    amountOfCupsNeeded -= 16;
                                    disposableCups -= 1;
                                    money += 4;
                                    break;
                                case "2":
                                    amountOfWater -= 350;
                                    amountOfMilk -= 75;
                                    amountOfCupsNeeded -= 20;
                                    disposableCups -= 1;
                                    money += 7;
                                    break;
                                case "3":
                                    amountOfWater -= 200;
                                    amountOfMilk -= 100;
                                    amountOfCupsNeeded -= 12;
                                    disposableCups -= 1;
                                    money += 6;
                                    break;
                                default:
                                    System.out.println("Please choose out the given 3! no. only");
                                    break;
                            }
                            System.out.println("I have enough resources, making you a coffee!");
                            System.out.println();
                        }else if (amountOfWater < waterNeeded){
                            System.out.println("Sorry, not enough water!");
                        }else if (amountOfMilk < milkNeeded){
                            System.out.println("Sorry, not enough Milk!");
                        }
                    } else if (option.equals("take")){
                        System.out.println("I gave you $"+money);
                        money = 0;

                    } else if (option.equals("fill")){
                        System.out.println("Write how many ml of water you want to add: ");
                        amountOfWater += scanner.nextInt();
                        System.out.println("Write how many ml of milk you want to add: ");
                        amountOfMilk += scanner.nextInt();
                        System.out.println("Write how many grams of coffee beans you want to add: ");
                        amountOfCupsNeeded += scanner.nextInt();
                        System.out.println("Write how many disposable cups of coffee you want to add: ");
                        disposableCups += scanner.nextInt();

                    } else if (option.equals("remaining")){
                        System.out.println();
                        System.out.println("The coffee machine has: ");
                        System.out.println(amountOfWater + " ml of water");
                        System.out.println( amountOfMilk + " ml of milk");
                        System.out.println(amountOfCupsNeeded + " g of coffee beans");
                        System.out.println(disposableCups+ " disposable cups");
                        System.out.println("$"+money+ " of money");
                        System.out.println();
                    } else if (option.equals("exit")){
                        System.exit(0);

                    }

                }

                Testcase = true;

            }

        /*
        System.out.println();
        System.out.println("The coffee machine has: ");
        System.out.println(amountOfWater + " ml of water");
        System.out.println( amountOfMilk + " ml of milk");
        System.out.println(amountOfCupsNeeded + " g of coffee beans");
        System.out.println(disposableCups+ " disposable Cups");
        System.out.println("$"+money+ " of money");

         */
        }
    }
