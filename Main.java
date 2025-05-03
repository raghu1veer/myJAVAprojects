class player1{
    private String weapon;
   private String name;
     private int health;

    public player1(String weapon, int health, String name) {
        this.weapon = weapon;
        this.health = health;
        this.name = name;
    }

    public void damagebyGun1(){
        System.out.println("health should be between 0 and 100");
        this.health = health - 30;
        if(health <= 0){
            this.health = 0;
        }
        System.out.println("player 1 has hit by Gun1 and health is decreased by 30");
        System.out.println("new health is " + this.health );

        if(this.health==0){
            System.out.println("wasted");
        }
    }

    public void damagebyGun2(){
        this.health = health - 50;
        if(health <= 0){
            this.health = 0;
        }
        System.out.println("player 1 has hit by Gun1 and health is decreased by 50");
        System.out.println("new health is " + this.health );

        if(this.health==0){
            System.out.println("wasted");
        }
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}

class Player2 extends player1 {
    public Player2(String weapon, int health, String name, int health1, boolean armor) {
        super(weapon, health, name);
        this.health = health1;
        this.armor = armor;
    }

    private int health;
    private boolean armor;

    @Override
    public void damagebyGun1() {
        if (armor) {
            this.health = this.health - 20;
            if (this.health <= 0) {
                this.health = 0;
            }
            System.out.println("Got hit by gun1 and health is reduced by 20 ");
            System.out.println("new hatlth is " + this.health);
            if (this.health == 0) {
                System.out.println("wasted");
            }
        }
        if (!armor) {
            this.health = health - 30;
            if (health <= 0) {
                this.health = 0;
            }
            System.out.println("player 1 has hit by Gun1 and health is decreased by 30");
            System.out.println("new health is " + this.health);

            if (this.health == 0) {
                System.out.println("wasted");

            }
        }

    }

    @Override
    public void damagebyGun2() {
        if (armor) {
            this.health = this.health - 20;
            if (this.health <= 0) {
                this.health = 0;
            }
            System.out.println("Got hit by gun1 and health is reduced by 20 ");
            System.out.println("new hatlth is " + this.health);
            if (this.health == 0) {
                System.out.println("wasted");
            }
        }
        if (!armor) {
            this.health = health - 30;
            if (health <= 0) {
                this.health = 0;
            }
            System.out.println("player 1 has hit by Gun1 and health is decreased by 30");
            System.out.println("new health is " + this.health);

            if (this.health == 0) {
                System.out.println("wasted");

            }
        }
    }
}


class Main{
    public static void main(String[] args) {
        player1 player = new player1("gun",100,"raghu");
        //System.out.println(player.getName());
        //System.out.println(player.getHealth());
        //System.out.println(player.getWeapon());

        player.damagebyGun1();
        player.damagebyGun2();
        player.damagebyGun2();




    }
}