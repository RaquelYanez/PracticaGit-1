package Persona;

public class mujer extends persona{
public mujer (String nombre, String Apellido, int edad) {
	super(nombre, Apellido, edad);


}

@Override
public String toString() {
	return "mujer [apellido=" + apellido + ", edad=" + edad + ", dinero=" + dinero + "]";
}
}
