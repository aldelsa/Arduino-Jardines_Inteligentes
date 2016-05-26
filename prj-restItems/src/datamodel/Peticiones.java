package datamodel;

public class Peticiones {
	  private String id_peticion;
	  private String id_robot;
	  private String id_sensor;
	  
	  public Peticiones (String id_pet_new,String id_rob_new,String id_sen_new) {
		  this.id_peticion = id_pet_new;
		  this.id_robot = id_rob_new;
		  this.id_sensor = id_sen_new;
	  }

	public String getId_peticion() {
		return id_peticion;
	}

	public void setId_peticion(String id_peticion) {
		this.id_peticion = id_peticion;
	}

	public String getId_robot() {
		return id_robot;
	}

	public void setId_robot(String id_robot) {
		this.id_robot = id_robot;
	}

	public String getId_sensor() {
		return id_sensor;
	}

	public void setId_sensor(String id_sensor) {
		this.id_sensor = id_sensor;
	}

	@Override
	public String toString() {
		return "Peticiones [id_peticion=" + id_peticion + ", id_robot="
				+ id_robot + ", id_sensor=" + id_sensor + "]";
	}
	  
	  
	  
}
