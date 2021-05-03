package Air;


public class Aircraft {

  public int ammunition;
  public int maxAmmo;
  public int baseDamage;
  public int allDamage;


  public Aircraft() {
    this.ammunition = 0;

  }


  public Aircraft(int ammunition, int maxAmmo, int baseDamage) {
    this.ammunition = ammunition;
    this.maxAmmo = maxAmmo;
    this.baseDamage = baseDamage;


  }


  public int fight() {
    int allDamage = ammunition * baseDamage;
    return allDamage;
  }

  public int refillAmmo(int ammoFromCarrier) {

    if (ammoFromCarrier >= maxAmmo) {
      int a = maxAmmo - ammunition;
      ammunition = maxAmmo;
      return ammoFromCarrier - a;
    } else {
      if (ammunition + ammoFromCarrier > maxAmmo) {
        ammunition = maxAmmo;
        return ammunition + ammoFromCarrier - maxAmmo;
      } else {
        ammunition += ammoFromCarrier;
        return 0;
      }


    }

  }

  public String getType() {
    if (this instanceof F16) {
      return "F16";
    }

    if (this instanceof F35) {
      return "F35";
    }
    return "Aircraft";
  }

  public String getStatus() {
    return "Type :" + getType() + "   ammunition:   " + ammunition + "   baseDamage :  " +
        baseDamage +
        "  allDamage:  " + allDamage;
  }


  public boolean isPriority() {
    String type = getType();
    if (type.equals("F16")) {
      return false;

    }
    return true;


  }

}
