public class Player{
  /*
  Has a string name
Has a “mana/energy” integer value
Has an inventory
Can ask for name through user input
Can return string name*/
private String name;
private int energy, highestScore;


public Player(String n, int e){
  name = n;
  energy = e;
}

public String getName(){
  return name;
}

public int energy(){
  return energy;
}
}
