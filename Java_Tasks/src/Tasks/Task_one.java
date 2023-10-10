package Tasks;


public class Task_one {
	public static void main(String[] args) {
		
		double Sun_Diameter = 865000;
		double Earth_Diameter = 7600;
        
        Problem_One_Of_Homework_Assignment_One(Earth_Diameter, Sun_Diameter);
	}

	public static void Problem_One_Of_Homework_Assignment_One(double Earth_Dia, double Sun_Dia) { // This function
																									// refers to the
																									// first problem in the homework assignment ONE
		double Earth_radius = Earth_Dia / 2; // This variable indicates the radius of the Earth.
		double Sun_radius = Sun_Dia / 2; // This variable indicates the radius of the Sun.
		double Earth_vol; // This variable indicates the Earth Volume.
		double Sun_vol; // This variable indicates the Sun volume.
		double Ratio; // This variable indicates the ratio of the volume of the Sun to the volume of the Earth.
		
		// Calculate the volume of the Earth using the formula for the volume of a sphere		
		// V = (4/3) * π * r^3, where r is the Earth's radius.
		Earth_vol = (4 / 3) * Math.PI * Math.pow(Earth_radius, 3);
		
		// Calculate the volume of the Sun using the same formula but with the Sun's radius.
		Sun_vol = (4 / 3) * Math.PI * Math.pow(Sun_radius, 3);
		
		Ratio = Sun_vol / Earth_vol;
		
		System.out.println("The volume of the Earth is " +""+ Earth_vol + " cubic miles" );
		System.out.println("The volume of the Sun is " +""+ Sun_vol + " cubic miles" );
		System.out.println("The ratio of the volume of the Sun to the volume of the Earth is " +""+ Ratio);
		
	}
}
