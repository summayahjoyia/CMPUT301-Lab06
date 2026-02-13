package com.example.listycity;

import java.util.Objects;

/**
 * This is a class that defines a City.
 */
public class City implements Comparable<City>{
    private String city;
    private String province;
    City(String city, String province){
        this.city = city;
        this.province = province;
    }
    String getCityName(){
        return this.city;
    }
    String getProvinceName(){
        return this.province;
    }

    @Override
    public int compareTo(City o) {
        City city = (City) o;
        return this.city.compareTo(city.getCityName());
    }
    //Participation Exercise
    //Reference : https://www.infoworld.com/article/2256967/comparing-java-objects-with-equals-and-hashcode.html
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City other = (City) o;
        return this.city.equals(other.city) && this.province.equals(other.province);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, province);
    }
}

