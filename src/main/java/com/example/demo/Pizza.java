package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity

public class Pizza {
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int id=0;
		private String name;
		private String toppings;
		private int cost;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getToppings() {
			return toppings;
		}

		public void setToppings(String toppings) {
			this.toppings = toppings;
		}

		public int getCost() {
			return cost;
		}

		public void setCost(int cost) {
			this.cost = cost;
		}
		
}
