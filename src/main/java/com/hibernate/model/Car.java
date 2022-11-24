package com.hibernate.model;

import java.util.ArrayList;
import java.util.Collection;



import jakarta.persistence.*;

@Entity
public class Car
{
   @Id
   @GeneratedValue( strategy = GenerationType.AUTO )
   private int                  id;
   private String               name;
   @ManyToMany
   @JoinTable( name = "CAR_CAROWNER", joinColumns = @JoinColumn( name = "CAR_OWNER_ID" ), inverseJoinColumns = @JoinColumn( name = "CAR_ID" ) )
   private Collection<CarOwner> owners = new ArrayList<>(); // mappedBy="owners"

   public Car()
   {
      // TODO Auto-generated constructor stub
   }

   public Car( String name )
   {
      this.name = name;
   }

   public int getId()
   {
      return id;
   }

   public void setId( int id )
   {
      this.id = id;
   }

   public String getName()
   {
      return name;
   }

   public void setName( String name )
   {
      this.name = name;
   }

   public Collection<CarOwner> getOwners()
   {
      return owners;
   }

   public void setOwners( Collection<CarOwner> owners )
   {
      this.owners = owners;
   }

}
