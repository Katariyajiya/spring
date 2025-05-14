package com.springcore.standalonecollections;
import java.util.*;
public class People {

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }


    @Override
    public String toString() {
        return "People{" +
                "properties=" + properties +
                ", feestructure=" + feestructure +
                ", friends=" + friends +
                '}';
    }

    private Properties properties;
    private Map<String,Integer> feestructure;
    private List <String> friends;
    public Map<String, Integer> getFeestructure() {
        return feestructure;
    }

    public void setFeestructure(Map<String, Integer> feestructure) {
        this.feestructure = feestructure;
    }
    public List<String> getFriends(){
          return friends;
      }
      public void setFriends( List<String> friends)
      {
          this.friends =friends;
      }

}
