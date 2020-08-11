public class Main extends Empresa{
	
	
	
	public static void main(String[] args) {
	Empleado ofia = new Oficinista("Carlos", "Alfredo", 30, 510);
	Empleado ofib = new Oficinista("Ramirez", "Gonzalez", 20, 530);

	System.out.println(ofia.getSalario());
	System.out.println(ofib.getSalario());
	
	Empleado spta = new SupervisorTecnico("Andres", "Vargas", 60,3000, 4);
	Empleado sptb = new SupervisorTecnico("Anthony", "Abad",31,155, 6);
	
	System.out.println(spta.getSalario());
	System.out.println(sptb.getSalario());
	
	Empleado gra = new Gerente("Melissa", "Ramirez", 63, 2040, 5, 350);
	Empleado grb = new Gerente("Viviana", "Peñafiel", 40, 4500, 6, 450);
	
	System.out.println(gra.getSalario());
	System.out.println(grb.getSalario());
	
	Empresa empresa = new Empresa ();
	empresa.contratar(ofia);
	empresa.contratar(ofib);
	empresa.contratar(spta);
	empresa.contratar(sptb);
	empresa.contratar(gra);
	empresa.contratar(grb);
	
	System.out.println(empresa.totalEmpleados());
	System.out.println(empresa.diaDePago());
	
}
}