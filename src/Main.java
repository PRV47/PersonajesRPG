public class Main {
    public static void main(String[] args) {
        Guerrero guerrero = new Guerrero("Volgarr", 15, "Humano", 88, 9);
        Mago mago = new Mago("Ignatus", 15, "Elfo", 46, 16);
        Picaro picaro = new Picaro("Sibo", 15, "Semi Elfo", 66, 13);

        System.out.println("Empieza el combate");
        System.out.println(guerrero.name +" ataca a "+ mago.name);
        int dmg = guerrero.atacar();
        mago.defender(dmg);
        System.out.println("Vida del mago: " + mago.healthPoints);
        System.out.println(mago.name +" ataca a "+ picaro.name);
        dmg = mago.atacar();
        picaro.defender(dmg);
        System.out.println("Vida del picaro: " + picaro.healthPoints);
        System.out.println(picaro.name +" ataca a "+ guerrero.name);
        dmg = picaro.atacar();
        guerrero.defender(dmg);
        System.out.println("Vida del guerrero: " + guerrero.healthPoints);
    }
}
