package OOP5;

public class Station {


  int gasAmount;
  int tankCapacity = 100;
  int carGasAmount;

  Station(){
    this.gasAmount = 1500;

  }

  public void gasAvailable(int gasAmount) {
    this.gasAmount = gasAmount;
    gasAmount = 1500;
  }

  public void refill(int gasAmount) {
    this.gasAmount = gasAmount;
    gasAmount =- tankCapacity;
  }
}

