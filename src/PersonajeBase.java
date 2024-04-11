abstract class PersonajeBase implements Personaje {
    String name;
    int level;
    String race;
    int healthPoints;
    int attackPoints;

    public PersonajeBase(String name, int level, String race, int healthPoints, int attackPoints) {
        this.name = name;
        this.level = level;
        this.race = race;
        this.healthPoints = healthPoints;
        this.attackPoints = attackPoints;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getAttackPoints() {
        return attackPoints;
    }

    public void setAttackPoints(int attackPoints) {
        this.attackPoints = attackPoints;
    }

    public int atacar() {
        return attackPoints;
    }

    public void defender(int dmg) {
        healthPoints -= dmg;
    }
}
