package com.github.thomasridd.datalino.model;

/**
 * Created by Tom.Ridd on 14/05/2016.
 */
public class Trust {
  String id;
  String name;
  String location;
  String region;
  String postcode;
  int beds_type1;
  int beds_type2;
  int beds_type3;
  public int beds_available_type1;
  public int beds_available_type2;
  public int beds_available_type3;

  public double latitude;
  public double longitude;
  public double distance;

  public void setDistanceTo(Trust trust) {
    distance = 111131 * Math.pow(trust.latitude - latitude, 2) +
            788446 * Math.pow(trust.longitude - longitude, 2);
    distance = Math.pow(distance, 0.5);
  }
}
