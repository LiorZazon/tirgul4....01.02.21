package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code herepackage com.company;

       	// write your code here

        // targil 1:

        // מחלקה בגדול זו בעצם תבנית של איך לייצר אובייקטים/ סרטוט שאומר למחשב איך רנו הולכים
        //לייצר משהו, דרך עבודה בצורה מודולרית, תחזוק קל יותר של הקוד, קל יותר לקרוא קוד שנכתב
        // .על ידי מישהו אחר, קוד קצר יותר ואיכותי יותר, כאשר הקוד מחולק בצורה מודולרית כל מודול עושה את התפקיד שלו

        // targil 2:

        // מופע- זה המוצר עצמו, ברגע שלקחתי את התוכנית וייצתי מוצר. האובייקט בעצם.

        //targil 3:

        // נרשום new, זו ילה שאומרת לו בעצם לייצר משהו חדש מתוך מחלקה מסויימת.

        //Laptop asus = new laptop();

        //targil 4:
        // למטה

        //targil 6:

        //תפקידה של פונקציית ToString הוא: היא לוקחת את האובייקט של אותה מחלקה ומחזירה מחרוזת.
        //על מנת שהמחשב לא יתבלבל וידפיס לנו את המיקום הכתובת של אותה מחלקה בזיכרון.

        // targil 7:
        pringDog();

        // targil 10 in meal class

        // targil 11
        // static - שדה שנמצא במחלקה עצמה, קיים רק פעם אחת ולא משתכפל לכל מופע וניתן לשנות אותו
        // final - שדה קבוע שאינו משתנה ולא ניתן לשנותו גם אחר כך בהמשך התוכנית



    }

        //4


            public static void creatDog (){
               Dog dog1 = new Dog("kiki", 3, "labrador");
            }

            public static void pringDog () {
                Dog doggies = new Dog("rexi", 4, "shpitz yapani");
                System.out.println(doggies);

            }
            //9

            public static void createMeals() {
        Meal m1 = new Meal("meat", false, 5.2f);
        Meal m2 = new Meal("spagehti", true, 6.2f);
            }
            //12
            public static void createHouses() {
        House h1 = new House("waxman 2", 56.4f);
        House h2 = new House("avraham avino", 55.1f, "lior");
            }

        }

