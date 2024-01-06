import java.util.*;
public class Cards {
int rank;
int suit;
public Cards(int rank, int suit){
    assert isTrueSuit(suit);
    assert isTrueRank(rank);
    this.rank=rank;
    this.suit=suit;
}
public int getRank(){
    return rank;
}
public void setRank(){
    this.rank=rank;
}
public int getSuit(){
    return suit;
}
public void setSuit(){
    this.suit=suit;
}
public boolean isTrueSuit(int value){
    if(value>=1 && value<=4){
        return true;
    }
    return false;
    }
public boolean isTrueRank(int value){
    if(value>=1 && value<=13){
        return true;
    }
    return false;
}
}
