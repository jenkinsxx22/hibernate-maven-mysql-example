package com.hibernate.model;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue( "CAR" )
public class FourWheeler extends Vehicle
{
   private String steeringWheel;

   public String getSteeringWheel()
   {
      return steeringWheel;
   }

   public void setSteeringWheel( String steeringWheel )
   {
      this.steeringWheel = steeringWheel;
   }

}
