import java.util.ArrayList;

public class Tile{
  int value;
  private static ArrayList<Tile> numTile = new ArrayList<>();

  public Tile(int v){
    value = v;
    numTile.add(this);
  }

  public int getValue(){
    return value;
  }

  public void added(){
    
  }

  public void randomNumberGen(){
    
  }
  
}
