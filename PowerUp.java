public class PowerUp{
  private String powerName;
  private int cost;

  public PowerUp(String p, int c){
    powerName = p;
    cost = c;
  }

  public String getpowerName(){
    return powerName;
  }

  public int getCost(){
    return cost;
  }
}
