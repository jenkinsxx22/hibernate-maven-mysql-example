package com.hibernate.model;

import jakarta.persistence.*;
@Entity
@DiscriminatorValue( "BIKE" )
public class TwoWheeler extends Vehicle
{
   private String steeringHandle;

   public String getSteeringHandle()
   {
      return steeringHandle;
   }

   public void setSteeringHandle( String steeringHandle )
   {
      this.steeringHandle = steeringHandle;
   }

}
